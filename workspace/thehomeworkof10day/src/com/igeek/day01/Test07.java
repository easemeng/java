package com.igeek.day01;

//public class Test07 {
//
//	public static void main(String[] args) {
//		
//		int a = 0;
//		System.out.println(a);
//		{
//			int c = 20;
//			System.out.println(c);
//		}
//		int c = 30;
//		System.out.println(c);
//	}
//}

public class Test07 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x = 2;
		{
			int y = 6;
			System.out.println("x is " + x);
			System.out.println("y is " + y);
		}
		int y = x;
		System.out.println("x is " + x);
	}

	}


