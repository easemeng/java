package com.igeek.io1;

import java.io.FileReader;
import java.io.FileWriter;

public class IOTest5_1 {

	public static void main(String[] args) throws Exception {
		//创建输入输出流对象。
		FileReader fr = new FileReader("haha.txt");
		FileWriter fw = new FileWriter("hehe.txt");
		
		int c = 0;
		
		while((c=fr.read())!=-1){
			fw.write(c);
			fw.flush();
		}
		
		//最先使用最后关闭
		fw.close();
		fr.close();
	}

}
