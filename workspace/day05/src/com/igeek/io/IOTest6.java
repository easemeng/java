package com.igeek.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		//FileReader �ַ����������� FileWriter�ַ����������   ֻ�ܶ�ȡ�ĵ����� ��txt .docx
		
		//FileInputStream �ֽ����������  FileOutputStream �ֽ���������� �� ע�� ���ʲô���ܶ���
		//  010010101011   .avi   gaojing.avi   mp4   map3 jpeg png ...
		//  2G ...  
		//43255 û��ʹ�û�����������¡�
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
	}

}