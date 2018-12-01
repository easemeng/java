package com.igeek_02_dbcp_utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DbcpUtils {

	// 1. 创建连接池
	private static DataSource dataSource;
	
	// 使用静态代码块获取属性文件
	static{
		try {
			// 1) 加载properties文件 获取Properties对象
			InputStream in = DbcpUtils.class.getClassLoader().getResourceAsStream("dbcp-config.properties");
			Properties prop = new Properties();
			prop.load(in);
			// 2) 通过工厂类 创建连接池对象
			dataSource = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 获得连接对象
	public static Connection getConnection() throws Exception{
		return dataSource.getConnection();
	}
	
	// 获得连接池
	public static DataSource getDataSource(){
		return dataSource;
	}

}
