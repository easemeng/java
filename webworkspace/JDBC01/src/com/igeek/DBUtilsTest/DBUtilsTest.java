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
		// ʹ��DBUtils����
		QueryRunner qr = new QueryRunner(cp);
		// ��дSQL���		?��ֹSQLע��
		String sql = "insert into product(pid,pname,price,category_id) value(?,?,?,?)";
		Object[] params = {990,"����",100,"c009"}; // params ��������
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
		// 1. ������
		QueryRunner queryrunner = new QueryRunner(cp);
		// 2. ׼��sql���
		String sql = "update product set pname = ?,price = ?,category_id = ? where pid = ?";
		// 3. ׼��ʵ�ʲ���
		Object[] params = {"â��99","998","c009",10};
		// 4. ִ��
		int r = queryrunner.update(sql,params);
		System.out.println(r);
	}
	
	@Test
	public void sel1() throws Exception{
		// �ص�
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product where pid = ?";
		Object[] params = {6};
		// ResultSetHeadler<T> rsh
		// BeanHandler ʵ����	����Ѳ�ѯ�������� ��װ�ɶ��� ����ѯ���ֻ��һ����ʱ�������
		product products = qr.query(sql, new BeanHandler<product>(product.class),params);
		System.out.println(products);
	}
	
	@Test
	public void sel2() throws Exception{
		// �ص�
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
		// ��Ҫ
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
		// Map �ѽ����װ��map����	key-value
		Map<String,Object>map = qr.query(sql,new MapHandler(), params);
		System.out.println(map);
	}
	
	// ������Ͷ���ListǶ��Map
	@Test
	public void sel5() throws Exception{
		// �ص�
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
		// �ص�
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
		
		// KeyedHandler : new KeyedHandler<>("�ֶ�����") ��ѯ���� ����ѯ�Ľ����װ��Map��
		// * map.key = Ϊָ��"�ֶ�����"��Ӧ��ֵ
		// * map.value = Ϊ��ǰ������¼���е�ֵ ����Ϊ Map<�ֶ���,ֵ>
		// ���� Map<String,Map<String,Object>>
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product";
		
		Map<String,Map<String,Object>>map = qr.query(sql,new KeyedHandler<String>("pname"));
		
		/**
		 * Map �ļ� ����set��������
		 * 
		 */
		for(Map.Entry<String, Map<String,Object>>entry : map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	
	@Test
	public void sel9() throws Exception{
		// ColumnListHandler: 	��ѯָ����һ������
		ComboPooledDataSource cp = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(cp);
		String sql = "select * from product";
		
		List<String> list = qr.query(sql, new ColumnListHandler<String>("pname"));
		
		System.out.println(list);
	}
	
	/**
	 * BeanHandler		�����Զ���װ��������
	 * BeanListHandler	������װ������� ��Ƕ�׸�ʽ ����ListǶ�׶���
	 * ScalarHandler<>	����������ķ�װ һ��sql�ķ���ֵֻ��һ��	��ô����Ҫʲô�������� ����ScalarHandler�ķ�����ʹ�ð�װ�����Ƽ���
	 * MapHandler		�����ݷ�װ��Map key-value key ��ÿһ���ֶ����� value����ÿһ���ֶ�����Ӧ��ֵ
	 * MapListHandler	�����ݷ�װ��ListǶ��Map
	 * ArrayHandler()	����ֵ������һ������ ��װ���ݵĸ�ʽ{1,IBM,5500,c001} (ֻ��װһ��)
	 * ArrayListHandler()	listǶ������ {{1,IBM,5500,c001},{2,����,5000,c001},{3,����,3200,c001}...}
	 * KeyedHandler<>()	����ֵ������MapǶ��Map
	 * ColumnListHandler<>()	����ֵ������һ��List<> ����װ����ÿһ������
	 */

}
