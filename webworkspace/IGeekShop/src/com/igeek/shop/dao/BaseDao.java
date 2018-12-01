package com.igeek.shop.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.igeek.common.utils.MyDBUtils;

// 给当前类添加泛型 	???
public class BaseDao<T> {
	
	private QueryRunner queryRunner = MyDBUtils.getQueryRunner();
	
	// 用来做所有的修改操作 方法的返回值为当前SQL语句影响的数据数 	sql表示传入的要执行的sql语句 params 对应sql的?做预处理 防止SQL注入
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
	
	// 封装一个查询单一数据的放法 将查询到的数据封装到user对象中	user?? 泛型在项目中的实际应用
	public Object getOne(String sql,Object[] params,T t){
		Object obj = null; // 声明一个空的user对象
		// 拿到queryRunner对象用来执行sql
		try {
			// String sql,new BeanHandler<>(),Object[] params;
			// Product..
			// 自动把查询结构封装成user对象
			obj = queryRunner.query(sql, new BeanHandler<T>((Class<T>) t.getClass()),params);
			// 执行sql并把查询结果自动封装到user对象中
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	// user product beauty boys 都要重写方法
	
	// 封装一个用来查询列表数据的方法
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
	
	// 查询数据条数
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
