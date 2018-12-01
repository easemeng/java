package com.igeek.practice;

public class StringTest6 {

	public static void main(String[] args) {
		
		String str = "HelloWorld";
		char[] chars = str.toCharArray();
		for(int i = 0;i < chars.length; i++){
			System.out.print(chars[i]);
		}
		System.out.println();
		
		String str1 = str.toUpperCase();
		System.out.println(str1);
		
		System.out.println(str);
		
		String str2 = str.toLowerCase();
		System.out.println(str2);
	}
}
