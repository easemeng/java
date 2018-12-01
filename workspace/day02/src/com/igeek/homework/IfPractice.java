package com.igeek.homework;

import java.util.Scanner;

public class IfPractice {

	public static void main(String[] args) {
		
//		one();
		two();
	}
	
	@SuppressWarnings("resource")
	public static void one(){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("请输入成绩(1~100)：");
		
		int i = sc.nextInt();
		
		if(i > 100){
			System.out.println("请认真对待你的成绩");
		}else if(i == 100){
			System.out.println("恭喜获得BWM一辆！");
		}else if(i > 80 & i <= 99){
			System.out.println("恭喜获得iPhoneX一台！");
		}else if(i >= 60){
			System.out.println("送你一本参考书，再接再厉！");
		}else{
			System.out.println("不要灰心，下次继续努力！");
		
		}
	}
	
	@SuppressWarnings("resource")
	public static void two(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入第一个整数：");
		int num1 = scanner.nextInt();
		System.out.println("num1=" + num1);
		System.out.println("请输入第二个整数：");
		int num2 = scanner.nextInt();
/*		if(num2 == num1){
			System.out.println("输入重复，请重新输入");
		}else{*/
		System.out.println("num2=" + num2);
//		}
		System.out.println("请输入第三个整数：");
		int num3 = scanner.nextInt();
		/*if(num3 == num1 || num3 == num2){
			System.out.println("输入重复，请重新输入");
		}else{*/
		System.out.println("num3=" + num3);
//		}
		
		if(num1 > num2 & num2 > num3){
			System.out.println("num3" + "<" + "num2" + "<" + "num1");
		}else if(num3 > num2 & num1 > num3){
			System.out.println("num2" + "<" + "num3" + "<" + "num1");
		}else if(num1 > num2 & num1 < num3){
			System.out.println("num2" + "<" + "num1" + "<" + "num3");
		}else if(num1 < num2 & num3 > num2){
			System.out.println("num1" + "<" + "num2" + "<" + "num3");
		}else if(num3 < num2 & num1 < num3){
			System.out.println("num1" + "<" + "num3" + "<" + "num2");
		}else{
			System.out.println("num3" + "<" + "num1" + "<" + "num2");
		}
		
		
		
	}

}
