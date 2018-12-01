package com.igeek.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.igeek.utils.MyDBUtils;

// ����ǰ����ӷ��� ������
public class BaseDao<T> {
	
	// ���������е��޸Ĳ��� �����ķ���ֵΪ��ǰSQL���Ӱ��������� 	sql��ʾ�����Ҫִ�е�sql��� params ��Ӧsql��?��Ԥ���� ��ֹSQLע��
	public int update(String sql,Object[] params){
		int i = -1;
		try {
			QueryRunner queryRunner = MyDBUtils.getQueryRunner();
			i = queryRunner.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	// ��װһ����ѯ��һ���ݵķŷ� ����ѯ�������ݷ�װ��user������	user?? ��������Ŀ�е�ʵ��Ӧ��
	public Object getUserByOne(String sql,Object[] params,T t){
		Object obj = null; // ����һ���յ�user����
		QueryRunner queryRunner = MyDBUtils.getQueryRunner();
		// �õ�queryRunner��������ִ��sql
		try {
			// String sql,new BeanHandler<>(),Object[] params;
			// Product..
			// �Զ��Ѳ�ѯ�ṹ��װ��user����
			obj = queryRunner.query(sql, new BeanHandler<T>((Class<T>) t.getClass()),params);
			// ִ��sql���Ѳ�ѯ����Զ���װ��user������
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	// user product beauty boys ��Ҫ��д����
	
	// ��װһ��������ѯ�б����ݵķ���
	public Object getList(String sql,Object[] params,T t){
		
		Object objectList = null;
		
		QueryRunner qr = MyDBUtils.getQueryRunner();
		try {
			objectList= qr.query(sql, new BeanListHandler<T>((Class<T>) t.getClass()), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return objectList;
	}

}
