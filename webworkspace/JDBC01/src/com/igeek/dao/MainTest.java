package com.igeek.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) throws Exception {
		
		// ʹ�÷�װ�Ĺ�������������ݿ����
		Connection connerction = JDBCUtils.getConnection();
		Statement createStatement = connerction.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = sc.nextLine();
		System.out.println("����������:");
		String password = sc.nextLine();
		
		// select * from user where username = '' or '1=1' and password = '' or '1=1'
		String sql = "select * from user where username = '"+ username +"' and password = '"+ password +"'";
		// SQLע��	����̨�������˺ź�����	���ƥ�������� �������½�ɹ�  �����¼ʧ��
		
		// SQLע��
		String sql2 = "select * from user where username = '' or '1=1' and password = '' or '1=1'";
		ResultSet resultSet = createStatement.executeQuery(sql);
		
		if(resultSet.next())
			System.out.println("��¼�ɹ�");
		else
			System.out.println("��¼ʧ��");
		
		int i = JDBCUtils.getRowCount(resultSet);
		System.out.println(i);

	}

}
