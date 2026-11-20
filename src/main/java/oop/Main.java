package oop;

import config.AppContext;
import view.LoginView;
import controller.LoginController;

public class Main {

    public static void main(String[] args) {

        // Inisialisasi awal Spring ApplicationContext agar hanya dibuat sekali (singleton)
        // dan Hibernate SessionFactory siap digunakan sebelum GUI tampil
        new Thread(() -> {
            try {
                AppContext.getInstance();
            } catch (Exception e) {
                System.err.println("Inisialisasi Spring background warning: " + e.getMessage());
            }
        }).start();

        java.awt.EventQueue.invokeLater(() -> {
            LoginView login = new LoginView();
            new LoginController(login);
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        });
    }
}
