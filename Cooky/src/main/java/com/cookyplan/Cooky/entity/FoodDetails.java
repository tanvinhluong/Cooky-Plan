package com.cookyplan.Cooky.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fooddetails")

public class FoodDetails {

	Integer Id_Food;
	Integer Id_Ingredients;
	String Name;
	Integer Quantity;
	String unitPrice;
	
	@ManyToOne
	@JoinColumn(name="Id")
	Ingredients ingredients;
	
	@ManyToOne
	@JoinColumn(name="Id")
	Foods foods;

	public Integer getId_Food() {
		return Id_Food;
	}

	public void setId_Food(Integer id_Food) {
		Id_Food = id_Food;
	}

	public Integer getId_Ingredients() {
		return Id_Ingredients;
	}

	public void setId_Ingredients(Integer id_Ingredients) {
		Id_Ingredients = id_Ingredients;
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
