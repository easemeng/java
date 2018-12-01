package com.igeek.pool;

import java.beans.PropertyVetoException;
import java.sql.Connection;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Test {

	@Test
	public void test1() throws Exception{
		// ComboPooledDataSource �� c3p0 �ṩ�����ӳض���
		ComboPooledDataSource cp = new ComboPooledDataSource();
		ComboPooledDataSource cp2 = new ComboPooledDataSource();
		// cp ���� ���ǳض���	cp �ʹ��������ӳ�
		cp.setDriverClass("com.mysql.jdbc.Driver");
		cp.setJdbcUrl("jdbc:mysql://localhost:3306/girls");
		cp.setUser("root");
		cp.setPassword("root");
		// ��ʼ�����ӳ������ӵĸ���
		cp.setInitialPoolSize(5);
		// ��С|��� ���ӳ������Ӹ���
		cp.setMinPoolSize(2);
		cp.setMaxPoolSize(10);
		// ������ʱ��
		cp.setMaxIdleTime(60);
		// ÿ����������
		cp.setAcquireIncrement(2);
		
		// 2 �������
		Connection conn = cp.getConnection();
		System.out.println(conn);
		
		Connection conn2 = cp.getConnection();
		System.out.println(conn2);
		// c3p0
		
	}
}
