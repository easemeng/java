package com.igeek.string;

import java.util.Scanner;

public class StringTest3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String username = "admin";
		String password = "123";
		
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������˺�:");
			String inputUserName = sc.nextLine();//��ʾ���������ַ�����
			System.out.println("����������:");
			String inputPassword = sc.nextLine();
			if(inputUserName.equals(username)&&inputPassword.equals(password)){
				System.out.println("��½�ɹ�!");
				break;
			}else{
				if(i==2){
					System.out.println("����˺����뱻������");
					
				}else{
					System.out.println("�㻹��:"+(2-i));
				}
			}
		}
		
	}

}
