package reeport;

import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Login() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        con = DBConnection.ConnectionDB();
        System.out.println("con started");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMasuk = new javax.swing.JLabel();
        btnLupaKataSandi = new javax.swing.JLabel();
        txtNamaPengguna = new javax.swing.JTextField();
        txtKataSandi = new javax.swing.JPasswordField();
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

        btnMasuk.setToolTipText("");
        btnMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasukMouseClicked(evt);
            }
        });
        getContentPane().add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 382, 238, 44));

        btnLupaKataSandi.setToolTipText("");
        getContentPane().add(btnLupaKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 485, 140, 10));

        txtNamaPengguna.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtNamaPengguna.setBorder(null);
        txtNamaPengguna.setOpaque(false);
        getContentPane().add(txtNamaPengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 232, 215, 38));

        txtKataSandi.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txtKataSandi.setBorder(null);
        txtKataSandi.setOpaque(false);
        getContentPane().add(txtKataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 307, 215, 38));

        background.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Analisa dan Perancangan Sistem Informasi\\Reeport\\eraport-01.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasukMouseClicked
        String sql = "SELECT * FROM AkunPengguna WHERE NamaPengguna LIKE ? AND KataSandi LIKE ?;";
        try {
            pst = con.prepareStatement(sql);
            System.out.println("pst started");
            pst.setString(1, txtNamaPengguna.getText());
            pst.setString(2, txtKataSandi.getText());
            rs = pst.executeQuery();
            System.out.println("rs executed");
            
            
            if(rs.next()) {
                sql = "SELECT StatusAkun FROM AkunPengguna";
                pst = con.prepareStatement(sql);
                System.out.println("pst started");
                rs = pst.executeQuery();
                System.out.println("rs executed");
                int StatusAkun = rs.getInt("StatusAkun");
                                
                
                if(rs.next()) {
                    if(StatusAkun == 0) { // If this is a first login, then show AccountRegistration form
                        this.dispose();
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new AccountRegistration().setVisible(true);
                            }
                        });
                        con.close();
                        System.out.println("con closed");
                    }
                    else { // If this is not a first login, then show Dashboard form
                        this.dispose();
                        java.awt.EventQueue.invokeLater(new Runnable() {
                            public void run() {
                                new Dashboard().setVisible(true);
                            }
                        });
                        con.close();
                        System.out.println("con closed");
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Username or password is not valid!");
            }
        }
        catch(SQLException e) {
        
        }
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountRegistration().setVisible(true);
            }
        });*/
    }//GEN-LAST:event_btnMasukMouseClicked

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnLupaKataSandi;
    private javax.swing.JLabel btnMasuk;
    private javax.swing.JPasswordField txtKataSandi;
    private javax.swing.JTextField txtNamaPengguna;
    // End of variables declaration//GEN-END:variables
}
