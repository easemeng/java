package com.igeek.sb;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("123");
		/*System.out.println(sb);//
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		sb.append("ABC").append("DEF");//��ʾ���ַ���ƴ�Ӳ�����
		//sb.append("DEF");
		//System.out.println(sb instanceof String);
		//���ת�� ��
		String result = sb.toString();
		
		//���淽�����Զ���ת�ˡ�
		sb.reverse();
		String reverseResult = sb.toString();
		System.out.println(result);
		System.out.println(reverseResult);
		
		
	}

}
