package com.igeek.zhengze;

public class Test2 {

	public static void main(String[] args) {
		
		// Ҫ��  �� ǰ8λΪ 0-9  a-zA-Z  ֮��������ַ�  �� @  �̶���ʽ  qq.com
		//String regex = a;
		//String str = "e";
		//System.out.println(str);
		//String regex = "[a-zA-Z]";
		//boolean flag = str.matches(regex);
		//System.out.println(flag);
		//"[a-zA-Z0-9]{8}@qq.com"
		
		// ���������ַ�	ʹ�õ�ʱ�����  	ת��
		
		String str = "5+5";
		String [] s = str.split("\\+");
		for (String string : s) {
			System.out.println(string);
		}

	}

}
