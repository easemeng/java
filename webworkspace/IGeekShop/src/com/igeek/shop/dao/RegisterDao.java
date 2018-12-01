package com.igeek.shop.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.igeek.common.utils.DataSourceUtils;
import com.igeek.shop.entity.User;

public class RegisterDao {
	
	private static QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
	
	public static int rigest(User user){
		
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?)";
		
		int row = 0;
		try {
			row = qr.update(sql,user.getUid(),user.getUsername(),user.getPassword(),
					user.getName(),user.getEmail(),user.getTelephone(),user.getBirthday(),
					user.getSex(),user.getState(),user.getCode());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
		
	}

	public void active(String activeCode) throws Exception {
		// 更新用户状态
		String sql = "update user set state = 1 where code = ?";
		Object[] obj={activeCode};
		qr.update(sql,obj);
		
	}

}
