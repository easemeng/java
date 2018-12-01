package com.igeek.property2;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.util.Properties;

import org.junit.Test;

public class Main {
	
	@Test
	public void test3(){
		double d = Math.random() * 80;
		
		int i = 20 + (int) Math.random() * 80;
		System.out.println(d);
	}
	
	// java反射+配置文件   来动态创建对象 。 达到一种灵活编程的目的。
	@Test
	public void test2() throws Exception {
		// String str = "007";
		// int i = Integer.parseInt(str);
		// System.out.println(i);
		
		Reader reader = new InputStreamReader(new FileInputStream("classname.properties"), "UTF-8");
		
		// 读取配置文件
		Properties classProperties = new Properties();
		classProperties.load(reader);
		
		// 拿到加载的类
		String className = classProperties.getProperty("className");
		
		// 创建Java反射
		Class classType = Class.forName(className);
		// Object obj = classType.newInstance();
		// System.out.println(obj);  // 会报错 ， 当前类中没有空参构造器 。 java 反射创建对象 ， 是会调用空参构造器的
		Constructor con = classType.getConstructor(int.class,String.class);
		
		// ID,NAME  也是取出来的
		Reader reader1 = new InputStreamReader(new FileInputStream("data.properties"), "UTF-8");
		
		Properties content = new Properties();
		content.load(reader1);
		
		String strId = content.getProperty("id");
		int id = Integer.parseInt(strId);
		String name = content.getProperty("name");
		
		Object obj = con.newInstance(id,name);
		System.out.println(obj);
		
		reader1.close();
		reader.close();
	}
	
	@Test
	public void test(){
		Student stu = new Student(1,"逸");
		System.out.println(stu);
	}

}
