package com.igeek.shop.service;

import java.util.List;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.PageBean;
import com.igeek.shop.entity.Product;

public class IndexServiceImpl implements IndexService {

	private BaseDao<Product> dao = new BaseDao<Product>();
	
	@Override
	public PageBean getPageBean(int currentPageNumber) {
		
		String sql = "select count(*) from product";
		Object[] params = {};
		long i = dao.getTotalDataNumber(sql, params);
		int totalDataNumber = (int) i;	// 拿到总数据数
		PageBean pageBean = new PageBean(currentPageNumber, 6, totalDataNumber);
		// List data
		String sql2 = "select * from product limit ?,?";
		Object[] params2 = {pageBean.getStartIndex(),pageBean.getPageSize()};
		List<Product> productList = (List<Product>) dao.getList(sql2, params2, new Product());
		pageBean.setData(productList);
		return pageBean;
	}

}
