package com.igeek.practice;

import java.util.UUID;

public class StringTest8 {

	public static void main(String[] args) {
		
		String str = "L-.-O-.-V-.-E-.-Q-.-M-.-Y";
		String newStr = str.trim();
		System.out.println(newStr);
		
		//
		String[] newStr1 = str.split("-.-");
		// ForEach 增强for循环  JDK 1.5之后才能使用 。 
		for(String Z:newStr1){
		System.out.println(Z);
		}
		
		UUID id = UUID.randomUUID();
		String uuid = id.toString().replace("-","");
		
		System.out.println(uuid);
	}

}
