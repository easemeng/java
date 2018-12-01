package com.igeek.homework;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
	//	one();
	//	two();
	//	three();
	//	four();
	//	five();
	//	six();
		seven();
	}
	
	@SuppressWarnings("resource")
	public static void one(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("输入一个小写字母");
		char i = scanner.next().charAt(0);
		
		switch (i) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		case 'e':
			System.out.println("E");
			break;

		default:
			System.out.println("Other");
			break;
		}
		
		}
	
	
	@SuppressWarnings("resource")
	public static void two(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入成绩");
		
		int i = scanner.nextInt();
		switch (i / 10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不合格");
			break;

		default:
			System.out.println("合格");
			break;
		}
		}
	
	@SuppressWarnings("resource")
	public static void three(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入月份：");
		int i = scanner.nextInt();
		switch(i){
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
			default:
				System.out.println("请输入正确的月份");
		}
	}
	
	@SuppressWarnings("resource")
	public static void four(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入2014年的月份：");
		int i = scanner.nextInt();
		System.out.println("请输入日期：");
		int j = scanner.nextInt();
		int sum = 0;
		
		switch(i){
		case 12:
			sum += 30;
		case 11:
			sum += 31;
		case 10:
			sum += 30;
		case 9:
			sum += 31;
		case 8:
			sum += 31;
		case 7:
			sum += 30;
		case 6:
			sum += 31;
		case 5:
			sum += 30;
		case 4:
			sum += 31;
		case 3:
			sum += 28;
		case 2:
			sum += 31;
		case 1:
			sum += j;
		}
		
		System.out.println("2014年" + i + "月" + j + "日是2014年第" + sum + "天");
		
		
	}
	
	public static void five(){
		
		int a = 3;
		int x = 100;
		
		switch (a) {
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;

		default:
			x += 34;
			break;
		}
		System.out.println(x);
	}
	
	@SuppressWarnings("resource")
	public static void six(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入成绩：");
		int score = scanner.nextInt();
		switch(score/10){
		case 10:
		case 9:
			System.out.println("等级：A");
			break;
		case 8:
		case 7:
			System.out.println("等级: B");
			break;
		case 6:
			System.out.println("等级: C");
			break;
			default:
				System.out.println("等级：D");
				break;
		}
	}
	
	@SuppressWarnings("resource")
	public static void seven(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入年份：");
		int k = scanner.nextInt();
		System.out.println("请输入月份：");
		int i = scanner.nextInt();
		System.out.println("请输入日期：");
		int j = scanner.nextInt();
		int sum = 0;
		
		switch(i){
		case 12:
			sum += 30;
		case 11:
			sum += 31;
		case 10:
			sum += 30;
		case 9:
			sum += 31;
		case 8:
			sum += 31;
		case 7:
			sum += 30;
		case 6:
			sum += 31;
		case 5:
			sum += 30;
		case 4:
			sum += 31;
		case 3:
			if(k % 4 == 0 && k % 100 != 0 || k % 400 == 0){
				sum += 29;
			}else{
				sum += 28;
			}
		case 2:
			sum += 31;
		case 1:
			sum += j;
		
		}
		
		System.out.println(k + "年" + i + "月" + j + "日是" + k + "年第" + sum + "天");
	
	}

}
