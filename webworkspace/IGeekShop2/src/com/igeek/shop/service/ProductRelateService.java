package com.igeek.shop.service;

import java.util.List;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.Product;

public class ProductRelateService {
	
	private BaseDao dao = new BaseDao();
	
	public List<Product> findHotProductList(){
		
		String sql = "select * from product where is_hot = ? limit ?,?";
		Object[] params = {1,0,9};
		List<Product> hotProductList = (List<Product>) dao.getList(sql, params, new Product());
		return hotProductList;
		
	}
	
	public List<Product> findNewProductList(){
		
		String sql = "select * from product order by pdate desc limit ?,?";
		Object[] params = {0,9};
		List<Product> newProductList = (List<Product>) dao.getList(sql, params, new Product());
		return newProductList;
		
	}
	
	public List<Category> findCategoryList(){
		
		String sql = "select * from category";
		Object[] params = {};
		List<Category> categoryList = (List<Category>) dao.getList(sql, params, new Category());
		return categoryList;
		
	}

}
