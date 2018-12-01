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

	// 测试 。 跟流相关的操作
	@Test
	public void test1() throws Exception {
		
		// 测试跟流相关的操作
		
		// 将 properties 集合中的内容，存入到指定的文件中
		Properties p = new Properties();
		
		p.setProperty("k01", "110");
		p.setProperty("k02", "120");
		p.setProperty("k03", "119");
		
		// 需要传入一个字节流对象 ， 然后指定要设置的编码集
		Writer writer = new OutputStreamWriter(new FileOutputStream("1.properties"),"UTF-8");
		
		// store 方法  需要传入一个 字符输出流对象
		p.store(writer, "输出的内容");
		
		writer.close();
	}
	
	@Test
	public void test() throws Exception {
		
		// 声明一个字符输入流
		Reader reader = new InputStreamReader(new FileInputStream("src/data.properties"),"UTF-8");
		
		// 创建集合对象 ， 用来接受读取到的数据
		Properties p = new Properties();
		p.load(reader);
		
		Set<String> keys = p.stringPropertyNames();
		
		for (String string : keys) {
			String value = p.getProperty(string);
			System.out.println(value);
		}
		
		// Bean 豆子		JavaBean 指的就是   一个类 然后私有属性 set/get
	}

}
