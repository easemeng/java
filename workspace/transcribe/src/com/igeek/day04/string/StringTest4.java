package com.igeek.day04.string;

public class StringTest4 {

	public static void main(String[] args) {
		String str1 = "hello-hehe";
		String [] strs = {"1","123","324","abc"};
		//System.out.println(strs.length);
		//length...
		//System.out.println(str1.length());
		
		//����ָ�����ַ���  ���س��ֵ��±ꡣ
		String str2 = "0123456789A";
		//System.out.println(str2.indexOf(65));
		//System.out.println(str2.indexOf("321"));
		//System.out.println(str2.indexOf("A", 5));
		
		//�ַ����Ľ�ȡ��
		String newStr2 = str2.substring(4);
		System.out.println(newStr2);
		// ������ʼ�±꣬���ǲ����������±�  ����������ȡ�����ݡ�
		String newStr3 = str2.substring(0,2);
		System.out.println(newStr3);
		
		//�����ַ��� ��
		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.charAt(i));
		}
	}

}
