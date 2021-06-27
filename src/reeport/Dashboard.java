package reeport;

import java.awt.*;
import java.sql.*;

public class Dashboard extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Dashboard() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        con = DBConnection.ConnectionDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNamaDepan = new javax.swing.JLabel();
        btnLembaga = new javax.swing.JLabel();
        btnWaliKelas = new javax.swing.JLabel();
        btnPesertaDidik = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNamaDepan.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        lblNamaDepan.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNamaDepan, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 119, 330, 30));

        btnLembaga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLembagaMouseClicked(evt);
            }
        });
        getContentPane().add(btnLembaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 240, 40));

        btnWaliKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWaliKelasMouseClicked(evt);
            }
        });
        getContentPane().add(btnWaliKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 240, 40));

        btnPesertaDidik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesertaDidikMouseClicked(evt);
            }
        });
        getContentPane().add(btnPesertaDidik, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 240, 40));

        background.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Analisa dan Perancangan Sistem Informasi\\Reeport\\reeport-02.png")); // NOI18N
        background.setToolTipText("");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        String sql = "SELECT NamaDepan FROM DataWaliKelas";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()) {
                String NamaDepan = rs.getString("NamaDepan");
                lblNamaDepan.setText(NamaDepan + "!");
            }
            con.close();
        }
        catch(SQLException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnLembagaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLembagaMouseClicked
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lembaga().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnLembagaMouseClicked

    private void btnWaliKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWaliKelasMouseClicked
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaliKelas().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnWaliKelasMouseClicked

    private void btnPesertaDidikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesertaDidikMouseClicked
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesertaDidik().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnPesertaDidikMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnLembaga;
    private javax.swing.JLabel btnPesertaDidik;
    private javax.swing.JLabel btnWaliKelas;
    private javax.swing.JLabel lblNamaDepan;
    // End of variables declaration//GEN-END:variables
}
