package dao;

import config.AppContext;
import model.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import java.util.List;

public class UserDao {

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
     * Memvalidasi login user berdasarkan username dan password via Hibernate HQL.
     */
    public User login(String username, String password) {
        try {
            String hql = "FROM User WHERE username = ?0 AND password = ?1";
            List<User> list = (List<User>) getHibernateTemplate().find(hql, username, password);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
        } catch (Exception e) {
            System.err.println("Error UserDao.login via Hibernate: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Mencari user berdasarkan username via Hibernate HQL.
     */
    public User findByUsername(String username) {
        try {
            String hql = "FROM User WHERE username = ?0";
            List<User> list = (List<User>) getHibernateTemplate().find(hql, username);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
        } catch (Exception e) {
            System.err.println("Error UserDao.findByUsername via Hibernate: " + e.getMessage());
        }
        return null;
    }

    /**
     * Mendaftarkan pengguna baru ke database MySQL menggunakan Spring + Hibernate.
     */
    public boolean register(User user) {
        PlatformTransactionManager txManager = getTransactionManager();
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setName("registerUserTx");
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus status = txManager.getTransaction(def);
        try {
            // Cek apakah username sudah dipakai
            User existing = findByUsername(user.getUsername());
            if (existing != null) {
                txManager.rollback(status);
                return false;
            }

            getHibernateTemplate().save(user);
            txManager.commit(status);
            return true;
        } catch (Exception e) {
            txManager.rollback(status);
            System.err.println("Error UserDao.register via Hibernate: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}
