package com.igeek.day03;

import java.util.Scanner;

public class Test01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int grade = scanner.nextInt();
		if(grade >= 90 & grade <= 100){
			System.out.println("����");
		}else if(grade >= 80 & grade < 90){
			System.out.println("��");
		}else if(grade >= 70 & grade < 80){
			System.out.println("����");
		}else if(grade >= 60 & grade < 70){
			System.out.println("����");
		}else if(grade >= 0 & grade < 60){
			System.out.println("������");
		}else{
			System.out.println("�ɼ���������");
		}

	}

}
