package com.igeek.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {

	public static void main(String[] args) throws Exception {
		
		String driver = "com.mysql.jdbc.Driver";  // ���ݿ�
		String url = "jdbc:mysql://localhost:3306/girls?characterEncoding=utf-8";
		String user = "root";
		String password = "root";
		
		// JDBC Java�������ݿ�
		
		// ��Զ�ĵ�һ�� �������ݿ�����
		Class.forName(driver);
		
		// ��Զ�ĵڶ��� �������ݿ����Ӷ���	connection
		Connection connection = DriverManager.getConnection(url, user, password);
		
		// ������ �������ݿ�ִ�ж���	ִ�ж��� ����ִ�о���ĵ�SQL���	statement ���ݿ�ִ�ж��� ��������ִ��SQL���
		Statement statement = connection.createStatement();
		
		// ��д SQL ���
		String sql = "select * from beauty";
		
		// statement.executeUpdate(sql); // ר������ִ�� inner into �� update �� delete
		// ���岽 ͨ��ִ��SQL��� �õ����������	����������� �Ͱ����װ�� ��ѯ���
		ResultSet result = statement.executeQuery(sql);
		
		// �������������
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
