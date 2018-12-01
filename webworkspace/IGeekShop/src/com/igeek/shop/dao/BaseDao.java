package com.igeek.shop.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.igeek.common.utils.MyDBUtils;

// ����ǰ����ӷ��� 	???
public class BaseDao<T> {
	
	private QueryRunner queryRunner = MyDBUtils.getQueryRunner();
	
	// ���������е��޸Ĳ��� �����ķ���ֵΪ��ǰSQL���Ӱ��������� 	sql��ʾ�����Ҫִ�е�sql��� params ��Ӧsql��?��Ԥ���� ��ֹSQLע��
	public int update(String sql,Object[] params){
		int i = -1;
		try {
			i = queryRunner.update(sql,params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	// ��װһ����ѯ��һ���ݵķŷ� ����ѯ�������ݷ�װ��user������	user?? ��������Ŀ�е�ʵ��Ӧ��
	public Object getOne(String sql,Object[] params,T t){
		Object obj = null; // ����һ���յ�user����
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
		
		try {
			objectList= queryRunner.query(sql, new BeanListHandler<T>((Class<T>) t.getClass()), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return objectList;
	}
	
	// ��ѯ��������
	public long getTotalDataNumber(String sql,Object [] params){
		
		long i = -1;
		try {
			i = (long) queryRunner.query(sql, new ScalarHandler(), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
		
	}
	
	public Object getListMap(String sql,Object [] params){
		
		Object objectListMap = null;
		try {
			objectListMap = queryRunner.query(sql, new MapListHandler(), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objectListMap;
		
	}
	
}
