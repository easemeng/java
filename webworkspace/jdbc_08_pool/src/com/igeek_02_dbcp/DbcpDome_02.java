package com.igeek_02_dbcp;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DbcpDome_02 {

	public static void main(String[] args) throws Exception {
		
		// 获得连接池
		// 1.1 加载 properties 文件	获得 Properties对象
		InputStream in = DbcpDome_02.class.getClassLoader().getResourceAsStream("dbcp-config.properties");
		Properties prop = new Properties();
		prop.load(in);
		
		// 1.2 获得连接池对象
		DataSource dataSource = BasicDataSourceFactory.createDataSource(prop);
		
		// 2. 获得连接对象
		Connection conn = dataSource.getConnection();
		System.out.println(conn);

	}

}
