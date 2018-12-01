package com.igeek.if1;

import java.util.Scanner;

public class TestIf6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入考试成绩:");
		int score = sc.nextInt();
		//多条件的我if  else else if 比较特殊  ，整个if 开始 到else 结束都看做一个整体 ，里面分支只会被执行1次。
		if(score<0 || score>100){
			System.out.println("你的成绩是错误的");
		}else if(score>=90 && score<=100){
			System.out.println("你的成绩属于优秀");//1
		}else if(score>=80 && score<=90){
			System.out.println("你的成绩属于好");//1
		}else if(score>=70 && score<80){
			System.out.println("你的成绩属于良");
		}else if(score>=60 && score<70){
			System.out.println("你的成绩属于及格");
		}else {
			System.out.println("你的成绩属于不及格");
		}

	}

}
