package com.igeek.hello;

public class Hello4 {

	public static void main(String[] args) {
		//数据类型的转换 。
		//隐式转换 。(从小的数据类型，变成大的数据类型) 自动完成的 。
		byte b1 = 100;  //1  -128  -  127     1L
		
		int i1 = b1;  //  4L   
		
		System.out.println(i1);
		
		//强制转换(显示转换)。 (从大的数据类型，变成小的数据类型)  需要使用强制转换。
		
		int i2 = 128;//  4
		
		byte b2 = (byte)i2; // 1    数据溢出，精度降低。
		
		System.out.println(b2);
		
	}

}
