package com.cafecalledencapsulation.cafe;

import java.util.List;

public class Item {
	private String name;
	private String description;
	private Integer quantity;
	private Double price;;

	public Item() {

	}

	public Item(String name, String description, Integer quantity, Double price) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
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

	public static List<Item> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
