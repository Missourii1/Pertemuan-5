package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppContext {

    private static ApplicationContext context;

    private AppContext() {
    }

    public static synchronized ApplicationContext getInstance() {
        if (context == null) {
            try {
                context = new ClassPathXmlApplicationContext("applicationContext.xml");
                System.out.println("Spring ApplicationContext berhasil diinisialisasi!");
            } catch (Exception e) {
                System.err.println("Gagal menginisialisasi Spring ApplicationContext: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return context;
    }

    public static <T> T getBean(Class<T> requiredType) {
        return getInstance().getBean(requiredType);
    }

    public static Object getBean(String name) {
        return getInstance().getBean(name);
    }
}

