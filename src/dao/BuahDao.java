package dao;

import config.AppContext;
import model.Buah;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import java.util.ArrayList;
import java.util.List;

public class BuahDao {

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
     * Mengambil seluruh data buah dari database menggunakan Hibernate HQL.
     */
    public List<Buah> getAllBuah() {
        try {
            List<Buah> list = (List<Buah>) getHibernateTemplate().find("FROM Buah ORDER BY idBuah ASC");
            return list != null ? list : new ArrayList<>();
        } catch (Exception e) {
            System.err.println("Error BuahDao.getAllBuah via Hibernate: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    /**
     * Mencari buah berdasarkan ID menggunakan HibernateTemplate.get().
     */
    public Buah getBuahById(int idBuah) {
        try {
            return getHibernateTemplate().get(Buah.class, idBuah);
        } catch (Exception e) {
            System.err.println("Error BuahDao.getBuahById via Hibernate: " + e.getMessage());
            return null;
        }
    }

    /**
     * Menambahkan data buah baru ke database dalam transaksi Spring + Hibernate.
     */
    public boolean insertBuah(Buah buah) {
        PlatformTransactionManager txManager = getTransactionManager();
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setName("insertBuahTx");
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus status = txManager.getTransaction(def);
        try {
            getHibernateTemplate().save(buah);
            txManager.commit(status);
            return true;
        } catch (Exception e) {
            txManager.rollback(status);
            System.err.println("Error BuahDao.insertBuah via Hibernate: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Memperbarui data buah di database dalam transaksi Spring + Hibernate.
     */
    public boolean updateBuah(Buah buah) {
        PlatformTransactionManager txManager = getTransactionManager();
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setName("updateBuahTx");
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus status = txManager.getTransaction(def);
        try {
            getHibernateTemplate().update(buah);
            txManager.commit(status);
            return true;
        } catch (Exception e) {
            txManager.rollback(status);
            System.err.println("Error BuahDao.updateBuah via Hibernate: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Menghapus data buah berdasarkan ID dalam transaksi Spring + Hibernate.
     */
    public boolean deleteBuah(int idBuah) {
        PlatformTransactionManager txManager = getTransactionManager();
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setName("deleteBuahTx");
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus status = txManager.getTransaction(def);
        try {
            Buah buah = getBuahById(idBuah);
            if (buah != null) {
                getHibernateTemplate().delete(buah);
                txManager.commit(status);
                return true;
            }
            txManager.rollback(status);
            return false;
        } catch (Exception e) {
            txManager.rollback(status);
            System.err.println("Error BuahDao.deleteBuah via Hibernate: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
