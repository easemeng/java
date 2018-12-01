package com.igeek.io4;

import java.io.FileReader;

public class IOTest2 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("");
		
		int i = fr.read(); // h
		System.out.println(i); // h unicode 编码  104
		System.out.println((char)i);
		
		int i2 = fr.read(); // e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); // 当read返回值为-1  证明没有数据
		System.out.println(i3);
		
		int ch = 0;  // 声明一个变量int  用来接受读取到的内容所对应的Unicode编码
		while((ch = fr.read()) != -1){
			System.out.println((char)ch);
		}

	}

}
