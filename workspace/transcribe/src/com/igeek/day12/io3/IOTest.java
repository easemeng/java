package com.igeek.day12.io3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class IOTest {
	
	@Test
	public void test2() throws Exception{
		FileInputStream fis = new FileInputStream("e:/obj.txt");
		// 序列化对象 。 
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();  // readObject()  从ObjectInputStream读取一个对象。 
		Person p = (Person) obj;
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
	
	@Test
	public void test() throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/obj.txt");
		// 对象
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Person p = new Person("Tim",20);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		fos.close();
		
	}

}
