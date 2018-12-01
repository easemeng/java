package com.igeek.day05.io;

import java.io.FileReader;

public class IOTest4 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("hello3.txt");

		int i = 0;
		
		char[] c = new char[5];
		
		while((i=fr.read(c))!=-1){
			System.out.println(new String(c,0,i));
		}
		
		
		
		
		FileReader fr2 = new FileReader("hello3.txt");

		int i2 = 0;
		
		char[] c2 = new char[5];
		
		while((i2=fr2.read(c2))!=-1){
			System.out.println(new String(c2,0,i2));
		}
		
		
		
		
		FileReader fr3 = new FileReader("hello3.txt");

		int i3 = 0;
		
		char[] c3 = new char[5];
		
		while((i=fr.read(c))!=-1){
			System.out.println(new String(c,0,i));
		}
		
		
		
		
		FileReader fr4 = new FileReader("hello3.txt");

		int i4 = 0;
		
		char[] c4 = new char[5];
		
		while((i4=fr4.read(c4))!=-1){
			System.out.println(new String(c4,0,i4));
		}
		
		
		
		
		FileReader fr5 = new FileReader("hello3.txt");

		int i5 = 0;
		
		char[] c5 = new char[5];
		
		while((i=fr.read(c))!=-1){
			System.out.println(new String(c,0,i));
		}
	}

}
