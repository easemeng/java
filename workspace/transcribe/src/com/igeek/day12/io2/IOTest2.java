package com.igeek.day12.io2;

import java.io.FileOutputStream;

import org.junit.Test;

public class IOTest2 {
	
	@Test
	public void test3() throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/test1.txt");
		byte [] b = {-76, -13, -61, -64, -67, -83, -70, -2};
		fos.write(b, 2, 4);  // 从 b 数组中 ， 写入数据到 text1.txt 文件中 ， 从数组中下标为2的位置开始写，写4位
		fos.flush();
		fos.close();
	}
	
	// 字节输出流
	@Test
	public void test2() throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/test1.txt");
		byte [] b = {-76, -13, -61, -64, -67, -83, -70, -2};
		fos.write(b);
		fos.flush();
		fos.close();
	}
	
	// 字节输出流
	@Test
	public void test() throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/test1.txt");
		fos.write(97);  // 写入Unicode 编码  。  会写入这个编码所对应的字符
		fos.flush();
		fos.close();
	}

}
