package reeport;
import java.awt.*;
import java.sql.*;

public class PesertaDidik extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public PesertaDidik() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        con = DBConnection.ConnectionDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPesertaDidik = new javax.swing.JPanel();
        lblNoNisn = new javax.swing.JLabel();
        txtNoNisn = new javax.swing.JTextField();
        lblNamaSiswa = new javax.swing.JLabel();
        txtNamaSiswa = new javax.swing.JTextField();
        lblJenisKelamin = new javax.swing.JLabel();
        lblTempatLahir = new javax.swing.JLabel();
        txtTempatLahir = new javax.swing.JTextField();
        lblTanggalLahir = new javax.swing.JLabel();
        lblAlamatSiswa = new javax.swing.JLabel();
        txtAlamatSiswa = new javax.swing.JTextField();
        lblNoTelpRumahSiswa = new javax.swing.JLabel();
        txtNoTelpRumahSiswa = new javax.swing.JTextField();
        lblNoPonselSiswa = new javax.swing.JLabel();
        txtNoPonsel = new javax.swing.JTextField();
        lblAgama = new javax.swing.JLabel();
        lblAnakKe = new javax.swing.JLabel();
        txtAnakKe = new javax.swing.JTextField();
        lblStatusKeluarga = new javax.swing.JLabel();
        cboJenisKelamin = new javax.swing.JComboBox<>();
        txtTanggalLahir = new javax.swing.JFormattedTextField();
        cboAgama = new javax.swing.JComboBox<>();
        cboStatusKeluarga = new javax.swing.JComboBox<>();
        panAyah = new javax.swing.JPanel();
        lblNama = new javax.swing.JLabel();
        txtNamaAyah = new javax.swing.JTextField();
        lblPekerjaanAyah = new javax.swing.JLabel();
        txtPekerjaanAyah = new javax.swing.JTextField();
        lblAlamatAyah = new javax.swing.JLabel();
        txtAlamatAyah = new javax.swing.JTextField();
        lblNoTelpRumahAyah = new javax.swing.JLabel();
        txtNoTelpRumahAyah = new javax.swing.JTextField();
        lblNoPonselAyah = new javax.swing.JLabel();
        txtNoPonselAyah = new javax.swing.JTextField();
        panTable = new javax.swing.JScrollPane();
        tblPesertaDidik = new javax.swing.JTable();
        panIbu = new javax.swing.JPanel();
        lblNamaIbu = new javax.swing.JLabel();
        txtNamaIbu = new javax.swing.JTextField();
        lblPekerjaanIbu = new javax.swing.JLabel();
        txtPekerjaanIbu = new javax.swing.JTextField();
        lblAlamatIbu = new javax.swing.JLabel();
        txtAlamatIbu = new javax.swing.JTextField();
        lblNoTelpRumahIbu = new javax.swing.JLabel();
        txtNoTelpRumahIbu = new javax.swing.JTextField();
        lblNoPonselIbu = new javax.swing.JLabel();
        txtNoPonselIbu = new javax.swing.JTextField();
        panIjazah = new javax.swing.JPanel();
        lblJenisIjazah = new javax.swing.JLabel();
        lblTahunIjazah = new javax.swing.JLabel();
        txtTahunIjazah = new javax.swing.JTextField();
        lblNoIjazah = new javax.swing.JLabel();
        txtNoIjazah = new javax.swing.JTextField();
        lblTanggalDiterima = new javax.swing.JLabel();
        lblSetaraKelas = new javax.swing.JLabel();
        cboJenisIjazah = new javax.swing.JComboBox<>();
        txtTanggalDiterima = new javax.swing.JFormattedTextField();
        cboSetaraKelas = new javax.swing.JComboBox<>();
        panWali = new javax.swing.JPanel();
        lblNamaWali = new javax.swing.JLabel();
        txtNamaWali = new javax.swing.JTextField();
        lblPekerjaanWali = new javax.swing.JLabel();
        txtPekerjaanWali = new javax.swing.JTextField();
        lblAlamatWali = new javax.swing.JLabel();
        txtAlamatWali = new javax.swing.JTextField();
        lblNoTelpRumahWali = new javax.swing.JLabel();
        txtNoTelpRumahWali = new javax.swing.JTextField();
        lblNoPonselWali = new javax.swing.JLabel();
        txtNoPonselWali = new javax.swing.JTextField();
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

        panPesertaDidik.setBackground(new java.awt.Color(255, 255, 255));
        panPesertaDidik.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peserta Didik", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 11))); // NOI18N

        lblNoNisn.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoNisn.setText("No. NISN");

        txtNoNisn.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNamaSiswa.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNamaSiswa.setText("Nama Siswa");

        txtNamaSiswa.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblJenisKelamin.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblJenisKelamin.setText("Jenis Kelamin");

        lblTempatLahir.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblTempatLahir.setText("Tempat Lahir");

        txtTempatLahir.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblTanggalLahir.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblTanggalLahir.setText("Tanggal Lahir");

        lblAlamatSiswa.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblAlamatSiswa.setText("Alamat");

        txtAlamatSiswa.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNoTelpRumahSiswa.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoTelpRumahSiswa.setText("No. Telp. Rumah");

        txtNoTelpRumahSiswa.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNoPonselSiswa.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoPonselSiswa.setText("No. Ponsel");

        txtNoPonsel.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblAgama.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblAgama.setText("Agama");

        lblAnakKe.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblAnakKe.setText("Anak Ke");

        txtAnakKe.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblStatusKeluarga.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblStatusKeluarga.setText("Status Keluarga");

        cboJenisKelamin.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        cboJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        cboJenisKelamin.setOpaque(false);

        txtTanggalLahir.setColumns(8);
        txtTanggalLahir.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        txtTanggalLahir.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        cboAgama.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        cboAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Protestan", "Katolik", "Hindu", "Buddha", "Konghucu" }));
        cboAgama.setOpaque(false);

        cboStatusKeluarga.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        cboStatusKeluarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anak Kandung", "Anak Angkat" }));

        javax.swing.GroupLayout panPesertaDidikLayout = new javax.swing.GroupLayout(panPesertaDidik);
        panPesertaDidik.setLayout(panPesertaDidikLayout);
        panPesertaDidikLayout.setHorizontalGroup(
            panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPesertaDidikLayout.createSequentialGroup()
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblStatusKeluarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAnakKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAgama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNoPonselSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNoTelpRumahSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(lblAlamatSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panPesertaDidikLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTempatLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblJenisKelamin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(lblNamaSiswa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNoNisn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAnakKe, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoPonsel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoTelpRumahSiswa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlamatSiswa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTempatLahir, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaSiswa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoNisn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(cboJenisKelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTanggalLahir)
                    .addComponent(cboAgama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboStatusKeluarga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        panPesertaDidikLayout.setVerticalGroup(
            panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPesertaDidikLayout.createSequentialGroup()
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoNisn)
                    .addComponent(txtNoNisn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamaSiswa)
                    .addComponent(txtNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenisKelamin)
                    .addComponent(cboJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempatLahir)
                    .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTanggalLahir)
                    .addComponent(txtTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlamatSiswa)
                    .addComponent(txtAlamatSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoTelpRumahSiswa)
                    .addComponent(txtNoTelpRumahSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoPonselSiswa)
                    .addComponent(txtNoPonsel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgama)
                    .addComponent(cboAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnakKe)
                    .addComponent(txtAnakKe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPesertaDidikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusKeluarga)
                    .addComponent(cboStatusKeluarga, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panPesertaDidik, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 290, 310));

        panAyah.setBackground(new java.awt.Color(255, 255, 255));
        panAyah.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ayah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 11))); // NOI18N

        lblNama.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNama.setText("Nama");

        txtNamaAyah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblPekerjaanAyah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblPekerjaanAyah.setText("Pekerjaan");

        txtPekerjaanAyah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblAlamatAyah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblAlamatAyah.setText("Alamat");

        txtAlamatAyah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNoTelpRumahAyah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoTelpRumahAyah.setText("No. Telp. Rumah");

        txtNoTelpRumahAyah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNoPonselAyah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoPonselAyah.setText("No. Ponsel");

        txtNoPonselAyah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        javax.swing.GroupLayout panAyahLayout = new javax.swing.GroupLayout(panAyah);
        panAyah.setLayout(panAyahLayout);
        panAyahLayout.setHorizontalGroup(
            panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAyahLayout.createSequentialGroup()
                .addGroup(panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNoPonselAyah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panAyahLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNoTelpRumahAyah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlamatAyah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPekerjaanAyah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNoPonselAyah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoTelpRumahAyah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlamatAyah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPekerjaanAyah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaAyah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panAyahLayout.setVerticalGroup(
            panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAyahLayout.createSequentialGroup()
                .addGroup(panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(txtNamaAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPekerjaanAyah)
                    .addComponent(txtPekerjaanAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlamatAyah)
                    .addComponent(txtAlamatAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoTelpRumahAyah)
                    .addComponent(txtNoTelpRumahAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAyahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoPonselAyah)
                    .addComponent(txtNoPonselAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panAyah, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 290, 150));

        tblPesertaDidik.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        tblPesertaDidik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. NISN", "Nama Siswa", "Jenis Kelamin", "Tempat Lahir", "Tanggal Lahir", "Alamat Siswa", "No. Telp. Rumah Siswa", "No. Ponsel Siswa", "Agama", "Anak Ke", "Status Keluarga", "Nama Ayah", "Pekerjaan Ayah", "Alamat Ayah", "No. Telp. Rumah Ayah", "No. Ponsel Ayah", "Nama Ibu", "Pekerjaan Ibu", "Alamat Ibu", "No. Telp. Rumah Ibu", "No. Ponsel Ibu", "Nama Wali", "Pekerjaan Wali", "Alamat Wali", "No. Telp. Rumah Wali", "No. Ponsel Wali", "Jenis Ijazah", "Tahun Ijazah", "No. Ijazah", "Tanggal Diterima", "Setara Kelas"
            }
        ));
        panTable.setViewportView(tblPesertaDidik);

        getContentPane().add(panTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 850, 150));

        panIbu.setBackground(new java.awt.Color(255, 255, 255));
        panIbu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ibu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 11))); // NOI18N

        lblNamaIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNamaIbu.setText("Nama");

        txtNamaIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblPekerjaanIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblPekerjaanIbu.setText("Pekerjaan");

        txtPekerjaanIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblAlamatIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblAlamatIbu.setText("Alamat");

        txtAlamatIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNoTelpRumahIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoTelpRumahIbu.setText("No. Telp. Rumah");

        txtNoTelpRumahIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNoPonselIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoPonselIbu.setText("No. Ponsel");

        txtNoPonselIbu.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        javax.swing.GroupLayout panIbuLayout = new javax.swing.GroupLayout(panIbu);
        panIbu.setLayout(panIbuLayout);
        panIbuLayout.setHorizontalGroup(
            panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIbuLayout.createSequentialGroup()
                .addGroup(panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNoPonselIbu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panIbuLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNoTelpRumahIbu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlamatIbu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPekerjaanIbu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNamaIbu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNoPonselIbu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoTelpRumahIbu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlamatIbu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPekerjaanIbu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaIbu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panIbuLayout.setVerticalGroup(
            panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIbuLayout.createSequentialGroup()
                .addGroup(panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamaIbu)
                    .addComponent(txtNamaIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPekerjaanIbu)
                    .addComponent(txtPekerjaanIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlamatIbu)
                    .addComponent(txtAlamatIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoTelpRumahIbu)
                    .addComponent(txtNoTelpRumahIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIbuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoPonselIbu)
                    .addComponent(txtNoPonselIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panIbu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 290, 150));

        panIjazah.setBackground(new java.awt.Color(255, 255, 255));
        panIjazah.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ijazah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 11))); // NOI18N

        lblJenisIjazah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblJenisIjazah.setText("Jenis");

        lblTahunIjazah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblTahunIjazah.setText("Tahun");

        txtTahunIjazah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNoIjazah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoIjazah.setText("Nomor");

        txtNoIjazah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblTanggalDiterima.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblTanggalDiterima.setText("Tanggal Diterima");

        lblSetaraKelas.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblSetaraKelas.setText("Setara Kelas");

        cboJenisIjazah.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        cboJenisIjazah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SD", "SMP", "MI", "MTS", "PAKET A", "PAKET B" }));

        txtTanggalDiterima.setColumns(8);
        txtTanggalDiterima.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyy"))));
        txtTanggalDiterima.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        cboSetaraKelas.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        cboSetaraKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" }));

        javax.swing.GroupLayout panIjazahLayout = new javax.swing.GroupLayout(panIjazah);
        panIjazah.setLayout(panIjazahLayout);
        panIjazahLayout.setHorizontalGroup(
            panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIjazahLayout.createSequentialGroup()
                .addGroup(panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblSetaraKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panIjazahLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTanggalDiterima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNoIjazah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTahunIjazah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblJenisIjazah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNoIjazah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTahunIjazah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboJenisIjazah, 0, 150, Short.MAX_VALUE)
                    .addComponent(txtTanggalDiterima)
                    .addComponent(cboSetaraKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        panIjazahLayout.setVerticalGroup(
            panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panIjazahLayout.createSequentialGroup()
                .addGroup(panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenisIjazah)
                    .addComponent(cboJenisIjazah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTahunIjazah)
                    .addComponent(txtTahunIjazah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoIjazah)
                    .addComponent(txtNoIjazah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTanggalDiterima)
                    .addComponent(txtTanggalDiterima, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panIjazahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSetaraKelas)
                    .addComponent(cboSetaraKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panIjazah, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 260, 270, 150));

        panWali.setBackground(new java.awt.Color(255, 255, 255));
        panWali.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Wali", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins SemiBold", 0, 11))); // NOI18N

        lblNamaWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNamaWali.setText("Nama");

        txtNamaWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblPekerjaanWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblPekerjaanWali.setText("Pekerjaan");

        txtPekerjaanWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblAlamatWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblAlamatWali.setText("Alamat");

        txtAlamatWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNoTelpRumahWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoTelpRumahWali.setText("No. Telp. Rumah");

        txtNoTelpRumahWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        lblNoPonselWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        lblNoPonselWali.setText("No. Ponsel");

        txtNoPonselWali.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N

        javax.swing.GroupLayout panWaliLayout = new javax.swing.GroupLayout(panWali);
        panWali.setLayout(panWaliLayout);
        panWaliLayout.setHorizontalGroup(
            panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWaliLayout.createSequentialGroup()
                .addGroup(panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNoPonselWali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panWaliLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNoTelpRumahWali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlamatWali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPekerjaanWali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNamaWali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNoPonselWali, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoTelpRumahWali, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAlamatWali, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPekerjaanWali, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaWali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panWaliLayout.setVerticalGroup(
            panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panWaliLayout.createSequentialGroup()
                .addGroup(panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamaWali)
                    .addComponent(txtNamaWali, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPekerjaanWali)
                    .addComponent(txtPekerjaanWali, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlamatWali)
                    .addComponent(txtAlamatWali, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoTelpRumahWali)
                    .addComponent(txtNoTelpRumahWali, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panWaliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoPonselWali)
                    .addComponent(txtNoPonselWali, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panWali, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 270, 150));

        background.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Analisa dan Perancangan Sistem Informasi\\Reeport\\reeport-05.png")); // NOI18N
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
        
        String sql = "SELECT * FROM DataPesertaDidik;";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()) {
                String NoNisn = rs.getString("NoNisn");
                
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesertaDidik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> cboAgama;
    private javax.swing.JComboBox<String> cboJenisIjazah;
    private javax.swing.JComboBox<String> cboJenisKelamin;
    private javax.swing.JComboBox<String> cboSetaraKelas;
    private javax.swing.JComboBox<String> cboStatusKeluarga;
    private javax.swing.JLabel lblAgama;
    private javax.swing.JLabel lblAlamatAyah;
    private javax.swing.JLabel lblAlamatIbu;
    private javax.swing.JLabel lblAlamatSiswa;
    private javax.swing.JLabel lblAlamatWali;
    private javax.swing.JLabel lblAnakKe;
    private javax.swing.JLabel lblJenisIjazah;
    private javax.swing.JLabel lblJenisKelamin;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNamaIbu;
    private javax.swing.JLabel lblNamaSiswa;
    private javax.swing.JLabel lblNamaWali;
    private javax.swing.JLabel lblNoIjazah;
    private javax.swing.JLabel lblNoNisn;
    private javax.swing.JLabel lblNoPonselAyah;
    private javax.swing.JLabel lblNoPonselIbu;
    private javax.swing.JLabel lblNoPonselSiswa;
    private javax.swing.JLabel lblNoPonselWali;
    private javax.swing.JLabel lblNoTelpRumahAyah;
    private javax.swing.JLabel lblNoTelpRumahIbu;
    private javax.swing.JLabel lblNoTelpRumahSiswa;
    private javax.swing.JLabel lblNoTelpRumahWali;
    private javax.swing.JLabel lblPekerjaanAyah;
    private javax.swing.JLabel lblPekerjaanIbu;
    private javax.swing.JLabel lblPekerjaanWali;
    private javax.swing.JLabel lblSetaraKelas;
    private javax.swing.JLabel lblStatusKeluarga;
    private javax.swing.JLabel lblTahunIjazah;
    private javax.swing.JLabel lblTanggalDiterima;
    private javax.swing.JLabel lblTanggalLahir;
    private javax.swing.JLabel lblTempatLahir;
    private javax.swing.JPanel panAyah;
    private javax.swing.JPanel panIbu;
    private javax.swing.JPanel panIjazah;
    private javax.swing.JPanel panPesertaDidik;
    private javax.swing.JScrollPane panTable;
    private javax.swing.JPanel panWali;
    private javax.swing.JTable tblPesertaDidik;
    private javax.swing.JTextField txtAlamatAyah;
    private javax.swing.JTextField txtAlamatIbu;
    private javax.swing.JTextField txtAlamatSiswa;
    private javax.swing.JTextField txtAlamatWali;
    private javax.swing.JTextField txtAnakKe;
    private javax.swing.JTextField txtNamaAyah;
    private javax.swing.JTextField txtNamaIbu;
    private javax.swing.JTextField txtNamaSiswa;
    private javax.swing.JTextField txtNamaWali;
    private javax.swing.JTextField txtNoIjazah;
    private javax.swing.JTextField txtNoNisn;
    private javax.swing.JTextField txtNoPonsel;
    private javax.swing.JTextField txtNoPonselAyah;
    private javax.swing.JTextField txtNoPonselIbu;
    private javax.swing.JTextField txtNoPonselWali;
    private javax.swing.JTextField txtNoTelpRumahAyah;
    private javax.swing.JTextField txtNoTelpRumahIbu;
    private javax.swing.JTextField txtNoTelpRumahSiswa;
    private javax.swing.JTextField txtNoTelpRumahWali;
    private javax.swing.JTextField txtPekerjaanAyah;
    private javax.swing.JTextField txtPekerjaanIbu;
    private javax.swing.JTextField txtPekerjaanWali;
    private javax.swing.JTextField txtTahunIjazah;
    private javax.swing.JFormattedTextField txtTanggalDiterima;
    private javax.swing.JFormattedTextField txtTanggalLahir;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables
}
