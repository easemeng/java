package com.igeek.io1;

import java.io.FileWriter;

public class IOTest1 {

	public static void main(String[] args) throws Exception {
		//IO  输入输出流   。 (InputStream   OutputStream)
		//  从资源到你的java程序 。 输入   
		//  从java程序到你要访问的资源 。 输出 
		
		//IO   字节流    XxxxInputStream  XxxxOutputStream  (可以读取任意后缀 。)
		//     字符流    XxxxReader   XxxxxWriter (只能读取文档类型。)
		
		FileWriter fw = new FileWriter("d:/a.txt",true);
		
		fw.write("\r\n");
		fw.write("\n");
		fw.write("\r");
		
		fw.write("abc123");//向文件中写入内容。
		
		fw.flush();//将内存中的数据，写入到硬盘中
		
		fw.write("哈哈123");
		
		fw.flush();
		
		fw.close();
	}

}
