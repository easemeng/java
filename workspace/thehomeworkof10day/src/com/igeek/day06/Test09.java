package com.igeek.day06;

public class Test09 {

	public static void main(String[] args) {
		
		num1();
		num2();

	}
	
	public static void num1(){
		
		int count = 0;
		for(int i = 1;i < 501;i++){
			if(i % 2 == 0 & i % 5 == 0 & i % 7 == 0){
				System.out.print(i + " ");
				count++;
				if(count % 5 == 0){
					System.out.println("\n");
				}
			}
		}
		System.out.println("\n1-500之内能同时被2，5，7整除的数有" + count + "个");
	}
	
	public static void num2(){
		
		int sum = 0;
		for(int i = 0; i < 100; i++){
			if(i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
