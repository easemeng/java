package com.igeek.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class MainTest2 {

	// ���� �� ������صĲ���
	@Test
	public void test1() throws Exception {
		
		// ���Ը�����صĲ���
		
		// �� properties �����е����ݣ����뵽ָ�����ļ���
		Properties p = new Properties();
		
		p.setProperty("k01", "110");
		p.setProperty("k02", "120");
		p.setProperty("k03", "119");
		
		// ��Ҫ����һ���ֽ������� �� Ȼ��ָ��Ҫ���õı��뼯
		Writer writer = new OutputStreamWriter(new FileOutputStream("1.properties"),"UTF-8");
		
		// store ����  ��Ҫ����һ�� �ַ����������
		p.store(writer, "���������");
		
		writer.close();
	}
	
	@Test
	public void test() throws Exception {
		
		// ����һ���ַ�������
		Reader reader = new InputStreamReader(new FileInputStream("src/data.properties"),"UTF-8");
		
		// �������϶��� �� �������ܶ�ȡ��������
		Properties p = new Properties();
		p.load(reader);
		
		Set<String> keys = p.stringPropertyNames();
		
		for (String string : keys) {
			String value = p.getProperty(string);
			System.out.println(value);
		}
		
		// Bean ����		JavaBean ָ�ľ���   һ���� Ȼ��˽������ set/get
	}

}
