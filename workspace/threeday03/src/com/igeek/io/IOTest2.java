package com.igeek.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class IOTest2 {
	
	@Test
	public void test2() {
		// 使用输入输出流完成文件的复制 。
		// 字符流 。 Reader ... Writer .
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("e:/b.txt");
			fw = new FileWriter("e:/b(2).txt");
			char [] c = new char[1024];
			int i = 0;
			// c = {'B','C'}  i = 2   2 != -1
			//       0   1    2
			// {BCDvi.}
			while((i = fr.read(c)) != -1){
				fw.write(c, 0, i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void test() {
		// 使用输入输出流完成文件的复制 。
		// 字符流 。 Reader ... Writer .
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("e:/b.txt");
			fw = new FileWriter("e:/b(2).txt");
			// 第一种写的方式 ，  直接通过 int 变量 来存储Unicode值来完成读写操作
			int i = 0;
			while((i = fr.read()) != -1){
				fw.write(i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
