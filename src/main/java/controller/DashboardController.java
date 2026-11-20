package controller;

import config.AppContext;
import dao.BuahDao;
import model.Buah;
import model.User;
import view.BuahView;
import view.DashboardView;
import view.LoginView;
import view.PembelianView;
import java.util.List;
import javax.swing.JOptionPane;

public class DashboardController {

    private DashboardView view;
    private User currentUser;
    private BuahDao buahDao;

    public DashboardController(DashboardView view, User currentUser) {
        this.view = view;
        this.currentUser = currentUser;
        // Mengambil bean BuahDao yang dikelola oleh Spring ApplicationContext
        this.buahDao = AppContext.getBean(BuahDao.class);

        initView();
        initListeners();
    }

    private void initView() {
        if (currentUser != null && currentUser.getNamaLengkap() != null) {
            view.getLblGreeting().setText("Selamat datang, " + currentUser.getNamaLengkap() + "! Kelola inventaris dan transaksi toko buah Anda.");
        }

        updateSummaryCards();
    }

    public void updateSummaryCards() {
        try {
            List<Buah> list = buahDao.getAllBuah();
            if (list != null && !list.isEmpty()) {
                int totalJenis = list.size();
                int totalStok = 0;
                for (Buah b : list) {
                    totalStok += b.getStok();
                }
                view.getLblValTotalBuah().setText(totalJenis + " Jenis");
                view.getLblValTotalStok().setText(totalStok + " Unit");
            }
        } catch (Exception e) {
            System.err.println("Database belum aktif saat membaca ringkasan dashboard: " + e.getMessage());
        }
    }

    private void initListeners() {
        // Navigasi ke Data Buah
        view.getBtnNavDataBuah().addActionListener(e -> bukaDataBuah());
        view.getBtnActionDataBuah().addActionListener(e -> bukaDataBuah());

        // Navigasi ke Pembelian (fitur pembelian terhubung dengan Spring Hibernate)
        view.getBtnNavPembelian().addActionListener(e -> bukaPembelian());
        view.getBtnActionPembelian().addActionListener(e -> bukaPembelian());

        // Logout
        view.getBtnNavLogout().addActionListener(e -> prosesLogout());
    }

    private void bukaDataBuah() {
        BuahView buahView = new BuahView();
        new BuahController(buahView, currentUser);
        buahView.setLocationRelativeTo(null);
        buahView.setVisible(true);
        view.dispose();
    }

    private void bukaPembelian() {
        // Mengambil buah pertama dari database atau default jika kosong
        Buah buah = null;
        try {
            List<Buah> list = buahDao.getAllBuah();
            if (list != null && !list.isEmpty()) {
                buah = list.get(0);
            }
        } catch (Exception e) {
            System.err.println("Gagal memuat buah untuk pembelian: " + e.getMessage());
        }

        if (buah == null) {
            buah = new Buah(1, "Apel", 15000, 20);
        }

        PembelianView pembelianView = new PembelianView();
        new PembelianController(buah, pembelianView, currentUser);
        pembelianView.setLocationRelativeTo(null);
        pembelianView.setVisible(true);
        view.dispose();
    }

    private void prosesLogout() {
        int pilihan = JOptionPane.showConfirmDialog(
            view,
            "Apakah Anda yakin ingin logout?",
            "Konfirmasi Logout",
            JOptionPane.YES_NO_OPTION
        );

        if (pilihan == JOptionPane.YES_OPTION) {
            LoginView login = new LoginView();
            new LoginController(login);
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            view.dispose();
        }
    }
}
