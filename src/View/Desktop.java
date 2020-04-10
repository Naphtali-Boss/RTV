/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ConfigDB;
import Control.DB;
import Control.UsersControl;
import Control.VehiculesControl;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebas
 */
public class Desktop extends javax.swing.JFrame {

    public static DB db = new DB();
    public static UsersControl userscontrol = new UsersControl();
    public static VehiculesControl vehiculesControl = new VehiculesControl();
    /**
     * Creates new form Desktop
     */
    public Desktop() {
        if (!db.connect(new ConfigDB().getConfig())) {
            ViewConfigDB frm = new ViewConfigDB(this, true);
            frm.setVisible(true);
            db.connect(new ConfigDB().getConfig());
        }
        initComponents();
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblUsers = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblConfig = new javax.swing.JLabel();
        jblVehicules = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        lblUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users.png"))); // NOI18N
        lblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUsersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblUsersMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Users");

        lblConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/config.png"))); // NOI18N
        lblConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConfigMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblConfigMousePressed(evt);
            }
        });

        jblVehicules.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/car1.png"))); // NOI18N
        jblVehicules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jblVehiculesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jblVehiculesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jblVehiculesMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vehicules");

        jDesktopPane1.setLayer(lblUsers, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblConfig, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblVehicules, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 531, Short.MAX_VALUE)
                        .addComponent(jblVehicules, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(539, 539, 539)
                        .addComponent(lblConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jblVehicules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(755, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsersMousePressed
        ViewUsers vw = new ViewUsers();
        vw.setVisible(true);
    }//GEN-LAST:event_lblUsersMousePressed

    private void lblUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsersMouseEntered
        lblUsers.setIcon(new ImageIcon(getClass().getResource("/images/users2.png")));
    }//GEN-LAST:event_lblUsersMouseEntered

    private void lblUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsersMouseExited
        lblUsers.setIcon(new ImageIcon(getClass().getResource("/images/users.png")));
    }//GEN-LAST:event_lblUsersMouseExited

    private void lblConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigMouseEntered
        lblConfig.setIcon(new ImageIcon(getClass().getResource("/images/config2.png")));
    }//GEN-LAST:event_lblConfigMouseEntered

    private void lblConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigMouseExited
        lblConfig.setIcon(new ImageIcon(getClass().getResource("/images/config.png")));
    }//GEN-LAST:event_lblConfigMouseExited

    private void lblConfigMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfigMousePressed
        ViewConfigDB frm = new ViewConfigDB(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_lblConfigMousePressed

    private void jblVehiculesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblVehiculesMouseEntered
        jblVehicules.setIcon(new ImageIcon(getClass().getResource("/images/car2.png")));
    }//GEN-LAST:event_jblVehiculesMouseEntered

    private void jblVehiculesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblVehiculesMouseExited
        jblVehicules.setIcon(new ImageIcon(getClass().getResource("/images/car1.png")));
    }//GEN-LAST:event_jblVehiculesMouseExited

    private void jblVehiculesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblVehiculesMousePressed
        ViewVehicules vv = new ViewVehicules();
        vv.setVisible(true);
    }//GEN-LAST:event_jblVehiculesMousePressed

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
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel jblVehicules;
    private javax.swing.JLabel lblConfig;
    private javax.swing.JLabel lblUsers;
    // End of variables declaration//GEN-END:variables
}
