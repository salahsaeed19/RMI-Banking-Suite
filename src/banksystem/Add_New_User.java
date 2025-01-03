package banksystem;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Add_New_User extends javax.swing.JFrame {

    public Add_New_User() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LabelBank_add = new javax.swing.JLabel();
        Text_firstname = new javax.swing.JTextField();
        LabelFirstname = new javax.swing.JLabel();
        LabelLastname = new javax.swing.JLabel();
        Text_Lastname = new javax.swing.JTextField();
        LabelAddress = new javax.swing.JLabel();
        LabelGender = new javax.swing.JLabel();
        ComboBox_account_type = new javax.swing.JComboBox<>();
        NationalField = new javax.swing.JTextField();
        LabelAccounttype = new javax.swing.JLabel();
        LabelNationalid = new javax.swing.JLabel();
        RadioFemale = new javax.swing.JRadioButton();
        RadioMale = new javax.swing.JRadioButton();
        LabelNationalid1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_address = new javax.swing.JTextArea();
        Button_add_new_user = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Button_add_new_user1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LabelBank_add.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        LabelBank_add.setText("Bank | Add New System ");

        Text_firstname.setBackground(java.awt.SystemColor.controlHighlight);
        Text_firstname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Text_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_firstnameActionPerformed(evt);
            }
        });

        LabelFirstname.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelFirstname.setText("First Name ");

        LabelLastname.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelLastname.setText("Last Name ");

        Text_Lastname.setBackground(java.awt.SystemColor.controlHighlight);
        Text_Lastname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        LabelAddress.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelAddress.setText("Address");

        LabelGender.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelGender.setText("Gender");

        ComboBox_account_type.setBackground(new java.awt.Color(204, 255, 255));
        ComboBox_account_type.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        ComboBox_account_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving account", "Cash Card", "Easy Life", "Signature" }));
        ComboBox_account_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_account_typeActionPerformed(evt);
            }
        });

        NationalField.setBackground(java.awt.SystemColor.controlHighlight);
        NationalField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NationalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalFieldActionPerformed(evt);
            }
        });

        LabelAccounttype.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelAccounttype.setText("Account Type");

        LabelNationalid.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelNationalid.setText("National ID");

        RadioFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RadioFemale);
        RadioFemale.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        RadioFemale.setText("Female");

        RadioMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RadioMale);
        RadioMale.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        RadioMale.setText("Male");
        RadioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMaleActionPerformed(evt);
            }
        });

        LabelNationalid1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelNationalid1.setText("Password");

        PasswordField.setBackground(java.awt.SystemColor.controlHighlight);
        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        TextArea_address.setBackground(java.awt.SystemColor.controlHighlight);
        TextArea_address.setColumns(20);
        TextArea_address.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TextArea_address.setRows(5);
        jScrollPane1.setViewportView(TextArea_address);

        Button_add_new_user.setBackground(java.awt.SystemColor.controlHighlight);
        Button_add_new_user.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        Button_add_new_user.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        Button_add_new_user.setText("Add User");
        Button_add_new_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add_new_userActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/add.png"))); // NOI18N

        Button_add_new_user1.setBackground(java.awt.SystemColor.controlHighlight);
        Button_add_new_user1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        Button_add_new_user1.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        Button_add_new_user1.setText("Back");
        Button_add_new_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add_new_user1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelBank_add)
                        .addGap(300, 300, 300))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelFirstname)
                            .addComponent(LabelLastname)
                            .addComponent(LabelGender)
                            .addComponent(LabelAddress))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RadioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadioFemale))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Text_Lastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(Text_firstname, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelNationalid)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelNationalid1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelAccounttype))
                                    .addGap(50, 50, 50)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(PasswordField)
                                        .addComponent(NationalField)
                                        .addComponent(ComboBox_account_type, 0, 206, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_add_new_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(Button_add_new_user)))
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelBank_add, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelFirstname)
                            .addComponent(Text_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelLastname)
                            .addComponent(Text_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelGender)
                            .addComponent(RadioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioFemale))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelAddress)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelAccounttype))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNationalid)
                            .addComponent(NationalField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelNationalid1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_add_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_add_new_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RadioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMaleActionPerformed
    }//GEN-LAST:event_RadioMaleActionPerformed

    private void Text_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_firstnameActionPerformed
    }//GEN-LAST:event_Text_firstnameActionPerformed

    private void Button_add_new_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_add_new_userActionPerformed

        String first_name = Text_firstname.getText();
        String last_name = Text_Lastname.getText();
        String address = TextArea_address.getText();
        String national_id = NationalField.getText();
        String password = PasswordField.getText();
        String account_type = (String) ComboBox_account_type.getSelectedItem();
        String gender;

        if (RadioMale.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }

        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            BankInterfaces server = (BankInterfaces) reg.lookup("rmi://localhost/service");
            boolean response = server.AddNewUser(first_name, last_name, address, national_id, password, account_type, gender);

            if (response) {
                BankSystem.newuser.setVisible(false);
                BankSystem.dashboard_user.setVisible(true);
            } else {
                System.out.println("Not ADD");
            }
        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_Button_add_new_userActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void NationalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalFieldActionPerformed
    }//GEN-LAST:event_NationalFieldActionPerformed

    private void ComboBox_account_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_account_typeActionPerformed
    }//GEN-LAST:event_ComboBox_account_typeActionPerformed

    private void Button_add_new_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_add_new_user1ActionPerformed
        BankSystem.newuser.setVisible(false);
        BankSystem.dashboard_user.setVisible(true);
    }//GEN-LAST:event_Button_add_new_user1ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_New_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add_new_user;
    private javax.swing.JButton Button_add_new_user1;
    private javax.swing.JComboBox<String> ComboBox_account_type;
    private javax.swing.JLabel LabelAccounttype;
    private javax.swing.JLabel LabelAddress;
    private javax.swing.JLabel LabelBank_add;
    private javax.swing.JLabel LabelFirstname;
    private javax.swing.JLabel LabelGender;
    private javax.swing.JLabel LabelLastname;
    private javax.swing.JLabel LabelNationalid;
    private javax.swing.JLabel LabelNationalid1;
    private javax.swing.JTextField NationalField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JRadioButton RadioFemale;
    private javax.swing.JRadioButton RadioMale;
    private javax.swing.JTextArea TextArea_address;
    private javax.swing.JTextField Text_Lastname;
    private javax.swing.JTextField Text_firstname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
