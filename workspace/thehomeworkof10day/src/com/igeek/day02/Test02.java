package com.igeek.day02;

import java.util.Scanner;

public class Test02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("����ɼ���");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String flag = (num >= 60)?"����":"������";
		System.out.println(flag);

	}

}
