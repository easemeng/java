package com.igeek.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		
		// FileReader �ַ�����������   FileWriter �ַ����������	ֻ�ܶ�ȡ�ĵ����� �� txt .docx
		
		// FileInputStream �ֽ�����������   FileOutputStream �ֽ����������� �� ע��  ���ʲô���ܶ� �� 
		
		long startTime = System.currentTimeMillis();
		// FileReader fr = new FileReader("����.xlsx");
		// FileWriter fw = new FileWriter("ss.xlsx");
		FileInputStream fr = new FileInputStream("E:/����Ӫ/day01/HD.mp4");
		FileOutputStream fw = new FileOutputStream("d:cang.mp4");
		int i = 0;
		byte [] c = new byte [1024];
		while((i = fr.read(c)) != -1){
			fw.write(c,0,i);
		}
		fw.close();
		fr.close();
		long time = System.currentTimeMillis() - startTime;
		System.out.println(time);

	}

}
