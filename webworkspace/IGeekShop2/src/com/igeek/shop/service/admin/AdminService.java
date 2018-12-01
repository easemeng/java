package com.igeek.shop.service.admin;

import java.util.List;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.Category;

public class AdminService {

	private BaseDao dao = new BaseDao();
	
	public List<Category> getCategorys() {
		
		String sql = "select * from category";
		Object[] params = {};
		List<Category> CategoryList = (List<Category>) dao.getList(sql, params, new Category());
		return CategoryList;

	}

	public void addCategory(Category category) {
		
		String sql = "insert into category value(?,?)";
		Object[] params = {category.getCid(),category.getCname()};
		dao.update(sql, params);
		
	}

	public void updateCategory(String cname,String cid) {
		
		String sql = "update category set cname=? where cid=?";
		Object[] params = {cname,cid};
		dao.update(sql, params);
		
	}

	public Category updateOne(String cid) {
		
		String sql = "select * from category where cid=?";
		Object [] params = {cid};
		Object userByOne = dao.getUserByOne(sql, params, new Category());
		Category category = (Category) userByOne;
		return category;
		
	}

	public void deleteCategory(String cid) {
		
		String sql = "delete from category where cid=?";
		Object [] params = {cid};
		dao.update(sql, params);
		
	}
	
	

}
