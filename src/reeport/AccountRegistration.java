package reeport;

import java.awt.*;
import java.sql.*;

public class AccountRegistration extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
        
    public AccountRegistration() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        con = DBConnection.ConnectionDB();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNamaPengguna = new javax.swing.JTextField();
        cboPertanyaan = new javax.swing.JComboBox<>();
        txtKataSandi = new javax.swing.JPasswordField();
        txtJawaban = new javax.swing.JTextField();
        btnLanjut = new javax.swing.JLabel();
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

        txtNamaPengguna.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtNamaPengguna.setForeground(new java.awt.Color(255, 255, 255));
        txtNamaPengguna.setBorder(null);
        txtNamaPengguna.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNamaPengguna.setOpaque(false);
        getContentPane().add(txtNamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 300, 20));

        cboPertanyaan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cboPertanyaan.setForeground(new java.awt.Color(27, 117, 188));
        cboPertanyaan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apa nama panggilan anda saat anak-anak? ", "Di kota mana anda bertemu dengan pasangan? ", "Apa nama sekolah dasar anda? ", "Di kota mana anda pertama kali bekerja?" }));
        cboPertanyaan.setBorder(null);
        cboPertanyaan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(cboPertanyaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 385, 303, 25));

        txtKataSandi.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtKataSandi.setForeground(new java.awt.Color(255, 255, 255));
        txtKataSandi.setBorder(null);
        txtKataSandi.setCaretColor(new java.awt.Color(255, 255, 255));
        txtKataSandi.setOpaque(false);
        getContentPane().add(txtKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 300, -1));

        txtJawaban.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtJawaban.setForeground(new java.awt.Color(255, 255, 255));
        txtJawaban.setBorder(null);
        txtJawaban.setCaretColor(new java.awt.Color(255, 255, 255));
        txtJawaban.setOpaque(false);
        getContentPane().add(txtJawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 458, 300, -1));

        btnLanjut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLanjutMouseClicked(evt);
            }
        });
        getContentPane().add(btnLanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 597, 128, 31));

        background.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Analisa dan Perancangan Sistem Informasi\\Reeport\\eraport-07.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

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
    }//GEN-LAST:event_formWindowOpened

    private void btnLanjutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLanjutMouseClicked
        String sql = "UPDATE AkunPengguna SET NamaPengguna = ?, KataSandi = ?, Pertanyaan = ?, Jawaban = ?, StatusAkun = 1;";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, txtNamaPengguna.getText());
            pst.setString(2, txtKataSandi.getText());
            pst.setString(3, cboPertanyaan.getSelectedItem().toString());
            pst.setString(4, txtJawaban.getText());
            pst.executeUpdate();
            
            this.dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Dashboard().setVisible(true);
                    }
                });
            con.close();
            System.out.println("con closed");
                
            /*if (rs.next()) {
                this.dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Dashboard().setVisible(true);
                    }
                });
            }*/
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnLanjutMouseClicked

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
            java.util.logging.Logger.getLogger(AccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnLanjut;
    private javax.swing.JComboBox<String> cboPertanyaan;
    private javax.swing.JTextField txtJawaban;
    private javax.swing.JPasswordField txtKataSandi;
    private javax.swing.JTextField txtNamaPengguna;
    // End of variables declaration//GEN-END:variables
}
