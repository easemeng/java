package com.igeek.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MyDBUtils {
	
	private static ComboPooledDataSource cp = new ComboPooledDataSource();
	
	// 当前方法返回一个数据库连接对象(通过连接池)
	public static Connection getConnection(){
		// 通过连接池来拿到数据库的连接对象
		Connection connection = null;
		try {
			connection = cp.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	// 当前方法返回一个QueryRunner对象
	public static QueryRunner getQueryRunner(){
		QueryRunner qr = new QueryRunner(cp);
		return qr;
	}
	
	public static void closeConnection(Connection connection){
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 作用是关闭所有JDBC对象
	public static void closeJDBCObjectAll(Connection connection,Statement statement,ResultSet result){
		try {
			connection.close();
			statement.close();
			result.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
