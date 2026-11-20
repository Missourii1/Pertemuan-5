package view;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterView extends javax.swing.JFrame {

    public RegisterView() {
        initComponents();
    }

    public String getTxtNamaLengkap() {
        return txtNamaLengkap.getText();
    }

    public String getTxtUsername() {
        return txtUsername.getText();
    }

    public String getTxtPassword() {
        return new String(txtPassword.getPassword());
    }

    public String getTxtKonfirmasi() {
        return new String(txtKonfirmasi.getPassword());
    }

    public JButton getBtnRegister() {
        return btnRegister;
    }

    public JButton getBtnKeLogin() {
        return btnKeLogin;
    }

    public JTextField getFieldNamaLengkap() {
        return txtNamaLengkap;
    }

    public JTextField getFieldUsername() {
        return txtUsername;
    }

    public JPasswordField getFieldPassword() {
        return txtPassword;
    }

    public JPasswordField getFieldKonfirmasi() {
        return txtKonfirmasi;
    }

    public void tampilkanPesan(String pesan) {
        javax.swing.JOptionPane.showMessageDialog(this, pesan);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBanner = new javax.swing.JPanel();
        lblBrandTitle = new javax.swing.JLabel();
        lblBrandSub = new javax.swing.JLabel();
        lblBrandDesc = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        lblJudul = new javax.swing.JLabel();
        lblSubJudul = new javax.swing.JLabel();
        lblNamaLengkap = new javax.swing.JLabel();
        txtNamaLengkap = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblKonfirmasi = new javax.swing.JLabel();
        txtKonfirmasi = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        lblSudahPunya = new javax.swing.JLabel();
        btnKeLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar Akun Baru - Toko Buah Modern");
        setResizable(false);

        panelBanner.setBackground(new java.awt.Color(27, 102, 51));
        panelBanner.setPreferredSize(new java.awt.Dimension(300, 560));

        lblBrandTitle.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblBrandTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblBrandTitle.setText("TOKO BUAH");

        lblBrandSub.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBrandSub.setForeground(new java.awt.Color(209, 234, 204));
        lblBrandSub.setText("Sistem Kasir & Inventaris");

        lblBrandDesc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblBrandDesc.setForeground(new java.awt.Color(236, 245, 235));
        lblBrandDesc.setText("<html>Daftarkan akun kasir atau staf baru untuk mulai mengakses sistem transaksi dan manajemen inventaris buah.</html>");

        javax.swing.GroupLayout panelBannerLayout = new javax.swing.GroupLayout(panelBanner);
        panelBanner.setLayout(panelBannerLayout);
        panelBannerLayout.setHorizontalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBannerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBrandDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(lblBrandTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBrandSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        panelBannerLayout.setVerticalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBannerLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(lblBrandTitle)
                .addGap(8, 8, 8)
                .addComponent(lblBrandSub)
                .addGap(24, 24, 24)
                .addComponent(lblBrandDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        getContentPane().add(panelBanner, java.awt.BorderLayout.WEST);

        panelForm.setBackground(new java.awt.Color(255, 255, 255));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(34, 34, 34));
        lblJudul.setText("Daftar Akun");

        lblSubJudul.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblSubJudul.setForeground(new java.awt.Color(102, 102, 102));
        lblSubJudul.setText("Buat akun baru untuk akses sistem toko buah.");

        lblNamaLengkap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNamaLengkap.setForeground(new java.awt.Color(51, 51, 51));
        lblNamaLengkap.setText("Nama Lengkap");

        txtNamaLengkap.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername.setText("Username");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 51, 51));
        lblPassword.setText("Password");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        lblKonfirmasi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKonfirmasi.setForeground(new java.awt.Color(51, 51, 51));
        lblKonfirmasi.setText("Konfirmasi Password");

        txtKonfirmasi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnRegister.setBackground(new java.awt.Color(46, 139, 70));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("DAFTAR SEKARANG");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegister.setFocusPainted(false);

        lblSudahPunya.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblSudahPunya.setForeground(new java.awt.Color(102, 102, 102));
        lblSudahPunya.setText("Sudah punya akun?");

        btnKeLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKeLogin.setForeground(new java.awt.Color(46, 139, 70));
        btnKeLogin.setText("Login di sini");
        btnKeLogin.setBorderPainted(false);
        btnKeLogin.setContentAreaFilled(false);
        btnKeLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnKeLogin.setFocusPainted(false);

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblJudul)
                    .addComponent(lblSubJudul)
                    .addComponent(lblNamaLengkap)
                    .addComponent(txtNamaLengkap)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword)
                    .addComponent(lblKonfirmasi)
                    .addComponent(txtKonfirmasi)
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(lblSudahPunya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKeLogin)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblJudul)
                .addGap(4, 4, 4)
                .addComponent(lblSubJudul)
                .addGap(20, 20, 20)
                .addComponent(lblNamaLengkap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblKonfirmasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSudahPunya)
                    .addComponent(btnKeLogin))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(panelForm, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel lblBrandDesc;
    private javax.swing.JLabel lblBrandSub;
    private javax.swing.JLabel lblBrandTitle;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblKonfirmasi;
    private javax.swing.JLabel lblNamaLengkap;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSubJudul;
    private javax.swing.JLabel lblSudahPunya;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelBanner;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPasswordField txtKonfirmasi;
    private javax.swing.JTextField txtNamaLengkap;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
