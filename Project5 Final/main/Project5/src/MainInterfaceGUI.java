import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class MainInterfaceGUI extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainInterfaceGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void updateUsersList() {
        usersOnlineList.setListData(userArrayList.toArray());
    }

    public void updateChatRoomList(String[] chatRoomArrayList) {
        chatRoomsList.setListData(chatRoomArrayList);
    }


    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        listPanel = new java.awt.Panel();
        chatRoomsLabel = new javax.swing.JLabel();
        usersOnlineLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        joinButton = new javax.swing.JButton();
        newChatButton = new javax.swing.JButton();

        usersOnlineScrollPane = new javax.swing.JScrollPane();
        usersOnlineList = new javax.swing.JList<>();
//        usersOnlineList.setListData((String[]) userArrayList.toArray());

        chatRoomsScrollPane = new javax.swing.JScrollPane();
        chatRoomsList = new javax.swing.JList<>();
//        chatRoomsList.setListData((String[]) chatRoomArrayList.toArray());

        chatPanel = new java.awt.Panel();
        sendButton = new javax.swing.JButton();
        editAppearanceButton = new javax.swing.JButton();
        messageTextField = new javax.swing.JTextField();
        messageLine = new java.awt.Panel();
        chatScrollPane = new javax.swing.JScrollPane();
        chatTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 650));

        backgroundPanel.setSize(new java.awt.Dimension(850, 650));

        listPanel.setBackground(new java.awt.Color(233, 233, 233));
        listPanel.setPreferredSize(new java.awt.Dimension(250, 650));

        chatRoomsLabel.setBackground(new java.awt.Color(204, 204, 204));
        chatRoomsLabel.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        chatRoomsLabel.setForeground(new java.awt.Color(99, 110, 114));
        chatRoomsLabel.setText("Chat Rooms");
        chatRoomsLabel.setToolTipText("Username");
        chatRoomsLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        usersOnlineLabel.setBackground(new java.awt.Color(204, 204, 204));
        usersOnlineLabel.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        usersOnlineLabel.setForeground(new java.awt.Color(99, 110, 114));
        usersOnlineLabel.setText("Users");
        usersOnlineLabel.setToolTipText("Username");
        usersOnlineLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(99, 110, 114));
        deleteButton.setText("Delete");
        deleteButton.setToolTipText("Delete Chat Room");
        deleteButton.setActionCommand("");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        joinButton.setBackground(new java.awt.Color(255, 255, 255));
        joinButton.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        joinButton.setForeground(new java.awt.Color(99, 110, 114));
        joinButton.setText("Join");
        joinButton.setToolTipText("Join Chat Room");
        joinButton.setActionCommand("");
        joinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        newChatButton.setBackground(new java.awt.Color(255, 255, 255));
        newChatButton.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        newChatButton.setForeground(new java.awt.Color(99, 110, 114));
        newChatButton.setText("New Chat");
        newChatButton.setToolTipText("Add a New Chat Room");
        newChatButton.setActionCommand("");
        newChatButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        usersOnlineList.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        usersOnlineScrollPane.setViewportView(usersOnlineList);

        chatRoomsList.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        chatRoomsScrollPane.setViewportView(chatRoomsList);

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
                listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listPanelLayout.createSequentialGroup()
                                .addContainerGap(49, Short.MAX_VALUE)
                                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(newChatButton, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                        .addComponent(joinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chatRoomsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(usersOnlineLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(usersOnlineScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(chatRoomsScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap(45, Short.MAX_VALUE))
        );
        listPanelLayout.setVerticalGroup(
                listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listPanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(usersOnlineLabel)
                                .addGap(0, 0, 0)
                                .addComponent(usersOnlineScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(chatRoomsLabel)
                                .addGap(0, 0, 0)
                                .addComponent(chatRoomsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addGap(46, 46, 46)
                                .addComponent(deleteButton)
                                .addGap(12, 12, 12)
                                .addComponent(joinButton)
                                .addGap(12, 12, 12)
                                .addComponent(newChatButton)
                                .addGap(41, 41, 41))
        );

        chatPanel.setBackground(new java.awt.Color(242, 243, 244));

        sendButton.setBackground(new java.awt.Color(255, 255, 255));
        sendButton.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        sendButton.setForeground(new java.awt.Color(99, 110, 114));
        sendButton.setText("Send");
        sendButton.setToolTipText("Send your message");
        sendButton.setActionCommand("");
        sendButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        // Jun's edit
        if (messageTextField.equals(null)) {
            sendButton.setEnabled(false);
        }

        editAppearanceButton.setBackground(new java.awt.Color(255, 255, 255));
        editAppearanceButton.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        editAppearanceButton.setForeground(new java.awt.Color(99, 110, 114));
        editAppearanceButton.setText("Edit Appearance");
        editAppearanceButton.setToolTipText("Edit the appearance of your chatroom");
        editAppearanceButton.setActionCommand("");
        editAppearanceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        messageTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        messageTextField.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        messageTextField.setForeground(new java.awt.Color(121, 125, 127));
        messageTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        messageTextField.setToolTipText("Enter username");
        messageTextField.setActionCommand("<Not Set>");
        messageTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        messageTextField.setPreferredSize(new java.awt.Dimension(11, 30));

        messageLine.setBackground(new java.awt.Color(99, 110, 114));
        messageLine.setPreferredSize(new java.awt.Dimension(200, 1));

        javax.swing.GroupLayout messageLineLayout = new javax.swing.GroupLayout(messageLine);
        messageLine.setLayout(messageLineLayout);
        messageLineLayout.setHorizontalGroup(
                messageLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        messageLineLayout.setVerticalGroup(
                messageLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE)
        );

        chatTextArea.setEditable(false);
        chatTextArea.setColumns(20);
        chatTextArea.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        chatTextArea.setRows(5);
        chatTextArea.setMinimumSize(new java.awt.Dimension(1, 1));
        chatScrollPane.setViewportView(chatTextArea);

        javax.swing.GroupLayout chatPanelLayout = new javax.swing.GroupLayout(chatPanel);
        chatPanel.setLayout(chatPanelLayout);
        chatPanelLayout.setHorizontalGroup(
                chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chatPanelLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(chatPanelLayout.createSequentialGroup()
                                                .addGroup(chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(messageLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(messageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(chatScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
                                .addGap(63, 63, 63))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chatPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editAppearanceButton)
                                .addGap(55, 55, 55))
        );
        chatPanelLayout.setVerticalGroup(
                chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chatPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(editAppearanceButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chatScrollPane)
                                .addGap(18, 18, 18)
                                .addGroup(chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sendButton))
                                .addComponent(messageLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(chatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );

        pack();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterfaceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterfaceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JPanel backgroundPanel;
    private java.awt.Panel chatPanel;
    private javax.swing.JLabel chatRoomsLabel;
    private javax.swing.JList<Object> chatRoomsList;
    private javax.swing.JScrollPane chatRoomsScrollPane;
    private javax.swing.JScrollPane chatScrollPane;
    private javax.swing.JTextArea chatTextArea;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editAppearanceButton;
    private javax.swing.JButton joinButton;
    private java.awt.Panel listPanel;
    private java.awt.Panel messageLine;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JButton newChatButton;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel usersOnlineLabel;
    private JList<Object> usersOnlineList;
    private javax.swing.JScrollPane usersOnlineScrollPane;
    ArrayList<String> userArrayList = new ArrayList<String>();
    ArrayList<String> chatRoomArrayList = new ArrayList<String>();
    // End of variables declaration



    /**
     * Getter and Setter Methods
     */

    // Users Array List
    public ArrayList<String> getUserArrayList() {
        return userArrayList;
    }
    public void setUserArrayList(ArrayList<String> userArrayList) {
        this.userArrayList = userArrayList;
    }

    // Chat Rooms Array List
    public ArrayList<String> getChatRoomArrayList() {
        return chatRoomArrayList;
    }
    public void setChatRoomArrayList(ArrayList<String> chatRoomArrayList) {
        this.userArrayList = chatRoomArrayList;
    }

    // Getter and setter for Users List
    public JList<Object> getUsersOnlineList() {
        return usersOnlineList;
    }

    public void setUsersOnlineList(String[] usersOnline) {
        this.usersOnlineList.setListData(usersOnline);

//        this.usersOnlineList = usersOnlineList;
    }

    // Getter and setter for Chat Rooms List
    public JList<Object> getChatRoomsList() {
        return chatRoomsList;
    }
    public void setChatRoomsList(String[] chatRooms) {
        this.chatRoomsList.setListData(chatRooms);
//        this.chatRoomsList = chatRoomsList;
    }


    // Getter for Delete Button
    public JButton getDeleteButton() {
        return deleteButton;
    }

    // Getter for Join Button
    public JButton getJoinButton() {
        return joinButton;
    }

    // Getter for New Chat Button
    public JButton getNewChatButton() {
        return newChatButton;
    }

    // Getter and setter for Chat Text Area
    public JTextArea getChatTextArea() {
        return chatTextArea;
    }
    public void setChatTextArea(JTextArea chatTextArea) {
        this.chatTextArea = chatTextArea;
    }

    // Getter and setter for Message Text Field
    public JTextField getMessageTextField() {
        return messageTextField;
    }
    public void setMessageTextField(JTextField messageTextField) {
        this.messageTextField = messageTextField;
    }

    // Getter for Send Button
    public JButton getSendButton() {
        return sendButton;
    }

    // Getter for Edit Appearance Button
    public JButton getEditAppearanceButton() {
        return editAppearanceButton;
    }

}
