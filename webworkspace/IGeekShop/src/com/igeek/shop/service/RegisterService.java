package com.igeek.shop.service;

import com.igeek.shop.dao.RegisterDao;
import com.igeek.shop.entity.User;

public class RegisterService {
	
	private RegisterDao dao = new RegisterDao();
	
	public boolean rigest(User user){
		// 业务逻辑
		int row = 0;
		// Dao层返回的是数据库影响行数
		row = RegisterDao.rigest(user);
		
		return row>0?true:false;
	
	}

	public boolean active(String activeCode) {
		// 更新用户状态
		try {
			dao.active(activeCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

}
