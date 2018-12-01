package com.igeek.day06;

public class Test10 {

	public static void main(String[] args) {
		
		num();

	}
	
	public static void num(){
		
		int temp = 0;
		int num1 = 1;
		int num2 = 2;
		int sum = 0;
		for(int i = 0;i < 20;i++){
												
			System.out.println(num2 + "/" + num1);
			
			sum += (num2/num1);
			
			temp = num1 + num2;						
			num1 = num2;
			num2 = temp;
						
		}
		System.out.println(sum);
	}

}
