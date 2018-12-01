package com.igeek.class1;

import java.util.Arrays;

public class Test2 {

	public static void getArr(int[] arr){
		
		//Arrays
		int[] newarr=new int[arr.length];
		
		int o=0;//偶数的下标 。
		int j=0;//奇数的下标。
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){//这个数是偶数 。  //     2  4  6  8  10
				newarr[newarr.length-1-o]=arr[i];
				o++;
			}else{
				newarr[j]=arr[i];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(newarr));
	}

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		getArr(arr);

	}

}
