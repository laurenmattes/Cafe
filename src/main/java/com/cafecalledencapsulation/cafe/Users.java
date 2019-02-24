package com.cafecalledencapsulation.cafe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "socialsecurity")
	private String socialSecurity;
	@Column(name = "shoesize")
	public int shoeSize;

	public Users() {

	}

	public Users(String firstName, String lastName, String socialSecurity, Integer shoeSize) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurity = socialSecurity;
		this.shoeSize = shoeSize;
	}

	public Users(Long id, String firstName, String lastName, String socialSecurity, Integer shoeSize) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurity = socialSecurity;
		this.shoeSize = shoeSize;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

}
