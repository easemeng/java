package com.igeek.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {

	public static void main(String[] args) throws Exception {
		
		String driver = "com.mysql.jdbc.Driver";  // 数据库
		String url = "jdbc:mysql://localhost:3306/girls?characterEncoding=utf-8";
		String user = "root";
		String password = "root";
		
		// JDBC Java连接数据库
		
		// 永远的第一步 加载数据库驱动
		Class.forName(driver);
		
		// 永远的第二步 创建数据库连接对象	connection
		Connection connection = DriverManager.getConnection(url, user, password);
		
		// 第三步 创建数据库执行对象	执行对象 负责执行具体的的SQL语句	statement 数据库执行对象 可以用来执行SQL语句
		Statement statement = connection.createStatement();
		
		// 书写 SQL 语句
		String sql = "select * from beauty";
		
		// statement.executeUpdate(sql); // 专门用来执行 inner into ， update ， delete
		// 第五步 通过执行SQL语句 拿到结果集对象	结果集对象中 就帮你封装了 查询结果
		ResultSet result = statement.executeQuery(sql);
		
		// 遍历操作结果集
		while(result.next()){
			String id = result.getString("id");
			String name = result.getString("name");
			String borndate = result.getString("borndate");
			System.out.println(id + "\t" + name + "\t" + borndate);
		}
		
		result.close();
		statement.close();
		connection.close();

	}

}
