package com.igeek.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		
		// FileReader 字符输入流对象   FileWriter 字符输出流对象	只能读取文档类型 。 txt .docx
		
		// FileInputStream 字节输入流对象   FileOutputStream 字节输入流对象 。 注意  这个什么都能读 。 
		
		long startTime = System.currentTimeMillis();
		// FileReader fr = new FileReader("数组.xlsx");
		// FileWriter fw = new FileWriter("ss.xlsx");
		FileInputStream fr = new FileInputStream("E:/极客营/day01/HD.mp4");
		FileOutputStream fw = new FileOutputStream("d:cang.mp4");
		int i = 0;
		byte [] c = new byte [1024];
		while((i = fr.read(c)) != -1){
			fw.write(c,0,i);
		}
		fw.close();
		fr.close();
		long time = System.currentTimeMillis() - startTime;
		System.out.println(time);

	}

}
