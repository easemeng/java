package com.igeek.day05.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		//FileReader �ַ����������� FileWriter�ַ����������   ֻ�ܶ�ȡ�ĵ����� ��txt .docx
		
		//FileInputStream �ֽ����������  FileOutputStream �ֽ���������� �� ע�� ���ʲô���ܶ���
		Long startTime = System.currentTimeMillis();
		//FileReader fr = new FileReader("����.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr = new FileInputStream("E:/����Ӫ/day01/HD.mp4");
		FileOutputStream fw = new FileOutputStream("c:/canglaoshi.mp4");
		int i = 0;
		byte [] c = new byte [1024];
		while((i=fr.read(c))!=-1){
			fw.write(c, 0, i);
		}
		fw.close();
		fr.close();
		Long time = System.currentTimeMillis()-startTime;
		System.out.println(time);
		
		
		
		
		//FileReader �ַ����������� FileWriter�ַ����������   ֻ�ܶ�ȡ�ĵ����� ��txt .docx
		
		//FileInputStream �ֽ����������  FileOutputStream �ֽ���������� �� ע�� ���ʲô���ܶ���
		Long startTime1 = System.currentTimeMillis();
		//FileReader fr = new FileReader("����.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr1 = new FileInputStream("E:/����Ӫ/day01/HD.mp4");
		FileOutputStream fw1 = new FileOutputStream("c:/canglaoshi.mp4");
		int i1 = 0;
		byte [] c1 = new byte [1024];
		while((i1=fr1.read(c))!=-1){
			fw1.write(c1, 0, i1);
		}
		fw1.close();
		fr1.close();
		Long time1 = System.currentTimeMillis()-startTime1;
		System.out.println(time1);
		
		
		
		
		//FileReader �ַ����������� FileWriter�ַ����������   ֻ�ܶ�ȡ�ĵ����� ��txt .docx
		
		//FileInputStream �ֽ����������  FileOutputStream �ֽ���������� �� ע�� ���ʲô���ܶ���
		Long startTime2 = System.currentTimeMillis();
		//FileReader fr = new FileReader("����.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr2 = new FileInputStream("E:/����Ӫ/day01/HD.mp4");
		FileOutputStream fw2 = new FileOutputStream("c:/canglaoshi.mp4");
		int i2 = 0;
		byte [] c2 = new byte [1024];
		while((i=fr.read(c))!=-1){
			fw.write(c, 0, i);
		}
		fw.close();
		fr.close();
		Long time2 = System.currentTimeMillis()-startTime;
		System.out.println(time);
		
		
		
		
		//FileReader �ַ����������� FileWriter�ַ����������   ֻ�ܶ�ȡ�ĵ����� ��txt .docx
		
		//FileInputStream �ֽ����������  FileOutputStream �ֽ���������� �� ע�� ���ʲô���ܶ���
		Long startTime3 = System.currentTimeMillis();
		//FileReader fr = new FileReader("����.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr3 = new FileInputStream("E:/����Ӫ/day01/HD.mp4");
		FileOutputStream fw3 = new FileOutputStream("c:/canglaoshi.mp4");
		int i3 = 0;
		byte [] c3 = new byte [1024];
		while((i=fr.read(c))!=-1){
			fw.write(c, 0, i);
		}
		fw.close();
		fr.close();
		Long time3 = System.currentTimeMillis()-startTime;
		System.out.println(time);
		
		
		
		
		//FileReader �ַ����������� FileWriter�ַ����������   ֻ�ܶ�ȡ�ĵ����� ��txt .docx
		
		//FileInputStream �ֽ����������  FileOutputStream �ֽ���������� �� ע�� ���ʲô���ܶ���
		Long startTime4 = System.currentTimeMillis();
		//FileReader fr = new FileReader("����.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr4 = new FileInputStream("E:/����Ӫ/day01/HD.mp4");
		FileOutputStream fw4 = new FileOutputStream("c:/canglaoshi.mp4");
		int i4 = 0;
		byte [] c4 = new byte [1024];
		while((i=fr4.read(c))!=-1){
			fw.write(c, 0, i);
		}
		fw.close();
		fr.close();
		Long time4 = System.currentTimeMillis()-startTime;
		System.out.println(time4);
	}

}
