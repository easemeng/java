package com.igeek.Book;

import java.util.Scanner;

public class BookTest {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int i =Integer.parseInt(str);// 
		
		double d = Double.parseDouble(str);//   6个。
		
		// 先把字符串  准换成字符数组 。
		char [] c = str.toCharArray();
	}

}
