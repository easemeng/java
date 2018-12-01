package com.igeek.hello;

public class Operator3 {

	public static void main(String[] args) {
		
		int a = 10;
		a+=20;//a+=20 等价于   a=a+20;
		a-=10;//等价于 a=a-10;
		a*=2;
		a/=4;  //自动完成强制转换 。
		System.out.println(a);
	}

}
