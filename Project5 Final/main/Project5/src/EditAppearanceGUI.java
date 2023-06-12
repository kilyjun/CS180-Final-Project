import javax.swing.*;

/**
 *
 * @author visa
 */
public class EditAppearanceGUI extends javax.swing.JFrame {

    /**
     * Creates new form EditAppearanceGUI
     */
    public EditAppearanceGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        backgroundPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        editAppearanceTitle = new javax.swing.JLabel();
        selectColorPanel = new javax.swing.JPanel();
        selectColorLabel = new javax.swing.JLabel();
        colorComboBox = new javax.swing.JComboBox<>();
        selectColorSaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(242, 243, 244));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(550, 450));

        titlePanel.setBackground(new java.awt.Color(242, 243, 244));

        editAppearanceTitle.setBackground(new java.awt.Color(242, 243, 244));
        editAppearanceTitle.setFont(new java.awt.Font("Avenir Next", 0, 50)); // NOI18N
        editAppearanceTitle.setForeground(new java.awt.Color(45, 52, 54));
        editAppearanceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editAppearanceTitle.setText("Edit Appearance");
        editAppearanceTitle.setToolTipText("Login");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editAppearanceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                                .addContainerGap(8, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editAppearanceTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        selectColorPanel.setBackground(new java.awt.Color(242, 243, 244));

        selectColorLabel.setBackground(new java.awt.Color(204, 204, 204));
        selectColorLabel.setFont(new java.awt.Font("Avenir Next", 0, 18)); // NOI18N
        selectColorLabel.setForeground(new java.awt.Color(99, 110, 114));
        selectColorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectColorLabel.setText(" Select Chat Background Color");
        selectColorLabel.setToolTipText("Username");
        selectColorLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 1));
        selectColorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        colorComboBox.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        colorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "White", "Gray", "Green", "Blue", "Purple", "Pink" }));
        colorComboBox.setToolTipText("Select the color of your chatroom");

        selectColorSaveButton.setBackground(new java.awt.Color(255, 255, 255));
        selectColorSaveButton.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        selectColorSaveButton.setForeground(new java.awt.Color(99, 110, 114));
        selectColorSaveButton.setText("Save Changes");
        selectColorSaveButton.setToolTipText("Send your message");
        selectColorSaveButton.setActionCommand("");
        selectColorSaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout selectColorPanelLayout = new javax.swing.GroupLayout(selectColorPanel);
        selectColorPanel.setLayout(selectColorPanelLayout);
        selectColorPanelLayout.setHorizontalGroup(
                selectColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(selectColorPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectColorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(selectColorPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(selectColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(selectColorPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(selectColorSaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(colorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectColorPanelLayout.setVerticalGroup(
                selectColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(selectColorPanelLayout.createSequentialGroup()
                                .addComponent(selectColorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectColorSaveButton)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectColorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
                backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundPanelLayout.createSequentialGroup()
                                .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(selectColorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
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
                        .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(EditAppearanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAppearanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAppearanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAppearanceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAppearanceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JComboBox<String> colorComboBox;
    private javax.swing.JLabel customColorLabel;
    private java.awt.Panel customColorLine;
    private javax.swing.JPanel customColorPanel;
    private javax.swing.JButton customColorSaveButton;
    private javax.swing.JTextField customColorTextField;
    private javax.swing.JLabel editAppearanceTitle;
    private javax.swing.JLabel selectColorLabel;
    private javax.swing.JPanel selectColorPanel;
    private javax.swing.JButton selectColorSaveButton;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration

    /*
      Getter and Setter Methods
     */
    // Getter and setter for Color Combo Box
    public JComboBox<String> getColorComboBox() {
        return colorComboBox;
    }
    public void setColorComboBox(JComboBox<String> colorComboBox) {
        this.colorComboBox = colorComboBox;
    }

    // Getter for Select Color Save Button
    public JButton getSelectColorSaveButton() {
        return selectColorSaveButton;
    }



}
