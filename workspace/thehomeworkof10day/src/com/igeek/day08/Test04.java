package com.igeek.day08;

import java.util.Scanner;

public class Test04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ�����ַ�����");
		String bs = scanner.nextLine();
		System.out.println("������һ��С�ַ�����");
		String ss = scanner.nextLine();
		int count = 0;
		int i = 0;
		//�ҵ�С�ַ������ֵ��״�λ��֮���ٴӵ�ǰ�����������ң������Ҵ����е�С�ַ���
		while((i = bs.indexOf(ss,i)) != -1){
			count++;
			//�ҵ��״γ��ֵ�λ�ú󣬴����������֮���ң���������ֵӦ�ü���С�ַ����ĳ���
			i += ss.length();
		}
		System.out.println(count);

	}

}
