package com.cafecalledencapsulation.cafe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cafecalledencapsulation.cafe.Users;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void create(Users user) {
		String sql = "INSERT INTO User (firstName, lastName, socialSecurity, shoeSize) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getSocialSecurity(), user.getShoeSize());
	}

}
