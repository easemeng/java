package com.igeek.shop.service;

import com.igeek.shop.dao.BaseDao;
import com.igeek.shop.entity.User;

public class CheckServiceImpl implements CheckService {

	private BaseDao dao = new BaseDao();
	@Override
	public boolean checkCode(String sessionCode, String checkCode) {
		
		boolean flag = false;

		if (sessionCode != null && checkCode.equals(sessionCode)) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}

	@Override
	public boolean checkUsername(String username) {
		
		String sql = "select count(*) from user where username = ?";
		Object[] params = {username};
		long count = dao.getTotalDataNumber(sql, params);

		return count>0?true:false;
	}

	@Override
	public User getUser(String username) {
		
		String sql = "select * from user where username = ?";
		Object[] params = {username};
		User user = (User) dao.getOne(sql, params, new User());
		
		return user;
	}

}
