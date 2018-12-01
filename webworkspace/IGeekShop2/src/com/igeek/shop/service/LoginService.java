package com.igeek.shop.service;

import com.igeek.shop.dao.LoginDao;
import com.igeek.shop.entity.User;

public class LoginService {

	private LoginDao dao = new LoginDao();
	
	public boolean checkPassword(String password) {
		
		Long count = 0L;
		try {
			count = dao.checkPasswords(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count>0?true:false;
	}
	

}
