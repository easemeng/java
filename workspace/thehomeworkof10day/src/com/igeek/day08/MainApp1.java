package com.igeek.day08;

public class MainApp1 {

	public static void main(String[] args) {

		String str = "javajfiewjavajfiowfjavagkljjava";
		System.out.println(countChar(str, 'j'));
		System.out.println(countString(str, "java"));
		System.out.println(str.length());

	}

	public static int countChar(String str, char c) {
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;		
			}
		}
		return count;
	}

	public static int countString(String str, String s) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(s) != -1) {
				str = str.replaceFirst(str, s);
				count++;
			}
		}
		return count;
	}
}
