package com.cookyplan.Cooky.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="categorydetails")
public class CategoryDetails {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer Id;
//	Integer ID_CATEGORY;
//	Integer ID_FOOD;
	
	@ManyToOne
	@JoinColumn(name="ID_CATEGORY")
	Category category;
	
	@ManyToOne
	@JoinColumn(name="ID_FOOD")
	Foods foods;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Foods getFoods() {
		return foods;
	}

	public void setFoods(Foods foods) {
		this.foods = foods;
	}

  

	
	
	
	
}
