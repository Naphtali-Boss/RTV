/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.User;
import java.util.ArrayList;
import java.util.Observer;

/**
 *
 * @author Andrey
 */
public class Deductions extends javax.swing.JFrame {

    /**
     * Creates new form Deductions
     */
    Control.Salarycontrol Sala = new Control.Salarycontrol();
    private ArrayList<Observer> observadores = new ArrayList<>();

    public void agregarObservador(Observer o) {
        this.observadores.add(o);
    }

    public void quitarObservador(Observer o) {
        this.observadores.remove(o);
    }

    public void notificarObservadores() {
        for (Observer obj : observadores) {
            obj.update(null, null);
        }
    }

    public User user;
    private static String userName;

    public Deductions() {
        initComponents();
        this.setUndecorated(true);
    }
    double rent = 0;

    public Deductions(User user) {
        this.user = user;
//        this.userName = user.getUserName();
        initComponents();
        lblDNI.setText(this.user.getDni());
        System.out.println(this.user.getFullName());
        lblFullName.setText(this.user.getFullName());
        txtBirth.setText(String.valueOf(this.user.getBirthday()));
        txttelephone.setText(String.valueOf(this.user.getPhoneNumber()));
        txtEmail.setText(this.user.getEmail());
        txtUser.setText(this.user.getUserName());
        fillSpace();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fmtDisability = new javax.swing.JFormattedTextField();
        fmtWorker = new javax.swing.JFormattedTextField();
        fmtAssociation = new javax.swing.JFormattedTextField();
        fmtTax = new javax.swing.JFormattedTextField();
        fmtNet = new javax.swing.JFormattedTextField();
        fmtGross = new javax.swing.JFormattedTextField();
        fmtIllnes = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txttelephone = new javax.swing.JTextField();
        txtBirth = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 12)); // NOI18N
        jLabel1.setText("Illness and maternity 5.5%");

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 1, 12)); // NOI18N
        jLabel2.setText("Disability and Death 3.84%");

        jLabel3.setFont(new java.awt.Font("Bodoni MT Black", 1, 12)); // NOI18N
        jLabel3.setText("Contribution of the worker 1%");

        jLabel4.setFont(new java.awt.Font("Bodoni MT Black", 1, 12)); // NOI18N
        jLabel4.setText("Contribution to the solidarity association 3.3%");

        jLabel5.setFont(new java.awt.Font("Bodoni MT Black", 1, 12)); // NOI18N
        jLabel5.setText("Income tax");

        jLabel6.setFont(new java.awt.Font("Bodoni MT Black", 1, 12)); // NOI18N
        jLabel6.setText("Gross income");

        jLabel7.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        jLabel7.setText("Net income");

        fmtDisability.setEditable(false);
        fmtDisability.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¢#,##0.00;(¤#,##0.00)"))));

        fmtWorker.setEditable(false);
        fmtWorker.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¢#,##0.00;(¤#,##0.00)"))));
        fmtWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmtWorkerActionPerformed(evt);
            }
        });

        fmtAssociation.setEditable(false);
        fmtAssociation.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¢#,##0.00;(¤#,##0.00)"))));

        fmtTax.setEditable(false);
        fmtTax.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¢#,##0.00;(¤#,##0.00)"))));

        fmtNet.setEditable(false);
        fmtNet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¢#,##0.00;(¤#,##0.00)"))));

        fmtGross.setEditable(false);
        fmtGross.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¢#,##0.00;(¤#,##0.00)"))));

        fmtIllnes.setEditable(false);
        fmtIllnes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¢#,##0.00;(¤#,##0.00)"))));
        fmtIllnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmtIllnesActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bodoni MT Black", 1, 14)); // NOI18N
        jLabel8.setText("DNI");

        jLabel9.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel9.setText("Information");

        jLabel10.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel10.setText("Name");

        txtUser.setEditable(false);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        txtEmail.setEditable(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txttelephone.setEditable(false);
        txttelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelephoneActionPerformed(evt);
            }
        });

        txtBirth.setEditable(false);
        txtBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthActionPerformed(evt);
            }
        });

        lblDNI.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        lblDNI.setText("-----------------");

        lblFullName.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        lblFullName.setText("-----------------");

        jLabel11.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel11.setText("E-mail");

        jLabel12.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel12.setText("User");

        jLabel13.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel13.setText("Phone");

        jLabel14.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel14.setText("Birth Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDNI)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblFullName))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(120, 120, 120)
                                .addComponent(fmtNet, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fmtTax, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                        .addComponent(fmtAssociation)
                                        .addComponent(fmtWorker)
                                        .addComponent(fmtDisability)
                                        .addComponent(fmtIllnes)
                                        .addComponent(fmtGross, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(txtEmail)))))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(lblFullName))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(1, 1, 1)
                .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fmtGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(fmtIllnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addComponent(fmtDisability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fmtWorker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fmtAssociation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fmtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fmtNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fmtIllnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmtIllnesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmtIllnesActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txttelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelephoneActionPerformed

    private void txtBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthActionPerformed

    private void fmtWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmtWorkerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmtWorkerActionPerformed

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
            java.util.logging.Logger.getLogger(Deductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deductions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deductions().setVisible(true);
            }
        });
    }

    public void fillSpace() {

        int Sal = Integer.parseInt(Sala.finder(Integer.parseInt(this.user.getDni())));
        double mater = 5.5 * Sal / 100;
        double dead = 3.84 * Sal / 100;
        double worker = 1.0 * Sal / 100;
        double aso = 3.3 * Sal / 100;

        if (Sal < 817000) {
            rent = 0;

        } else if (Sal > 817001 && Sal < 1226000) {
            rent = 10.0 * Sal / 100;
        } else {
            rent = 15.0 * Sal / 100;
        }

        fmtGross.setValue(Sal);
        fmtIllnes.setValue(mater);
        fmtDisability.setValue(dead);
        fmtWorker.setValue(worker);
        fmtAssociation.setValue(aso);
        fmtTax.setValue(rent);
        fmtNet.setValue(Sal - mater - dead - worker - aso - rent);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField fmtAssociation;
    private javax.swing.JFormattedTextField fmtDisability;
    private javax.swing.JFormattedTextField fmtGross;
    private javax.swing.JFormattedTextField fmtIllnes;
    private javax.swing.JFormattedTextField fmtNet;
    private javax.swing.JFormattedTextField fmtTax;
    private javax.swing.JFormattedTextField fmtWorker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txttelephone;
    // End of variables declaration//GEN-END:variables
}