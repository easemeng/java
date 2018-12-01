package com.igeek.io1;

import java.io.FileWriter;

public class IOTest2 {

	public static void main(String[] args) throws Exception {
		//true 表示   追加内容。
		FileWriter fw = new FileWriter("d:/b.txt",true);
		
		//声明一个char [] 
		//char [] c = {'我','爱','你'};
		//fw.write(c);
		
		//fw.write(65); // 65 代表了unicode编码，其实写入的是编码所对应的字符。
		
		//fw.write(c, 1, 2);
		
		fw.write("哈哈呵呵",0, 2);
		fw.write("\r\n");
		
		
		
		fw.close();//
	}

}
