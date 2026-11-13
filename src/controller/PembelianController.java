package controller;

import config.AppContext;
import dao.BuahDao;
import dao.TransaksiDao;
import model.Buah;
import model.DetailTransaksi;
import model.Transaksi;
import model.User;
import view.BuahView;
import view.DashboardView;
import view.LoginView;
import view.PembelianView;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PembelianController {

    private Buah buah;
    private PembelianView view;
    private User currentUser;
    private TransaksiDao transaksiDao;
    private BuahDao buahDao;

    public PembelianController(Buah buah, PembelianView view, User currentUser) {
        this.buah = buah;
        this.view = view;
        this.currentUser = currentUser;

        this.transaksiDao = AppContext.getBean(TransaksiDao.class);
        this.buahDao = AppContext.getBean(BuahDao.class);

        initSidebar();
        initComboBox();
        tampilkanDetailBuah(this.buah);

        // Menghubungkan tombol BELI dan LOGOUT
        view.getBtnBeli().addActionListener(e -> prosesPembelian());
        view.getBtnLogout().addActionListener(e -> prosesLogout());
    }

    public PembelianController(Buah buah, PembelianView view) {
        this(buah, view, null);
    }

    private void initSidebar() {
        // Navigasi Sidebar yang konsisten
        view.getBtnNavDashboard().addActionListener(e -> {
            DashboardView dashboard = new DashboardView();
            new DashboardController(dashboard, currentUser);
            dashboard.setLocationRelativeTo(null);
            dashboard.setVisible(true);
            view.dispose();
        });

        view.getBtnNavDataBuah().addActionListener(e -> {
            BuahView buahView = new BuahView();
            new BuahController(buahView, currentUser);
            buahView.setLocationRelativeTo(null);
            buahView.setVisible(true);
            view.dispose();
        });
    }

    private void initComboBox() {
        try {
            List<Buah> listBuah = buahDao.getAllBuah();
            DefaultComboBoxModel<Buah> comboModel = new DefaultComboBoxModel<>();
            for (Buah b : listBuah) {
                comboModel.addElement(b);
            }
            view.getCmbPilihBuah().setModel(comboModel);

            // Pilih buah yang sedang aktif jika ada
            if (buah != null) {
                for (int i = 0; i < comboModel.getSize(); i++) {
                    Buah item = comboModel.getElementAt(i);
                    if (item.getIdBuah() == buah.getIdBuah()) {
                        view.getCmbPilihBuah().setSelectedIndex(i);
                        break;
                    }
                }
            }

            // Listener pergantian pilihan buah
            view.getCmbPilihBuah().addActionListener(e -> {
                Buah selected = (Buah) view.getCmbPilihBuah().getSelectedItem();
                if (selected != null) {
                    this.buah = selected;
                    tampilkanDetailBuah(this.buah);
                }
            });

        } catch (Exception e) {
            System.err.println("Gagal memuat combo box buah: " + e.getMessage());
        }
    }

    private void tampilkanDetailBuah(Buah b) {
        if (b != null) {
            view.setNamaBuah(b.getNama());
            view.setHargaBuah("Rp" + b.getHarga());
            view.setStokBuah(String.valueOf(b.getStok()));
        }
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

    private void prosesPembelian() {
        if (buah == null) {
            view.tampilkanPesan("Pilih buah terlebih dahulu!");
            return;
        }

        int jumlah;
        try {
            jumlah = Integer.parseInt(view.getJumlahBeli().trim());
        } catch (NumberFormatException e) {
            view.tampilkanPesan("Masukkan jumlah pembelian yang valid!");
            return;
        }

        if (jumlah <= 0) {
            view.tampilkanPesan("Jumlah pembelian harus di atas 0!");
            return;
        }

        // Ambil stok ter-update dari database
        Buah freshBuah = buahDao.getBuahById(buah.getIdBuah());
        if (freshBuah != null) {
            this.buah = freshBuah;
        }

        if (jumlah > buah.getStok()) {
            view.tampilkanPesan("Jumlah pembelian melebihi batas stok! (Stok tersedia: " + buah.getStok() + ")");
            return;
        }

        // Perhitungan akurat dengan BigDecimal
        BigDecimal subtotal = buah.getHarga().multiply(BigDecimal.valueOf(jumlah));

        // Header Transaksi
        int userId = (currentUser != null && currentUser.getIdUser() > 0) ? currentUser.getIdUser() : 1;
        Transaksi transaksi = new Transaksi();
        transaksi.setIdUser(userId);
        transaksi.setTanggal(new Date());
        transaksi.setTotal(subtotal);

        // Detail Transaksi
        DetailTransaksi detail = new DetailTransaksi();
        detail.setIdBuah(buah.getIdBuah());
        detail.setBuah(buah);
        detail.setJumlah(jumlah);
        detail.setHarga(buah.getHarga());
        detail.setSubtotal(subtotal);

        List<DetailTransaksi> listDetail = new ArrayList<>();
        listDetail.add(detail);

        // Eksekusi atomik via Spring Hibernate
        boolean sukses = transaksiDao.simpanTransaksi(transaksi, listDetail);

        if (sukses) {
            // Update stok buah lokal & tampilan
            buah.setStok(buah.getStok() - jumlah);
            view.setStokBuah(String.valueOf(buah.getStok()));

            // Masukkan ke riwayat JTable
            DefaultTableModel model = (DefaultTableModel) view.getTblTransaksi().getModel();
            model.addRow(new Object[]{
                buah.getNama(),
                jumlah,
                "Rp" + subtotal
            });

            view.tampilkanPesan("Pembelian berhasil dan tersimpan ke MySQL via Spring Hibernate!\nTotal: Rp" + subtotal);
            view.setJumlahBeli("");
        } else {
            view.tampilkanPesan("Transaksi pembelian gagal disimpan ke database!");
        }
    }
}
