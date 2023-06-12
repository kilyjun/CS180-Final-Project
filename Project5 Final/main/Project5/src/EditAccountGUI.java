/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author visa
 */
public class EditAccountGUI extends javax.swing.JFrame {

    /**
     * Creates new form CURRENT_EditAccount
     */
    public EditAccountGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        editAccountPanel = new javax.swing.JPanel();
        oldInfoPanel = new javax.swing.JPanel();
        oldUsernameLabel = new javax.swing.JLabel();
        oldUsernameTextField = new javax.swing.JTextField();
        oldUsernameLine = new java.awt.Panel();
        oldPasswordLabel = new javax.swing.JLabel();
        oldPasswordTextField = new javax.swing.JTextField();
        oldPasswordLine = new java.awt.Panel();
        newInfoPanel = new javax.swing.JPanel();
        newUsernameTextField = new javax.swing.JTextField();
        newUsernameLabel = new javax.swing.JLabel();
        newUsernameLine = new java.awt.Panel();
        newPasswordLabel = new javax.swing.JLabel();
        newPasswordField = new javax.swing.JPasswordField();
        newPasswordLine = new java.awt.Panel();
        buttonPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        editAccountTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editAccountPanel.setBackground(new java.awt.Color(242, 243, 244));
        editAccountPanel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        editAccountPanel.setPreferredSize(new java.awt.Dimension(350, 670));

        oldInfoPanel.setBackground(new java.awt.Color(242, 243, 244));

        oldUsernameLabel.setBackground(new java.awt.Color(204, 204, 204));
        oldUsernameLabel.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        oldUsernameLabel.setForeground(new java.awt.Color(99, 110, 114));
        oldUsernameLabel.setText("Old Username");
        oldUsernameLabel.setToolTipText("Old Username");

        oldUsernameTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        oldUsernameTextField.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        oldUsernameTextField.setForeground(new java.awt.Color(121, 125, 127));
        oldUsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        oldUsernameTextField.setToolTipText("Enter your old username");
        oldUsernameTextField.setActionCommand("<Not Set>");
        oldUsernameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        oldUsernameTextField.setPreferredSize(new java.awt.Dimension(11, 30));

        oldUsernameLine.setBackground(new java.awt.Color(99, 110, 114));
        oldUsernameLine.setPreferredSize(new java.awt.Dimension(200, 1));

        javax.swing.GroupLayout oldUsernameLineLayout = new javax.swing.GroupLayout(oldUsernameLine);
        oldUsernameLine.setLayout(oldUsernameLineLayout);
        oldUsernameLineLayout.setHorizontalGroup(
                oldUsernameLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        oldUsernameLineLayout.setVerticalGroup(
                oldUsernameLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE)
        );

        oldPasswordLabel.setBackground(new java.awt.Color(204, 204, 204));
        oldPasswordLabel.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        oldPasswordLabel.setForeground(new java.awt.Color(99, 110, 114));
        oldPasswordLabel.setText("Old Password");
        oldPasswordLabel.setToolTipText("Old Password");

        oldPasswordTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        oldPasswordTextField.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        oldPasswordTextField.setForeground(new java.awt.Color(121, 125, 127));
        oldPasswordTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        oldPasswordTextField.setToolTipText("Enter your old password");
        oldPasswordTextField.setActionCommand("<Not Set>");
        oldPasswordTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        oldPasswordTextField.setPreferredSize(new java.awt.Dimension(11, 30));

        oldPasswordLine.setBackground(new java.awt.Color(99, 110, 114));
        oldPasswordLine.setPreferredSize(new java.awt.Dimension(200, 1));

        javax.swing.GroupLayout oldPasswordLineLayout = new javax.swing.GroupLayout(oldPasswordLine);
        oldPasswordLine.setLayout(oldPasswordLineLayout);
        oldPasswordLineLayout.setHorizontalGroup(
                oldPasswordLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        oldPasswordLineLayout.setVerticalGroup(
                oldPasswordLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout oldInfoPanelLayout = new javax.swing.GroupLayout(oldInfoPanel);
        oldInfoPanel.setLayout(oldInfoPanelLayout);
        oldInfoPanelLayout.setHorizontalGroup(
                oldInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oldInfoPanelLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(oldInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(oldUsernameLine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(oldUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(oldUsernameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(oldPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(oldPasswordLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(oldPasswordTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72))
        );
        oldInfoPanelLayout.setVerticalGroup(
                oldInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oldInfoPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(oldUsernameLabel)
                                .addGap(0, 0, 0)
                                .addComponent(oldUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(oldUsernameLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(oldPasswordLabel)
                                .addGap(3, 3, 3)
                                .addComponent(oldPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(oldPasswordLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );

        newInfoPanel.setBackground(new java.awt.Color(242, 243, 244));

        newUsernameTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        newUsernameTextField.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        newUsernameTextField.setForeground(new java.awt.Color(121, 125, 127));
        newUsernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        newUsernameTextField.setToolTipText("Enter a username you want to choose to");
        newUsernameTextField.setActionCommand("<Not Set>");
        newUsernameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        newUsernameTextField.setPreferredSize(new java.awt.Dimension(11, 30));

        newUsernameLabel.setBackground(new java.awt.Color(204, 204, 204));
        newUsernameLabel.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        newUsernameLabel.setForeground(new java.awt.Color(99, 110, 114));
        newUsernameLabel.setText("New Username");
        newUsernameLabel.setToolTipText("New Username");

        newUsernameLine.setBackground(new java.awt.Color(99, 110, 114));
        newUsernameLine.setPreferredSize(new java.awt.Dimension(200, 1));

        javax.swing.GroupLayout newUsernameLineLayout = new javax.swing.GroupLayout(newUsernameLine);
        newUsernameLine.setLayout(newUsernameLineLayout);
        newUsernameLineLayout.setHorizontalGroup(
                newUsernameLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        newUsernameLineLayout.setVerticalGroup(
                newUsernameLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE)
        );

        newPasswordLabel.setBackground(new java.awt.Color(204, 204, 204));
        newPasswordLabel.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(99, 110, 114));
        newPasswordLabel.setText("Password");
        newPasswordLabel.setToolTipText("Password");

        newPasswordField.setBackground(new java.awt.Color(255, 255, 255, 0));
        newPasswordField.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        newPasswordField.setForeground(new java.awt.Color(121, 125, 127));
        newPasswordField.setToolTipText("Enter a passwrod you want to choose to");
        newPasswordField.setActionCommand("<Not Set>");
        newPasswordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        newPasswordField.setPreferredSize(new java.awt.Dimension(11, 30));

        newPasswordLine.setBackground(new java.awt.Color(99, 110, 114));
        newPasswordLine.setPreferredSize(new java.awt.Dimension(200, 1));

        javax.swing.GroupLayout newPasswordLineLayout = new javax.swing.GroupLayout(newPasswordLine);
        newPasswordLine.setLayout(newPasswordLineLayout);
        newPasswordLineLayout.setHorizontalGroup(
                newPasswordLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        newPasswordLineLayout.setVerticalGroup(
                newPasswordLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout newInfoPanelLayout = new javax.swing.GroupLayout(newInfoPanel);
        newInfoPanel.setLayout(newInfoPanelLayout);
        newInfoPanelLayout.setHorizontalGroup(
                newInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newInfoPanelLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(newInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(newUsernameLine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newUsernameTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newPasswordLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72))
        );
        newInfoPanelLayout.setVerticalGroup(
                newInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newInfoPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newUsernameLabel)
                                .addGap(0, 0, 0)
                                .addComponent(newUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(newUsernameLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(newPasswordLabel)
                                .addGap(4, 4, 4)
                                .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(newPasswordLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
        );

        buttonPanel.setBackground(new java.awt.Color(242, 243, 244));

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(99, 110, 114));
        saveButton.setText("Save");
        saveButton.setToolTipText("Save Changes");
        saveButton.setActionCommand("");
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveButton)
                                        .addComponent(cancelButton))
                                .addContainerGap(65, Short.MAX_VALUE))
        );

        titlePanel.setBackground(new java.awt.Color(242, 243, 244));

        editAccountTitle.setBackground(new java.awt.Color(242, 243, 244));
        editAccountTitle.setFont(new java.awt.Font("Avenir Next", 0, 50)); // NOI18N
        editAccountTitle.setForeground(new java.awt.Color(45, 52, 54));
        editAccountTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editAccountTitle.setText("Edit Account");
        editAccountTitle.setToolTipText("Login");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editAccountTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(editAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout editAccountPanelLayout = new javax.swing.GroupLayout(editAccountPanel);
        editAccountPanel.setLayout(editAccountPanelLayout);
        editAccountPanelLayout.setHorizontalGroup(
                editAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(oldInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newInfoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editAccountPanelLayout.setVerticalGroup(
                editAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editAccountPanelLayout.createSequentialGroup()
                                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oldInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(newInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAccountGUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel editAccountPanel;
    private javax.swing.JLabel editAccountTitle;
    private javax.swing.JPanel newInfoPanel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private java.awt.Panel newPasswordLine;
    private javax.swing.JLabel newUsernameLabel;
    private java.awt.Panel newUsernameLine;
    private javax.swing.JTextField newUsernameTextField;
    private javax.swing.JPanel oldInfoPanel;
    private javax.swing.JLabel oldPasswordLabel;
    private java.awt.Panel oldPasswordLine;
    private javax.swing.JTextField oldPasswordTextField;
    private javax.swing.JLabel oldUsernameLabel;
    private java.awt.Panel oldUsernameLine;
    private javax.swing.JTextField oldUsernameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration


    /**
     * Getter and Setter Methods
     */
    // Getter and setter for Old Username Text Field
    public JTextField getOldUsernameTextField() {
        return oldUsernameTextField;
    }
    public void setOldUsernameTextField(JTextField oldUsernameTextField) {
        this.oldUsernameTextField = oldUsernameTextField;
    }

    // Getter and setter for Old Password Text Field
    public JTextField getOldPasswordTextField() {
        return oldPasswordTextField;
    }
    public void setOldPasswordTextField(JTextField oldPasswordTextField) {
        this.oldPasswordTextField = oldPasswordTextField;
    }

    // Getter and setter for New Username Text Field
    public JTextField getNewUsernameTextField() {
        return newUsernameTextField;
    }
    public void setNewUsernameTextField(JTextField newUsernameTextField) {
        this.newUsernameTextField = newUsernameTextField;
    }

    // Getter and setter for New Password Field
    public JPasswordField getNewPasswordField() {
        return newPasswordField;
    }
    public void setNewPasswordField(JPasswordField newPasswordField) {
        this.newPasswordField = newPasswordField;
    }

    // Getter for Save Button
    public JButton getSaveButton() {
        return saveButton;
    }

    // Getter for Cancel Button
    public JButton getCancelButton() {
        return cancelButton;
    }

}
