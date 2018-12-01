package com.igeek_01_c3p0_utils;

import java.sql.Connection;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utils {

	// �������ӳ�
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource("igeek");
	
	// ������Ӷ���
	public static Connection getConnection() throws Exception{
		return dataSource.getConnection();
	}
	
	// �������Դ����
	public static DataSource getDataSource(){
		return dataSource;
	}

}
