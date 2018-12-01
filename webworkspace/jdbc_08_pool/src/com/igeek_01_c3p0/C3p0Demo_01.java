package com.igeek_01_c3p0;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Demo_01 {

	public static void main(String[] args) throws Exception {
		
		// 1. 创建连接池(数据源)
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		// 1.1 基本配置
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jabc:mysql://localhost:3306/igeek_02");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		
		// 1.2 其他的配置
		// 1.2.1 设置初始时连接数的数量
		dataSource.setInitialPoolSize(5);
		// 1.2.2 设置连接池中最小和最大连接数量
		dataSource.setMinPoolSize(3);
		dataSource.setMaxPoolSize(10);
		// 1.2.3 设置每次增长连接数量
		dataSource.setAcquireIncrement(2);
		// 1.2.4 设置连接的最大空闲时间(以秒为单位)
		dataSource.setMaxIdleTime(30);
		
		// 2. 从连接池中获取连接对象
		Connection conn = dataSource.getConnection();
		
		System.out.println(conn);

	}

}
