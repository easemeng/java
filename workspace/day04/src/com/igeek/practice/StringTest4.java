package com.igeek.practice;

public class StringTest4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String str = "七夕-Love-虐狗";
		String[] str1 = {"7","7","3","3","9","7"};
		
		//System.out.println(str.length());
		//length...
		//System.out.println(str1.length);
		
		// 输入指定的字符串	返回出现的下标
		String str2 = "19970303Y";
		//System.out.println(str2.indexOf(89));
		//System.out.println(str2.indexOf("0303"));
		//System.out.println(str2.indexOf("Y",5));
		
		// 字符串的截取
		String newstr2 = str2.substring(4);
		System.out.println(newstr2);
		// 包括开始的下标  但不包括结束的下标 。 这是他截取的内容。
		String newstr21 = str2.substring(0, 8);
		System.out.println(newstr21);
		
		// 遍历字符串 . 
		for(int i = 0;i < str2.length();i++){
			System.out.print(str2.charAt(i));
		}

	}

}
