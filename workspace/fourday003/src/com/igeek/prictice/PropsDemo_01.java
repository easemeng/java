package com.igeek.prictice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class PropsDemo_01 {
	
	@Test
	public void demo03() throws Exception, Exception{
		
		// ��properties�ļ��л�ȡ����
		
		// 1. �����Դ��
		Reader reader = new InputStreamReader(new FileInputStream("1.properties"), "UTF-8");
		
		// 2. ͨ�� Properties ���������
		Properties props = new Properties();
		props.load(reader);
		
		// 3. ��������
		for(String name : props.stringPropertyNames()){
			String value = props.getProperty(name);
			System.out.println(name + " : " + value);
		}
		
	}
	
	@Test
	public void demo02() throws Exception, Exception{
		
		// ������д�뵽�ļ�
		// * Properties ��Ӧһ�������ļ���* properties
		// * һ�б�ʾһ����ֵ�Զ� �� ��ʽ��k=v
		
		// 1. ��������
		Properties props = new Properties();
		
		// 2. ��������
		// props.put(key, value);
		props.setProperty("k01", "v01 ����Ӫ");
		props.setProperty("k02", "v02 ����Ա");
		props.setProperty("k03", "v03");
		
		// 3. ��propsд�뵽Ӳ��
		Writer writer = new OutputStreamWriter(new FileOutputStream("1.properties"), "UTF-8");
		props.store(writer, "����");
		writer.close();
	}

	@Test
	public void demo01(){
		
		// Properties ����   ����� Map<String,String>
		
		// 1. ��������
		Properties props = new Properties();
		
		// 2. ��������
		// props.put(key, value);
		props.setProperty("k01", "v01");
		props.setProperty("k02", "v02");
		props.setProperty("k03", "v03");
		
		// 3. ���ָ�����Ƶ�����
		String prop = props.getProperty("k01");
		System.out.println(prop);
		
		// 4. ����������ƣ������������������
		Set<String> name = props.stringPropertyNames();
		for (String string : name) {
			String value = props.getProperty(string);
			System.out.println(string + " : " + value);
		}
	}

}
