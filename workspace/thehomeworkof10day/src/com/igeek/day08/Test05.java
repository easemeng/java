package com.igeek.day08;

import java.util.Scanner;

/**
 * 1.����¼��һ��Դ�ַ������ַ�������scrStr����
	2.����¼��һ��Ҫɾ�����ַ������ַ�������delStr����
	3.Ҫ��
		ɾ������scrStr�����е�����delStr�ַ��������յ��ַ����в��ܰ���delStr����Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���delStr�ַ���
	4.�������д�ӡ��ʽ:
		������Դ�ַ���:java woaijava,i like jajavava i enjoy java
		������Ҫɾ�����ַ���:java
		����̨������:Դ�ַ������ܹ�����:4 �� java ɾ��java����ַ���Ϊ: woai,i like  i enjoy
 * 
 *
 */

public class Test05 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��Դ�ַ�����");
		String scrStr = sc.nextLine();
		System.out.println("������Ҫɾ�����ַ�����");
		String delStr = sc.nextLine();
		int count = 0;
		int i = 0;
		while ((i = scrStr.indexOf(delStr)) != -1) {
			count++;
			scrStr = scrStr.replaceFirst(delStr, "");
			i += scrStr.length();
			System.out.println(scrStr);
		}

	/*	for (int i = 0; i < scrStr.length(); i++) {
			if (scrStr.indexOf(delStr, i) != -1) {
				i = scrStr.indexOf(delStr, i);
				count++;
				scrStr = scrStr.replaceAll(delStr, "");
			}
		}*/

		System.out.println(count + "��" + delStr + "ɾ��" + delStr + "����ַ���Ϊ:" + scrStr);
	}

}
