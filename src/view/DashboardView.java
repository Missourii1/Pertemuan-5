package view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class DashboardView extends javax.swing.JFrame {

    public DashboardView() {
        initComponents();
    }

    // Getter untuk komponen interaksi Controller
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

    public JButton getBtnActionDataBuah() {
        return btnActionDataBuah;
    }

    public JButton getBtnActionPembelian() {
        return btnActionPembelian;
    }

    public JLabel getLblValTotalBuah() {
        return lblValTotalBuah;
    }

    public JLabel getLblValTotalStok() {
        return lblValTotalStok;
    }

    public JLabel getLblGreeting() {
        return lblGreeting;
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
        lblGreeting = new javax.swing.JLabel();
        cardTotalBuah = new javax.swing.JPanel();
        lblTitleTotalBuah = new javax.swing.JLabel();
        lblValTotalBuah = new javax.swing.JLabel();
        cardTotalStok = new javax.swing.JPanel();
        lblTitleTotalStok = new javax.swing.JLabel();
        lblValTotalStok = new javax.swing.JLabel();
        cardQuickActions = new javax.swing.JPanel();
        lblQuickTitle = new javax.swing.JLabel();
        btnActionDataBuah = new javax.swing.JButton();
        btnActionPembelian = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard - Aplikasi Pembelian Buah");

        panelSidebar.setBackground(new java.awt.Color(27, 102, 51));
        panelSidebar.setPreferredSize(new java.awt.Dimension(220, 600));

        lblBrand.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(255, 255, 255));
        lblBrand.setText("TOKO BUAH");

        lblSubBrand.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblSubBrand.setForeground(new java.awt.Color(209, 234, 204));
        lblSubBrand.setText("Sistem Manajemen & Kasir");

        btnNavDashboard.setBackground(new java.awt.Color(46, 139, 70));
        btnNavDashboard.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNavDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnNavDashboard.setText("Dashboard");
        btnNavDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNavDashboard.setFocusPainted(false);

        btnNavDataBuah.setBackground(new java.awt.Color(27, 102, 51));
        btnNavDataBuah.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(btnNavLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(panelSidebar, java.awt.BorderLayout.WEST);

        panelContent.setBackground(new java.awt.Color(244, 246, 248));

        lblPageTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPageTitle.setForeground(new java.awt.Color(34, 34, 34));
        lblPageTitle.setText("Ringkasan Toko");

        lblGreeting.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblGreeting.setForeground(new java.awt.Color(102, 102, 102));
        lblGreeting.setText("Selamat datang di sistem manajemen aplikasi pembelian buah.");

        cardTotalBuah.setBackground(new java.awt.Color(255, 255, 255));
        cardTotalBuah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        lblTitleTotalBuah.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblTitleTotalBuah.setForeground(new java.awt.Color(102, 102, 102));
        lblTitleTotalBuah.setText("JUMLAH JENIS BUAH");

        lblValTotalBuah.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblValTotalBuah.setForeground(new java.awt.Color(46, 139, 70));
        lblValTotalBuah.setText("5 Jenis");

        javax.swing.GroupLayout cardTotalBuahLayout = new javax.swing.GroupLayout(cardTotalBuah);
        cardTotalBuah.setLayout(cardTotalBuahLayout);
        cardTotalBuahLayout.setHorizontalGroup(
            cardTotalBuahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTotalBuahLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardTotalBuahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValTotalBuah, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitleTotalBuah, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        cardTotalBuahLayout.setVerticalGroup(
            cardTotalBuahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTotalBuahLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitleTotalBuah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValTotalBuah)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        cardTotalStok.setBackground(new java.awt.Color(255, 255, 255));
        cardTotalStok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        lblTitleTotalStok.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblTitleTotalStok.setForeground(new java.awt.Color(102, 102, 102));
        lblTitleTotalStok.setText("TOTAL STOK TERSEDIA");

        lblValTotalStok.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblValTotalStok.setForeground(new java.awt.Color(51, 102, 27));
        lblValTotalStok.setText("100 Unit");

        javax.swing.GroupLayout cardTotalStokLayout = new javax.swing.GroupLayout(cardTotalStok);
        cardTotalStok.setLayout(cardTotalStokLayout);
        cardTotalStokLayout.setHorizontalGroup(
            cardTotalStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTotalStokLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardTotalStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValTotalStok, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitleTotalStok, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        cardTotalStokLayout.setVerticalGroup(
            cardTotalStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTotalStokLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitleTotalStok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValTotalStok)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        cardQuickActions.setBackground(new java.awt.Color(255, 255, 255));
        cardQuickActions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        lblQuickTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuickTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblQuickTitle.setText("Aksi Cepat");

        btnActionDataBuah.setBackground(new java.awt.Color(46, 139, 70));
        btnActionDataBuah.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnActionDataBuah.setForeground(new java.awt.Color(255, 255, 255));
        btnActionDataBuah.setText("Kelola Buah");
        btnActionDataBuah.setFocusPainted(false);

        btnActionPembelian.setBackground(new java.awt.Color(240, 240, 240));
        btnActionPembelian.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnActionPembelian.setForeground(new java.awt.Color(34, 34, 34));
        btnActionPembelian.setText("Kasir / Pembelian");
        btnActionPembelian.setFocusPainted(false);

        javax.swing.GroupLayout cardQuickActionsLayout = new javax.swing.GroupLayout(cardQuickActions);
        cardQuickActions.setLayout(cardQuickActionsLayout);
        cardQuickActionsLayout.setHorizontalGroup(
            cardQuickActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardQuickActionsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardQuickActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuickTitle)
                    .addGroup(cardQuickActionsLayout.createSequentialGroup()
                        .addComponent(btnActionDataBuah, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnActionPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        cardQuickActionsLayout.setVerticalGroup(
            cardQuickActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardQuickActionsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblQuickTitle)
                .addGap(18, 18, 18)
                .addGroup(cardQuickActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActionDataBuah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActionPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContentLayout = new javax.swing.GroupLayout(panelContent);
        panelContent.setLayout(panelContentLayout);
        panelContentLayout.setHorizontalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGreeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelContentLayout.createSequentialGroup()
                        .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPageTitle)
                            .addGroup(panelContentLayout.createSequentialGroup()
                                .addComponent(cardTotalBuah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(cardTotalStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cardQuickActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        panelContentLayout.setVerticalGroup(
            panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContentLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblPageTitle)
                .addGap(4, 4, 4)
                .addComponent(lblGreeting)
                .addGap(24, 24, 24)
                .addGroup(panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardTotalBuah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardTotalStok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(cardQuickActions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        getContentPane().add(panelContent, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActionDataBuah;
    private javax.swing.JButton btnActionPembelian;
    private javax.swing.JButton btnNavDashboard;
    private javax.swing.JButton btnNavDataBuah;
    private javax.swing.JButton btnNavLogout;
    private javax.swing.JButton btnNavPembelian;
    private javax.swing.JPanel cardQuickActions;
    private javax.swing.JPanel cardTotalBuah;
    private javax.swing.JPanel cardTotalStok;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblQuickTitle;
    private javax.swing.JLabel lblSubBrand;
    private javax.swing.JLabel lblTitleTotalBuah;
    private javax.swing.JLabel lblTitleTotalStok;
    private javax.swing.JLabel lblValTotalBuah;
    private javax.swing.JLabel lblValTotalStok;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelSidebar;
    // End of variables declaration//GEN-END:variables
}

