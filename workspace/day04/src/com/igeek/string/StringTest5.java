package com.igeek.string;

import java.util.Scanner;

public class StringTest5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//�������ݣ�ͳ�ƴ�Сд�Լ����ֳ��ֵĴ��� ��
		//boolean flag = true;
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String inputString = sc.nextLine();
		if(inputString.equals("-")){
			break;
		}
		int number = 0;
		int upper = 0;
		int lower = 0;
		
		for (int i = 0; i < inputString.length(); i++) {
			//�õ�ÿһ���ַ� ��
			char c = inputString.charAt(i);
			if(c<='Z'&&c>='A'){
				upper++;
			}else if(c<='z'&&c>='a'){
				lower++;
			}else if(c<='9'&&c>='0'){
				number++;
			}else{
				System.out.println("�Ƿ���");
			}
		}
		
		System.out.println("��д����:"+upper+"��");
		System.out.println("Сд����:"+lower+"��");
		System.out.println("���ֳ���:"+number+"��");
		}
	}

}
