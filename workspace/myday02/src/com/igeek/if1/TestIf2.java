package com.igeek.if1;

public class TestIf2 {

	public static void main(String[] args) {
		System.out.println("开始");//1
		// 定义两个变量
		int a = 10;
		int b = 20;

		if (a == b) {
			System.out.println("a等于b");
		}

		int c = 10;
		if (a == c) {
			System.out.println("a等于c");//2
		}

		System.out.println("结束");//3

	}

}
