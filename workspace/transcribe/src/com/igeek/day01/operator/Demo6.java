package com.igeek.day01.operator;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		int i = 10 ;//变量类型  变量名称 = 值；
		//从控制台输入三个数 ，然后求出这个三个数的最大值 。 用一个三元表达式搞定。
		Scanner sc = new Scanner(System.in);  //对象类型    对象名称 = 值；  new 出来的。
		System.out.println("请输入第一个内容:");
		int input1 = sc.nextInt();
		System.out.println("请输入第二个内容:");
		int input2 = sc.nextInt();
		System.out.println("请输入第三个内容:");
		int input3 = sc.nextInt();
		
		
		//int maxValue = ((input1>input2)?input1:input2)>input3?((input1>input2)?input1:input2):input3;
		
		int step1 = (input1>input2)?input1:input2;
		int maxValue = (step1>input3)?step1:input3;
		
		System.out.println(maxValue);
		
		
		
		
		int i2 = 10 ;//变量类型  变量名称 = 值；
		//从控制台输入三个数 ，然后求出这个三个数的最大值 。 用一个三元表达式搞定。
		Scanner sc2 = new Scanner(System.in);  //对象类型    对象名称 = 值；  new 出来的。
		System.out.println("请输入第一个内容:");
		int input4 = sc2.nextInt();
		System.out.println("请输入第二个内容:");
		int input5 = sc2.nextInt();
		System.out.println("请输入第三个内容:");
		int input6 = sc2.nextInt();
		
		
		//int maxValue2 = ((input4>input5)?input4:input5)>input6?((input4>input5)?input4:input5):input6;
		
		int step2 = (input4>input5)?input4:input5;
		int maxValue2 = (step2>input6)?step2:input6;
		
		System.out.println(maxValue2);
		
		
		
		
		int i3 = 10 ;//变量类型  变量名称 = 值；
		//从控制台输入三个数 ，然后求出这个三个数的最大值 。 用一个三元表达式搞定。
		Scanner sc3 = new Scanner(System.in);  //对象类型    对象名称 = 值；  new 出来的。
		System.out.println("请输入第一个内容:");
		int input7 = sc3.nextInt();
		System.out.println("请输入第二个内容:");
		int input8 = sc3.nextInt();
		System.out.println("请输入第三个内容:");
		int input9 = sc3.nextInt();
		
		
		//int maxValue3 = ((input7>input8)?input7:input8)>input9?((input7>input8)?input7:input8):input9;
		
		int step3 = (input7>input8)?input7:input8;
		int maxValue3 = (step3>input9)?step3:input9;
		
		System.out.println(maxValue3);
		
		
		
		
		int i4 = 10 ;//变量类型  变量名称 = 值；
		//从控制台输入三个数 ，然后求出这个三个数的最大值 。 用一个三元表达式搞定。
		Scanner sc4 = new Scanner(System.in);  //对象类型    对象名称 = 值；  new 出来的。
		System.out.println("请输入第一个内容:");
		int input11 = sc4.nextInt();
		System.out.println("请输入第二个内容:");
		int input12 = sc4.nextInt();
		System.out.println("请输入第三个内容:");
		int input13 = sc4.nextInt();
		
		
		//int maxValue4 = ((input11>input12)?input11:input12)>input13?((input11>input12)?input11:input12):input13;
		
		int step4 = (input11>input12)?input11:input12;
		int maxValue4 = (step4>input13)?step4:input13;
		
		System.out.println(maxValue4);
		
		
		
		
		int i5 = 10 ;//变量类型  变量名称 = 值；
		//从控制台输入三个数 ，然后求出这个三个数的最大值 。 用一个三元表达式搞定。
		Scanner sc5 = new Scanner(System.in);  //对象类型    对象名称 = 值；  new 出来的。
		System.out.println("请输入第一个内容:");
		int input21 = sc5.nextInt();
		System.out.println("请输入第二个内容:");
		int input22 = sc5.nextInt();
		System.out.println("请输入第三个内容:");
		int input23 = sc5.nextInt();
		
		
		//int maxValue5 = ((input21>input22)?input21:input22)>input23?((input21>input22)?input21:input22):input23;
		
		int step5 = (input21>input22)?input21:input22;
		int maxValue5 = (step5>input23)?step5:input23;
		
		System.out.println(maxValue5);
	}

}
