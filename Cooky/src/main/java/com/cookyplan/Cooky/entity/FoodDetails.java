package com.cookyplan.Cooky.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fooddetails")

public class FoodDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer Id;
	//Integer ID_INGREDIENTS;
	//Integer ID_FOODS;
	String Name;
	Integer Quantity;
	String unitPrice;
	
	@ManyToOne
	@JoinColumn(name="ID_INGREDIENTS")
	Ingredients ingredients;
	
	@ManyToOne
	@JoinColumn(name="ID_FOOD")
	Foods foods;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Ingredients getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}

	public Foods getFoods() {
		return foods;
	}

	public void setFoods(Foods foods) {
		this.foods = foods;
	}

	

	
	
	
}
