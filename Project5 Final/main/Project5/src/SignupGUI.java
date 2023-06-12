
import javax.swing.*;

public class SignupGUI extends javax.swing.JFrame {

    /**
     * Creates new form SignUpGUI
     */
    public SignupGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        signUpPrompt = new javax.swing.JLabel();
        signupPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        signupTitle = new javax.swing.JLabel();
        usernamePasswordPanel = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameLine = new java.awt.Panel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLine = new java.awt.Panel();
        buttonPanel = new javax.swing.JPanel();
        signupButton = new javax.swing.JButton();
        loginPrompt = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        signUpPrompt.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        signUpPrompt.setForeground(new java.awt.Color(153, 153, 153));
        signUpPrompt.setText("Already have an account?");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signupPanel.setBackground(new java.awt.Color(242, 243, 244));
        signupPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        signupPanel.setPreferredSize(new java.awt.Dimension(350, 500));

        titlePanel.setBackground(new java.awt.Color(242, 243, 244));

        signupTitle.setBackground(new java.awt.Color(242, 243, 244));
        signupTitle.setFont(new java.awt.Font("Avenir Next", 0, 50)); // NOI18N
        signupTitle.setForeground(new java.awt.Color(45, 52, 54));
        signupTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signupTitle.setText("Sign Up");
        signupTitle.setToolTipText("");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(signupTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addComponent(signupTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
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

        signupButton.setBackground(new java.awt.Color(255, 255, 255));
        signupButton.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        signupButton.setForeground(new java.awt.Color(99, 110, 114));
        signupButton.setText("Sign Up");
        signupButton.setToolTipText("Sign Up");
        signupButton.setActionCommand("");
        signupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        loginPrompt.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        loginPrompt.setForeground(new java.awt.Color(153, 153, 153));
        loginPrompt.setText("Already have an account?");

        loginButton.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        loginButton.setForeground(new java.awt.Color(153, 153, 153));
        loginButton.setText("Log In");
        loginButton.setToolTipText("Log In");
        loginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginPrompt)
                                .addGap(0, 0, 0)
                                .addComponent(loginButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(signupButton)
                                .addGap(27, 27, 27)
                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginPrompt)
                                        .addComponent(loginButton))
                                .addContainerGap(81, Short.MAX_VALUE))
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
                        .addComponent(signupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(signupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupGUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginPrompt;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private java.awt.Panel passwordLine;
    private javax.swing.JLabel signUpPrompt;
    private javax.swing.JButton signupButton;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JLabel signupTitle;
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

    // Getter and setter for Sign Up Button
    public JButton getSignupButton() {
        return signupButton;
    }
    public void setSignupButton(JButton signupButton) {
        this.signupButton = signupButton;
    }
    // Getter and setter for Log In Button
    public JButton getLoginButton() {
        return loginButton;
    }
    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }


}
