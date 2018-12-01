package com.igeek.shop.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.igeek.common.DBUtils;

public class BaseDao<T> {
	
	private QueryRunner qr = DBUtils.getQueryRunner();
	
	// 所有的增删改
	public int update(String sql,Object[] params){
		
		int i = -1;
		try {
			i = qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	// 查询一行数据
	public Object getOne(String sql,Object[] params,T t){
		
		Object obj = null;
		try {
			obj = qr.query(sql, new BeanHandler<T>((Class<T>) t.getClass()), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
	
	// 查询列表
	public Object getList(String sql,Object[] params,T t){
		
		Object objList = null;
		try {
			objList = qr.query(sql,new BeanListHandler<T>((Class<T>) t.getClass()), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return objList;
	}

	public long getTotalDataNumber(String sql,Object [] params) {
		long i = -1;
		try {
			i = (long) qr.query(sql, new ScalarHandler(), params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

}
