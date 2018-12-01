package com.igeek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) throws Exception {
	
		Connection connection = JDBCUtils.getConnection();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = sc.nextLine();
		System.out.println("请输入密码:");
		String password = sc.nextLine();
		
		String sql = "select * from user where username = ? and password = ?";
		
		// 普通的执行对象 会被SQL注入 （字符串拼接 达到非法的目的）
		
		// 拿到预处理 执行对象	预处理对象可以防止SQL注入
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next())
			System.out.println("登录成功");
		else
			System.out.println("登录失败");
		
		// 预处理对象的使用
		//  1. connection.prepareStatement(sql); 通过连接对象获得预处理对象	SQL就是你要查询的参数
		//  2. sql 应把需要拼接的参数	使用占位符 ? 来表示
		//  3. preparedStatement.setString(1,"user")	表示给第一个问号设置成 user
		//	   preparedStatement.setInt(2, 3);	表示给第二个问号设置成int类型的3
		//  4. preparedStatement.executeQuery();	来拿到结果集对象
		//  5. 正常的去操作结果集即可

	}

}
