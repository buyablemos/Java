package org.backend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class Database {
    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static void saveRate(String currencyCode, double rate) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            CurrencyData currencyData = new CurrencyData(currencyCode, rate, new java.util.Date());
            session.save(currencyData);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public static List<CurrencyData> getRates(String currencyCode) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from CurrencyData where currencyCode = :currencyCode", CurrencyData.class)
                    .setParameter("currencyCode", currencyCode)
                    .list();
        }
    }

    public static CurrencyData getLast(String currencyCode) {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from CurrencyData where currencyCode = :currencyCode order by id desc", CurrencyData.class)
                    .setParameter("currencyCode", currencyCode)
                    .setMaxResults(1)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean addUser(String username, String password) {
        try (Session session = sessionFactory.openSession()) {
            User existingUser = session.createQuery("FROM User WHERE username = :username", User.class).setParameter("username", username).uniqueResult();


            if (existingUser != null) {
                return false;
            }
            session.beginTransaction();
            String passwordhashed=HashPassword.hash(password);
            User user = new User(username,passwordhashed);
            session.save(user);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean authenticateUser(String username, String password) {
        try (Session session = sessionFactory.openSession()) {
            String hashedPassword = HashPassword.hash(password);
            return session.createQuery("FROM User WHERE username = :username AND passwordHash = :passwordHash")
                    .setParameter("username", username).setParameter("passwordHash", hashedPassword)
                    .uniqueResult()!=null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
