package com.igeek.day03;

import java.util.Scanner;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		int grade = scanner.nextInt();
		if(grade >= 90 & grade <= 100){
			System.out.println("优秀");
		}else if(grade >= 80 & grade < 90){
			System.out.println("好");
		}else if(grade >= 70 & grade < 80){
			System.out.println("良好");
		}else if(grade >= 60 & grade < 70){
			System.out.println("及格");
		}else if(grade >= 0 & grade < 60){
			System.out.println("不及格");
		}else{
			System.out.println("成绩输入有误");
		}

	}

}
