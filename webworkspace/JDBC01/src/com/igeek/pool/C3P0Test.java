package com.igeek.pool;

import java.beans.PropertyVetoException;
import java.sql.Connection;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Test {

	@Test
	public void test1() throws Exception{
		// ComboPooledDataSource 由 c3p0 提供的连接池对象
		ComboPooledDataSource cp = new ComboPooledDataSource();
		ComboPooledDataSource cp2 = new ComboPooledDataSource();
		// cp 对象 就是池对象	cp 就代表了连接池
		cp.setDriverClass("com.mysql.jdbc.Driver");
		cp.setJdbcUrl("jdbc:mysql://localhost:3306/girls");
		cp.setUser("root");
		cp.setPassword("root");
		// 初始化连接池中连接的个数
		cp.setInitialPoolSize(5);
		// 最小|最大 连接池中连接个数
		cp.setMinPoolSize(2);
		cp.setMaxPoolSize(10);
		// 最大空闲时间
		cp.setMaxIdleTime(60);
		// 每次增长个数
		cp.setAcquireIncrement(2);
		
		// 2 获得连接
		Connection conn = cp.getConnection();
		System.out.println(conn);
		
		Connection conn2 = cp.getConnection();
		System.out.println(conn2);
		// c3p0
		
	}
}
