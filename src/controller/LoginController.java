package controller;

import config.AppContext;
import dao.UserDao;
import model.User;
import view.DashboardView;
import view.LoginView;
import javax.swing.JOptionPane;

public class LoginController {

    private LoginView view;
    private UserDao userDao;

    public LoginController(LoginView view) {
        this.view = view;
        // Mengambil bean UserDao yang dikelola oleh Spring ApplicationContext
        this.userDao = AppContext.getBean(UserDao.class);

        view.getBtnLogin().addActionListener(e -> prosesLogin());
    }

    private void prosesLogin() {
        String username = view.getTxtUsername();
        String password = view.getTxtPassword();

        if (username.trim().isEmpty() || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(view, "Username dan password tidak boleh kosong!");
            return;
        }

        try {
            // Memanggil DAO Spring Hibernate
            User user = userDao.login(username, password);

            if (user != null) {
                JOptionPane.showMessageDialog(view,
                        "Login berhasil! Selamat datang " + user.getNamaLengkap());

                DashboardView dashboardView = new DashboardView();
                new DashboardController(dashboardView, user);

                dashboardView.setLocationRelativeTo(null);
                dashboardView.setVisible(true);

                view.dispose();
            } else {
                JOptionPane.showMessageDialog(view,
                        "Username atau password salah!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view,
                    "Terjadi kesalahan: " + e.getMessage());
        }
    }
}
