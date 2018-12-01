package com.igeek.day01.data5;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * short s1 = 10;
		 * short s2 = (short)(s1 + 10);
		 * 
		 * 就是强制转换和隐式转换的应用
		 */
		
		short s1 = 10;
		short s2 = s1 += 10;  // 等价于 s1+=10 等价于 s1=s1+=10  += -= *= /= %= 都不自动帮你完成强转

	}

}
