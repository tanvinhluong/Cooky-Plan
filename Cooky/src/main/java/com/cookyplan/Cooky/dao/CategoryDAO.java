package com.cookyplan.Cooky.dao;

import java.util.List;

import com.cookyplan.Cooky.entity.Category;

public interface CategoryDAO {
	Category findById(Integer ID_CATEGORY);
	List<Category> findAll();
	Category create(Category entity);
	void update(Category entity);
	Category delete(Integer ID_CATEGORY);
	List<Category> getRandoms();
}
