package com.igeek.string;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str1 = "hello";
		
		//charAt����  ��ʾ����ָ�����±�  �����±��Ӧ���ַ���
		char c = str1.charAt(0);
		System.out.println(c);
		
		//equals�������������ж������ַ�����ֵ�Ƿ���� ��  ==
		boolean flag = str1.equals("hello");
		System.out.println(flag);
		
		boolean flag2 = str1.equalsIgnoreCase("HeLLO");
		System.out.println(flag2);
		
		boolean flag3 = str1.startsWith("he");
		System.out.println(flag3);
		
		boolean flag4= str1.endsWith("dd");
		System.out.println(flag4);
		
	}

}
