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

	public void create(Item aItem) {
		em.persist(aItem);
	}

	public Item findById(Long id) {
		return em.find(Item.class, id);
	}

	public void update(Item aItem) {
		em.merge(aItem);
	}

	public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		Item aItem = em.getReference(Item.class, id);
		em.remove(aItem);
	}

}
