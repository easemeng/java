package com.igeek.day06;

public class Test07 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 4 };
		arrNum(arr);

	}

	public static void arrNum(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			sum++;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == sum) {
					count++;
				}
			}
			if(count == 0){
				return;
			}else
			System.out.println("数字" + sum + "出现了" + count + "次");
		}
	}

}
