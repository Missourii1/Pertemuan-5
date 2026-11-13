package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Buah;

public class PembelianView extends javax.swing.JFrame {

    public PembelianView() {
        initComponents();
    }

    // Getter & Setter yang sudah ada (dipertahankan agar kompatibilitas 100%)
    public String getJumlahBeli() {
        return txtJumlah.getText();
    }

    public void setNamaBuah(String nama) {
        lblNamaValue.setText(nama);
    }

    public void setHargaBuah(String harga) {
        lblHargaValue.setText(harga);
    }

    public void setStokBuah(String stok) {
        lblStokValue.setText(stok);
    }

    public void setJumlahBeli(String jumlah) {
        txtJumlah.setText(jumlah);
    }

    public JButton getBtnBeli() {
        return btnBeli;
    }

    public JTable getTblTransaksi() {
        return tblTransaksi;
    }

    public void tampilkanPesan(String pesan) {
        javax.swing.JOptionPane.showMessageDialog(this, pesan);
    }

    public JButton getBtnLogout() {
        return btnNavLogout;
    }

    // Komponen tambahan untuk desain modern konsisten
    public JButton getBtnNavDashboard() {
        return btnNavDashboard;
    }

    public JButton getBtnNavDataBuah() {
        return btnNavDataBuah;
    }

    public JButton getBtnNavPembelian() {
        return btnNavPembelian;
    }

    public JComboBox<Buah> getCmbPilihBuah() {
        return cmbPilihBuah;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSidebar = new javax.swing.JPanel();
        lblBrand = new javax.swing.JLabel();
        lblSubBrand = new javax.swing.JLabel();
        btnNavDashboard = new javax.swing.JButton();
        btnNavDataBuah = new javax.swing.JButton();
        btnNavPembelian = new javax.swing.JButton();
        btnNavLogout = new javax.swing.JButton();
        panelContent = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        panelBeliCard = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        panelInfoBox = new javax.swing.JPanel();
        lblnama = new javax.swing.JLabel();
        lblNamaValue = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        lblHargaValue = new javax.swing.JLabel();
        lblStok = new javax.swing.JLabel();
        lblStokValue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPilihBuah = new javax.swing.JLabel();
        cmbPilihBuah = new javax.swing.JComboBox<>();
        lblJumlah = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        btnBeli = new javax.swing.JButton();
        panelTableCard = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transaksi Pembelian Buah");

        panelSidebar.setBackground(new java.awt.Color(27, 102, 51));
        panelSidebar.setPreferredSize(new java.awt.Dimension(220, 650));

        lblBrand.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(255, 255, 255));
        lblBrand.setText("TOKO BUAH");

        lblSubBrand.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblSubBrand.setForeground(new java.awt.Color(209, 234, 204));
        lblSubBrand.setText("Sistem Manajemen & Kasir");

        btnNavDashboard.setBackground(new java.awt.Color(27, 102, 51));
        btnNavDashboard.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnNavDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnNavDashboard.setText("Dashboard");
        btnNavDashboard.setFocusPainted(false);

        btnNavDataBuah.setBackground(new java.awt.Color(27, 102, 51));
        btnNavDataBuah.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnNavDataBuah.setForeground(new java.awt.Color(255, 255, 255));
        btnNavDataBuah.setText("Data Buah");
        btnNavDataBuah.setFocusPainted(false);

        btnNavPembelian.setBackground(new java.awt.Color(46, 139, 70));
        btnNavPembelian.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNavPembelian.setForeground(new java.awt.Color(255, 255, 255));
        btnNavPembelian.setText("Transaksi Pembelian");
        btnNavPembelian.setFocusPainted(false);

        btnNavLogout.setBackground(new java.awt.Color(168, 54, 54));
        btnNavLogout.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNavLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnNavLogout.setText("Logout");
        btnNavLogout.setFocusPainted(false);

        javax.swing.GroupLayout panelSidebarLayout = new javax.swing.GroupLayout(panelSidebar);
        panelSidebar.setLayout(panelSidebarLayout);
        panelSidebarLayout.setHorizontalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(lblSubBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavDataBuah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavPembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNavLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        panelSidebarLayout.setVerticalGroup(
            panelSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSidebarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblBrand)
                .addGap(4, 4, 4)
                .addComponent(lblSubBrand)
                .addGap(36, 36, 36)
                .addComponent(btnNavDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnNavDataBuah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnNavPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(btnNavLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(panelSidebar, java.awt.BorderLayout.WEST);

        panelContent.setBackground(new java.awt.Color(244, 246, 248));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(34, 34, 34));
        lblJudul.setText("Kasir & Transaksi Pembelian");

        panelBeliCard.setBackground(new java.awt.Color(255, 255, 255));
        panelBeliCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(22, 22, 22));
        jLabel11.setText("Informasi Buah Dipilih");

        panelInfoBox.setBackground(new java.awt.Color(244, 246, 248));
        panelInfoBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        lblnama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblnama.setForeground(new java.awt.Color(68, 68, 68));
        lblnama.setText("Nama:");

        lblNamaValue.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNamaValue.setText("Apel");

        lblHarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHarga.setForeground(new java.awt.Color(68, 68, 68));
        lblHarga.setText("Harga:");

        lblHargaValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHargaValue.setForeground(new java.awt.Color(46, 139, 70));
        lblHargaValue.setText("Rp15.000");

        lblStok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStok.setForeground(new java.awt.Color(68, 68, 68));
        lblStok.setText("Stok:");

        lblStokValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStokValue.setForeground(new java.awt.Color(51, 102, 27));
        lblStokValue.setText("20");

        javax.swing.GroupLayout panelInfoBoxLayout = new javax.swing.GroupLayout(panelInfoBox);
        panelInfoBox.setLayout(panelInfoBoxLayout);
        panelInfoBoxLayout.setHorizontalGroup(
            panelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoBoxLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnama)
                    .addComponent(lblHarga)
                    .addComponent(lblStok))
                .addGap(24, 24, 24)
                .addGroup(panelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStokValue, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(lblHargaValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNamaValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        panelInfoBoxLayout.setVerticalGroup(
            panelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoBoxLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnama)
                    .addComponent(lblNamaValue))
                .addGap(8, 8, 8)
                .addGroup(panelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHarga)
                    .addComponent(lblHargaValue))
                .addGap(8, 8, 8)
                .addGroup(panelInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStok)
                    .addComponent(lblStokValue))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(22, 22, 22));
        jLabel5.setText("Form Pembelian");

        lblPilihBuah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPilihBuah.setText("Pilih Buah");

        lblJumlah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJumlah.setText("Jumlah Beli");

        btnBeli.setBackground(new java.awt.Color(46, 139, 70));
        btnBeli.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBeli.setForeground(new java.awt.Color(255, 255, 255));
        btnBeli.setText("BELI SEKARANG");
        btnBeli.setFocusPainted(false);

        javax.swing.GroupLayout panelBeliCardLayout = new javax.swing.GroupLayout(panelBeliCard);
        panelBeliCard.setLayout(panelBeliCardLayout);
        panelBeliCardLayout.setHorizontalGroup(
            panelBeliCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBeliCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBeliCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(panelInfoBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(lblPilihBuah)
                    .addComponent(cmbPilihBuah, 0, 242, Short.MAX_VALUE)
                    .addComponent(lblJumlah)
                    .addComponent(txtJumlah)
                    .addComponent(btnBeli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelBeliCardLayout.setVerticalGroup(
            panelBeliCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBeliCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInfoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPilihBuah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPilihBuah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblJumlah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelTableCard.setBackground(new java.awt.Color(255, 255, 255));
        panelTableCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(22, 22, 22));
        jLabel10.setText("Riwayat Transaksi");

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Buah", "Jumlah", "Total Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTransaksi.setRowHeight(26);
        jScrollPane1.setViewportView(tblTransaksi);

        javax.swing.GroupLayout panelTableCardLayout = new javax.swing.GroupLayout(panelTableCard);
        panelTableCard.setLayout(panelTableCardLayout);
        panelTableCardLayout.setHorizontalGroup(
            panelTableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableCardLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelTableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addGroup(panelTableCardLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        panelTableCardLayout.setVerticalGroup(
            panelTableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableCardLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJudul)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addComponent(panelBeliCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(panelTableCard, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblJudul)
                .addGap(18, 18, 18)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBeliCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTableCard, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(panelContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnNavDashboard;
    private javax.swing.JButton btnNavDataBuah;
    private javax.swing.JButton btnNavLogout;
    private javax.swing.JButton btnNavPembelian;
    private javax.swing.JComboBox<model.Buah> cmbPilihBuah;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblHargaValue;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblNamaValue;
    private javax.swing.JLabel lblPilihBuah;
    private javax.swing.JLabel lblStok;
    private javax.swing.JLabel lblStokValue;
    private javax.swing.JLabel lblSubBrand;
    private javax.swing.JLabel lblnama;
    private javax.swing.JPanel panelBeliCard;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelInfoBox;
    private javax.swing.JPanel panelSidebar;
    private javax.swing.JPanel panelTableCard;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextField txtJumlah;
    // End of variables declaration//GEN-END:variables
}
