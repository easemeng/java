package com.igeek.day08.zhengze;

public class Test3 {

	public static void main(String[] args) {
		
		//String regex = "a";
		//String regex = "\\";
		//String regex = "[abc]";
		//String regex = "[^abc]";
		//String regex = "[a-zA-Z]";
		//String regex = "[0-9]";
		//String regex = "[a-zA-Z_0-9]";
		//String regex = "\d [0-9]";
		//String regex = "\w [a-zA-Z_0-9]";
		//String regex = "\b[abc]\b";
		//String regex = "X?";
		//String regex = "X*";
		//String regex = "X+";
		//String regex = "X{n}";
		//String regex = "X{n,}";
		String regex = "X{1,3}";
		String str = "asXXda";
		boolean flag = str.matches(regex);
		System.out.println(flag);

	}

}
