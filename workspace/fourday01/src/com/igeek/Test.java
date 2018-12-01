package com.igeek;

public class Test {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = (a + b > 2 ? a++:++b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);

	}

}
