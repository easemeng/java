package com.igeek.io2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOTest3 {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("");
		
		char [] c = new char [5];
		
		int i = fr.read(c); // ��ʱi�ķ���ֵ  �����鳤�� ��
		System.out.println(i);
		System.out.println(c);  // c �����е�����  ��ǰc���������  char []
		System.out.println(new String(c,0,i));
		
		int i2 = fr.read(c); // ��ʱi�ķ���ֵ  �����鳤�� ��
		System.out.println(i2);
		System.out.println(c);  // c �����е�����  ��ǰc���������  char []
		System.out.println(new String(c,0,i2));

	}

}
