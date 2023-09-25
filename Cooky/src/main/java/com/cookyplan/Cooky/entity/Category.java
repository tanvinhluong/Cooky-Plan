package com.cookyplan.Cooky.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer ID_CATEGORY;
	String NAME;
	
	@OneToMany(mappedBy="category")
	Collection<CategoryDetails> categoryDetails;
	
	public Collection<CategoryDetails> getCategoryDetails() {
		return categoryDetails;
	}
	public void setCategoryDetails(Collection<CategoryDetails> categoryDetails) {
		this.categoryDetails = categoryDetails;
	}
	public Integer getID_CATEGORY() {
		return ID_CATEGORY;
	}
	public void setID_CATEGORY(Integer iD_CATEGORY) {
		this.ID_CATEGORY = 	iD_CATEGORY;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		this.NAME = nAME;
	}

}
