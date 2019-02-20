package com.cafecalledencapsulation.cafe.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cafecalledencapsulation.cafe.Item;

@Repository
public class ItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Item> findAll() {
		return jdbcTemplate.query("SELECT * FROM items", new BeanPropertyRowMapper<>(Item.class));

	}

}
