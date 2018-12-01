package com.igeek_01_c3p0;

import java.sql.Connection;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Dome_02 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 1. �������ӳض���(����Դ)
		 * ���Զ����� src c3p0-config.xml �ļ������о��������
		 */
		// 1.1 ���ѯ�����ļ��е�default-config
		// ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
		// 1.2 ����������ļ��е�named-config��������
		ComboPooledDataSource dataSource = new ComboPooledDataSource("igeek");
		
		// 2. ������Ӷ���
		Connection conn = dataSource.getConnection();
		
		System.out.println(conn);

	}

}
