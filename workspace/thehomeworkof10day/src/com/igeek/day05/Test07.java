package com.igeek.day05;

import java.util.Scanner;

public class Test07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("��ѡ����Ҫ�����ֵ:1���������ܳ� 2��Բ���ܳ� 3����������� 4��Բ����� 5���˳�");
		int x = scanner.nextInt();
		switch(x){
		case 1:
			System.out.println("�����볤���εĳ��Ϳ�");
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			System.out.println(perimeter(a,b));
			break;
		case 2:
			System.out.println("������Բ�İ뾶��");
			double r = scanner.nextDouble();
			System.out.println(perimeter(r));
			break;
		case 3:
			System.out.println("�����볤���εĳ��Ϳ�");
			double a1 = scanner.nextDouble();
			double b1 = scanner.nextDouble();
			System.out.println(area(a1,b1));
			break;
		case 4:
			System.out.println("������Բ�İ뾶��");
			double r1 = scanner.nextDouble();
			System.out.println(area(r1));
			break;
		case 5:
			System.exit(0);
			default:
				System.out.println("������������������");
		}
		}		

	}
	
	public static double perimeter(double a,double b){
		
		double c = (a + b) * 2;
		return c;
		
	}
	
	public static double perimeter(double r){
		
		double c = r * 2 * Math.PI;
		return c;
		
	}
	
	public static double area(double a,double b){
		
		double s = a * b;
		return s;
		
	}
	
	public static double area(double r){
		
		double s = r * r * Math.PI;
		return s;
		
	}

}
