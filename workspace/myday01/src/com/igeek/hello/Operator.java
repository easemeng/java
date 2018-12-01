package com.igeek.hello;

public class Operator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//int a = 199;
		//注意 使用除法的时候，除数不能是0 ,会产生异常。
		//ArithmeticException 数学运算异常。
		//int b = a/100;//1.23
		//System.out.println(b);
		
		// 当取模运算的时候，被模数为负数的时候，模值为负数。
		//  
		int a = -5;
		int b = a % -2;
		System.out.println(b);
		
		
		float f = 314.15F; 
		double f2 = f / 100;
		System.out.println(f/100);
		
		int i = 100;
		System.out.println(i+"");
	}

}
