package com.igeek.homework;

public class ForPractice {

	public static void main(String[] args) {
		
	//	one();
	//	two();
	//	three();
	//	four();

	}
	
	public static void one(){
		int sum = 0;
		for(int i = 0;i < 100;i++){
			if(i % 2 != 0){
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	@SuppressWarnings("unused")
	public static void two(){
		int sum = 0;
		int count = 0;
		for(int i = 1;i < 100;i++){
			if(i % 7 == 0){
				System.out.println(i);
				count++;
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static void three(){
		
		for(int i = 100; i < 1000; i++){
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;
			
			if(a*a*a + b*b*b + c*c*c == i){
				System.out.println(i);
			}
		}
	}
	
	public static void four(){
				
		for(int i = 2; i <= 200 ; i++){
			boolean  flag = true;
			for(int j = 2; j < i ; j++){
				if(i % j == 0){
					flag = false;
					break;
				}
				}
			if(flag){
					System.out.println(i);
			}
		}
	}

}
