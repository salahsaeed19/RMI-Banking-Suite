package banksystem;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Add_New_Transction extends javax.swing.JFrame {

    public Add_New_Transction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Text_currency = new javax.swing.JTextField();
        Text_amount = new javax.swing.JTextField();
        ComboBox_typeTrancation = new javax.swing.JComboBox<>();
        Text_id = new javax.swing.JTextField();
        Button_add_transaction = new javax.swing.JButton();
        Button_add_transaction1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setText("Currency");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setText("Amount");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel4.setText("Type Transcation ");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("ID Nationaly ");

        Text_currency.setBackground(java.awt.SystemColor.controlHighlight);
        Text_currency.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        Text_amount.setBackground(java.awt.SystemColor.controlHighlight);
        Text_amount.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        ComboBox_typeTrancation.setBackground(java.awt.SystemColor.controlHighlight);
        ComboBox_typeTrancation.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        ComboBox_typeTrancation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deposit", "Pull" }));
        ComboBox_typeTrancation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_typeTrancationActionPerformed(evt);
            }
        });

        Text_id.setBackground(java.awt.SystemColor.controlHighlight);
        Text_id.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Text_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_idActionPerformed(evt);
            }
        });

        Button_add_transaction.setBackground(java.awt.SystemColor.activeCaption);
        Button_add_transaction.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button_add_transaction.setForeground(new java.awt.Color(255, 255, 255));
        Button_add_transaction.setText("Add");
        Button_add_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add_transactionActionPerformed(evt);
            }
        });

        Button_add_transaction1.setBackground(java.awt.SystemColor.activeCaption);
        Button_add_transaction1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Button_add_transaction1.setForeground(new java.awt.Color(255, 255, 255));
        Button_add_transaction1.setText("Cancel");
        Button_add_transaction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add_transaction1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel1.setText("Bank | Add a New Transaction ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banksystem/img/deposit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Text_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBox_typeTrancation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_currency, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Button_add_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(Button_add_transaction1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ComboBox_typeTrancation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_currency, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_add_transaction)
                    .addComponent(Button_add_transaction1))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Text_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_idActionPerformed
    }//GEN-LAST:event_Text_idActionPerformed

    private void Button_add_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_add_transactionActionPerformed

        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            BankInterfaces server = (BankInterfaces) reg.lookup("rmi://localhost/service");

            int id_client = Integer.parseInt(Text_id.getText());
            String type_transaction = (String) ComboBox_typeTrancation.getSelectedItem();
            double amount = Integer.parseInt(Text_amount.getText());

            boolean[] response = server.AddNewTransaction(id_client, type_transaction, amount);

            boolean transaction = response[0];
            boolean is_exist = response[1];

            if (!is_exist) {
                JOptionPane.showMessageDialog(this, "Please insert ID True to client is exists", "Client Not Found", JOptionPane.ERROR_MESSAGE);
            }
            if (type_transaction.equals("Deposit")) {
                if (!transaction) {
                    JOptionPane.showMessageDialog(this, "Please insert amount grather than 0", "Error Amount", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (!transaction) {
                    JOptionPane.showMessageDialog(this, "Sorry , There is not enough balance", "Error balance", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (RemoteException | NotBoundException ex) {
            System.out.println(ex.getMessage());
        }

        BankSystem.transction.setVisible(false);
        BankSystem.dashboard_user.setVisible(true);

    }//GEN-LAST:event_Button_add_transactionActionPerformed

    private void ComboBox_typeTrancationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_typeTrancationActionPerformed
    }//GEN-LAST:event_ComboBox_typeTrancationActionPerformed

    private void Button_add_transaction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_add_transaction1ActionPerformed
        BankSystem.transction.setVisible(false);
        BankSystem.dashboard_user.setVisible(true);
    }//GEN-LAST:event_Button_add_transaction1ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_New_Transction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_New_Transction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_New_Transction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_New_Transction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_New_Transction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_add_transaction;
    private javax.swing.JButton Button_add_transaction1;
    private javax.swing.JComboBox<String> ComboBox_typeTrancation;
    private javax.swing.JTextField Text_amount;
    private javax.swing.JTextField Text_currency;
    private javax.swing.JTextField Text_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
