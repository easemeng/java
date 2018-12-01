package com.igeek.practice;

import java.util.Scanner;

public class StringTest10 {
	
	// 反转字符串
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入字符串：");
		String str = scanner.nextLine();
		String result = reverse(str);
		System.out.println(result);

	}
	
	
	// 反转的功能封装到方法中
	public static String reverse(String str){
		char[] arrays = str.toCharArray();
		
		for(int i = 0;i < arrays.length/2;i++){  // 小于字符串长度的一半，小于字符串长度会反转再反转
			char temp = arrays[i];
			arrays[i] = arrays[arrays.length-i-1];
			arrays[arrays.length-i-1] = temp;
		}
		
		String result = new String(arrays);
		return result;
	}

}
