package controller;

import config.AppContext;
import dao.BuahDao;
import model.Buah;
import model.User;
import view.BuahView;
import view.DashboardView;
import view.LoginView;
import view.PembelianView;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuahController {

    private BuahView view;
    private User currentUser;
    private BuahDao buahDao;
    private Integer selectedIdBuah = null;

    public BuahController(BuahView view, User currentUser) {
        this.view = view;
        this.currentUser = currentUser;
        // Mengambil bean BuahDao yang dikelola oleh Spring ApplicationContext
        this.buahDao = AppContext.getBean(BuahDao.class);

        initListeners();
        loadDataBuah();
    }

    public BuahController(BuahView view) {
        this(view, null);
    }

    public void loadDataBuah() {
        try {
            List<Buah> list = buahDao.getAllBuah();
            DefaultTableModel model = new DefaultTableModel(
                new Object[]{"ID", "Nama Buah", "Harga", "Stok"}, 0
            ) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            for (Buah b : list) {
                model.addRow(new Object[]{
                    b.getIdBuah(),
                    b.getNama(),
                    "Rp" + b.getHarga(),
                    b.getStok()
                });
            }

            view.getTblBuah().setModel(model);
        } catch (Exception e) {
            view.tampilkanPesan("Gagal memuat data buah: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void initListeners() {
        // Navigasi Sidebar
        view.getBtnNavDashboard().addActionListener(e -> {
            DashboardView dashboard = new DashboardView();
            new DashboardController(dashboard, currentUser);
            dashboard.setLocationRelativeTo(null);
            dashboard.setVisible(true);
            view.dispose();
        });

        view.getBtnNavPembelian().addActionListener(e -> {
            Buah buah = null;
            try {
                List<Buah> list = buahDao.getAllBuah();
                if (list != null && !list.isEmpty()) {
                    buah = list.get(0);
                }
            } catch (Exception ex) {
            }
            if (buah == null) {
                buah = new Buah(1, "Apel", 15000, 20);
            }
            PembelianView pembelianView = new PembelianView();
            new PembelianController(buah, pembelianView, currentUser);
            pembelianView.setLocationRelativeTo(null);
            pembelianView.setVisible(true);
            view.dispose();
        });

        view.getBtnNavLogout().addActionListener(e -> prosesLogout());

        // Operasi CRUD nyata via Spring Hibernate DAO
        view.getBtnTambah().addActionListener(e -> prosesTambah());
        view.getBtnEdit().addActionListener(e -> prosesEdit());
        view.getBtnHapus().addActionListener(e -> prosesHapus());
        view.getBtnRefresh().addActionListener(e -> {
            loadDataBuah();
            resetForm();
        });
        view.getBtnBatal().addActionListener(e -> resetForm());

        // Event seleksi JTable
        view.getTblBuah().getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int row = view.getTblBuah().getSelectedRow();
                if (row != -1) {
                    selectedIdBuah = Integer.parseInt(view.getTblBuah().getValueAt(row, 0).toString());
                    view.getTxtNamaBuah().setText(view.getTblBuah().getValueAt(row, 1).toString());
                    String hargaStr = view.getTblBuah().getValueAt(row, 2).toString()
                            .replace("Rp", "").replace(".", "").replace(",", "").trim();
                    view.getTxtHarga().setText(hargaStr);
                    view.getTxtStok().setText(view.getTblBuah().getValueAt(row, 3).toString());
                }
            }
        });
    }

    private void prosesTambah() {
        String nama = view.getTxtNamaBuah().getText().trim();
        String hargaStr = view.getTxtHarga().getText().trim();
        String stokStr = view.getTxtStok().getText().trim();

        if (nama.isEmpty() || hargaStr.isEmpty() || stokStr.isEmpty()) {
            view.tampilkanPesan("Semua kolom input wajib diisi!");
            return;
        }

        try {
            BigDecimal harga = new BigDecimal(hargaStr);
            int stok = Integer.parseInt(stokStr);

            if (harga.compareTo(BigDecimal.ZERO) <= 0 || stok < 0) {
                view.tampilkanPesan("Harga harus lebih dari 0 dan stok tidak boleh negatif!");
                return;
            }

            Buah buah = new Buah(nama, harga, stok);
            boolean sukses = buahDao.insertBuah(buah);

            if (sukses) {
                view.tampilkanPesan("Data buah '" + nama + "' berhasil ditambahkan via Hibernate!");
                loadDataBuah();
                resetForm();
            } else {
                view.tampilkanPesan("Gagal menyimpan data buah ke database!");
            }
        } catch (NumberFormatException ex) {
            view.tampilkanPesan("Format harga atau stok tidak valid!");
        }
    }

    private void prosesEdit() {
        if (selectedIdBuah == null) {
            view.tampilkanPesan("Pilih baris buah pada tabel yang ingin diubah terlebih dahulu!");
            return;
        }

        String nama = view.getTxtNamaBuah().getText().trim();
        String hargaStr = view.getTxtHarga().getText().trim();
        String stokStr = view.getTxtStok().getText().trim();

        if (nama.isEmpty() || hargaStr.isEmpty() || stokStr.isEmpty()) {
            view.tampilkanPesan("Semua kolom input wajib diisi!");
            return;
        }

        try {
            BigDecimal harga = new BigDecimal(hargaStr);
            int stok = Integer.parseInt(stokStr);

            if (harga.compareTo(BigDecimal.ZERO) <= 0 || stok < 0) {
                view.tampilkanPesan("Harga harus lebih dari 0 dan stok tidak boleh negatif!");
                return;
            }

            Buah buah = new Buah(selectedIdBuah, nama, harga, stok);
            boolean sukses = buahDao.updateBuah(buah);

            if (sukses) {
                view.tampilkanPesan("Data buah berhasil diperbarui via Hibernate!");
                loadDataBuah();
                resetForm();
            } else {
                view.tampilkanPesan("Gagal memperbarui data buah ke database!");
            }
        } catch (NumberFormatException ex) {
            view.tampilkanPesan("Format harga atau stok tidak valid!");
        }
    }

    private void prosesHapus() {
        if (selectedIdBuah == null) {
            view.tampilkanPesan("Pilih baris buah pada tabel yang ingin dihapus terlebih dahulu!");
            return;
        }

        int konfirmasi = JOptionPane.showConfirmDialog(
            view,
            "Apakah Anda yakin ingin menghapus buah ini?",
            "Konfirmasi Hapus",
            JOptionPane.YES_NO_OPTION
        );

        if (konfirmasi == JOptionPane.YES_OPTION) {
            boolean sukses = buahDao.deleteBuah(selectedIdBuah);
            if (sukses) {
                view.tampilkanPesan("Data buah berhasil dihapus via Hibernate!");
                loadDataBuah();
                resetForm();
            } else {
                view.tampilkanPesan("Gagal menghapus data buah dari database!");
            }
        }
    }

    private void resetForm() {
        selectedIdBuah = null;
        view.getTxtNamaBuah().setText("");
        view.getTxtHarga().setText("");
        view.getTxtStok().setText("");
        view.getTblBuah().clearSelection();
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
