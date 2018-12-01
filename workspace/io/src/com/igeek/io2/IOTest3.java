package com.igeek.io2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOTest3 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("");
		
		char [] c = new char [5];
		
		int i = fr.read(c); // 此时i的返回值  是数组长度 。
		System.out.println(i);
		System.out.println(c);  // c 数组中的内容  当前c对象的类型  char []
		System.out.println(new String(c,0,i));
		
		int i2 = fr.read(c); // 此时i的返回值  是数组长度 。
		System.out.println(i2);
		System.out.println(c);  // c 数组中的内容  当前c对象的类型  char []
		System.out.println(new String(c,0,i2));

	}

}
