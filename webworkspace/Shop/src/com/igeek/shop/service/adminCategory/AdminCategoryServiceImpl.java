package com.igeek.shop.service.adminCategory;

import java.util.List;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.Category;

public class AdminCategoryServiceImpl implements AdminCategoryService {

	private BaseDao dao = new BaseDao();
	
	@Override
	public List<Category> getCategoryList() {
		
		String sql = "select * from category";
		Object[] params = {};
		List<Category> categoryList = (List<Category>) dao.getList(sql, params, new Category());
		return categoryList;
	}

	@Override
	public void addCategory(Category category) {
		
		String sql = "insert into category value(?,?)";
		Object[] params = {category.getCid(),category.getCname()};
		dao.update(sql, params);
		
	}

	@Override
	public void delete(String cid) {
		
		String sql = "delete";
		Object[] params = {cid};
		dao.update(sql, params);
		
	}

}
