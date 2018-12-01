package com.igeek.day06;

public class Test02 {

	public static void main(String[] args) {
		
		int sum = palindromic5(0);
		int sum1 = palindromic7(0);
		System.out.println(sum1-sum);

	}
	
	public static int palindromic5(int a){
		
		int count = 0;
		for(int i = 10000;i < 100000;i++){
			if(i / 10000 == i % 10 & (i / 1000) % 10 == (i % 100) / 10){
				count++;
			}
		}
		System.out.println(count);
		return count;
		
	}
	
	public static int palindromic7(int a){
		
		int count1 = 0;
		for(int i = 1000000;i < 10000000;i++){
			if(i / 1000000 == i % 10 && (i / 100000) % 10 == (i % 100) / 10 && (i / 10000) % 10 == (i % 1000) / 100){
				count1++;
			}
		}
		System.out.println(count1);
		return count1;
		
	}

}
