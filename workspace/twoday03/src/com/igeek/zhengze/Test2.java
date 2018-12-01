package com.igeek.zhengze;

public class Test2 {

	public static void main(String[] args) {
		
		// 要求  。 前8位为 0-9  a-zA-Z  之间的任意字符  。 @  固定格式  qq.com
		//String regex = a;
		//String str = "e";
		//System.out.println(str);
		//String regex = "[a-zA-Z]";
		//boolean flag = str.matches(regex);
		//System.out.println(flag);
		//"[a-zA-Z0-9]{8}@qq.com"
		
		// 对于特殊字符	使用的时候最好  	转义
		
		String str = "5+5";
		String [] s = str.split("\\+");
		for (String string : s) {
			System.out.println(string);
		}

	}

}
