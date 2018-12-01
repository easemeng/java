package com.igeek.io3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest5 {

	// 实现文件的复制  从本地读取内容  再将文件写入到指定的地方
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("");
		FileWriter fw = new FileWriter("");
		
		int i = 0;
		char [] c = new char [1024];
		
		while((i = fr.read(c)) != -1){
			
			// 写数据
			fw.write(c,0,i);
		}
		
		// 注意  关闭流有个原则	最先时候的最后关闭 。 
		fw.close();
		fr.close();

	}

}
