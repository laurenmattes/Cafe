package com.cafecalledencapsulation.cafe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cafecalledencapsulation.cafe.Users;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Users findById(Integer id) {
		// The last parameters of .query let us specify values for the (?) parameters in
		// our SQL statement.
		// While .query returns a list, .queryForObject assumes only one result.
		Users match = jdbcTemplate.queryForObject("SELECT * FROM Room WHERE id = ?",
				new BeanPropertyRowMapper<>(Users.class), id);
		// If nothing matched, match will be null.
		return match;
	}

	public void update(Users user) {
		String sql = "UPDATE Users SET firstName = ?, lastName = ?, socialSecurity = ?, shoeSize = ? WHERE id = ?";
		// Use .update for SQL INSERT, UPDATE, and DELETE
		// All the parameters after the first specify values to fill in the ?s in the
		// SQL.
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getSocialSecurity(), user.getShoeSize(),
				user.getId());
	}

	public void create(Users user) {
		String sql = "INSERT INTO Users (firstName, lastName, socialSecurity, shoeSize) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getFirstName(), user.getLastName(), user.getSocialSecurity(), user.getShoeSize());
	}

}
