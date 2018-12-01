package com.igeek_02_dbcp_utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DbcpUtils {

	// 1. �������ӳ�
	private static DataSource dataSource;
	
	// ʹ�þ�̬������ȡ�����ļ�
	static{
		try {
			// 1) ����properties�ļ� ��ȡProperties����
			InputStream in = DbcpUtils.class.getClassLoader().getResourceAsStream("dbcp-config.properties");
			Properties prop = new Properties();
			prop.load(in);
			// 2) ͨ�������� �������ӳض���
			dataSource = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ������Ӷ���
	public static Connection getConnection() throws Exception{
		return dataSource.getConnection();
	}
	
	// ������ӳ�
	public static DataSource getDataSource(){
		return dataSource;
	}

}