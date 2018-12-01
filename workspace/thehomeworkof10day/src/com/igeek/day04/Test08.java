package com.igeek.day04;

import java.util.Random;
import java.util.Scanner;

public class Test08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int sum = 0;
		int count = 0;
		System.out.println("请输入班级人数：");
		int num = scanner.nextInt();
		int[] arrays = new int[num];
		for(int i = 0;i < arrays.length;i++){
			arrays[i] = random.nextInt(101);
			System.out.print(arrays[i] + " ");
			if(arrays[i] < 60){
				count++;
			}
			sum += arrays[i];
		}
		System.out.println();
		System.out.println("不及格人数：" + count);
		System.out.println("班级平均分：" + (sum/num));

	}

}
