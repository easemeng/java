package com.igeek.io4;

import java.io.FileReader;

public class IOTest2 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("");
		
		int i = fr.read(); // h
		System.out.println(i); // h unicode ����  104
		System.out.println((char)i);
		
		int i2 = fr.read(); // e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); // ��read����ֵΪ-1  ֤��û������
		System.out.println(i3);
		
		int ch = 0;  // ����һ������int  �������ܶ�ȡ������������Ӧ��Unicode����
		while((ch = fr.read()) != -1){
			System.out.println((char)ch);
		}

	}

}
