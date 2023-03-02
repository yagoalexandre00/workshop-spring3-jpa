package com.yagoinc.course.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {

	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imgUrl;

	private Set<Category> categories = new HashSet<>();

	public Product() {
	}

	public Product(Long id, String name, String description, Double price, String imgUrl, Set<Category> categories) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
		this.categories = categories;
	}

}
