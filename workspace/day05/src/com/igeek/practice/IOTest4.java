package com.igeek.practice;

import java.io.FileReader;

public class IOTest4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("hello3.txt");
		
		int i = 0;
		
		char[] c = new char[5];
		
		while((i = fr.read(c)) != -1){
			System.out.println(new String(c,0,i));
		}
	}

}
