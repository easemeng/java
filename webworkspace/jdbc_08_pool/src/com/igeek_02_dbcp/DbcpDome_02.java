package com.igeek_02_dbcp;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DbcpDome_02 {

	public static void main(String[] args) throws Exception {
		
		// ������ӳ�
		// 1.1 ���� properties �ļ�	��� Properties����
		InputStream in = DbcpDome_02.class.getClassLoader().getResourceAsStream("dbcp-config.properties");
		Properties prop = new Properties();
		prop.load(in);
		
		// 1.2 ������ӳض���
		DataSource dataSource = BasicDataSourceFactory.createDataSource(prop);
		
		// 2. ������Ӷ���
		Connection conn = dataSource.getConnection();
		System.out.println(conn);

	}

}
