/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author visa
 */
public class ServerGUI extends javax.swing.JFrame {

    /**
     * Creates new form ServerGUI
     */
    public ServerGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        middlePanel = new javax.swing.JPanel();
        serverPortLabel = new javax.swing.JLabel();
        serverPortLine = new java.awt.Panel();
        serverPortTextField = new javax.swing.JTextField();
        bottomPanel = new javax.swing.JPanel();
        startServerButton = new javax.swing.JButton();
        stopServerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 243, 244));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setPreferredSize(new java.awt.Dimension(400, 550));
        setSize(new java.awt.Dimension(400, 550));

        backgroundPanel.setBackground(new java.awt.Color(242, 243, 244));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(300, 300));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(400, 510));
        backgroundPanel.setSize(new java.awt.Dimension(400, 510));

        topPanel.setBackground(new java.awt.Color(242, 243, 244));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Avenir", Font.PLAIN, 14)); // NOI18N
        textArea.setForeground(new java.awt.Color(121, 125, 127));
        textArea.setRows(5);
        scrollPane.setViewportView(textArea);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
                topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(topPanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(scrollPane)
                                .addGap(54, 54, 54))
        );
        topPanelLayout.setVerticalGroup(
                topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(topPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        middlePanel.setBackground(new java.awt.Color(242, 243, 244));

        serverPortLabel.setBackground(new java.awt.Color(204, 204, 204));
        serverPortLabel.setFont(new java.awt.Font("Avenir Next", Font.PLAIN, 18)); // NOI18N
        serverPortLabel.setForeground(new java.awt.Color(99, 110, 114));
        serverPortLabel.setText("Server Port");
        serverPortLabel.setToolTipText("Server Port");

        serverPortLine.setBackground(new java.awt.Color(99, 110, 114));
        serverPortLine.setPreferredSize(new java.awt.Dimension(200, 1));

        javax.swing.GroupLayout serverPortLineLayout = new javax.swing.GroupLayout(serverPortLine);
        serverPortLine.setLayout(serverPortLineLayout);
        serverPortLineLayout.setHorizontalGroup(
                serverPortLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        serverPortLineLayout.setVerticalGroup(
                serverPortLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE)
        );

        serverPortTextField.setBackground(new java.awt.Color(255, 255, 255, 0));
        serverPortTextField.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        serverPortTextField.setForeground(new java.awt.Color(121, 125, 127));
        serverPortTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        serverPortTextField.setToolTipText("Enter the server port");
        serverPortTextField.setActionCommand("<Not Set>");
        serverPortTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        serverPortTextField.setPreferredSize(new java.awt.Dimension(11, 30));

        javax.swing.GroupLayout middlePanelLayout = new javax.swing.GroupLayout(middlePanel);
        middlePanel.setLayout(middlePanelLayout);
        middlePanelLayout.setHorizontalGroup(
                middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(middlePanelLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(serverPortLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(serverPortLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(serverPortTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(55, 55, 55))
        );
        middlePanelLayout.setVerticalGroup(
                middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(middlePanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(serverPortLabel)
                                .addGap(3, 3, 3)
                                .addComponent(serverPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(serverPortLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        bottomPanel.setBackground(new java.awt.Color(242, 243, 244));

        startServerButton.setBackground(new java.awt.Color(255, 255, 255));
        startServerButton.setFont(new java.awt.Font("Avenir", Font.PLAIN, 18)); // NOI18N
        startServerButton.setForeground(new java.awt.Color(99, 110, 114));
        startServerButton.setText("Start Server");
        startServerButton.setToolTipText("Start Server");
        startServerButton.setActionCommand("");
        startServerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        stopServerButton.setBackground(new java.awt.Color(255, 255, 255));
        stopServerButton.setFont(new java.awt.Font("Avenir", Font.PLAIN, 18)); // NOI18N
        stopServerButton.setForeground(new java.awt.Color(99, 110, 114));
        stopServerButton.setText("Stop Server");
        stopServerButton.setToolTipText("Stop Server");
        stopServerButton.setActionCommand("");
        stopServerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
                bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(startServerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(stopServerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(58, 58, 58))
        );
        bottomPanelLayout.setVerticalGroup(
                bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bottomPanelLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(startServerButton)
                                        .addComponent(stopServerButton))
                                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(middlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(middlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel middlePanel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel serverPortLabel;
    private java.awt.Panel serverPortLine;
    private javax.swing.JTextField serverPortTextField;
    private javax.swing.JButton startServerButton;
    private javax.swing.JButton stopServerButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JPanel topPanel;
    // End of variables declaration


    /**
     * Getter and Setter Methods
     */
    // Getter and setter for Text Area
    public JTextArea getTextArea() {
        return textArea;
    }
    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    // Getter and setter for Server Port Text Field
    public JTextField getServerPortTextField() {
        return serverPortTextField;
    }
    public void setServerPortTextField(JTextField serverPortTextField) {
        this.serverPortTextField = serverPortTextField;
    }

    // Getter  for Start Server Button
    public JButton getStartServerButton() {
        return startServerButton;
    }

    // Getter for Stop Server Button
    public JButton getStopServerButton() {
        return stopServerButton;
    }

}
