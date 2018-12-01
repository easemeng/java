package com.igeek_01_c3p0;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Demo_01 {

	public static void main(String[] args) throws Exception {
		
		// 1. �������ӳ�(����Դ)
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		// 1.1 ��������
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jabc:mysql://localhost:3306/igeek_02");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		
		// 1.2 ����������
		// 1.2.1 ���ó�ʼʱ������������
		dataSource.setInitialPoolSize(5);
		// 1.2.2 �������ӳ�����С�������������
		dataSource.setMinPoolSize(3);
		dataSource.setMaxPoolSize(10);
		// 1.2.3 ����ÿ��������������
		dataSource.setAcquireIncrement(2);
		// 1.2.4 �������ӵ�������ʱ��(����Ϊ��λ)
		dataSource.setMaxIdleTime(30);
		
		// 2. �����ӳ��л�ȡ���Ӷ���
		Connection conn = dataSource.getConnection();
		
		System.out.println(conn);

	}

}
