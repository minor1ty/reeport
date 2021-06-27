package reeport;

import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class WaliKelas extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public WaliKelas() {
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
        txtNip = new javax.swing.JTextField();
        txtNamaDepan = new javax.swing.JTextField();
        txtNamaBelakang = new javax.swing.JTextField();
        cboSemester = new javax.swing.JComboBox<>();
        cboProgramPaket = new javax.swing.JComboBox<>();
        cboKelas = new javax.swing.JComboBox<>();
        txtTahunAjaran = new javax.swing.JFormattedTextField();
        btnDashboard = new javax.swing.JLabel();
        btnLembaga = new javax.swing.JLabel();
        btnSunting = new javax.swing.JLabel();
        btnPengaturanShow = new javax.swing.JLabel();
        btnPengaturanHide = new javax.swing.JLabel();
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
        popDataSimpan.setText("jLabel1");
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

        txtNip.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 620, 30));

        txtNamaDepan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtNamaDepan, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 620, 30));

        txtNamaBelakang.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtNamaBelakang, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 620, 30));

        cboSemester.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cboSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ganjil", "Genap" }));
        cboSemester.setBorder(null);
        cboSemester.setOpaque(false);
        getContentPane().add(cboSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 620, 30));

        cboProgramPaket.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cboProgramPaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        cboProgramPaket.setBorder(null);
        cboProgramPaket.setOpaque(false);
        getContentPane().add(cboProgramPaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 620, 30));

        cboKelas.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cboKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" }));
        cboKelas.setBorder(null);
        cboKelas.setOpaque(false);
        getContentPane().add(cboKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 620, 30));

        txtTahunAjaran.setColumns(8);
        try {
            txtTahunAjaran.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTahunAjaran.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtTahunAjaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 620, 30));

        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 40));

        btnLembaga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLembagaMouseClicked(evt);
            }
        });
        getContentPane().add(btnLembaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 240, 40));

        btnSunting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuntingMouseClicked(evt);
            }
        });
        getContentPane().add(btnSunting, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 577, 105, 40));

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

        background.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Analisa dan Perancangan Sistem Informasi\\Reeport\\reeport-04.png")); // NOI18N
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
        
        String sql = "SELECT * FROM DataWaliKelas";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()) {
                String NamaDepan = rs.getString("NamaDepan");
                String NamaBelakang = rs.getString("NamaBelakang");
                String NIP = rs.getString("NIP");
                String ProgramPaket = rs.getString("ProgramPaket");
                String Kelas = rs.getString("Kelas");
                String Semester = rs.getString("Semester");
                String TahunAjaran = rs.getString("TahunAjaran");
                
                txtNamaDepan.setText(NamaDepan);
                txtNamaBelakang.setText(NamaBelakang);
                txtNip.setText(NIP);
                cboProgramPaket.setSelectedItem(ProgramPaket);
                cboKelas.setSelectedItem(Kelas);
                cboSemester.setSelectedItem(Semester);
                txtTahunAjaran.setText(TahunAjaran);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnLembagaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLembagaMouseClicked
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(WaliKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lembaga().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnLembagaMouseClicked

    private void btnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseClicked
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(WaliKelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnDashboardMouseClicked

    private void btnSuntingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuntingMouseClicked
        String sql = "UPDATE DataWaliKelas SET NamaDepan = ?, NamaBelakang = ?, NIP = ?, ProgramPaket = ?, Kelas = ?, Semester = ?, TahunAjaran = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, txtNamaDepan.getText());
            pst.setString(2, txtNamaBelakang.getText());
            pst.setString(3, txtNip.getText());
            pst.setString(4, cboProgramPaket.getSelectedItem().toString());
            pst.setString(5, cboKelas.getSelectedItem().toString());
            pst.setString(6, cboSemester.getSelectedItem().toString());
            pst.setString(7, txtTahunAjaran.getText());
            pst.executeUpdate();
            
            popDataSimpan.setEnabled(true);
            popDataSimpan.setVisible(true);
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        popDataSimpan.setEnabled(true);
        popDataSimpan.setVisible(true);
    }//GEN-LAST:event_btnSuntingMouseClicked

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
    private javax.swing.JLabel btnLembaga;
    private javax.swing.JLabel btnPengaturanHide;
    private javax.swing.JLabel btnPengaturanShow;
    private javax.swing.JLabel btnSunting;
    private javax.swing.JComboBox<String> cboKelas;
    private javax.swing.JComboBox<String> cboProgramPaket;
    private javax.swing.JComboBox<String> cboSemester;
    private javax.swing.JLabel popDataSimpan;
    private javax.swing.JLabel popKeluar;
    private javax.swing.JTextField txtNamaBelakang;
    private javax.swing.JTextField txtNamaDepan;
    private javax.swing.JTextField txtNip;
    private javax.swing.JFormattedTextField txtTahunAjaran;
    // End of variables declaration//GEN-END:variables
}
