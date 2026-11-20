package view;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    public String getTxtUsername() {
        return txtUsername.getText();
    }

    public String getTxtPassword() {
        return new String(txtPassword.getPassword());
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public JButton getBtnKeRegister() {
        return btnKeRegister;
    }

    public JTextField getFieldUsername() {
        return txtUsername;
    }

    public JPasswordField getFieldPassword() {
        return txtPassword;
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
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblTanya = new javax.swing.JLabel();
        btnKeRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Toko Buah Modern");
        setResizable(false);

        panelBanner.setBackground(new java.awt.Color(27, 102, 51));
        panelBanner.setPreferredSize(new java.awt.Dimension(300, 480));

        lblBrandTitle.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblBrandTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblBrandTitle.setText("TOKO BUAH");

        lblBrandSub.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBrandSub.setForeground(new java.awt.Color(209, 234, 204));
        lblBrandSub.setText("Sistem Kasir & Inventaris");

        lblBrandDesc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblBrandDesc.setForeground(new java.awt.Color(236, 245, 235));
        lblBrandDesc.setText("<html>Selamat datang! Silakan login untuk mengelola katalog buah dan transaksi kasir secara terintegrasi.</html>");

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
                .addGap(140, 140, 140)
                .addComponent(lblBrandTitle)
                .addGap(8, 8, 8)
                .addComponent(lblBrandSub)
                .addGap(24, 24, 24)
                .addComponent(lblBrandDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        getContentPane().add(panelBanner, java.awt.BorderLayout.WEST);

        panelForm.setBackground(new java.awt.Color(255, 255, 255));

        lblJudul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(34, 34, 34));
        lblJudul.setText("Masuk Akun");

        lblSubJudul.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblSubJudul.setForeground(new java.awt.Color(102, 102, 102));
        lblSubJudul.setText("Gunakan akun Anda untuk masuk ke sistem.");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername.setText("Username");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 51, 51));
        lblPassword.setText("Password");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        btnLogin.setBackground(new java.awt.Color(46, 139, 70));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("MASUK");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.setFocusPainted(false);

        lblTanya.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTanya.setForeground(new java.awt.Color(102, 102, 102));
        lblTanya.setText("Belum punya akun?");

        btnKeRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKeRegister.setForeground(new java.awt.Color(46, 139, 70));
        btnKeRegister.setText("Daftar Sekarang");
        btnKeRegister.setBorderPainted(false);
        btnKeRegister.setContentAreaFilled(false);
        btnKeRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnKeRegister.setFocusPainted(false);

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblJudul)
                    .addComponent(lblSubJudul)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(lblTanya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKeRegister)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblJudul)
                .addGap(4, 4, 4)
                .addComponent(lblSubJudul)
                .addGap(32, 32, 32)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTanya)
                    .addComponent(btnKeRegister))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        getContentPane().add(panelForm, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeRegister;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblBrandDesc;
    private javax.swing.JLabel lblBrandSub;
    private javax.swing.JLabel lblBrandTitle;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSubJudul;
    private javax.swing.JLabel lblTanya;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelBanner;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
