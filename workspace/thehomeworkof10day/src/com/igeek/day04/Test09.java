package com.igeek.day04;

import java.util.Random;
import java.util.Scanner;

public class Test09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("������༶��С������");
		int num = scanner.nextInt();
		System.out.println("������ÿ��ѧ��������");
		int num1 = scanner.nextInt();
		
		int count = 0;  //����������
		int sum = 0;  //
		int temp = 0;
		int[][] arrays = new int[num][num1];
		for(int i = 0;i < num;i++){
			int count1 = 0;
			int sum1 = 0;
			for(int j = 0;j < num1;j++){
				arrays[i][j] = random.nextInt(101);
//				System.out.println(arrays[i][j]);
				if(arrays[i][j] < 60){
					count++;
					count1++;
				}
				sum1 += arrays[i][j];
				sum += arrays[i][j];
			}
			System.out.println("��" + (i+1) + "�鲻��������Ϊ" + count1 + "��");
			System.out.println("��" + (i+1) + "��ƽ����Ϊ" + (sum1/num1));			
			if((sum1/num1) > temp){
				temp = sum1/num1;
			}
		}
		System.out.println("�M���ƽ���֞飺" + temp);
		System.out.println("�༶����������Ϊ��" + count);
		System.out.println("�༶ƽ����Ϊ��" + (sum / (num * num1)));
	}

}
