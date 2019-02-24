package com.cafecalledencapsulation.cafe.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cafecalledencapsulation.cafe.Users;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	private EntityManager em;

	public void create(Users aUser) {
		em.persist(aUser);
	}

}
