package com.igeek_02_dbcp;

import java.sql.Connection;
import org.apache.commons.dbcp.BasicDataSource;

public class DbcpDome_01 {
	
	public static void main(String[] args) throws Exception {
		
		// 1. �������ӳض���(����Դ����)
		BasicDataSource dataSource = new BasicDataSource();
		
		// 1.1 ����������
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/igeek_01");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		// 1.2 ����������
		dataSource.setInitialSize(5);
		dataSource.setMaxActive(10);
		dataSource.setMaxIdle(30);
		
		// 2. ��ȡ���Ӷ���
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
	}

}
