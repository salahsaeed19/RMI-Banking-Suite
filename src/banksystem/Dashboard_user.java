
package banksystem;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Dashboard_user extends javax.swing.JFrame {

    public Dashboard_user() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ButtonAddNewUser = new javax.swing.JButton();
        ButtonUpdateUser = new javax.swing.JButton();
        ButtonDeleteUser1 = new javax.swing.JButton();
        ButtonClientsData = new javax.swing.JButton();
        ButtonAddTransaction1 = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        OpeartionLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ButtonAddTransaction2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ButtonAddNewUser.setBackground(java.awt.SystemColor.controlHighlight);
        ButtonAddNewUser.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        ButtonAddNewUser.setText("Add Client");
        ButtonAddNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddNewUserActionPerformed(evt);
            }
        });

        ButtonUpdateUser.setBackground(java.awt.SystemColor.controlHighlight);
        ButtonUpdateUser.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        ButtonUpdateUser.setText("Update Client Info");
        ButtonUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateUserActionPerformed(evt);
            }
        });

        ButtonDeleteUser1.setBackground(java.awt.SystemColor.controlHighlight);
        ButtonDeleteUser1.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        ButtonDeleteUser1.setText("Delete Client");
        ButtonDeleteUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteUser1ActionPerformed(evt);
            }
        });

        ButtonClientsData.setBackground(java.awt.SystemColor.controlHighlight);
        ButtonClientsData.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        ButtonClientsData.setText("Clients Data");
        ButtonClientsData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClientsDataActionPerformed(evt);
            }
        });

        ButtonAddTransaction1.setBackground(java.awt.SystemColor.controlHighlight);
        ButtonAddTransaction1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        ButtonAddTransaction1.setText("Add Transaction");
        ButtonAddTransaction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddTransaction1ActionPerformed(evt);
            }
        });

        ButtonBack.setBackground(java.awt.SystemColor.controlHighlight);
        ButtonBack.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        ButtonBack.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        OpeartionLabel.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        OpeartionLabel.setForeground(new java.awt.Color(0, 153, 204));
        OpeartionLabel.setText("User Operations");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/add-user.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/refresh.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/data.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/block-user.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/money-transfer.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/back.png"))); // NOI18N

        ButtonAddTransaction2.setBackground(java.awt.SystemColor.controlHighlight);
        ButtonAddTransaction2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        ButtonAddTransaction2.setText("Search Client‏ ");
        ButtonAddTransaction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddTransaction2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/loupe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OpeartionLabel)
                .addGap(148, 148, 148))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonClientsData, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ButtonAddNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonDeleteUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonAddTransaction1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonAddTransaction2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(OpeartionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonAddNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ButtonUpdateUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ButtonClientsData))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonDeleteUser1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonAddTransaction1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonAddTransaction2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        BankSystem.dashboard_user.setVisible(false);
        BankSystem.login.setVisible(true);
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonClientsDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClientsDataActionPerformed
        BankSystem.dashboard_user.setVisible(false);
        BankSystem.clientsData.setVisible(true);
    }//GEN-LAST:event_ButtonClientsDataActionPerformed

    private void ButtonAddTransaction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddTransaction1ActionPerformed
        BankSystem.dashboard_user.setVisible(false);
        BankSystem.transction.setVisible(true);
    }//GEN-LAST:event_ButtonAddTransaction1ActionPerformed

    private void ButtonAddNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddNewUserActionPerformed
        BankSystem.dashboard_user.setVisible(false);
        BankSystem.newuser.setVisible(true);
    }//GEN-LAST:event_ButtonAddNewUserActionPerformed

    private void ButtonUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateUserActionPerformed
        BankSystem.dashboard_user.setVisible(false);
        BankSystem.update_client_info.setVisible(true);
    }//GEN-LAST:event_ButtonUpdateUserActionPerformed

    private void ButtonDeleteUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteUser1ActionPerformed
        String accessible = JOptionPane.showInputDialog("Enter Client ID");
        int person_id = Integer.parseInt(accessible);
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",1099);
            BankInterfaces server = (BankInterfaces) reg.lookup("rmi://localhost/service");
            boolean response = server.ClieantExist(person_id);
            if(response){
                JOptionPane.showMessageDialog(this,"The Deletion Was Successful");
            }
            else{
                JOptionPane.showMessageDialog(this, "Client not exists", "Client Not Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(RemoteException | NotBoundException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_ButtonDeleteUser1ActionPerformed

    private void ButtonAddTransaction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddTransaction2ActionPerformed
        BankSystem.dashboard_user.setVisible(false);
        BankSystem.profile_user.setVisible(true);
    }//GEN-LAST:event_ButtonAddTransaction2ActionPerformed



    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Dashboard_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        UsernameLabel.setText(current_user.first_name);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddNewUser;
    private javax.swing.JButton ButtonAddTransaction1;
    private javax.swing.JButton ButtonAddTransaction2;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonClientsData;
    private javax.swing.JButton ButtonDeleteUser1;
    private javax.swing.JButton ButtonUpdateUser;
    private javax.swing.JLabel OpeartionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
