package com.igeek.day04.string;

import java.util.UUID;

public class StringTest8 {

	public static void main(String[] args) {
		String str = "haha-.-abcdef-.-eee-.-ddd-.-zeze-123";
		String newStr = str.trim();
		System.out.println(newStr);
		
		//
		String[] newStr2 = str.split("-.-");
		//ForEach 增强for循环 JDK 1.5之后才能用的。
		for(String sb:newStr2){
			System.out.println(sb);
		}
		
		UUID id = UUID.randomUUID();
		String uuid = id.toString().replace("-", "");
		
		System.out.println(uuid);
		
		
		
		
		String str2 = "haha-.-abcdef-.-eee-.-ddd-.-zeze-123";
		String newStr21 = str.trim();
		System.out.println(newStr21);
		
		String[] newStr22 = str2.split("-.-");
		//ForEach 增强for循环 JDK 1.5之后才能用的。
		for(String sb:newStr22){
			System.out.println(sb);
		}
		
		UUID id2 = UUID.randomUUID();
		String uuid2 = id2.toString().replace("-", "");
		
		System.out.println(uuid2);
		
		
		
		
		String str3 = "haha-.-abcdef-.-eee-.-ddd-.-zeze-123";
		String newStr31 = str3.trim();
		System.out.println(newStr31);
		
		String[] newStr32 = str3.split("-.-");
		//ForEach 增强for循环 JDK 1.5之后才能用的。
		for(String sb:newStr32){
			System.out.println(sb);
		}
		
		UUID id3 = UUID.randomUUID();
		String uuid3 = id3.toString().replace("-", "");
		
		System.out.println(uuid3);
		
		
		
		
		String str4 = "haha-.-abcdef-.-eee-.-ddd-.-zeze-123";
		String newStr41 = str4.trim();
		System.out.println(newStr41);
		
		//
		String[] newStr42 = str4.split("-.-");
		//ForEach 增强for循环 JDK 1.5之后才能用的。
		for(String sb:newStr42){
			System.out.println(sb);
		}
		
		UUID id4 = UUID.randomUUID();
		String uuid4 = id4.toString().replace("-", "");
		
		System.out.println(uuid4);
		
		
		
		
		String str5 = "haha-.-abcdef-.-eee-.-ddd-.-zeze-123";
		String newStr51 = str5.trim();
		System.out.println(newStr51);
		
		String[] newStr52 = str.split("-.-");
		//ForEach 增强for循环 JDK 1.5之后才能用的。
		for(String sb:newStr52){
			System.out.println(sb);
		}
		
		UUID id5 = UUID.randomUUID();
		String uuid5 = id5.toString().replace("-", "");
		
		System.out.println(uuid5);
	}

}
