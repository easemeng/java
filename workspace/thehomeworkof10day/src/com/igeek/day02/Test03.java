package com.igeek.day02;

import java.util.Scanner;

public class Test03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		String name = scanner.nextLine();
		System.out.println("��������");
		int age = scanner.nextInt();
		System.out.println("������ߣ�");
		int height = scanner.nextInt();
		
		System.out.println("�ҵ�������" + name + "������" + age + "�����" + height + "CM");
		
		

	}

}
