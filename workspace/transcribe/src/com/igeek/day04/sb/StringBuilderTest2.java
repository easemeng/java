package com.igeek.day04.sb;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("123");
		/*System.out.println(sb);//
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		sb.append("ABC").append("DEF");//��ʾ���ַ���ƴ�Ӳ�����
		//sb.append("DEF");
		//System.out.println(sb instanceof String);
		String result = sb.toString();
		
		//���÷������Զ���ת�ˡ�
		sb.reverse();
		String reverseResult = sb.toString();
		System.out.println(result);
		System.out.println(reverseResult);
		
		
		
		
		
		StringBuilder sb2 = new StringBuilder("123");
		/*System.out.println(sb);//
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		sb2.append("123").append("321");//��ʾ���ַ���ƴ�Ӳ�����
		//sb.append("333");
		//System.out.println(sb instanceof String);
		String result2 = sb2.toString();
		
		//���÷������Զ���ת�ˡ�
		sb2.reverse();
		String reverseResult2 = sb2.toString();
		System.out.println(result2);
		System.out.println(reverseResult2);
		
		
		
		
		StringBuilder sb3 = new StringBuilder("123");
		/*System.out.println(sb);//
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		sb3.append("123").append("321");//��ʾ���ַ���ƴ�Ӳ�����
		//sb.append("222");
		//System.out.println(sb instanceof String);
		String result3 = sb3.toString();
		
		//���÷������Զ���ת�ˡ�
		sb3.reverse();
		String reverseResult3 = sb3.toString();
		System.out.println(result3);
		System.out.println(reverseResult3);
		
		
		
		
		StringBuilder sb4 = new StringBuilder("123");
		/*System.out.println(sb);//
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		sb4.append("123").append("321");//��ʾ���ַ���ƴ�Ӳ�����
		//sb.append("000");
		//System.out.println(sb instanceof String);
		String result4 = sb2.toString();
		
		//���÷������Զ���ת�ˡ�
		sb4.reverse();
		String reverseResult4 = sb4.toString();
		System.out.println(result4);
		System.out.println(reverseResult4);
		
		
		
		
		StringBuilder sb5 = new StringBuilder("123");
		/*System.out.println(sb);//
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		sb5.append("123").append("321");//��ʾ���ַ���ƴ�Ӳ�����
		//sb.append("111");
		//System.out.println(sb instanceof String);
		String result5 = sb5.toString();
		
		//���÷������Զ���ת�ˡ�
		sb5.reverse();
		String reverseResult5 = sb5.toString();
		System.out.println(result5);
		System.out.println(reverseResult5);
	}

}
