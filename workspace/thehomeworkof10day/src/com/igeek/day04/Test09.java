package com.igeek.day04;

import java.util.Random;
import java.util.Scanner;

public class Test09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("请输入班级中小组数：");
		int num = scanner.nextInt();
		System.out.println("请输入每组学生数量：");
		int num1 = scanner.nextInt();
		
		int count = 0;  //不及格人数
		int sum = 0;  //
		int temp = 0;
		int[][] arrays = new int[num][num1];
		for(int i = 0;i < num;i++){
			int count1 = 0;
			int sum1 = 0;
			for(int j = 0;j < num1;j++){
				arrays[i][j] = random.nextInt(101);
//				System.out.println(arrays[i][j]);
				if(arrays[i][j] < 60){
					count++;
					count1++;
				}
				sum1 += arrays[i][j];
				sum += arrays[i][j];
			}
			System.out.println("第" + (i+1) + "组不及格人数为" + count1 + "人");
			System.out.println("第" + (i+1) + "组平均分为" + (sum1/num1));			
			if((sum1/num1) > temp){
				temp = sum1/num1;
			}
		}
		System.out.println("組最高平均分為：" + temp);
		System.out.println("班级不及格人数为：" + count);
		System.out.println("班级平均分为：" + (sum / (num * num1)));
	}

}
