package com.igeek.day11.recursion;

public class Test3 {

	// �Լ������Լ� ������
	public static void main(String[] args) {

		int sum = getSum(100);
		System.out.println(sum);
	}

	public static int getSum(int sum) {
		// �ݹ�ĳ��� ��
		if (sum == 1) {
			return sum;
		}
		return sum + getSum(sum - 1);
	}

}