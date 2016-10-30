package com.bogdan.assign2.repository;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bogdan.assign2.util.HibernateUtil;

public class BaseRepository implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 4242960948584399415L;

	public <T> T save(final T o) {
		Session sessionFactory = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = null;
		try {

			transaction = sessionFactory.beginTransaction();
			T t = (T) sessionFactory.save(o);
			transaction.commit();
			return t;
		} catch (HibernateException e) {
			e.printStackTrace();

		} finally {
			sessionFactory.flush();
			sessionFactory.close();
		}
		return o;

	}

	public void delete(final Object object) {
		Session sessionFactory = HibernateUtil.getSessionFactory().openSession();

		Transaction transaction = null;

		try {
			transaction = sessionFactory.beginTransaction();
			sessionFactory.delete(object);
			transaction.commit();
			System.out.println("DELETED");

		} catch (HibernateException e) {

			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}

	}

	/***/
	public <T> T get(final Class<T> type, final Long id) {
		Session sessionFactory = HibernateUtil.getSessionFactory().openSession();

		return (T) sessionFactory.get(type, id);
	}

	/***/
	public <T> T merge(final T o) {
		Session sessionFactory = HibernateUtil.getSessionFactory().openSession();

		return (T) sessionFactory.merge(o);
	}

	/***/
	public <T> void saveOrUpdate(final T o) {
		Session sessionFactory = HibernateUtil.getSessionFactory().openSession();

		sessionFactory.saveOrUpdate(o);
	}

	public <T> List<T> getAll(final Class<T> type) {
		Session sessionFactory = HibernateUtil.getSessionFactory().openSession();

		final Criteria crit = sessionFactory.createCriteria(type);
		return crit.list();
	}
}
