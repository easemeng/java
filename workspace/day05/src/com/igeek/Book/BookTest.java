package com.igeek.Book;

import java.util.Scanner;

public class BookTest {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int i =Integer.parseInt(str);// 
		
		double d = Double.parseDouble(str);//   6����
		
		// �Ȱ��ַ���  ׼�����ַ����� ��
		char [] c = str.toCharArray();
	}

}