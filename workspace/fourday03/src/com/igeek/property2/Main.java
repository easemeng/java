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
	
	// java����+�����ļ�   ����̬�������� �� �ﵽһ������̵�Ŀ�ġ�
	@Test
	public void test2() throws Exception {
		// String str = "007";
		// int i = Integer.parseInt(str);
		// System.out.println(i);
		
		Reader reader = new InputStreamReader(new FileInputStream("classname.properties"), "UTF-8");
		
		// ��ȡ�����ļ�
		Properties classProperties = new Properties();
		classProperties.load(reader);
		
		// �õ����ص���
		String className = classProperties.getProperty("className");
		
		// ����Java����
		Class classType = Class.forName(className);
		// Object obj = classType.newInstance();
		// System.out.println(obj);  // �ᱨ�� �� ��ǰ����û�пղι����� �� java ���䴴������ �� �ǻ���ÿղι�������
		Constructor con = classType.getConstructor(int.class,String.class);
		
		// ID,NAME  Ҳ��ȡ������
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
		Student stu = new Student(1,"��");
		System.out.println(stu);
	}

}
