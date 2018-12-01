package com.igeek.if1;

public class TestIf3 {

	public static void main(String[] args) {
		System.out.println("开始");//1
		// 判断给定的数据是奇数还是偶数
		// 定义变量
		int a = 100;
		// 给a重新赋值
		//a = 99;//

		if (a % 2 == 0) {
			System.out.println("a是偶数");//2
		} else {
			System.out.println("a是奇数");
		}

		System.out.println("结束");//3

	}

}
