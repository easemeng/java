package com.igeek.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

@SuppressWarnings("unused")
public class IOTest2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		// �� ��ָ��·����ʱ��		���Ե�ǰ��������Ŀ�ĸ�·��Ϊ׼
		FileReader fr = new FileReader("hello4.txt");
		
		/*int i = fr.read(); //h
		System.out.println(i); // h Unicode ���� ��  104
		System.out.println((char)i);
		
		int i2 = fr.read(); //e
		System.out.println(i2);
		System.out.println((char)i2);
		
		int i3 = fr.read(); // �� read ����ֵΪ -1 ֤��û������ �� 
		System.out.println(i3);*/
		
		int ch = 0; // ����һ������ int �������ܶ�ȡ������������Ӧ��Unicode����
		while((ch = fr.read()) != -1){
			System.out.println((char)ch);
		}

	}

}
