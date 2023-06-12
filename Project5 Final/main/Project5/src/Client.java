import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

/**
 * A class that represents the Client.
 * It contains actionListeners that User interacts with
 *
 * <p>Purdue University -- CS18000 -- Fall 2020 -- Project5</p>
 *
 * @author Kil Junhyeok, An Nguyen, Hoang Nguyen, Xiaoke He, Theerapatra Thongdee
 * @version December 07, 2020
 */

public class Client extends JFrame implements ActionListener {

    // Login GUI Object
    LoginGUI loginGUI = new LoginGUI();

    // Sign up GUI Object
    SignupGUI signupGUI = new SignupGUI();

    // Edit Account GUI Object
    EditAccountGUI editAccountGUI = new EditAccountGUI();

    // Delete Account GUI Object
    DeleteAccountGUI deleteAccountGUI = new DeleteAccountGUI();

    // Main Interface GUI Object
    MainInterfaceGUI mainInterfaceGUI = new MainInterfaceGUI();

    // Edit Appearance GUI Object
    EditAppearanceGUI editAppearanceGUI = new EditAppearanceGUI();

    // Network I/O Fields
    public static Socket socket;
    private static String ip; // localhost
    private static int port;
    private static String userID = "";
    private static String password = "";
    private static InputStream is;
    private static OutputStream os;
    private static DataInputStream dis;
    private static DataOutputStream dos;

    private String myRoom;

    Client() {
        loginGUI.setVisible(true);

        start();
    }

    private void start() {
        // From Login GUI
        loginGUI.getLoginButton().addActionListener(this);
        loginGUI.getSignupButton().addActionListener(this);
        loginGUI.getEditAccountButton().addActionListener(this);
        loginGUI.getDeleteAccountButton().addActionListener(this);

        // From Sign up GUI
        signupGUI.getSignupButton().addActionListener(this);
        signupGUI.getLoginButton().addActionListener(this);

        // from Edit Account GUI
        editAccountGUI.getSaveButton().addActionListener(this);
        editAccountGUI.getCancelButton().addActionListener(this);

        // from Delete Account GUI
        deleteAccountGUI.getDeleteButton().addActionListener(this);
        deleteAccountGUI.getCancelButton().addActionListener(this);

        // from Main GUI
        mainInterfaceGUI.getDeleteButton().addActionListener(this);
        mainInterfaceGUI.getJoinButton().addActionListener(this);
        mainInterfaceGUI.getNewChatButton().addActionListener(this);
        mainInterfaceGUI.getSendButton().addActionListener(this);
        mainInterfaceGUI.getEditAppearanceButton().addActionListener(this);

        // from Edit Appearance GUI
        editAppearanceGUI.getSelectColorSaveButton().addActionListener(this);
    }

    // Join network method
    private void network() {

        try {
            socket = new Socket(ip, port);

            if (socket != null) {
                connection();
                mainInterfaceGUI.setVisible(true);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to connect"
                    , "notification", JOptionPane.ERROR_MESSAGE);
        }



    }
    // This method checks if User exists
    public static int checkUsername(String userID) {
        File toProcess = new File("Password");
        int usernameExists = 0; // 0 if false, 1 if true
        try (BufferedReader br = new BufferedReader(new FileReader(toProcess))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineValues;
                lineValues = line.split(", ");
                if (lineValues[0].equals(userID)) {
                    usernameExists = 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usernameExists;
    }

    // This method starts a new Thread
    private void connection() {

        try {
            is = socket.getInputStream();
            dis = new DataInputStream(is);

            os = socket.getOutputStream();
            dos = new DataOutputStream(os);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to connect"
                    , "notification", JOptionPane.ERROR_MESSAGE);
        } // Done with stream setting

        // Sends userID upon new connection
        sendMessage(userID + "," + password);

        // Add user to userList
        mainInterfaceGUI.userArrayList.add(userID);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    try {
                        String message = dis.readUTF(); // receiving message
                        System.out.println("Message from Server: " + message);

                        inMessage(message);

                    } catch (IOException e) {
                        try {
                            os.close();
                            is.close();
                            dos.close();
                            dis.close();
                            socket.close();
                            JOptionPane.showMessageDialog(null, "Disconnected"
                                    , "notification", JOptionPane.ERROR_MESSAGE);
                        } catch (IOException e1) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
            }
        });
        thread.start();
    }

    //This method receives the chat message ArrayList from the Server and formats it
    private String formatChats(String message) {
        String message2 = message.substring(1, message.length() - 1);
        String message3 = message2.replaceAll(", ", "\n");
        return message3;
    }
    // All the message received from server
    private void inMessage(String str) {
        String[] strInArray = str.split("/");
        String protocol = strInArray[0];
        String message = strInArray[1];
        System.out.println("Protocol: " + protocol);
        System.out.println("Message: " + message);

        if (protocol.equals("WrongPassword")) {
            JOptionPane.showMessageDialog(null, message
                    , "notification", JOptionPane.ERROR_MESSAGE);
            return;
        }

        loginGUI.setVisible(false);

        if (protocol.equals("NewUser")) {
            mainInterfaceGUI.userArrayList.add(message);
        } else if (protocol.equals("OldUser")) {
            mainInterfaceGUI.userArrayList.add(message);
        } else if (protocol.equals("UpdateUserList")) {
            System.out.println(mainInterfaceGUI.userArrayList);
            mainInterfaceGUI.updateUsersList();
//            userList.setListData(userArrayList.toArray());
            System.out.println("User List Updated  ---------------------");
        } else if (protocol.equals("CreatedRoom")) { // When room has been created
            String[] messageInArray = message.split(", ");
            System.out.println(messageInArray);
            mainInterfaceGUI.updateChatRoomList(messageInArray);
//            chatRoomList.setListData(messageInArray);

        } else if (protocol.equals("CreateRoomFail")) { // When failed to create room
            JOptionPane.showMessageDialog(null, "Failed to create chat room"
                    , "notification", JOptionPane.ERROR_MESSAGE);
        } else if (protocol.equals("AddedToRoom")) { // When user has been added to a room
            String[] messageInArray = message.split(", ");
            System.out.println(messageInArray);
            mainInterfaceGUI.updateChatRoomList(messageInArray);
//            chatRoomList.setListData(messageInArray);

        } else if (protocol.equals("UpdateChatList")) {

        } else if (protocol.equals("UserLost")) {
            mainInterfaceGUI.userArrayList.remove(message);
            System.out.println("User Lost ---------------------");
        } else if (protocol.equals("DeleteRoom")) {

        } else if (protocol.equals("WriteOnTextArea")) {
            System.out.println(message);
            String[] messagesInArray = message.split(", ");
            mainInterfaceGUI.getChatTextArea().append(messagesInArray[messagesInArray.length - 1] + "\n");
        } else if (protocol.equals("ShowingChat")) {
            myRoom = strInArray[2];
            System.out.println("showing chat works");
            mainInterfaceGUI.getChatTextArea().setText(formatChats(message));
            mainInterfaceGUI.getSendButton().setEnabled(true);
            mainInterfaceGUI.getMessageTextField().setEnabled(true);

        } else if (protocol.equals("UpdateTextArea")) {
            // String username = strInArray[2];
            System.out.println("update Textarea works");
            mainInterfaceGUI.getChatTextArea().setText(formatChats(message));
        } else if (protocol.equals("RoomDeleted")) {
            String[] messageInArray = message.split(", ");
            System.out.println(messageInArray);
            mainInterfaceGUI.updateChatRoomList(messageInArray);
//            chatRoomList.setListData(messageInArray);
        } else if (protocol.equals("UpdateTextAreaForSpecificRoom")) {
            System.out.println("updatedtextforspecificroom works");
            String roomThatIAmIn = strInArray[2];
            // String username = strInArray[3];
            if (roomThatIAmIn.equals(myRoom)) {
                mainInterfaceGUI.getChatTextArea().setText(formatChats(message));
            }
        }
    }

    // Sends message to server
    private void sendMessage(String message) {
        try {
            dos.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

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


        Client user = new Client();

    }

    //This method checks if Username exists
    public static boolean usernameExists(String username) {
        File toProcess = new File("Password.txt");
        boolean usernameExists = false;
        try (BufferedReader br = new BufferedReader(new FileReader(toProcess))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineValues = line.split(", ");
                if (lineValues[0].equals(username)) {
                    usernameExists = true;
                }
            }
            return usernameExists;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return usernameExists;
    }

    //This method creates new User account
    public void createUser(String username, String password) throws FileNotFoundException {
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        if (usernameExists(username)) {
            JOptionPane.showMessageDialog(null, "Username unavailable",
                    "Sign Up Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // copies the usernames and passwords to an arraylist to add them
        File toProcess = new File("Password.txt");
        FileReader fileReader = new FileReader(toProcess);
        try (BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineValues;
                lineValues = line.split(", ");
                usernames.add(lineValues[0]);
                passwords.add(lineValues[1]);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // copies the username and password to new Password file
        try {
            FileOutputStream fos = new FileOutputStream(new File("Password.txt"));
            PrintWriter pw = new PrintWriter(fos);

            for (int i = 0; i < usernames.size(); i++) {
                pw.println(usernames.get(i) + ", " + passwords.get(i));
            }
            pw.println(username + ", " + password);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "User Created.",
                "Sign Up", JOptionPane.INFORMATION_MESSAGE);

        signupGUI.setVisible(false);
        loginGUI.setVisible(true);

    }

    //This method edits User account
    public void editUser(String oldUsername, String oldPassword, String newUsername, String newPassword) {
        ArrayList<String> usernames = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        File toProcess = new File("Password.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(toProcess))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineValues = line.split(", ");
                if (lineValues[0].equals(oldUsername)) {
                    //do nothing
                } else {
                    usernames.add(lineValues[0]);
                    passwords.add(lineValues[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // copies the new username and new password to new Password file
        try {
            FileOutputStream fos = new FileOutputStream(new File("Password.txt"));
            PrintWriter pw = new PrintWriter(fos);

            for (int i = 0; i < usernames.size(); i++) {
                pw.println(usernames.get(i) + ", " + passwords.get(i));
            }
            pw.println(newUsername + ", " + newPassword);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "Account information has been edited",
                "Editing Successful", JOptionPane.INFORMATION_MESSAGE);

        editAccountGUI.setVisible(false);
        loginGUI.setVisible(true);
//        try {
//            File toProcess = new File("Password");
//            FileReader fileReader = new FileReader(toProcess);
//            try (BufferedReader br = new BufferedReader(fileReader)) {
//                String line;
//                while ((line = br.readLine()) != null) {
//                    String[] lineValues;
//                    lineValues = line.split(", ");
//                    if (oldUsername.equals(lineValues[0].trim())) {
//                        oldUsername = newUsername;
//                        lineValues[1] = newPassword;
//                    }
//                }
//                fileReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    // This method deletes User account
    public void deleteUser(String username) throws IOException {
        File toProcess = new File("Password.txt");
        File tempFile = new File("myTempFile");

        BufferedReader reader = new BufferedReader(new FileReader(toProcess));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            String[] thisUsername;
            thisUsername = currentLine.split(",");
            if (thisUsername[0].trim().equals(username)) {
                continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
            System.out.println(thisUsername[0]);
        }
        writer.close();
        reader.close();

        toProcess.delete();
        boolean successful = tempFile.renameTo(toProcess);
        System.out.println(successful);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /* Login Screen */
        // Login Button
        if (e.getSource() == loginGUI.getLoginButton()) {
            if (loginGUI.getipTextField().getText().length() == 0) {
                loginGUI.getipTextField().setText("Enter IP Address");
                loginGUI.getipTextField().requestFocus();
            } else if (loginGUI.getPortTextField().getText().length() == 0) {
                loginGUI.getPortTextField().setText("Enter Port Number");
                loginGUI.getPortTextField().requestFocus();
            } else if (loginGUI.getUsernameTextField().getText().length() == 0) {
                loginGUI.getUsernameTextField().setText("Enter Username");
                loginGUI.getUsernameTextField().requestFocus();
            } else if (String.valueOf(loginGUI.getPasswordField().getPassword()).length() == 0) {
                loginGUI.getPasswordField().setText("Enter Password");
                loginGUI.getPasswordField().requestFocus();
            } else {
                ip = loginGUI.getipTextField().getText().trim();
                port = Integer.parseInt(loginGUI.getPortTextField().getText().trim());
                userID = loginGUI.getUsernameTextField().getText().trim();
                password = String.valueOf(loginGUI.getPasswordField().getPassword()).trim();
            }

            // Clear all text fields
            loginGUI.getipTextField().setText("");
            loginGUI.getPortTextField().setText("");
            loginGUI.getUsernameTextField().setText("");
            loginGUI.getPasswordField().setText("");

            network();

        }
        // Sign Up Button (change screens)
        if (e.getSource() == loginGUI.getSignupButton()) {
            // Clear all text fields
            loginGUI.getipTextField().setText("");
            loginGUI.getPortTextField().setText("");
            loginGUI.getUsernameTextField().setText("");
            loginGUI.getPasswordField().setText("");

            loginGUI.setVisible(false);
            signupGUI.setVisible(true);
        }

        // Edit Account Button (change screens)
        if (e.getSource() == loginGUI.getEditAccountButton()) {
            // Clear all text fields
            loginGUI.getipTextField().setText("");
            loginGUI.getPortTextField().setText("");
            loginGUI.getUsernameTextField().setText("");
            loginGUI.getPasswordField().setText("");

            loginGUI.setVisible(false);
            editAccountGUI.setVisible(true);
        }

        // Delete Account Button (change screens)
        if (e.getSource() == loginGUI.getDeleteAccountButton()) {
            // Clear all text fields
            loginGUI.getipTextField().setText("");
            loginGUI.getPortTextField().setText("");
            loginGUI.getUsernameTextField().setText("");
            loginGUI.getPasswordField().setText("");

            loginGUI.setVisible(false);
            deleteAccountGUI.setVisible(true);
        }

        /* Sign Up Screen */
        // Sign up button in sign up screen
        if (e.getSource() == signupGUI.getSignupButton()) {

            // Create username
            String usernameCreate = null;
            usernameCreate = signupGUI.getUsernameTextField().getText();
            System.out.println("Username created! " + usernameCreate);

            // Create password
            String passwordCreate = null;
            passwordCreate = String.valueOf(signupGUI.getPasswordField().getPassword());
            System.out.println("Password created! " + passwordCreate);
            //sendMessage("Create," + usernameCreate + "," + passwordCreate);

            try {
                createUser(usernameCreate, passwordCreate);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

            // Clear all text fields in Signup GUI
            signupGUI.getUsernameTextField().setText("");
            signupGUI.getPasswordField().setText("");

        }

        // Login button on sign up screen (change screens)
        if (e.getSource() == signupGUI.getLoginButton()) {
            signupGUI.setVisible(false);
            loginGUI.setVisible(true);

            // Clear all text fields in Signup GUI
            signupGUI.getUsernameTextField().setText("");
            signupGUI.getPasswordField().setText("");
        }

        /*
          Edit Account Screen
         */
        // Save button on edit account screen
        if (e.getSource() == editAccountGUI.getSaveButton()) {
            String oldUsername = editAccountGUI.getOldUsernameTextField().getText();
            String oldPassword = editAccountGUI.getOldPasswordTextField().getText();

            String newUsername = editAccountGUI.getNewUsernameTextField().getText();
            String newPassword = String.valueOf(editAccountGUI.getNewPasswordField().getPassword());

            if (usernameExists(oldUsername)) {
                editUser(oldUsername, oldPassword, newUsername, newPassword);
            } else if (!usernameExists(oldUsername)) {
                JOptionPane.showMessageDialog(null, "User does not exist. Try again.",
                        "Editing error", JOptionPane.ERROR_MESSAGE);
            }
//
            // Clear all text fields in Edit Account GUI
            editAccountGUI.getOldUsernameTextField().setText("");
            editAccountGUI.getOldPasswordTextField().setText("");
            editAccountGUI.getNewUsernameTextField().setText("");
            editAccountGUI.getNewPasswordField().setText("");

        }
        // Cancel button on edit account screen (change screens)
        if (e.getSource() == editAccountGUI.getCancelButton()) {
            editAccountGUI.setVisible(false);
            loginGUI.setVisible(true);

            // Clear all text fields in Edit Account GUI
            editAccountGUI.getOldUsernameTextField().setText("");
            editAccountGUI.getOldPasswordTextField().setText("");
            editAccountGUI.getNewUsernameTextField().setText("");
            editAccountGUI.getNewPasswordField().setText("");
        }

        /**
         * Delete Account Screen
         */
        // Delete button on delete account screen
        if (e.getSource() == deleteAccountGUI.getDeleteButton()) {
            // Assign values to username and password
            String usernameDelete = deleteAccountGUI.getUsernameTextField().getText();
            String passwordDelete = String.valueOf(deleteAccountGUI.getPasswordField().getPassword());

            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete the account "
                    + usernameDelete + "?", "Delete Account Confirmation", JOptionPane.YES_NO_OPTION);


            if ((confirmation == JOptionPane.YES_OPTION) && usernameExists(usernameDelete)) {
                try {
                    deleteUser(usernameDelete);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            } else if (!usernameExists(usernameDelete)) {
                JOptionPane.showMessageDialog(null, "User does not exist. Try again.",
                        "Deleting error", JOptionPane.ERROR_MESSAGE);
            }

            // Clear all text fields in Delete Account GUI
            deleteAccountGUI.getUsernameTextField().setText("");
            deleteAccountGUI.getPasswordField().setText("");

        }

        // Cancel button on delete account screen
        if (e.getSource() == deleteAccountGUI.getCancelButton()) {
            deleteAccountGUI.setVisible(false);
            loginGUI.setVisible(true);

            // Clear all text fields in Delete Account GUI
            deleteAccountGUI.getUsernameTextField().setText("");
            deleteAccountGUI.getPasswordField().setText("");
        }

        /* Main Interface Screen */
        // Delete Button
        if (e.getSource() == mainInterfaceGUI.getDeleteButton()) {
            System.out.println("deleteButton Clicked");
            String DeleteRoom = (String) mainInterfaceGUI.getChatRoomsList().getSelectedValue();
            sendMessage("DeleteRoom/" + DeleteRoom + "/" + userID);

        }
        if (e.getSource() == mainInterfaceGUI.getNewChatButton()) {
            boolean invite = true;
            String userToInvite = "";
            String roomName = JOptionPane.showInputDialog("Room Name");
            String[] onlineUsers = new String[mainInterfaceGUI.userArrayList.size()];
            for (int i = 0; i < mainInterfaceGUI.userArrayList.size(); i++) {
                if (!mainInterfaceGUI.userArrayList.get(i).equals(userID)) {
                    onlineUsers[i] = mainInterfaceGUI.userArrayList.get(i);
                }
            }
            if (roomName != null) {
                sendMessage("CreateRoom/" + roomName + "/" + userID);
            }
            while (invite) {
                userToInvite = (String) JOptionPane.showInputDialog(null, "Choose users to invite"
                        , "Online users", JOptionPane.PLAIN_MESSAGE, null, onlineUsers, onlineUsers[0]);

                sendMessage("AddUserToRoom/" + roomName + "/" + userToInvite);

                int result = JOptionPane.showConfirmDialog(null, "Invite another user?", "Question", JOptionPane.YES_NO_CANCEL_OPTION);

                if(result == JOptionPane.NO_OPTION) {
                    invite = false;
                }
            }
            System.out.println("newChatButton Clicked");

        }
        if (e.getSource() == mainInterfaceGUI.getSendButton()) {
            sendMessage("Chatting/" + myRoom + "/" + mainInterfaceGUI.getMessageTextField().getText().trim() + "/" + userID);
            mainInterfaceGUI.getMessageTextField().setText("");
            mainInterfaceGUI.getMessageTextField().requestFocus();
            System.out.println("sendButton Clicked");

        }
        if (e.getSource() == mainInterfaceGUI.getJoinButton()) {
            String JoinedRoom = (String) mainInterfaceGUI.getChatRoomsList().getSelectedValue();
            sendMessage("JoinRoom/" + JoinedRoom + "/" + userID);
            System.out.println("joinButton Clicked");
        }
        if (e.getSource() == mainInterfaceGUI.getEditAppearanceButton()) {
            System.out.println("hi");
            editAppearanceGUI.setVisible(true);
        }

        /*
           Edit Appearance GUI
         */
        if (e.getSource() == editAppearanceGUI.getSelectColorSaveButton()) {
            if (editAppearanceGUI.getColorComboBox().getSelectedItem() == "White") {
                mainInterfaceGUI.getChatTextArea().setBackground(new java.awt.Color(255, 255, 255));
            } else if (editAppearanceGUI.getColorComboBox().getSelectedItem() == "Gray") {
                mainInterfaceGUI.getChatTextArea().setBackground(new java.awt.Color(204, 204, 204));
            } else if (editAppearanceGUI.getColorComboBox().getSelectedItem() == "Green") {
                mainInterfaceGUI.getChatTextArea().setBackground(new java.awt.Color(209, 255, 198));
            } else if (editAppearanceGUI.getColorComboBox().getSelectedItem() == "Blue") {
                mainInterfaceGUI.getChatTextArea().setBackground(new java.awt.Color(198, 230, 255));
            } else if (editAppearanceGUI.getColorComboBox().getSelectedItem() == "Purple") {
                mainInterfaceGUI.getChatTextArea().setBackground(new java.awt.Color(224, 198, 255));
            } else if (editAppearanceGUI.getColorComboBox().getSelectedItem() == "Pink") {
                mainInterfaceGUI.getChatTextArea().setBackground(new java.awt.Color(255, 198, 198));
            }
            editAppearanceGUI.setVisible(false);
        }


    }
}