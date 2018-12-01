package com.igeek.shop.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.igeek.common.utils.DataSourceUtils;

public class LoginDao {

	private QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
	public Long checkPasswords(String password) throws Exception {
		
		String sql = "select count(*) from user where password = ?";
		Long count = (Long) qr.query(sql, new ScalarHandler(), password);
		return count;
		
	}
	


}
