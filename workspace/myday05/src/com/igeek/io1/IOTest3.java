package com.igeek.io1;

import java.io.FileReader;

public class IOTest3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		//文件输入流 。  把资源的数组   读取到java程序 。
		FileReader fr = new FileReader("d:/b.txt");
		//b.txt 表示当项目的跟路径下查找 。、d:/b.txt 表示到计算机硬盘中查找。
		
		int i = fr.read();//每调用依次read方法表示读取一个字符 。  
		//read()方法的返回值  就是这个字符的unicode编码。
		
		//System.out.println(i);
		
		System.out.println((char)i);
		
		int i2 = fr.read();
		//System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read();
		//System.out.println(i3);
		System.out.println((char)i3);
		
		//当read()返回-1的时候，表示没有读取到任何内容。
		char [] c = new char [5];//"\u0000"   " " 
		//fr.read(c); //调用read(char [] cbuf) 方法的时候，数组的长度是多少个 就往里写多少个字符。
		// 当调用read()方法的时候，会接着上次读取的位置，继续往后读。
		
		fr.read(c, 0, 3);// 第一个参数 c  表示要存数据的数组 。   第二个参数  表示从数组的第几个下标开始存   第三个参数 表示要写入多少个。
		
		for (char sb : c) {
			System.out.println(sb);
		}
	}

}
