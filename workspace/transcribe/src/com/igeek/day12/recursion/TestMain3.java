package com.igeek.day12.recursion;

public class TestMain3 {

	public static void main(String[] args) {
		
		// ʹ�õݹ����׳� �� 
		
		// �ݹ������Ч�ʿ϶����� �� ѭ�� �� 
		
		int sum = getSum(5);  // 5*4*3*2*1
		System.out.println(sum);

	}
	
	// StackOverflowError	2
	public static int getSum(int i){
		if(i == 1){
			return 1;
		}
		// 6		2		1
		// 5 * getSum(4) * getSum(3) * getSum(2) * getSum(1); //1
		return i * getSum(i - 1);
	}

}
