package com.igeek.shop.test;

import java.util.List;

import org.junit.Test;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.Order;
import com.igeek.shop.entity.OrderItem;
import com.igeek.shop.entity.User;
import com.igeek.shop.service.CheckService;
import com.igeek.shop.service.CheckServiceImpl;

public class TestMain {
	
	@Test
	public void test6(){
		
		BaseDao dao = new BaseDao();
		String sql = "select * from orders where oid=?";
		Object[] params = {"0ac47760af9b4a6587458181f5f311c0"};
		String sql2 = "select * from orderitem where oid=?";
		List<OrderItem> orderitem = (List<OrderItem>) dao.getList(sql, params, new OrderItem());
		
		Order order = (Order) dao.getOne(sql, params, new Order());
		order.setOrderItems(orderitem);
		System.out.println(order);
		
	}
	
	@Test
	public void test5(){
		
		CheckService cs = new CheckServiceImpl();
		User user = cs.getUser("er");
		System.out.println(user);
	}
	
	@Test
	public void test4(){
		String sql = "select * from user where username = ?";
		Object[] params = {"ererer"};
		BaseDao dao = new BaseDao();
		User user = (User) dao.getOne(sql, params, new User());
//		System.out.println(user.getPassword());
	}
	
	@Test
	public void test3(){
		
		CheckService cs = new CheckServiceImpl();
		boolean flag = cs.checkUsername("cch");
		System.out.println(flag);
		
	}
	
	@Test
	public void test1(){
		User user = new User();
		System.out.println(user.getEmail());
	}

	
/*	@Test
	public void test2(){
		
		LoginDao dao = new LoginDao();
		String password = "erer";
		Long count = 0L;
		try {
			count = dao.checkPasswords(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(count);
		
	}*/

}
