package com.cafecalledencapsulation.cafe.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cafecalledencapsulation.cafe.Users;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	private EntityManager em;

	public Users findById(Long id) {
		return em.find(Users.class, id);
	}

	public void create(Users aUser) {
		em.merge(aUser);
	}

	public void update(Users aUser) {
		em.merge(aUser);
	}

	public Users findByUsername(String username) {
		try {
			return em.createQuery("FROM Users WHERE username = :username", Users.class)
					.setParameter("username", username).getSingleResult();
		} catch (NoResultException ex) {
			// No user with that username found.
			return null;
		}

	}
}
