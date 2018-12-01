package com.igeek.arrs;

public class TestArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 数组 。 存储数据的。

		// java中数据的声明格式 。

		//数组的动态创建方式。
		int[] arrays = new int[3];
		arrays[0] = 10;
		arrays[1] = 20;
		arrays[2] = 30;  //数组.length - 1  就是数组的最大下标。
		
		//arrays[3] = 40;//ArrayIndexOutOfBoundsException 数组下标越界异常。
		
		
		//数组的第二种创建方式。静态创建方式。
		int [] arrays2 = new int []{2,3,5,7};
		//可以简写成  一下方式；
		int [] arrays3 = {2,3,5,7};
		
		
		System.out.println(arrays.length);//数组的长度 使用对象.length 来表示。
		System.out.println(arrays2.length);
		System.out.println(arrays3.length);
		
		//数组存储数据存在缺点 。  1.一旦数组被创建 长度不能被改变 。 2.数组中的数据类型必须一致。
		String [] strs = {"a","b","c"};
		
		
	}

}
