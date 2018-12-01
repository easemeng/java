package com.igeek.day08.test03;

import java.util.ArrayList;
import java.util.Scanner;
//import org.apache.commons.lang.StringUtils;

public class Test03 {

	static ArrayList<Object> list = new ArrayList<Object>();

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Registe[] reg = new Registe[3];
		while (true) {
			System.out.println("1.注册     2.登陆     3.退出");
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				registe(reg);
				break;
			case 2:
				login(reg);
				break;
			case 3:
				System.exit(0);
			}
		}

	}

	@SuppressWarnings("resource")
	public static Registe[] registe(Registe[] reg) {
		Scanner scanner1 = new Scanner(System.in);

		for (int i = 0; i < reg.length; i++) {
			if (reg[i] == null) {
				System.out.println("请输入用户名：");
				String s1 = scanner1.nextLine();
				System.out.println("请输入密码：");
				String s2 = scanner1.nextLine();
				System.out.println("请输入出生日期：");
				String s3 = scanner1.next();
				System.out.println("请输入爱好：");
				String s4 = scanner1.next();
				reg[i] = new Registe(s1, s2, s3, s4);
				return reg;
			}
			if (reg[reg.length - 1] != null) {
				System.out.println("禁止注册！");
				return reg;
			}
		}
		// StringUntils.strip(reg.toString(),"[]");
		/*
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list); }
		 */
		return reg;
	}

	@SuppressWarnings({ "resource", "unused" })
	public static void login(Registe[] reg) {

		// Scanner scanner2 = new Scanner(System.in);
		// System.out.println("请输入用户名：");
		// String nm = scanner2.nextLine();
		// for (int i = 0; i < list.size(); i++) {
		// if (list.contains(nm)) {
		// System.out.println("请输入密码：");
		// String pw = scanner2.nextLine();
		// if (list.contains(pw)) {
		// System.out.println("登录成功！");
		// System.out.println(list.get(i));
		// break;
		// } else {
		// System.out.println("密码输入错误");
		// break;
		// }
		// } else {
		// System.out.println("该用户不存在");
		// break;
		// }
		// }
		//

		for (int i = 0; i < reg.length; i++) {
			Scanner scanner2 = new Scanner(System.in);
			if (reg[i] == null) {
				System.out.println("帐号或密码错误，请重新输入");
				break;
			}
			System.out.println("请输入用户名：");
			String nm = scanner2.nextLine();
			System.out.println("请输入密码：");
			String pw = scanner2.nextLine();
			if (nm.equals(reg[i].getName()) && pw.equals(reg[i].getPwd())) {
				System.out.println("登录成功");
				System.out.println("用户名：" + reg[i].getName());
				System.out.println("密码：" + reg[i].getPwd());
				System.out.println("出生日期：" + reg[i].getDate());
				System.out.println("爱好：" + reg[i].getHobbys());
				break;
			} else {
				System.out.println("帐号或密码错误，请重新输入");
				break;
			}

		}
	}
}
