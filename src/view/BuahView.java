package view;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class BuahView extends javax.swing.JFrame {

    public BuahView() {
        initComponents();
    }

    // Getter untuk komponen navigasi sidebar
    public JButton getBtnNavDashboard() {
        return btnNavDashboard;
    }

    public JButton getBtnNavDataBuah() {
        return btnNavDataBuah;
    }

    public JButton getBtnNavPembelian() {
        return btnNavPembelian;
    }

    public JButton getBtnNavLogout() {
        return btnNavLogout;
    }

    // Getter untuk form input dan tombol aksi
    public JTextField getTxtNamaBuah() {
        return txtNamaBuah;
    }

    public JTextField getTxtHarga() {
        return txtHarga;
    }

    public JTextField getTxtStok() {
        return txtStok;
    }

    public JButton getBtnTambah() {
        return btnTambah;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public JButton getBtnBatal() {
        return btnBatal;
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    public JTable getTblBuah() {
        return tblBuah;
    }

    public void tampilkanPesan(String pesan) {
        javax.swing.JOptionPane.showMessageDialog(this, pesan);
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
        lblPageTitle = new javax.swing.JLabel();
        panelFormCard = new javax.swing.JPanel();
        lblFormHeader = new javax.swing.JLabel();
        lblNamaBuah = new javax.swing.JLabel();
        txtNamaBuah = new javax.swing.JTextField();
        lblHarga = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        lblStok = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        panelTableCard = new javax.swing.JPanel();
        lblTableHeader = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        tblBuah = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manajemen Data Buah");

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

        btnNavDataBuah.setBackground(new java.awt.Color(46, 139, 70));
        btnNavDataBuah.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNavDataBuah.setForeground(new java.awt.Color(255, 255, 255));
        btnNavDataBuah.setText("Data Buah");
        btnNavDataBuah.setFocusPainted(false);

        btnNavPembelian.setBackground(new java.awt.Color(27, 102, 51));
        btnNavPembelian.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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

        lblPageTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPageTitle.setForeground(new java.awt.Color(34, 34, 34));
        lblPageTitle.setText("Kelola Data Buah");

        panelFormCard.setBackground(new java.awt.Color(255, 255, 255));
        panelFormCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        lblFormHeader.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblFormHeader.setForeground(new java.awt.Color(34, 34, 34));
        lblFormHeader.setText("Form Input Buah");

        lblNamaBuah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNamaBuah.setText("Nama Buah");

        lblHarga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHarga.setText("Harga (Rp)");

        lblStok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStok.setText("Stok");

        btnTambah.setBackground(new java.awt.Color(46, 139, 70));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.setFocusPainted(false);

        btnEdit.setBackground(new java.awt.Color(51, 102, 27));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setFocusPainted(false);

        btnHapus.setBackground(new java.awt.Color(168, 54, 54));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.setFocusPainted(false);

        btnBatal.setBackground(new java.awt.Color(112, 112, 112));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.setFocusPainted(false);

        javax.swing.GroupLayout panelFormCardLayout = new javax.swing.GroupLayout(panelFormCard);
        panelFormCard.setLayout(panelFormCardLayout);
        panelFormCardLayout.setHorizontalGroup(
            panelFormCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelFormCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFormHeader)
                    .addComponent(lblNamaBuah)
                    .addComponent(txtNamaBuah)
                    .addComponent(lblHarga)
                    .addComponent(txtHarga)
                    .addComponent(lblStok)
                    .addComponent(txtStok)
                    .addGroup(panelFormCardLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormCardLayout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelFormCardLayout.setVerticalGroup(
            panelFormCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblFormHeader)
                .addGap(20, 20, 20)
                .addComponent(lblNamaBuah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaBuah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblStok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelFormCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        panelTableCard.setBackground(new java.awt.Color(255, 255, 255));
        panelTableCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        lblTableHeader.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTableHeader.setForeground(new java.awt.Color(34, 34, 34));
        lblTableHeader.setText("Daftar Buah");

        btnRefresh.setBackground(new java.awt.Color(240, 240, 240));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(51, 51, 51));
        btnRefresh.setText("Refresh");
        btnRefresh.setFocusPainted(false);

        tblBuah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Apel", "Rp15.000", "20"},
                {"2", "Jeruk", "Rp12.000", "30"},
                {"3", "Mangga", "Rp18.000", "15"},
                {"4", "Pisang", "Rp10.000", "25"},
                {"5", "Anggur", "Rp25.000", "10"}
            },
            new String [] {
                "ID", "Nama Buah", "Harga", "Stok"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBuah.setRowHeight(26);
        tblBuah.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollTable.setViewportView(tblBuah);

        javax.swing.GroupLayout panelTableCardLayout = new javax.swing.GroupLayout(panelTableCard);
        panelTableCard.setLayout(panelTableCardLayout);
        panelTableCardLayout.setHorizontalGroup(
            panelTableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableCardLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelTableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addGroup(panelTableCardLayout.createSequentialGroup()
                        .addComponent(lblTableHeader)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        panelTableCardLayout.setVerticalGroup(
            panelTableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableCardLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelTableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTableHeader)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPageTitle)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addComponent(panelFormCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(panelTableCard, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblPageTitle)
                .addGap(18, 18, 18)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelFormCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTableCard, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(panelContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNavDashboard;
    private javax.swing.JButton btnNavDataBuah;
    private javax.swing.JButton btnNavLogout;
    private javax.swing.JButton btnNavPembelian;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblFormHeader;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblNamaBuah;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblStok;
    private javax.swing.JLabel lblSubBrand;
    private javax.swing.JLabel lblTableHeader;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelFormCard;
    private javax.swing.JPanel panelSidebar;
    private javax.swing.JPanel panelTableCard;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblBuah;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNamaBuah;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
