import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * A class that represents the Server.
 * It contains the information of all Users and Rooms
 *
 * <p>Purdue University -- CS18000 -- Fall 2020 -- Project5</p>
 *
 * @author Kil Junhyeok, An Nguyen, Hoang Nguyen, Xiaoke He, Theerapatra Thongdee
 * @version December 07, 2020
 */

public class Server extends JFrame implements ActionListener {

    //GUI Object
    ServerGUI serverGUI = new ServerGUI();

    //Network I/O Fields
    private ServerSocket serverSocket;
    private Socket socket;
    private int port;
    private ArrayList<Object> userArrayList = new ArrayList<Object>();
    private ArrayList<User> arrayListOfAllUsers = new ArrayList<User>();
    private ArrayList<Room> arrayListOfAllRooms = new ArrayList<Room>();

    // Constructor
    Server() {
        serverGUI.setVisible(true);
        start();
    }

    // This method is ActionListener for serverGUI.getStartServerButton() and serverGUI.getStopServerButton().
    private void start() {
        serverGUI.getStartServerButton().addActionListener(this);
        serverGUI.getStopServerButton().addActionListener(this);
    }

    private void StartServer() {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Port already being used"
                    , "notification", JOptionPane.ERROR_MESSAGE);
        }
        if (serverSocket != null) {
            connection();
        }
    }

    //This method starts a new Thread
    private void connection() {

        Thread thread = new Thread(new Runnable() {
            @Override
            // What happens in the Thread
            public void run() {
                while (true) {
                    try {
                        serverGUI.getTextArea().append("Waiting for Client to connect\n");
                        socket = serverSocket.accept(); // Waits forever til Client connects
                        UserInfo user = new UserInfo(socket);
                        user.start();
                    } catch (IOException e) {
                        break;
                    }
                } // end of while loop
            }
        });
        thread.start();
    }

    // This method checks if password matches
    public boolean checkPassword(String username, String Password) throws FileNotFoundException {
        File toProcess = new File("Password.txt");
        FileReader fileReader = new FileReader(toProcess);
        try (BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            System.out.println("1");
            while ((line = br.readLine()) != null) {
                String[] usernamePassword = line.split(",");
                System.out.println("2");
                if (usernamePassword[0].trim().equals(username) &&
                        usernamePassword[1].trim().equals(Password)) {
                    System.out.println("3");
                    return true;
                }
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {

        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        new Server();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean isPortValid = true;
        if (e.getSource() == serverGUI.getStartServerButton()) {
            System.out.println("Start Button clicked");
            try {
                port = Integer.parseInt(serverGUI.getServerPortTextField().getText().trim());
            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(null, "Enter valid port number"
                        , "notification", JOptionPane.ERROR_MESSAGE);
                isPortValid = false;
            }
            if (isPortValid) {
                StartServer();
                serverGUI.getStartServerButton().setEnabled(false);
                serverGUI.getServerPortTextField().setEditable(false);
                serverGUI.getStopServerButton().setEnabled(true);
            }
        } else if (e.getSource() == serverGUI.getStopServerButton()) {
            serverGUI.getStopServerButton().setEnabled(false);
            serverGUI.getStartServerButton().setEnabled(true);
            serverGUI.getServerPortTextField().setEditable(true);

            try {
                serverSocket.close();
                // If server were to run forever, stop button resets all the data
                // code to remove elements from arraylists

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            System.out.println("Stop Button clicked");
        }

    }

    // This class represnets a User account
    class UserInfo extends Thread {

        private OutputStream os;
        private InputStream is;
        private DataOutputStream dos;
        private DataInputStream dis;

        private Socket userSocket;
        private String username = "";

        // UserInfo Constructor
        UserInfo(Socket socket) {
            this.userSocket = socket;
            UserNetwork();
        }

        private String getUsername() {
            return username;
        }
        private void UserNetwork() {
            try {
                is = userSocket.getInputStream();
                dis = new DataInputStream(is);
                os = userSocket.getOutputStream();
                dos = new DataOutputStream(os);

                String messages = dis.readUTF();
                String[] usernamePassword = messages.split(",");
                username = usernamePassword[0].trim();
                String password = usernamePassword[1].trim();

                //textArea.append(password + "\n");

                if (!checkPassword(username, password)) {
                    sendMessage("WrongPassword/Try again!");
                    return;
                } else {
                    serverGUI.getTextArea().append("Client Connected!\n");
                    serverGUI.getTextArea().append(username + " has joined!\n");
                }
                User user1 = new User(username);
                arrayListOfAllUsers.add(user1);

                broadcast("NewUser/" + username);

                for (int i = 0; i < userArrayList.size(); i++) {
                    UserInfo user = (UserInfo) userArrayList.get(i);
                    System.out.println(user.username);
                    sendMessage("OldUser/" + user.username);
                }

                userArrayList.add(this);

                broadcast("UpdateUserList/ ");

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Stream error"
                        , "notification", JOptionPane.ERROR_MESSAGE);
            }
        }

        // What to process in Thread
        public void run() {
            while (true) {
                try {
                    String message = dis.readUTF();
                    serverGUI.getTextArea().append(username + ": Message from user: " + message + "\n");
                    inMessage(message);
                } catch (IOException e) {
                    serverGUI.getTextArea().append(username + ": disconnected\n");
                    try {
                        dos.close();
                        dis.close();
                        userSocket.close();
                        userArrayList.remove(this);
                    } catch (IOException e1) {
                    }
                    break;
                }
            }
        } // end run method

        // Method that handles message from client
        private void inMessage(String str) {
            Room room = new Room(" ");
            String[] strInArray = str.split("/");
            String protocol = strInArray[0];
            String message = strInArray[1];
            System.out.println("Protocol: " + protocol);
            System.out.println("Message: " + message);

            if (protocol.equals("CreateRoom")) {
                String username = strInArray[2];
                System.out.println("Username: " + username);
                for (int i = 0; i < arrayListOfAllUsers.size(); i ++) {
                    if (arrayListOfAllUsers.get(i).getUserName().equals(username)) {
                        room = new Room(message);
                        arrayListOfAllRooms.add(room);
                        room.setListOfUsersInThisRoom(arrayListOfAllUsers.get(i));
                        arrayListOfAllUsers.get(i).setListOfRoomsThisUserIsIn(room);
                        System.out.println(username + " has created " + room.getRoomName());
                        sendMessage("CreatedRoom/" + arrayListOfAllUsers.get(i).getListOfRoomsInString());
                        break;
                    }
                }

            } else if (protocol.equals("AddUserToRoom")) {
                // Add room to user's arraylist of rooms
                String username = strInArray[2];
                for (int i = 0; i < arrayListOfAllUsers.size(); i++) {
                    if (arrayListOfAllUsers.get(i).getUserName().equals(username)) {
                        for (int j = 0; j < arrayListOfAllRooms.size(); j++) {
                            if (arrayListOfAllRooms.get(j).getRoomName().equals(message)) {
                                arrayListOfAllUsers.get(i).setListOfRoomsThisUserIsIn(arrayListOfAllRooms.get(j));
                                System.out.println(username + " has been added to " + arrayListOfAllRooms.get(j).getRoomName());
                                broadcastSpecific("AddedToRoom/" + arrayListOfAllUsers.get(i).getListOfRoomsInString(), username);
                            }
                        }
                    }
                }
                // Add user to room's arraylist of users
                for (int i = 0; i < arrayListOfAllRooms.size(); i++) {
                    if (arrayListOfAllRooms.get(i).getRoomName().equals(message)) {
                        for (int j = 0; j < arrayListOfAllUsers.size(); j++) {
                            if (arrayListOfAllUsers.get(j).getUserName().equals(username)) {
                                arrayListOfAllRooms.get(i).setListOfUsersInThisRoom(arrayListOfAllUsers.get(j));
                            }
                        }
                    }
                }
                System.out.println("arraylist of all rooms: " + arrayListOfAllRooms);
                System.out.println("arraylist of all users: " + arrayListOfAllUsers);

                for (int i = 0; i < arrayListOfAllRooms.size(); i++) {
                    arrayListOfAllRooms.get(i).printListOfUsersInString();
                }
                System.out.println("above are all users per room");
                for (int i = 0; i < arrayListOfAllUsers.size(); i++) {
                    arrayListOfAllUsers.get(i).printListOfRoomsInString();
                }
                System.out.println("above are all rooms per user");

            } else if (protocol.equals("JoinRoom")) {
                String username = strInArray[2];
                for (int i = 0; i < arrayListOfAllRooms.size(); i++) {
                    if (message.contains(arrayListOfAllRooms.get(i).getRoomName())) {
                        sendMessage("ShowingChat/" + arrayListOfAllRooms.get(i).getMessagesOfThisRoom() + "/"
                                + arrayListOfAllRooms.get(i).getRoomName());
                    }
                }
            } else if (protocol.equals("Chatting")) {
                String msg = strInArray[2];
                String username = strInArray[3];
                for (int i = 0; i < arrayListOfAllRooms.size(); i++) {
                    if (arrayListOfAllRooms.get(i).getRoomName().equals(message)) {
                        arrayListOfAllRooms.get(i).writeMessage(username + ": " + msg);
                        sendMessage("UpdateTextArea/" + arrayListOfAllRooms.get(i).getMessagesOfThisRoom());
                        for (int j = 0; j < arrayListOfAllRooms.get(i).getListOfUsersInString().size(); j++) {
                            broadcastSpecific("UpdateTextAreaForSpecificRoom/" + arrayListOfAllRooms.get(i).getMessagesOfThisRoom()
                                            + "/" + arrayListOfAllRooms.get(i).getRoomName(),
                                    arrayListOfAllRooms.get(i).getListOfUsersInString().get(j));
                        }
                        System.out.println("textarea updated");
                        break;
                    }
                }
            } else if (protocol.equals("DeleteRoom")) {
                String username = strInArray[2];
                for (int i = 0; i < arrayListOfAllUsers.size(); i++) {
                    if (username.equals(arrayListOfAllUsers.get(i).getUserName())) {
                        for (int j = 0; j < arrayListOfAllUsers.get(i).getListOfRoomsThisUserIsIn2().size(); j++) {
                            if (arrayListOfAllUsers.get(i).getListOfRoomsThisUserIsIn2().get(j).getRoomName().equals(message)) {
                                arrayListOfAllUsers.get(i).getListOfRoomsThisUserIsIn2().get(j).removeUserfromList(username);
                                break;
                            }
                        }
                    }
                }
                for (int i = 0; i < arrayListOfAllRooms.size(); i++) {
                    if (message.contains(arrayListOfAllRooms.get(i).getRoomName())) {
                        for (int j = 0; j < arrayListOfAllRooms.get(i).getListOfUsersInThisRoom2().size(); j++) {
                            if (arrayListOfAllRooms.get(i).getListOfUsersInThisRoom2().get(j).getUserName().equals(username)) {
                                arrayListOfAllRooms.get(i).getListOfUsersInThisRoom2().get(j).removeRoomfromList(message);
                                for (int k = 0; k < arrayListOfAllUsers.size(); k++) {
                                    if (arrayListOfAllUsers.get(k).getUserName().equals(username)) {
                                        sendMessage("RoomDeleted/" + arrayListOfAllUsers.get(k).getListOfRoomsInString());
                                        System.out.println(arrayListOfAllUsers.get(i).getListOfRoomsInString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // This methods is used to send message to the Client
        private void sendMessage(String message) {
            try {
                dos.writeUTF(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        // Send message to all existing users
        private void broadcast(String str) {
            for (int i = 0; i < userArrayList.size(); i++) {
                UserInfo user = (UserInfo) userArrayList.get(i);
                user.sendMessage(str);
            }
        }

        // Send message to specific user
        private void broadcastSpecific(String str, String username) {
            for (int i = 0; i < arrayListOfAllUsers.size(); i++) {
                UserInfo user = (UserInfo) userArrayList.get(i);
                if (user.getUsername().equals(username)) {
                    user.sendMessage(str);
                }
            }
        }
    }
}

