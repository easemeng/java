package com.igeek_01_c3p0;

import java.sql.Connection;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Dome_02 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 1. 创建连接池对象(数据源)
		 * 会自动加载 src c3p0-config.xml 文件，进行具体的配置
		 */
		// 1.1 会查询配置文件中的default-config
		// ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		// 1.2 会根据配置文件中的named-config进项配置
		ComboPooledDataSource dataSource = new ComboPooledDataSource("igeek");
		
		// 2. 获得连接对象
		Connection conn = dataSource.getConnection();
		
		System.out.println(conn);

	}

}
