package reeport;

import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Lembaga extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Lembaga() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        con = DBConnection.ConnectionDB();
        popDataSimpan.setEnabled(false);
        popDataSimpan.setVisible(false);
        popKeluar.setEnabled(false);
        popKeluar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popDataSimpan = new javax.swing.JLabel();
        popKeluar = new javax.swing.JLabel();
        txtNamaLembaga = new javax.swing.JTextField();
        txtNpsn = new javax.swing.JTextField();
        txtKelurahan = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtKecamatan = new javax.swing.JTextField();
        txtKota = new javax.swing.JTextField();
        txtProvinsi = new javax.swing.JTextField();
        txtSurel = new javax.swing.JTextField();
        txtWebsite = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JLabel();
        btnUlangi = new javax.swing.JLabel();
        btnPengaturanShow = new javax.swing.JLabel();
        btnPengaturanHide = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JLabel();
        btnWaliKelas = new javax.swing.JLabel();
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

        popDataSimpan.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Analisa dan Perancangan Sistem Informasi\\Reeport\\reeport_sccs.png")); // NOI18N
        popDataSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popDataSimpanMouseClicked(evt);
            }
        });
        getContentPane().add(popDataSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 417, 226));

        popKeluar.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Analisa dan Perancangan Sistem Informasi\\Reeport\\reeport-logout.png")); // NOI18N
        popKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popKeluarMouseClicked(evt);
            }
        });
        getContentPane().add(popKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 455, 225, 58));

        txtNamaLembaga.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtNamaLembaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 610, 30));

        txtNpsn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtNpsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 168, 610, 30));

        txtKelurahan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtKelurahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 244, 610, 30));

        txtAlamat.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 206, 610, 30));

        txtKecamatan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtKecamatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 282, 610, 30));

        txtKota.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtKota, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 321, 610, 30));

        txtProvinsi.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtProvinsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 359, 610, 30));

        txtSurel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtSurel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 435, 610, 30));

        txtWebsite.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtWebsite, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 397, 610, 30));

        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 577, 105, 39));

        btnUlangi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUlangiMouseClicked(evt);
            }
        });
        getContentPane().add(btnUlangi, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 577, 105, 39));

        btnPengaturanShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPengaturanShowMouseClicked(evt);
            }
        });
        getContentPane().add(btnPengaturanShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 240, 40));

        btnPengaturanHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPengaturanHideMouseClicked(evt);
            }
        });
        getContentPane().add(btnPengaturanHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 240, 40));

        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 40));

        btnWaliKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWaliKelasMouseClicked(evt);
            }
        });
        getContentPane().add(btnWaliKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 240, 40));

        background.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Analisa dan Perancangan Sistem Informasi\\Reeport\\reeport-03.png")); // NOI18N
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
        
        String sql = "SELECT * FROM DataLembaga";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()) {
                String NamaLembaga = rs.getString("NamaLembaga");
                String NPSN = rs.getString("NPSN");
                String Alamat = rs.getString("Alamat");
                String Kelurahan = rs.getString("Kelurahan");
                String Kecamatan = rs.getString("Kecamatan");
                String Kota = rs.getString("Kota");
                String Provinsi = rs.getString("Provinsi");
                String Website = rs.getString("Website");
                String Surel = rs.getString("Surel");
                
                txtAlamat.setText(Alamat);
                txtKecamatan.setText(Kecamatan);
                txtKelurahan.setText(Kelurahan);
                txtKota.setText(Kota);
                txtNamaLembaga.setText(NamaLembaga);
                txtNpsn.setText(NPSN);
                txtProvinsi.setText(Provinsi);
                txtSurel.setText(Surel);
                txtWebsite.setText(Website);
            }                                    
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Lembaga.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnUlangiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUlangiMouseClicked
        txtAlamat.setText("");
        txtKecamatan.setText("");
        txtKelurahan.setText("");
        txtKota.setText("");
        txtNamaLembaga.setText("");
        txtNpsn.setText("");
        txtProvinsi.setText("");
        txtSurel.setText("");
        txtWebsite.setText("");
    }//GEN-LAST:event_btnUlangiMouseClicked

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        String sql = "SELECT * FROM DataLembaga";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()) {
                sql = "UPDATE DataLembaga SET NamaLembaga = ?, NPSN = ?, Alamat = ?, Kelurahan = ?, Kecamatan = ?, Kota = ?, Provinsi = ?, Website = ?, Surel = ?;";
                try {
                    pst = con.prepareStatement(sql);
                    pst.setString(1, txtNamaLembaga.getText());
                    pst.setString(2, txtNpsn.getText());
                    pst.setString(3, txtAlamat.getText());
                    pst.setString(4, txtKelurahan.getText());
                    pst.setString(5, txtKecamatan.getText());
                    pst.setString(6, txtKota.getText());
                    pst.setString(7, txtProvinsi.getText());
                    pst.setString(8, txtWebsite.getText());
                    pst.setString(9, txtSurel.getText());
                    pst.executeUpdate();  
                    
                    popDataSimpan.setEnabled(true);
                    popDataSimpan.setVisible(true);
            
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
            else {
                sql = "INSERT INTO DataLembaga (NamaLembaga, NPSN, Alamat, Kelurahan, Kecamatan, Kota, Provinsi, Website, Surel) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
                try {
                    pst = con.prepareStatement(sql);
                    pst.setString(1, txtNamaLembaga.getText());
                    pst.setString(2, txtNpsn.getText());
                    pst.setString(3, txtAlamat.getText());
                    pst.setString(4, txtKelurahan.getText());
                    pst.setString(5, txtKecamatan.getText());
                    pst.setString(6, txtKota.getText());
                    pst.setString(7, txtProvinsi.getText());
                    pst.setString(8, txtWebsite.getText());
                    pst.setString(9, txtSurel.getText());
                    pst.executeUpdate();
                    
                    popDataSimpan.setEnabled(true);
                    popDataSimpan.setVisible(true);               
            
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }       
        
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void btnWaliKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWaliKelasMouseClicked
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(WaliKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaliKelas().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnWaliKelasMouseClicked

    private void popDataSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popDataSimpanMouseClicked
        popDataSimpan.setEnabled(false);
        popDataSimpan.setVisible(false);
    }//GEN-LAST:event_popDataSimpanMouseClicked

    private void btnPengaturanShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengaturanShowMouseClicked
        popKeluar.setEnabled(true);
        popKeluar.setVisible(true);
        btnPengaturanHide.setEnabled(true);
        btnPengaturanHide.setVisible(true);
        btnPengaturanShow.setEnabled(false);
        btnPengaturanShow.setVisible(false);
    }//GEN-LAST:event_btnPengaturanShowMouseClicked

    private void btnPengaturanHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPengaturanHideMouseClicked
        popKeluar.setEnabled(false);
        popKeluar.setVisible(false);
        btnPengaturanShow.setEnabled(true);
        btnPengaturanShow.setVisible(true);
        btnPengaturanHide.setEnabled(false);
        btnPengaturanHide.setVisible(false);
    }//GEN-LAST:event_btnPengaturanHideMouseClicked

    private void popKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popKeluarMouseClicked
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }//GEN-LAST:event_popKeluarMouseClicked

    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnDashboard;
    private javax.swing.JLabel btnPengaturanHide;
    private javax.swing.JLabel btnPengaturanShow;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel btnUlangi;
    private javax.swing.JLabel btnWaliKelas;
    private javax.swing.JLabel popDataSimpan;
    private javax.swing.JLabel popKeluar;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKecamatan;
    private javax.swing.JTextField txtKelurahan;
    private javax.swing.JTextField txtKota;
    private javax.swing.JTextField txtNamaLembaga;
    private javax.swing.JTextField txtNpsn;
    private javax.swing.JTextField txtProvinsi;
    private javax.swing.JTextField txtSurel;
    private javax.swing.JTextField txtWebsite;
    // End of variables declaration//GEN-END:variables
}
