package com.igeek.practice2;

import java.util.Scanner;

public class Test1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��Դ�ַ�����");
		String str1 = sc.nextLine();
		String str = str1;
		System.out.println("������Ҫɾ�����ַ�����");
		String delStr = sc.nextLine();
		
		int count = 0;
		int i = 0;
		while((i = str.indexOf(delStr)) != -1){
			count++;
			str = str.replaceFirst(delStr, "");
		}
		System.out.println("ԭ�ַ���Ϊ��" + str1);
		System.out.println(count + "��" + delStr + "ɾ��" + delStr + "����ַ���Ϊ:" + str);

	}

}
