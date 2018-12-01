package com.igeek.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class IOTest2 {
	
	@Test
	public void test2() {
		// ʹ���������������ļ��ĸ��� ��
		// �ַ��� �� Reader ... Writer .
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
		// ʹ���������������ļ��ĸ��� ��
		// �ַ��� �� Reader ... Writer .
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("e:/b.txt");
			fw = new FileWriter("e:/b(2).txt");
			// ��һ��д�ķ�ʽ ��  ֱ��ͨ�� int ���� ���洢Unicodeֵ����ɶ�д����
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
