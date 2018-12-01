package com.igeek.day08;

import java.util.Random;

public class Test07 {

	public static void main(String[] args) {
		
		char[] chs = new char[26];
		for(int i = 0; i < chs.length;i++){
			chs[i] = (char)('A' + i);
		}
		
		System.out.println(getStr(chs));

	}
	
	public static StringBuilder getStr(char[] chs) {
		
		Random random = new Random();
		StringBuilder strBuilder = new StringBuilder();
		
		for(int i = 0;i < 4;i++){
			strBuilder.append(chs[random.nextInt(26)]);
		}
		strBuilder.append(random.nextInt(10));
		return strBuilder;		
	}

}
