package com.igeek.day08;

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		String sc = scanner.nextLine();
		char [] ch = new char[sc.length()];		
		for(int i = 0;i < sc.length();i++){
			ch[i] = sc.charAt(i);			
		}
		System.out.println(Arrays.toString(ch));
		for(int i = 0;i < sc.length();i++){
			if(ch[i] >= 97 & ch[i] <= 122){
				ch[i] = (char) (ch[i] - 32);
			}
		}
		System.out.println(Arrays.toString(ch));
		for(int i = 0;i < sc.length();i++){
			if(ch[i] >= 65 & ch[i] <= 90){
				ch[i] = (char) (ch[i] + 32);
			}
		}
		System.out.println(Arrays.toString(ch));
		for(int i = 0;i < sc.length();i++){
			if(ch[0] != ch[sc.length()-1]){
				char temp = ch[0];
				ch[0] = ch[sc.length()-1];
				ch[sc.length()-1] = temp;
			}
		}
		System.out.println(Arrays.toString(ch));
		for(int i = 0;i < sc.length();i++){
			if(i % 2 == 0){
				ch[i] = '~';
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
