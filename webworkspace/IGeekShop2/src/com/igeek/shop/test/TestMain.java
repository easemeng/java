package com.igeek.shop.test;

import org.junit.Test;

import com.igeek.shop.dao.LoginDao;
import com.igeek.shop.entity.User;

public class TestMain {
	
	@Test
	public void test1(){
		User user = new User();
		System.out.println(user.getEmail());
	}

	
	@Test
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
		
	}

}
