package dao;

import config.AppContext;
import model.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import java.util.List;

public class UserDao {

    private HibernateTemplate hibernateTemplate;

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
}
