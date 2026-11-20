package controller;

import config.AppContext;
import dao.UserDao;
import model.User;
import view.LoginView;
import view.RegisterView;
import javax.swing.JOptionPane;

public class RegisterController {

    private RegisterView view;
    private UserDao userDao;

    public RegisterController(RegisterView view) {
        this.view = view;
        this.userDao = AppContext.getBean(UserDao.class);

        initListeners();
    }

    private void initListeners() {
        view.getBtnRegister().addActionListener(e -> prosesRegister());
        view.getBtnKeLogin().addActionListener(e -> {
            LoginView loginView = new LoginView();
            new LoginController(loginView);
            loginView.setLocationRelativeTo(null);
            loginView.setVisible(true);
            view.dispose();
        });
    }

    private void prosesRegister() {
        String namaLengkap = view.getTxtNamaLengkap().trim();
        String username = view.getTxtUsername().trim();
        String password = view.getTxtPassword().trim();
        String konfirmasi = view.getTxtKonfirmasi().trim();

        // Validasi input
        if (namaLengkap.isEmpty() || username.isEmpty() || password.isEmpty() || konfirmasi.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Semua field wajib diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (username.length() < 3) {
            JOptionPane.showMessageDialog(view, "Username minimal 3 karakter!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (password.length() < 4) {
            JOptionPane.showMessageDialog(view, "Password minimal 4 karakter!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!password.equals(konfirmasi)) {
            JOptionPane.showMessageDialog(view, "Konfirmasi password tidak cocok!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Cek apakah username sudah ada
            User existing = userDao.findByUsername(username);
            if (existing != null) {
                JOptionPane.showMessageDialog(view, "Username '" + username + "' sudah digunakan, silakan pilih yang lain!", "Gagal", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Simpan user baru via Spring Hibernate DAO
            User newUser = new User(username, password, namaLengkap);
            boolean sukses = userDao.register(newUser);

            if (sukses) {
                JOptionPane.showMessageDialog(view, "Pendaftaran akun berhasil! Silakan login.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                LoginView loginView = new LoginView();
                new LoginController(loginView);
                loginView.setLocationRelativeTo(null);
                loginView.setVisible(true);
                view.dispose();
            } else {
                JOptionPane.showMessageDialog(view, "Gagal mendaftarkan akun. Silakan coba lagi.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
