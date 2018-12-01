package com.igeek.DBUtilsTest;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.igeek.domain.product;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtilsTest {

	@Test
	public void insert() throws Exception{
		// PooledDataSource	...DataSource
		ComboPooledDataSource cp = new ComboPooledDataSource();
		// 使用DBUtils对象
		QueryRunner qr = new QueryRunner(cp);
		// 书写SQL语句		?防止SQL注入
		String sql = "insert into product(pid,pname,price,category_id) value(?,?,?,?)";
		Object[] params = {990,"测试",100,"c009"}; // params 对象数组
		int r = qr.update(sql,params);
	}
	
	@Test
	public void delete() throws Exception{
		
		ComboPooledDataSource cp = new ComboPooledDataSource();
		
		QueryRunner qr = new QueryRunner(cp);
		
		String sql = "delete from product where pid = ?";
		Object[] params = {990};
		qr.update(sql, params);
	}
	
	@Test
	public void update() throws Exception{
		
		ComboPooledDataSource cp = new ComboPooledDataSource();
		// 1. 核心类
		QueryRunner queryrunner = new QueryRunner(cp);
		// 2. 准备sql语句
		String sql = "update product set pname = ?,price = ?,category_id = ? where pid = ?";
		// 3. 准备实际参数
		Object[] params = {"芒果99","998","c009",10};
		// 4. 执行
		int r = queryrunner.update(sql,params);
		System.out.println(r);
	}
	
	@Test
	public void sel1() throws Exception{
		// 重点
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product where pid = ?";
		Object[] params = {6};
		// ResultSetHeadler<T> rsh
		// BeanHandler 实现类	帮你把查询到的数据 封装成对象 当查询结果只有一条的时候才能用
		product products = qr.query(sql, new BeanHandler<product>(product.class),params);
		System.out.println(products);
	}
	
	@Test
	public void sel2() throws Exception{
		// 重点
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product";
		Object[] params = {};
		
		List<product> list = qr.query(sql, new BeanListHandler<product>(product.class),params);
		
		// System.out.println(product);
		for (product product : list) {
			System.out.println(product);
		}
	}
	
	@Test
	public void sel3() throws Exception{
		// 重要
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select avg(price) from product";
		Double query = qr.query(sql, new ScalarHandler<Double>());
		System.out.println(query);
	}
	
	@Test
	public void sel4() throws Exception{
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product where pid = ?";
		Object[] params = {6};
		// Map 把结果封装成map容器	key-value
		Map<String,Object>map = qr.query(sql,new MapHandler(), params);
		System.out.println(map);
	}
	
	// 结果类型都是List嵌套Map
	@Test
	public void sel5() throws Exception{
		// 重点
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product";
		
		List<Map<String,Object>> query = qr.query(sql, new MapListHandler());
		
		for (Map<String, Object> map : query) {
			System.out.println(map);
		}
	}
	
	@Test
	public void sel6() throws Exception{
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product where pid = ?";
		Object[] params = {6};
		Object[] arr = qr.query(sql, new ArrayHandler(), params);
		
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void sel7() throws Exception{
		// 重点
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product";
		
		List<Object[]> list = qr.query(sql, new ArrayListHandler());
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}
	
	@Test
	public void sel8() throws Exception{
		
		// KeyedHandler : new KeyedHandler<>("字段名称") 查询所有 将查询的结果封装到Map中
		// * map.key = 为指定"字段名称"对应的值
		// * map.value = 为当前整条记录所有的值 数据为 Map<字段名,值>
		// 类型 Map<String,Map<String,Object>>
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product";
		
		Map<String,Map<String,Object>>map = qr.query(sql,new KeyedHandler<String>("pname"));
		
		/**
		 * Map 的键 是用set集合来存
		 * 
		 */
		for(Map.Entry<String, Map<String,Object>>entry : map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
	@Test
	public void sel9() throws Exception{
		// ColumnListHandler: 	查询指定的一列数据
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product";
		
		List<String> list = qr.query(sql, new ColumnListHandler<String>("pname"));
		
		System.out.println(list);
	}
	
	/**
	 * BeanHandler		用来自动封装单个对象
	 * BeanListHandler	用来封装多个对象 ，嵌套格式 就是List嵌套对象
	 * ScalarHandler<>	做数量结果的封装 一般sql的返回值只有一列	那么你需要什么数据类型 就在ScalarHandler的泛型中使用包装类名称即可
	 * MapHandler		把数据封装成Map key-value key 是每一个字段名称 value就是每一个字段所对应的值
	 * MapListHandler	把数据封装成List嵌套Map
	 * ArrayHandler()	返回值类型是一个数组 封装数据的格式{1,IBM,5500,c001} (只封装一行)
	 * ArrayListHandler()	list嵌套数组 {{1,IBM,5500,c001},{2,惠普,5000,c001},{3,长城,3200,c001}...}
	 * KeyedHandler<>()	返回值类型是Map嵌套Map
	 * ColumnListHandler<>()	返回值类型是一个List<> 里面装的是每一列数据
	 */

}
