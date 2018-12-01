package com.igeek.practice;

@SuppressWarnings("unused")

public class StringTest {

	public static void main(String args) {
		
		// 字符串中的常用方法介绍
		
		// 创建字符串的集中方式
		
		
		String str1 = new String("hello");
		
		byte[] b1 = new byte[]{76,79,86,69};
		String str2 = new String(b1);
		System.out.println(str2);
		
		char[] c1 = new char[]{'Q','M','Y'};
		String str3 = new String(c1);
		System.out.println(str3);
		
		String str4 = "hello...";

	}

}
