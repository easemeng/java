package com.igeek.day08;

import java.util.Scanner;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��QQ��");
		String qq = scanner.nextLine();
		checkQQ(qq);

	}

	public static void checkQQ(String qq) {

		if (qq.length() >= 5 & qq.length() <= 12) {
			if (qq.substring(0, 1).equals("0")) {
				System.out.println("����ĸ����Ϊ0");
			}
		} else {
			System.out.println("������5-12λ����");
		}
	}

}
