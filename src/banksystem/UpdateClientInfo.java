package banksystem;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class UpdateClientInfo extends javax.swing.JFrame {
    boolean is_search = false;
    public UpdateClientInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_address = new javax.swing.JTextArea();
        RadioMale = new javax.swing.JRadioButton();
        RadioFemale = new javax.swing.JRadioButton();
        Button_add_new_user = new javax.swing.JButton();
        Text_Lastname = new javax.swing.JTextField();
        Text_firstname = new javax.swing.JTextField();
        SearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        ComboBox_account_type = new javax.swing.JComboBox<>();
        NationalField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LabelFirstname = new javax.swing.JLabel();
        LabelFirstname1 = new javax.swing.JLabel();
        LabelFirstname2 = new javax.swing.JLabel();
        LabelFirstname3 = new javax.swing.JLabel();
        LabelFirstname4 = new javax.swing.JLabel();
        LabelFirstname5 = new javax.swing.JLabel();
        Button_add_new_user1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TextArea_address.setBackground(java.awt.SystemColor.controlHighlight);
        TextArea_address.setColumns(20);
        TextArea_address.setFont(new java.awt.Font("Courier New", 2, 18)); // NOI18N
        TextArea_address.setRows(5);
        jScrollPane1.setViewportView(TextArea_address);

        RadioMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RadioMale);
        RadioMale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RadioMale.setText("Male");
        RadioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMaleActionPerformed(evt);
            }
        });

        RadioFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RadioFemale);
        RadioFemale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RadioFemale.setText("Female");
        RadioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioFemaleActionPerformed(evt);
            }
        });

        Button_add_new_user.setBackground(new java.awt.Color(255, 255, 255));
        Button_add_new_user.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_add_new_user.setForeground(new java.awt.Color(0, 153, 255));
        Button_add_new_user.setText("Update");
        Button_add_new_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add_new_userActionPerformed(evt);
            }
        });

        Text_Lastname.setBackground(java.awt.SystemColor.controlHighlight);
        Text_Lastname.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N

        Text_firstname.setBackground(java.awt.SystemColor.controlHighlight);
        Text_firstname.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        Text_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_firstnameActionPerformed(evt);
            }
        });

        SearchField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(255, 255, 255));
        SearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(0, 153, 255));
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        ComboBox_account_type.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ComboBox_account_type.setForeground(new java.awt.Color(51, 153, 255));
        ComboBox_account_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving account", "Cash Card", "Easy Life", "Signature" }));
        ComboBox_account_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_account_typeActionPerformed(evt);
            }
        });

        NationalField.setBackground(java.awt.SystemColor.controlHighlight);
        NationalField.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        NationalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel1.setText("Update Client Info");

        LabelFirstname.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelFirstname.setText("First Name ");

        LabelFirstname1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelFirstname1.setText("Last Name ");

        LabelFirstname2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelFirstname2.setText("Gender");

        LabelFirstname3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelFirstname3.setText("Address");

        LabelFirstname4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelFirstname4.setText("Account Type");

        LabelFirstname5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        LabelFirstname5.setText("National ID");

        Button_add_new_user1.setBackground(new java.awt.Color(255, 255, 255));
        Button_add_new_user1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Button_add_new_user1.setForeground(new java.awt.Color(0, 153, 255));
        Button_add_new_user1.setText("Back");
        Button_add_new_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add_new_user1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/refresh.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelFirstname)
                                    .addComponent(LabelFirstname1)
                                    .addComponent(LabelFirstname3))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelFirstname4)
                                            .addComponent(LabelFirstname5)
                                            .addComponent(LabelFirstname2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(RadioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RadioFemale))
                                            .addComponent(ComboBox_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NationalField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Text_firstname)
                                        .addComponent(Text_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(Button_add_new_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(Button_add_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFirstname)
                    .addComponent(ComboBox_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFirstname4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFirstname1)
                    .addComponent(Text_Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NationalField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFirstname5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RadioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelFirstname2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(LabelFirstname3)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_add_new_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_add_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        String account_type = (String) ComboBox_account_type.getSelectedItem();
        String gender;
        
        if (RadioMale.isSelected()) gender = "male";
        else gender = "female";
        
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",1099);
            BankInterfaces server = (BankInterfaces) reg.lookup("rmi://localhost/service");
            if(is_search){
                int person_id = Integer.parseInt(SearchField.getText());
                boolean response = server.UpdateInforUser(person_id,first_name,last_name ,gender ,account_type );
                
                if (response){
                    JOptionPane.showMessageDialog(this, "Success update date to client");
                    BankSystem.update_client_info.setVisible(false);
                    BankSystem.dashboard_user.setVisible(true);
                }
                else{
                     JOptionPane.showMessageDialog(this, "Faild update date to client", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                    JOptionPane.showMessageDialog(this, "Faild update date to client", "Error Message", JOptionPane.ERROR_MESSAGE);
                    BankSystem.update_client_info.setVisible(false);
                    BankSystem.dashboard_user.setVisible(true);
            }
        }
        catch(RemoteException | NotBoundException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_Button_add_new_userActionPerformed

    private void NationalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalFieldActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",1099);
            BankInterfaces server = (BankInterfaces) reg.lookup("rmi://localhost/service");
            int person_id = Integer.parseInt(SearchField.getText());
            String[] response = server.getPerson(person_id);
            if(response[0] != null){
                is_search = true;
                Text_firstname.setText(response[0]);
                Text_Lastname.setText(response[1]);
                TextArea_address.setText(response[5]);
                NationalField.setText(""+ person_id);
                
                if(response[2] == "female") RadioFemale.setSelected(true);
                else RadioMale.setSelected(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Client not exists , Please add Client to Database", "Client Not Found", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        catch(RemoteException | NotBoundException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void ComboBox_account_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_account_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_account_typeActionPerformed

    private void RadioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioFemaleActionPerformed

    private void Button_add_new_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_add_new_user1ActionPerformed
        BankSystem.update_client_info.setVisible(false);
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
            java.util.logging.Logger.getLogger(UpdateClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateClientInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add_new_user;
    private javax.swing.JButton Button_add_new_user1;
    private javax.swing.JComboBox<String> ComboBox_account_type;
    private javax.swing.JLabel LabelFirstname;
    private javax.swing.JLabel LabelFirstname1;
    private javax.swing.JLabel LabelFirstname2;
    private javax.swing.JLabel LabelFirstname3;
    private javax.swing.JLabel LabelFirstname4;
    private javax.swing.JLabel LabelFirstname5;
    private javax.swing.JTextField NationalField;
    private javax.swing.JRadioButton RadioFemale;
    private javax.swing.JRadioButton RadioMale;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchField;
    private javax.swing.JTextArea TextArea_address;
    private javax.swing.JTextField Text_Lastname;
    private javax.swing.JTextField Text_firstname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
