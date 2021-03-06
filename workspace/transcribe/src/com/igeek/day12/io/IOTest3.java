package com.igeek.day12.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class IOTest3 {

	@Test
	public void test2() throws Exception {
		FileReader fr = new FileReader("e:/b.txt");
		// FileWriter fw = new FileWriter("e:/buffer(1).txt");
		// 输入缓冲流
		BufferedReader br = new BufferedReader(fr);
		// 输出缓冲流
		// BufferedWriter bw = new BufferedWriter(fw);

		String gm = br.readLine();  // readLine()  读一行文字
		String hd = br.readLine();
		System.out.println(gm);
		System.out.println(hd);
		//
		br.close();
		fr.close();
	}

	@Test
	public void test() throws Exception {
		// 缓冲流还是要依赖原始的流对象 。
		// 字符缓冲流
		// FileReader fr = new FileReader("e:/b.txt");
		FileWriter fw = new FileWriter("e:/buffer(1).txt");
		// 输入缓冲流
		// BufferedReader br = new BufferedReader(fr);
		// 输出缓冲流
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("蛊梦");
		bw.newLine();
		bw.write("化蝶");
		// bw.flush();

		// 加快读写速度 ， 并且新增了换行方法 。。。

		bw.close();
		fw.close();
	}

}
