package com.igeek.zhengze;

public class Test1 {
	
	public static void main(String[] args) {
		
		String phone = "18888888888";
		
		// Ȼ��ָ��һ������  ����Ҳ���ַ���
		String regex = "1[34578][0-9]{9}";
		///^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+(\.[a-zA-Z]{2,3})+$/
		boolean flag = phone.matches(regex);
		System.out.println(flag);
		
		
		String strs = "hello  java hello     nihao   hehe";
		
		// ����ʹ��������ʽ   ����������ַ��� �� 
		String [] newstrs = strs.split(" +");
		
		for (String string : newstrs) {
			System.out.println(string);
		}
	}

}
