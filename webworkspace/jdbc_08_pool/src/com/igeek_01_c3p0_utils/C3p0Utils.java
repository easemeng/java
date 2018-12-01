package com.igeek_01_c3p0_utils;

import java.sql.Connection;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utils {

	// 创建连接池
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource("igeek");
	
	// 获得连接对象
	public static Connection getConnection() throws Exception{
		return dataSource.getConnection();
	}
	
	// 获得数据源对象
	public static DataSource getDataSource(){
		return dataSource;
	}

}
