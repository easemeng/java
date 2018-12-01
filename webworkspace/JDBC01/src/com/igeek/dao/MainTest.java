package com.igeek.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) throws Exception {
		
		// 使用封装的工具类来完成数据库操作
		Connection connerction = JDBCUtils.getConnection();
		Statement createStatement = connerction.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = sc.nextLine();
		System.out.println("请输入密码:");
		String password = sc.nextLine();
		
		// select * from user where username = '' or '1=1' and password = '' or '1=1'
		String sql = "select * from user where username = '"+ username +"' and password = '"+ password +"'";
		// SQL注入	控制台中输入账号和密码	如果匹配有数据 则输出登陆成功  否则登录失败
		
		// SQL注入
		String sql2 = "select * from user where username = '' or '1=1' and password = '' or '1=1'";
		ResultSet resultSet = createStatement.executeQuery(sql);
		
		if(resultSet.next())
			System.out.println("登录成功");
		else
			System.out.println("登录失败");
		
		int i = JDBCUtils.getRowCount(resultSet);
		System.out.println(i);

	}

}
