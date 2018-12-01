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
		
		// 从properties文件中获取数据
		
		// 1. 获得资源流
		Reader reader = new InputStreamReader(new FileInputStream("1.properties"), "UTF-8");
		
		// 2. 通过 Properties 对象加载流
		Properties props = new Properties();
		props.load(reader);
		
		// 3. 遍历所有
		for(String name : props.stringPropertyNames()){
			String value = props.getProperty(name);
			System.out.println(name + " : " + value);
		}
		
	}
	
	@Test
	public void demo02() throws Exception, Exception{
		
		// 将内容写入到文件
		// * Properties 对应一种特殊文件：* properties
		// * 一行表示一个键值对儿 ， 格式：k=v
		
		// 1. 创建对象
		Properties props = new Properties();
		
		// 2. 设置数据
		// props.put(key, value);
		props.setProperty("k01", "v01 极客营");
		props.setProperty("k02", "v02 程序员");
		props.setProperty("k03", "v03");
		
		// 3. 将props写入到硬盘
		Writer writer = new OutputStreamWriter(new FileOutputStream("1.properties"), "UTF-8");
		props.store(writer, "描述");
		writer.close();
	}

	@Test
	public void demo01(){
		
		// Properties 对象   特殊的 Map<String,String>
		
		// 1. 创建对象
		Properties props = new Properties();
		
		// 2. 设置数据
		// props.put(key, value);
		props.setProperty("k01", "v01");
		props.setProperty("k02", "v02");
		props.setProperty("k03", "v03");
		
		// 3. 获得指定名称的数据
		String prop = props.getProperty("k01");
		System.out.println(prop);
		
		// 4. 获得所有名称，并遍历获得所有数据
		Set<String> name = props.stringPropertyNames();
		for (String string : name) {
			String value = props.getProperty(string);
			System.out.println(string + " : " + value);
		}
	}

}
