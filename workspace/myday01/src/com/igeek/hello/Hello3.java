package com.igeek.hello;

public class Hello3 {

	public static void main(String[] args) {
		//声明变量(定义变量 )
		int a = 10;// 创建一个变量a,变量a的数据类型是int ，值是10;
		//变量顾名思义值是可以发生改变。
		++a;//++  表示变量自身+1  -- 表示变量自身-1
		int b = a++;
		
		//++ --  写在变量前，表示先自身加减，后参与运算。
		//++ --  写在变量后，表示先参与运算，后自身加减。
		
		// +  -  *    /   % 取模，取余数。
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
