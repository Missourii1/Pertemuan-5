package controller;

import config.AppContext;
import dao.UserDao;
import model.User;
import view.DashboardView;
import view.LoginView;
import view.RegisterView;
import javax.swing.JOptionPane;

public class LoginController {

    private LoginView view;
    private UserDao userDao;

    public LoginController(LoginView view) {
        this.view = view;
        // Mengambil bean UserDao yang dikelola oleh Spring ApplicationContext
        this.userDao = AppContext.getBean(UserDao.class);

        initListeners();
    }

    private void initListeners() {
        view.getBtnLogin().addActionListener(e -> prosesLogin());

        // Navigasi ke Form Register Baru
        view.getBtnKeRegister().addActionListener(e -> {
            RegisterView registerView = new RegisterView();
            new RegisterController(registerView);
            registerView.setLocationRelativeTo(null);
            registerView.setVisible(true);
            view.dispose();
        });
    }

    private void prosesLogin() {
        String username = view.getTxtUsername().trim();
        String password = view.getTxtPassword().trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Username dan password tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // Memanggil DAO Spring Hibernate
            User user = userDao.login(username, password);

            if (user != null) {
                JOptionPane.showMessageDialog(view,
                        "Login berhasil! Selamat datang, " + user.getNamaLengkap(), "Sukses", JOptionPane.INFORMATION_MESSAGE);

                DashboardView dashboardView = new DashboardView();
                new DashboardController(dashboardView, user);

                dashboardView.setLocationRelativeTo(null);
                dashboardView.setVisible(true);

                view.dispose();
            } else {
                JOptionPane.showMessageDialog(view,
                        "Username atau password salah!", "Login Gagal", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view,
                    "Terjadi kesalahan koneksi/server: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
