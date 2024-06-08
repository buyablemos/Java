package org.backend;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

}
