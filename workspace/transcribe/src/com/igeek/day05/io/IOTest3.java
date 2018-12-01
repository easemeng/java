package com.igeek.day05.io;

import java.io.FileReader;

public class IOTest3 {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("hello3.txt");
		
		char [] c = new char [5];
		
		int i = fr.read(c);//此时i的返回值 是数组长度 。
		System.out.println(i);
		System.out.println(c);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c,0,i));
		
		int i2 = fr.read(c);//此时i的返回值 是数组长度 。
		System.out.println(i2);
		System.out.println(c);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c,0,i2));
		
		
		
		
		FileReader fr2 = new FileReader("hello3.txt");
		
		char [] c2 = new char [5];
		
		int i3 = fr2.read(c2);//此时i的返回值 是数组长度 。
		System.out.println(i3);
		System.out.println(c2);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c,0,i));
		
		int i4 = fr2.read(c2);//此时i的返回值 是数组长度 。
		System.out.println(i4);
		System.out.println(c2);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c2,0,i4));
		
		
		
		
		FileReader fr3 = new FileReader("hello3.txt");
		
		char [] c3 = new char [5];
		
		int i5 = fr.read(c);//此时i的返回值 是数组长度 。
		System.out.println(i);
		System.out.println(c);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c,0,i));
		
		int i6 = fr.read(c);//此时i的返回值 是数组长度 。
		System.out.println(i2);
		System.out.println(c);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c,0,i2));
		
		
		
		
		FileReader fr4 = new FileReader("hello3.txt");
		
		char [] c4 = new char [5];
		
		int i7 = fr.read(c);//此时i的返回值 是数组长度 。
		System.out.println(i);
		System.out.println(c);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c,0,i));
		
		int i8 = fr.read(c);//此时i的返回值 是数组长度 。
		System.out.println(i2);
		System.out.println(c);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c,0,i2));
		
		
		
		
		FileReader fr5 = new FileReader("hello3.txt");
		
		char [] c5 = new char [5];
		
		int i11 = fr.read(c);//此时i的返回值 是数组长度 。
		System.out.println(i);
		System.out.println(c);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c,0,i));
		
		int i12 = fr.read(c);//此时i的返回值 是数组长度 。
		System.out.println(i2);
		System.out.println(c);//c 数组中内容啊 。  注意当前c对象是什么类型？？？ char [] 
		System.out.println(new String(c,0,i2));
	}

}
