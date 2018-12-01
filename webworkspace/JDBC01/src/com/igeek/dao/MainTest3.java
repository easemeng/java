package com.igeek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import org.junit.Before;
import org.junit.Test;

public class MainTest3 {

			/* 成员变量 */
		public Connection con = null;
		
		@Before
		public void a(){
			// 获得数据库连接对象
			con = JDBCUtils.getConnection();
		}
		
		@Test
		public void insert() throws Exception{
			String sql = "insert into user value(?,?,?,?)";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, "4");
			preparedStatement.setString(2, "jackson");
			preparedStatement.setString(3, "564");
			preparedStatement.setInt(4, 1388888888);
			int i = preparedStatement.executeUpdate();	// 会影响多少条数据
			System.out.println(i);
		}

		@Test
		public void delect() throws Exception{
			String sql = "delect from user where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "1");
			int i = ps.executeUpdate();
			System.out.println(i);
		}
		
		@Test
		public void update() throws Exception{
			String sql = "update user set username = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "111");
			ps.setString(2, "222");
			int i = ps.executeUpdate();
			System.out.println(i);
		}
}
