package com.igeek.day05;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
				
		Random random = new Random();
		int i = random.nextInt(100)+1;
		int j = random.nextInt(100)+1;
		System.out.println(add(i,j));

	}
	
	public static int add(int i,int j){
				
		System.out.println(i);
		System.out.println(j);
		
		int sum = 0;
		sum = i + j;
		
		return sum;

	}

}
