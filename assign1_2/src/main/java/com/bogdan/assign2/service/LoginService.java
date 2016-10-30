package com.bogdan.assign2.service;

import javax.persistence.PersistenceException;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bogdan.assign2.model.User;
import com.bogdan.assign2.repository.BaseRepository;
import com.bogdan.assign2.util.HibernateUtil;

public class LoginService {

	private BaseRepository baseRepository;

	public LoginService() {
		this.baseRepository = new BaseRepository();
	}

	public User getUserByUsername(String username) {
		Session sessionFactory = HibernateUtil.getSessionFactory().openSession();
		try {
			Query cq = sessionFactory.getNamedQuery(User.FIND_USER_BY_USERNAME);
			cq.setParameter(User.PARAM_USERNAME, username);
			return (User) cq.uniqueResult();
		} catch (PersistenceException e) {
			e.printStackTrace();
			System.out.println("crapat find by username");
		}
		return null;
	}

	public User login(User user) {
		User userDB = getUserByUsername(user.getUsername());

		if ((userDB != null) && userDB.getPassword().equals(user.getPassword())) {
			return userDB;
		} else {
			return null;
		}
	}

	// public User registerUser(User user) {
	// baseRepository.saveOrUpdate(user);
	// return user;
	// }
}
