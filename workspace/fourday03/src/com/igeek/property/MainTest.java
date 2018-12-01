package com.igeek.property;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MainTest {

	public static void main(String[] args) {
		
		// Property  属性
		// Properties  属性集
		
		// Map m = new Properties();  // 向上转型 ， 只能调用Map接口中的方法
		// m 对象 只能调用  Map接口中有的方法
		Properties prop = new Properties();
		
		// .setProperty() 相当于 .put()
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
		
		// 遍历
		Set<String> keys = prop.stringPropertyNames();
		// .stringPropertyNames()  取得所有键值
		for (String string : keys) {
			String value = prop.getProperty(string);
			System.out.println(string + ":" + value);
		}

	}

}
