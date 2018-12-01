package com.igeek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) throws Exception {
	
		Connection connection = JDBCUtils.getConnection();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = sc.nextLine();
		System.out.println("����������:");
		String password = sc.nextLine();
		
		String sql = "select * from user where username = ? and password = ?";
		
		// ��ͨ��ִ�ж��� �ᱻSQLע�� ���ַ���ƴ�� �ﵽ�Ƿ���Ŀ�ģ�
		
		// �õ�Ԥ���� ִ�ж���	Ԥ���������Է�ֹSQLע��
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if(resultSet.next())
			System.out.println("��¼�ɹ�");
		else
			System.out.println("��¼ʧ��");
		
		// Ԥ��������ʹ��
		//  1. connection.prepareStatement(sql); ͨ�����Ӷ�����Ԥ�������	SQL������Ҫ��ѯ�Ĳ���
		//  2. sql Ӧ����Ҫƴ�ӵĲ���	ʹ��ռλ�� ? ����ʾ
		//  3. preparedStatement.setString(1,"user")	��ʾ����һ���ʺ����ó� user
		//	   preparedStatement.setInt(2, 3);	��ʾ���ڶ����ʺ����ó�int���͵�3
		//  4. preparedStatement.executeQuery();	���õ����������
		//  5. ������ȥ�������������

	}

}
