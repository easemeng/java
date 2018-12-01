package com.igeek.day03;

import java.util.Scanner;

public class Test10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入工龄：");
		int seniority = scanner.nextInt();
		System.out.println("请输入基本工资：");
		int basicWage = scanner.nextInt();
		
		int basicWage1 = 0;
		
		if(seniority >= 10 & seniority < 15){
			basicWage1 = basicWage + 5000;
			System.out.println("您目前工作了" + seniority + "年，基本工资为" + basicWage + "元, 应涨工资5000元,涨后工资" + basicWage1 + "元");
		}else if(seniority >= 5 & seniority < 10){
			basicWage1 = basicWage + 2000;
			System.out.println("您目前工作了" + seniority + "年，基本工资为" + basicWage + "元, 应涨工资2000元,涨后工资" + basicWage1 + "元");
		}else if(seniority >= 3 & seniority < 5){
			basicWage1 = basicWage + 1000;
			System.out.println("您目前工作了" + seniority + "年，基本工资为" + basicWage + "元, 应涨工资1000元,涨后工资" + basicWage1 + "元");
		}else if(seniority >= 1 & seniority < 3){
			basicWage1 = basicWage + 500;
			System.out.println("您目前工作了" + seniority + "年，基本工资为" + basicWage + "元, 应涨工资500元,涨后工资" + basicWage1 + "元");
		}else if(seniority >= 0 & seniority < 1){
			basicWage1 = basicWage + 200;
			System.out.println("您目前工作了" + seniority + "年，基本工资为" + basicWage + "元, 应涨工资200元,涨后工资" + basicWage1 + "元");
		}
				

	}

}
