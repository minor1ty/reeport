package reeport;
import java.awt.*;
import java.sql.*;

public class TambahWaliKelas extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TambahWaliKelas() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        con = DBConnection.ConnectionDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNip = new javax.swing.JTextField();
        txtNamaDepan = new javax.swing.JTextField();
        txtNamaBelakang = new javax.swing.JTextField();
        cboSemester = new javax.swing.JComboBox<>();
        cboProgramPaket = new javax.swing.JComboBox<>();
        cboKelas = new javax.swing.JComboBox<>();
        txtTahunAjaran = new javax.swing.JFormattedTextField();
        btnKembali = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JLabel();
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

        txtNip.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 770, 30));

        txtNamaDepan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtNamaDepan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 203, 770, 30));

        txtNamaBelakang.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtNamaBelakang, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 242, 770, 30));

        cboSemester.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cboSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ganjil", "Genap" }));
        getContentPane().add(cboSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 396, 770, 30));

        cboProgramPaket.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cboProgramPaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        getContentPane().add(cboProgramPaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 318, 770, 30));

        cboKelas.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cboKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" }));
        getContentPane().add(cboKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 357, 770, 30));

        txtTahunAjaran.setColumns(8);
        try {
            txtTahunAjaran.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTahunAjaran.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        getContentPane().add(txtTahunAjaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 435, 770, -1));

        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 580, 106, 40));

        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1017, 580, 105, 40));

        background.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Analisa dan Perancangan Sistem Informasi\\Reeport\\reeport-10.png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        setSize(new java.awt.Dimension(1280, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        this.dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountRegistration().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnKembaliMouseClicked

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

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        String sql = "INSERT INTO DataWaliKelas(NamaDepan, NamaBelakang, NIP, ProgramPaket, Kelas, Semester, TahunAjaran) VALUES(?, ?, ?, ?, ?, ?, ?);";
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
            
            this.dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Dashboard().setVisible(true);
                }
            });
            con.close();
            System.out.println("con closed");                
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnSimpanMouseClicked

    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnKembali;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JComboBox<String> cboKelas;
    private javax.swing.JComboBox<String> cboProgramPaket;
    private javax.swing.JComboBox<String> cboSemester;
    private javax.swing.JTextField txtNamaBelakang;
    private javax.swing.JTextField txtNamaDepan;
    private javax.swing.JTextField txtNip;
    private javax.swing.JFormattedTextField txtTahunAjaran;
    // End of variables declaration//GEN-END:variables
}
