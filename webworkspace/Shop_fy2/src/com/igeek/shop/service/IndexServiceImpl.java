package com.igeek.shop.service;

import java.util.List;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.Category;
import com.igeek.shop.entity.PageBean;
import com.igeek.shop.entity.Product;

public class IndexServiceImpl implements IndexService {

	private BaseDao dao = new BaseDao();
	
	@Override
	public PageBean getPageBean(int currentPageNumber) {
		
		String sql = "select count(*) from product";
		Object[] params = {};
		long i = dao.getTotalDataNumber(sql, params);
		int totalDataNumber = (int) i;	// 拿到总数据数
		PageBean pageBean = new PageBean(currentPageNumber,6,totalDataNumber);
		// List data
		String sql2 = "select * from product limit ?,?";
		Object[] params2 = {pageBean.getStartIndex(),pageBean.getPageSize()};
		List<Product> productList = (List<Product>) dao.getList(sql2, params, new Product());
		pageBean.setData(productList);
		return pageBean;
	}

	@Override
	public List<Category> getCategoryList() {
		
		String sql = "select * from category";
		Object[] params = {};
		List<Category> categoryList = (List<Category>) dao.getList(sql, params, new Category());
		return categoryList;
	}

	@Override
	public long getProductNumberByCid(String cid) {
		
		String sql = "select count(*) from product where cid=?";
		Object[] params = {cid};
		long totalDataNumber = dao.getTotalDataNumber(sql, params);
		return totalDataNumber;
	}

	@Override
	public PageBean getPageBeanByCategory(int currentPageNumber, int pageSize, long totalDataNumber, String cid) {
		
		PageBean pageBean = new PageBean(currentPageNumber,pageSize,(int)totalDataNumber);
		// 根据cid来查询前台需要展示的数据
		String sql = "select * from product where cid=? limit ?,?";
		Object[] params = {cid,pageBean.getStartIndex(),pageBean.getPageSize()};
		List<Product> productList = (List<Product>) dao.getList(sql, params, new Product());
		pageBean.setData(productList);
		// 需要再把cid也一并传到前台
		pageBean.setCid(cid);
		return pageBean;
		
	}

}
