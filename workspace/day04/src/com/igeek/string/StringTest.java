package com.igeek.string;

public class StringTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//�ַ����еĳ��÷������� ��
		
		//�����ַ����ļ��ַ�ʽ��
		String str1 = new String("hello");
		
		byte [] b1 = new byte[]{65,66,67};
		String str2 =new String(b1);
		System.out.println(str2);
		
		char [] c1 = new char[]{'h','e','l','l','o'};
		String str3 = new String(c1);
		System.out.println(str3);
		
		String str4 = "hello...";
	}

}