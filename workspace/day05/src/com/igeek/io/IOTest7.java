package com.igeek.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest7 {
	/**
	 * XXXXWriter  һ�����ַ������ 
	 * XXXXReader  һ�����ַ�������
	 * 
	 * XXXXInputStream  һ�����ֽ�������
	 * XXXXOutputStream һ�����ֽ������
	 * 
	 * buffered һ���ǻ�����������
	 * @param args
	 * @throws Exception
	 */
	//NIO ...
	public static void main(String[] args) throws Exception {
		Long startTime = System.currentTimeMillis();
		//FileReader fr = new FileReader("����.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr = new FileInputStream("c:/canglaoshi2.mp4");
		FileOutputStream fw = new FileOutputStream("c:/canglaoshi3.mp4");
		//��������������
		BufferedInputStream bi = new BufferedInputStream(fr);
		BufferedOutputStream bo = new BufferedOutputStream(fw);
		/*int i = 0;
		byte [] c = new byte [1024];
		while((i=bi.read(c))!=-1){
			bo.write(c, 0, i);
		}*/
		/*int i = 0;
		while((i=bi.read())!=-1){
			bo.write(i);
		}*/
		bo.close();
		bi.close();
		fw.close();
		fr.close();
		Long time = System.currentTimeMillis()-startTime;
		System.out.println(time);
	}

}
