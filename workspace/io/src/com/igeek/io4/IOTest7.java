package com.igeek.io4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOTest7 {

	/**
	 * XXXXWriter	һ�����ַ������
	 * XXXXReader	һ�����ַ�������
	 * 
	 * XXXXInputStream	һ�����ֽ�������
	 * XXXXOutputStream	һ�����ֽ������
	 * 
	 * buffered һ���ǻ�����������
	 * @param args
	 * @throws Exception 
	 * @throws Exception 
	 */
	// NIO
	public static void main(String[] args) throws Exception {
		
		long startTime = System.currentTimeMillis();
		// FileReader fr = new FileReader("����.xlsx");
		// FileWriter fw = new FileWriter("ss.xlsx");
		FileInputStream fr = new FileInputStream("");
		FileOutputStream fw = new FileOutputStream("");
		
		// ��������������
		BufferedInputStream bi = new BufferedInputStream(fr);
		BufferedOutputStream bo = new BufferedOutputStream(fw);
		
		/*int i = 0;
		byte [] c = new byte [1024];
		while((i = bi.read(c)) != -1){
			bo.write(c, 0, i);
		}*/
		
		/*int i = 0;
		while((i = bi.read()) != -1){
			bo.write(i);
		}*/
		
		bo.close();
		bi.close();
		fw.close();
		fr.close();
		
		long time = System.currentTimeMillis() - startTime;
		System.out.println(time);

	}

}
