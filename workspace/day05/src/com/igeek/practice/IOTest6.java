package com.igeek.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		// FileReader �ַ�����������  FileWriter �ַ����������  	ֻ�ܶ�ȡ�ĵ�����   .txt  .docx
		
		// FileInputStream �ֽ����������   FileOutputStream �ֽ����������		ע��  ���ʲô���ܶ��� 
		//  010010101011   .avi  .mp4  .mp3  .jpeg  .png ...
		
		Long startTime = System.currentTimeMillis();
		//FileReader fr = new FileReader("����.xlsx");
		//FileWriter fw = new FileWriter("SZ.xlsx");
		FileInputStream fr = new FileInputStream("");
		FileOutputStream fw = new FileOutputStream("");
		
		int i = 0;
		byte[] c = new byte[1024];
		while((i = fr.read(c)) != -1){
			fw.write(c,0,i);
		}
		
		fw.close();
		fr.close();
		
		Long time = System.currentTimeMillis() - startTime;
		System.out.println(time);

	}

}
