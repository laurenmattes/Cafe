package com.cafecalledencapsulation.cafe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String name;

	private String description;

	private Integer quantity;

	private Double price;;

	public Item() {

	}

//	public Item(String name, String description, Integer quantity, Double price) {
//		super();
//
//		this.name = name;
//		this.description = description;
//		this.quantity = quantity;
//		this.price = price;
//	}

	public Item(Long id, String name, String description, Integer quantity, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", description=" + description + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

}
