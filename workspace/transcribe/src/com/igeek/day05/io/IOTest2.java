package com.igeek.day05.io;

import java.io.FileReader;

public class IOTest2 {

	public static void main(String[] args) throws Exception {

		//当 不指定路径的时候   会以当前类所在项目的根路径为准
		FileReader fr = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode 编码。104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //当read 返回值为-1 证明没有数据。
		System.out.println(i3);*/
		
		int ch = 0;//声明一个变量int 用来接受读取到的内容所对应的Unicode编码。
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		
		
		
		
		//当 不指定路径的时候   会以当前类所在项目的根路径为准
		FileReader fr2 = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode 编码。104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //当read 返回值为-1 证明没有数据。
		System.out.println(i3);*/
		
		int ch2 = 0;//声明一个变量int 用来接受读取到的内容所对应的Unicode编码。
		while((ch2=fr2.read())!=-1){
			System.out.println((char)ch2);
		}
		
		
		
		
		//当 不指定路径的时候   会以当前类所在项目的根路径为准
		FileReader fr3 = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode 编码。104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //当read 返回值为-1 证明没有数据。
		System.out.println(i3);*/
		
		int ch3 = 0;//声明一个变量int 用来接受读取到的内容所对应的Unicode编码。
		while((ch3=fr.read())!=-1){
			System.out.println((char)ch3);
		}
		
		
		
		
		//当 不指定路径的时候   会以当前类所在项目的根路径为准
		FileReader fr4 = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode 编码。104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //当read 返回值为-1 证明没有数据。
		System.out.println(i3);*/
		
		int ch4 = 0;//声明一个变量int 用来接受读取到的内容所对应的Unicode编码。
		while((ch4=fr.read())!=-1){
			System.out.println((char)ch4);
		}
		
		
		
		
		//当 不指定路径的时候   会以当前类所在项目的根路径为准
		FileReader fr5 = new FileReader("hello4.txt");
		
		/*int i = fr.read();//h
		System.out.println(i);//h  unicode 编码。104
		System.out.println((char)i);
		
		int i2 = fr.read();//e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); //当read 返回值为-1 证明没有数据。
		System.out.println(i3);*/
		
		int ch5 = 0;//声明一个变量int 用来接受读取到的内容所对应的Unicode编码。
		while((ch5=fr.read())!=-1){
			System.out.println((char)ch5);
		}
	}

}
