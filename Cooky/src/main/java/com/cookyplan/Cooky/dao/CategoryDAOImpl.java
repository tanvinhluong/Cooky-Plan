package com.cookyplan.Cooky.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cookyplan.Cooky.entity.Category;


@Transactional
@Repository
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory factory;

	@Override
	public Category findById(Integer ID_CATEGORY) {
		Session session = factory.getCurrentSession();
		Category entity = session.find(Category.class, ID_CATEGORY);
		return entity;

	}

	@Override
	public List<Category> findAll() {
		String hql = "FROM Category";
		Session session = factory.getCurrentSession();
		TypedQuery<Category> query = session.createQuery(hql, Category.class);
		List<Category> list = query.getResultList();
		return list;
	}

	@Override
	public Category create(Category entity) {
		Session session = factory.getCurrentSession();
		session.save(entity);
		return entity;
	}

	@Override
	public void update(Category entity) {
		Session session = factory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public Category delete(Integer ID_CATEGORY) {
		Session session = factory.getCurrentSession();
		Category entity = session.find(Category.class, ID_CATEGORY);
		session.delete(entity);
		return entity;
	}

	@Override
	public List<Category> getRandoms() {
		// TODO Auto-generated method stub
		return null;
	}

}
