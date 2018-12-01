package com.igeek.day04;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("请输入一个整数：");
		int a = scanner.nextInt();
		int[] arrays = new int[a];
		for(int i = 0; i < arrays.length; i++){
			arrays[i] = random.nextInt(10)+1;			
			if(arrays[i] > 5 & arrays[i] % 2 == 0){
				System.out.print(arrays[i] + "\t");
			}
			//System.out.println();
		}
		System.out.println("\n");
		for(int i = 0; i < arrays.length; i++){
			System.out.print(arrays[i] + "\t");
		}
		System.out.println();

	}

}
