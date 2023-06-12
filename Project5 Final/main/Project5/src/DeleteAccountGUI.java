import javax.swing.*;

/**
 *
 * @author visa
 */
public class DeleteAccountGUI extends javax.swing.JFrame {

    /**
     * Creates new form CURRENT_DeleteAccount
     */
    public DeleteAccountGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        signupPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        deleteAccountTitle = new javax.swing.JLabel();
        usernamePasswordPanel = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameLine = new java.awt.Panel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLine = new java.awt.Panel();
        buttonPanel = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signupPanel.setBackground(new java.awt.Color(242, 243, 244));
        signupPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        signupPanel.setPreferredSize(new java.awt.Dimension(350, 500));

        titlePanel.setBackground(new java.awt.Color(242, 243, 244));

        deleteAccountTitle.setBackground(new java.awt.Color(242, 243, 244));
        deleteAccountTitle.setFont(new java.awt.Font("Avenir Next", 0, 47)); // NOI18N
        deleteAccountTitle.setForeground(new java.awt.Color(45, 52, 54));
        deleteAccountTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteAccountTitle.setText("Delete Account");
        deleteAccountTitle.setToolTipText("");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(deleteAccountTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addComponent(deleteAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        usernamePasswordPanel.setBackground(new java.awt.Color(242, 243, 244));

        usernameTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        usernameTextField.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(121, 125, 127));
        usernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameTextField.setToolTipText("Enter username");
        usernameTextField.setActionCommand("<Not Set>");
        usernameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        usernameTextField.setPreferredSize(new java.awt.Dimension(11, 30));

        usernameLabel.setBackground(new java.awt.Color(204, 204, 204));
        usernameLabel.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(99, 110, 114));
        usernameLabel.setText("Username");
        usernameLabel.setToolTipText("Username");

        usernameLine.setBackground(new java.awt.Color(99, 110, 114));
        usernameLine.setPreferredSize(new java.awt.Dimension(200, 1));

        javax.swing.GroupLayout usernameLineLayout = new javax.swing.GroupLayout(usernameLine);
        usernameLine.setLayout(usernameLineLayout);
        usernameLineLayout.setHorizontalGroup(
                usernameLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        usernameLineLayout.setVerticalGroup(
                usernameLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE)
        );

        passwordLabel.setBackground(new java.awt.Color(204, 204, 204));
        passwordLabel.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(99, 110, 114));
        passwordLabel.setText("Password");
        passwordLabel.setToolTipText("Password");

        passwordField.setBackground(new java.awt.Color(255, 255, 255, 0));
        passwordField.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        passwordField.setForeground(new java.awt.Color(121, 125, 127));
        passwordField.setToolTipText("");
        passwordField.setActionCommand("<Not Set>");
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passwordField.setPreferredSize(new java.awt.Dimension(11, 30));

        passwordLine.setBackground(new java.awt.Color(99, 110, 114));
        passwordLine.setPreferredSize(new java.awt.Dimension(200, 1));

        javax.swing.GroupLayout passwordLineLayout = new javax.swing.GroupLayout(passwordLine);
        passwordLine.setLayout(passwordLineLayout);
        passwordLineLayout.setHorizontalGroup(
                passwordLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        passwordLineLayout.setVerticalGroup(
                passwordLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout usernamePasswordPanelLayout = new javax.swing.GroupLayout(usernamePasswordPanel);
        usernamePasswordPanel.setLayout(usernamePasswordPanelLayout);
        usernamePasswordPanelLayout.setHorizontalGroup(
                usernamePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePasswordPanelLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(usernamePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(usernameLine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72))
        );
        usernamePasswordPanelLayout.setVerticalGroup(
                usernamePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePasswordPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usernameLabel)
                                .addGap(0, 0, 0)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(usernameLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(passwordLabel)
                                .addGap(4, 4, 4)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(passwordLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );

        buttonPanel.setBackground(new java.awt.Color(242, 243, 244));

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(99, 110, 114));
        deleteButton.setText("Delete");
        deleteButton.setToolTipText("Delete Account");
        deleteButton.setActionCommand("");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(99, 110, 114));
        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("Cancel");
        cancelButton.setActionCommand("");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteButton)
                                        .addComponent(cancelButton))
                                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout signupPanelLayout = new javax.swing.GroupLayout(signupPanel);
        signupPanel.setLayout(signupPanelLayout);
        signupPanelLayout.setHorizontalGroup(
                signupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(usernamePasswordPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signupPanelLayout.setVerticalGroup(
                signupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signupPanelLayout.createSequentialGroup()
                                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(usernamePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(signupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(signupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
        );

        pack();
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DeleteAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteAccountGUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel deleteAccountTitle;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private java.awt.Panel passwordLine;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel usernameLabel;
    private java.awt.Panel usernameLine;
    private javax.swing.JPanel usernamePasswordPanel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration

    /**
     * Getter and Setter Methods
     */
    // Getter and setter for Username Text Field
    public JTextField getUsernameTextField() {
        return usernameTextField;
    }
    public void setUsernameTextField(JTextField usernameTextField) {
        this.usernameTextField = usernameTextField;
    }

    // Getter and setter for Password Field
    public JPasswordField getPasswordField() {
        return passwordField;
    }
    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    // Getter for Delete Button
    public JButton getDeleteButton() {
        return deleteButton;
    }

    // Getter for Cancel Button
    public JButton getCancelButton() {
        return cancelButton;
    }


}
