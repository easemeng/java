package com.igeek.day03;

import java.util.Scanner;

public class Test10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����빤�䣺");
		int seniority = scanner.nextInt();
		System.out.println("������������ʣ�");
		int basicWage = scanner.nextInt();
		
		int basicWage1 = 0;
		
		if(seniority >= 10 & seniority < 15){
			basicWage1 = basicWage + 5000;
			System.out.println("��Ŀǰ������" + seniority + "�꣬��������Ϊ" + basicWage + "Ԫ, Ӧ�ǹ���5000Ԫ,�Ǻ���" + basicWage1 + "Ԫ");
		}else if(seniority >= 5 & seniority < 10){
			basicWage1 = basicWage + 2000;
			System.out.println("��Ŀǰ������" + seniority + "�꣬��������Ϊ" + basicWage + "Ԫ, Ӧ�ǹ���2000Ԫ,�Ǻ���" + basicWage1 + "Ԫ");
		}else if(seniority >= 3 & seniority < 5){
			basicWage1 = basicWage + 1000;
			System.out.println("��Ŀǰ������" + seniority + "�꣬��������Ϊ" + basicWage + "Ԫ, Ӧ�ǹ���1000Ԫ,�Ǻ���" + basicWage1 + "Ԫ");
		}else if(seniority >= 1 & seniority < 3){
			basicWage1 = basicWage + 500;
			System.out.println("��Ŀǰ������" + seniority + "�꣬��������Ϊ" + basicWage + "Ԫ, Ӧ�ǹ���500Ԫ,�Ǻ���" + basicWage1 + "Ԫ");
		}else if(seniority >= 0 & seniority < 1){
			basicWage1 = basicWage + 200;
			System.out.println("��Ŀǰ������" + seniority + "�꣬��������Ϊ" + basicWage + "Ԫ, Ӧ�ǹ���200Ԫ,�Ǻ���" + basicWage1 + "Ԫ");
		}
				

	}

}
