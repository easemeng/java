package com.igeek.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtils {
	
	private static ComboPooledDataSource cp = new ComboPooledDataSource();
	
	public static Connection getConnection(){
		
		Connection connection = null;
		try {
			connection = cp.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	
	public static QueryRunner getQueryRunner(){
		
		QueryRunner qr = new QueryRunner(cp);
		return qr;
		
	}
	
	public static void closeAllJDBCObject(Connection connection,Statement statement,ResultSet result){
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
