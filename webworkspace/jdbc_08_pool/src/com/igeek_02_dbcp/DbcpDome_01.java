package com.igeek_02_dbcp;

import java.sql.Connection;
import org.apache.commons.dbcp.BasicDataSource;

public class DbcpDome_01 {
	
	public static void main(String[] args) throws Exception {
		
		// 1. 创建连接池对象(数据源对象)
		BasicDataSource dataSource = new BasicDataSource();
		
		// 1.1 基本项设置
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/igeek_01");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		// 1.2 其他项设置
		dataSource.setInitialSize(5);
		dataSource.setMaxActive(10);
		dataSource.setMaxIdle(30);
		
		// 2. 获取连接对象
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
	}

}
