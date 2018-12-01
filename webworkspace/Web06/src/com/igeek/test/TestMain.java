package com.igeek.test;

import java.util.List;

import org.junit.Test;

import com.igeek.dao.BaseDao;
import com.igeek.domain.Product;

public class TestMain {
	
	@Test
	public void testSelectProductList() {
		BaseDao<Product> dao = new BaseDao<Product>();
		String sql = "select * from product limit ?,5";
		Object[] params = {0};
		Object objectList = dao.getList(sql, params, new Product());
		List<Product> productList = (List<Product>) objectList;
		System.out.println(productList.size());
		/*for (Product product : productList) {
			System.out.println(product);
		}*/
		
	}
	

}
