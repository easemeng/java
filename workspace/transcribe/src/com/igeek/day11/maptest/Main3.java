package com.igeek.day11.maptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main3 {

	public static void main(String[] args) {
		
		// 操作数组 。 工具类	Arrays
		int [] a = {1,23,456,4564,321,897,34,0,34,88,6,99};
		Arrays.sort(a);
		int b = Arrays.binarySearch(a, 23);
		// binarySearch(byte[] a, byte key)   使用二进制搜索算法搜索指定值的指定字节数组。
		System.out.println(b);
		// Arrays.toString(a);  // 主要用来将数组 转换成字符串输出 。 
		System.out.println(Arrays.toString(a));
		
		// 操作集合 。 工具类	Collections
		ArrayList<String> list = new ArrayList<String>();
		
		Collections.addAll(list, "诸葛琴魔","王朗","元首");
		
		System.out.println(list);
		
		// 计算一个数的和 。 
		
		int sum = test(10,20);
		System.out.println(sum);
		
		int [] arrs = {10,20};
		int sum2 = test1(arrs);
		System.out.println(sum2);

	}
	
	// 方法的可变参数 。  JDK 1.5 之后才被支持 。 
	// 注意   可变参数   不能写到前面 。 除非只需要传一个可变参数 。 
	// 注意 。 可变参数	会被当做数组来处理 。 有了可变参数之后 ， 我们对于参数不确定的情况下 ， 不用反复去定义多个重载的方法
	public static int test(int ... my){
		int sum = 0;
		for(int i = 0; i < my.length;i++){
			sum += my[i];
		}
		return sum;
	}
	
	// int ... my   等价于	int [] my	一样的
	public static int test1(int [] my){
		int sum = 0;
		for(int i = 0; i < my.length;i++){
			sum += my[i];
		}
		return sum;
	}
	
	public static int sum(int a){
		int sum = 0;
		sum += a;
		return sum;
	}
	
	public static int sum(int a,int b){
		int sum = 0;
		sum += a;
		sum += b;
		return sum;
	}

}
