package com.igeek.practice2;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("����ԭ�ַ�����");
		Scanner scanner = new Scanner(System.in);
		String initString = scanner.nextLine();
		String finalString = initString;
		int count = 0;
		int index = finalString.indexOf("java");
		while(index != -1){
			System.out.println(index);
			Thread.sleep(1000);
			count++;
			String before = finalString.substring(0,index);
			String after = finalString.substring(index + 4);
			finalString = before + after;
			index = finalString.indexOf("java");
			System.out.println(finalString);
		}
		
		System.out.println("\n*********************************************\n");
		System.out.println("ԭ�ַ�����"+initString+"��");
		System.out.println("�ܹ�������"+count+"��java��ɾ��java����ַ���Ϊ��"+finalString);

	}

}
