package com.cookyplan.Cooky.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cookyplan.Cooky.entity.Foods;

@Entity
@Table(name="categorydetails")
public class CategoryDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer ID_CATEGORY;
	@ManyToOne
	@JoinColumn(name="ID_CATEGORY")
	Category category;
	@ManyToOne
	@JoinColumn(name="Id")
	Foods food;
	public Integer getID_CATEGORY() {
		return ID_CATEGORY;
	}

	public void setID_CATEGORY(Integer iD_CATEGORY) {
		ID_CATEGORY = iD_CATEGORY;
	}

	public Integer getID_FOOD() {
		return ID_FOOD;
	}

	public void setID_FOOD(Integer iD_FOOD) {
		ID_FOOD = iD_FOOD;
	}

	Integer ID_FOOD;
}
