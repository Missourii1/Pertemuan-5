package controller;

import config.AppContext;
import dao.TransaksiDao;
import model.Buah;
import model.DetailTransaksi;
import model.Transaksi;
import model.User;
import view.PembelianView;
import javax.swing.table.DefaultTableModel;
import view.LoginView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PembelianController {

    private Buah buah;
    private PembelianView view;
    private User currentUser;
    private TransaksiDao transaksiDao;

    public PembelianController(Buah buah, PembelianView view, User currentUser) {
        this.buah = buah;
        this.view = view;
        this.currentUser = currentUser;
        // Mengambil TransaksiDao yang dikelola oleh Spring ApplicationContext
        this.transaksiDao = AppContext.getBean(TransaksiDao.class);

        // Menampilkan informasi buah dengan format string yang bersih
        view.setNamaBuah(buah.getNama());
        view.setHargaBuah("Rp" + buah.getHarga());
        view.setStokBuah(String.valueOf(buah.getStok()));

        // Menghubungkan tombol BELI dan LOGOUT dengan Controller
        view.getBtnBeli().addActionListener(e -> prosesPembelian());
        view.getBtnLogout().addActionListener(e -> prosesLogout());
    }

    // Konstruktor lama untuk backward-compatibility
    public PembelianController(Buah buah, PembelianView view) {
        this(buah, view, null);
    }

    private void prosesLogout() {
        int pilihan = javax.swing.JOptionPane.showConfirmDialog(
            view,
            "Apakah kamu yakin ingin logout?",
            "Konfirmasi Logout",
            javax.swing.JOptionPane.YES_NO_OPTION
        );

        if (pilihan == javax.swing.JOptionPane.YES_OPTION) {
            LoginView login = new LoginView();
            new LoginController(login);
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            view.dispose();
        }
    }

    private void prosesPembelian() {
        int jumlah;

        try {
            jumlah = Integer.parseInt(view.getJumlahBeli());
        } catch (NumberFormatException e) {
            view.tampilkanPesan("Masukkan jumlah pembelian yang valid!");
            return;
        }

        if (jumlah <= 0) {
            view.tampilkanPesan("Jumlah pembelian harus di atas 0!");
            return;
        }

        if (jumlah > buah.getStok()) {
            view.tampilkanPesan("Jumlah pembelian melebihi batas stok!");
            return;
        }

        // Hitung total dengan BigDecimal
        BigDecimal subtotal = buah.getHarga().multiply(BigDecimal.valueOf(jumlah));

        // Buat objek Transaksi Header
        int userId = (currentUser != null && currentUser.getIdUser() > 0) ? currentUser.getIdUser() : 1;
        Transaksi transaksi = new Transaksi();
        transaksi.setIdUser(userId);
        transaksi.setTanggal(new Date());
        transaksi.setTotal(subtotal);

        // Buat rincian Detail Transaksi
        DetailTransaksi detail = new DetailTransaksi();
        detail.setIdBuah(buah.getIdBuah());
        detail.setBuah(buah);
        detail.setJumlah(jumlah);
        detail.setHarga(buah.getHarga());
        detail.setSubtotal(subtotal);

        List<DetailTransaksi> listDetail = new ArrayList<>();
        listDetail.add(detail);

        // Eksekusi penyimpanan ke MySQL dalam transaksi Spring + Hibernate (ACID commit/rollback)
        boolean sukses = transaksiDao.simpanTransaksi(transaksi, listDetail);

        if (sukses) {
            // Mengurangi stok buah di model in-memory
            buah.setStok(buah.getStok() - jumlah);

            // Memperbarui informasi stok di View
            view.setStokBuah(String.valueOf(buah.getStok()));

            // Memasukkan transaksi ke JTable
            DefaultTableModel model = (DefaultTableModel) view.getTblTransaksi().getModel();
            model.addRow(new Object[]{
                buah.getNama(),
                jumlah,
                "Rp" + subtotal
            });

            view.tampilkanPesan("Pembelian berhasil dan tersimpan ke MySQL via Spring Hibernate!\nTotal harga: Rp" + subtotal);
            view.setJumlahBeli("");
        } else {
            view.tampilkanPesan("Transaksi pembelian gagal disimpan ke database!");
        }
    }
}
