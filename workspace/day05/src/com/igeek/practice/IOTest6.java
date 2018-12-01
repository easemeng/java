package com.igeek.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		// FileReader 字符输入流对象  FileWriter 字符输出流对象  	只能读取文档类型   .txt  .docx
		
		// FileInputStream 字节流输入对象   FileOutputStream 字节流输出对象		注意  这个什么都能读。 
		//  010010101011   .avi  .mp4  .mp3  .jpeg  .png ...
		
		Long startTime = System.currentTimeMillis();
		//FileReader fr = new FileReader("数组.xlsx");
		//FileWriter fw = new FileWriter("SZ.xlsx");
		FileInputStream fr = new FileInputStream("");
		FileOutputStream fw = new FileOutputStream("");
		
		int i = 0;
		byte[] c = new byte[1024];
		while((i = fr.read(c)) != -1){
			fw.write(c,0,i);
		}
		
		fw.close();
		fr.close();
		
		Long time = System.currentTimeMillis() - startTime;
		System.out.println(time);

	}

}
