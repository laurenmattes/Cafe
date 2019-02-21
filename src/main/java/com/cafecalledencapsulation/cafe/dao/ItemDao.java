package com.cafecalledencapsulation.cafe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cafecalledencapsulation.cafe.Item;

@Repository
@Transactional
public class ItemDao {

	@PersistenceContext
	private EntityManager em;

	public List<Item> findAll() {
		return em.createQuery("FROM Item", Item.class).getResultList();

	}

	public void create(Item item) {
		em.persist(item);
	}

}
