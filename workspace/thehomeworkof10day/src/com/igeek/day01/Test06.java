package com.igeek.day01;

public class Test06 {

	public static void main(String[] args) {
		triangle();

	}
	
	public static void triangle(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
