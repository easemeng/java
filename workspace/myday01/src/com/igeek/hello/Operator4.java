package com.igeek.hello;

public class Operator4 {

	public static void main(String[] args) {
		
		//  >  <   >=  <=   ==  != 
		
		System.out.println(3>4);//f
		System.out.println(4<5);//t
		System.out.println(3>=3);//t
		System.out.println(5<=5);//t
		
		System.out.println(10 == 1);//t
		
		System.out.println(10!=20);//t
		
		//逻辑运算符 是来连接，比较运算的。   3<x<5
		
		int x = 4;
		
		//& 逻辑与  | 逻辑或   ! 非     ^ 异或
		System.out.println(3<x&x<5);//true & true  
		
		// &   两边结果都为true 最终结果才是true  
		// |   两边有一边为true 最终结果就是true
		// !   !true  结果是false    !false 结果就是true
		
		//短路运算跟逻辑运算的区别 。
		//逻辑运算符 ，无论如何  右边都会参与运算 。 int x = 0;   x>3&x++>=1
		//短路运算，特定的情况下，右边不参与运算。(右边的代码不会被执行。)
		//  && 左边为false,右边不用计算了。  false
		//  || 左边为true，右边不用计算了。 true
		
		int a=0;
		int b=10;
		a+=b+=b+=b;
		System.out.println(a);
	}

}
