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
			System.out.println("1.ע��     2.��½     3.�˳�");
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
				System.out.println("�������û�����");
				String s1 = scanner1.nextLine();
				System.out.println("���������룺");
				String s2 = scanner1.nextLine();
				System.out.println("������������ڣ�");
				String s3 = scanner1.next();
				System.out.println("�����밮�ã�");
				String s4 = scanner1.next();
				reg[i] = new Registe(s1, s2, s3, s4);
				return reg;
			}
			if (reg[reg.length - 1] != null) {
				System.out.println("��ֹע�ᣡ");
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
		// System.out.println("�������û�����");
		// String nm = scanner2.nextLine();
		// for (int i = 0; i < list.size(); i++) {
		// if (list.contains(nm)) {
		// System.out.println("���������룺");
		// String pw = scanner2.nextLine();
		// if (list.contains(pw)) {
		// System.out.println("��¼�ɹ���");
		// System.out.println(list.get(i));
		// break;
		// } else {
		// System.out.println("�����������");
		// break;
		// }
		// } else {
		// System.out.println("���û�������");
		// break;
		// }
		// }
		//

		for (int i = 0; i < reg.length; i++) {
			Scanner scanner2 = new Scanner(System.in);
			if (reg[i] == null) {
				System.out.println("�ʺŻ������������������");
				break;
			}
			System.out.println("�������û�����");
			String nm = scanner2.nextLine();
			System.out.println("���������룺");
			String pw = scanner2.nextLine();
			if (nm.equals(reg[i].getName()) && pw.equals(reg[i].getPwd())) {
				System.out.println("��¼�ɹ�");
				System.out.println("�û�����" + reg[i].getName());
				System.out.println("���룺" + reg[i].getPwd());
				System.out.println("�������ڣ�" + reg[i].getDate());
				System.out.println("���ã�" + reg[i].getHobbys());
				break;
			} else {
				System.out.println("�ʺŻ������������������");
				break;
			}

		}
	}
}
