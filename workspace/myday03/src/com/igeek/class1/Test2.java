package com.igeek.class1;

import java.util.Arrays;

public class Test2 {

	public static void getArr(int[] arr){
		
		//Arrays
		int[] newarr=new int[arr.length];
		
		int o=0;//ż�����±� ��
		int j=0;//�������±ꡣ
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){//�������ż�� ��  //     2  4  6  8  10
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
