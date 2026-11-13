package dao;

import config.AppContext;
import model.Buah;
import model.DetailTransaksi;
import model.Transaksi;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import java.util.List;

public class TransaksiDao {

    private HibernateTemplate hibernateTemplate;
    private PlatformTransactionManager transactionManager;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        if (this.hibernateTemplate == null) {
            try {
                this.hibernateTemplate = AppContext.getBean(HibernateTemplate.class);
            } catch (Exception e) {
                System.err.println("Gagal mendapatkan HibernateTemplate dari Spring: " + e.getMessage());
            }
        }
        return this.hibernateTemplate;
    }

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public PlatformTransactionManager getTransactionManager() {
        if (this.transactionManager == null) {
            try {
                this.transactionManager = AppContext.getBean(PlatformTransactionManager.class);
            } catch (Exception e) {
                System.err.println("Gagal mendapatkan TransactionManager dari Spring: " + e.getMessage());
            }
        }
        return this.transactionManager;
    }

    /**
     * Menyimpan data transaksi lengkap beserta detailnya dan memotong stok
     * dalam satu transaksi database menggunakan Spring Transaction Manager + Hibernate.
     */
    public boolean simpanTransaksi(Transaksi transaksi, List<DetailTransaksi> listDetail) {
        PlatformTransactionManager txManager = getTransactionManager();
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setName("simpanTransaksiTx");
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus status = txManager.getTransaction(def);
        try {
            // 1. Simpan header transaksi
            getHibernateTemplate().save(transaksi);

            // 2. Simpan setiap detail dan kurangi stok buah
            for (DetailTransaksi dt : listDetail) {
                dt.setTransaksi(transaksi);

                Buah buah = dt.getBuah();
                if (buah == null) {
                    buah = getHibernateTemplate().get(Buah.class, dt.getIdBuah());
                }

                if (buah == null || buah.getStok() < dt.getJumlah()) {
                    // Stok tidak cukup, batalkan seluruh transaksi
                    txManager.rollback(status);
                    return false;
                }

                // Kurangi stok buah
                buah.setStok(buah.getStok() - dt.getJumlah());
                getHibernateTemplate().update(buah);

                // Simpan detail transaksi
                dt.setBuah(buah);
                getHibernateTemplate().save(dt);
            }

            // Commit jika semua sukses
            txManager.commit(status);
            return true;

        } catch (Exception e) {
            System.err.println("Error TransaksiDao.simpanTransaksi via Spring Hibernate: " + e.getMessage());
            e.printStackTrace();
            try {
                txManager.rollback(status);
            } catch (Exception ex) {
                System.err.println("Gagal rollback transaksi: " + ex.getMessage());
            }
            return false;
        }
    }
}
