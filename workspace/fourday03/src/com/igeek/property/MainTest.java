package com.igeek.property;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {
		
		// Property  ����
		// Properties  ���Լ�
		
		// Map m = new Properties();  // ����ת�� �� ֻ�ܵ���Map�ӿ��еķ���
		// m ���� ֻ�ܵ���  Map�ӿ����еķ���
		Properties prop = new Properties();
		
		// .setProperty() �൱�� .put()
		prop.setProperty("k01", "110");
		prop.setProperty("k02", "120");
		prop.setProperty("k03", "119");
		
		Properties prop2 = new Properties();
		
		prop.setProperty("k01", "110");
		prop.setProperty("k02", "120");
		prop.setProperty("k03", "119");
		
		// System.out.println(prop == prop2);  // false
		
		// String k = prop.getProperty("k01");
		// System.out.println(k);
		
		// ����
		Set<String> keys = prop.stringPropertyNames();
		// .stringPropertyNames()  ȡ�����м�ֵ
		for (String string : keys) {
			String value = prop.getProperty(string);
			System.out.println(string + ":" + value);
		}

	}

}
