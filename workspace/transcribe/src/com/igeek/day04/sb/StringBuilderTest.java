package com.igeek.day04.sb;

public class StringBuilderTest {

	public static void main(String[] args) {
		//StringBuilder ���ַ���ƴ��  ��StringBuffer ...�������ַ���ƴ�ӵġ�
		//String  final ��ʾ���յ� �� 
		//��final���εı��� ���ܱ����¸�ֵ ����final���ε��� �����ܱ��̳С�
		//��final���εķ��������ܱ���д��
		long startTime = System.currentTimeMillis();
		String str = "";
		for(int i = 0;i<50000;i++){
			str+=i;//str = str + i; 12345678910111213...
		}
		long resultTime = System.currentTimeMillis()-startTime;
		System.out.println(resultTime);
		//5s
		
		
		
		
		
		//StringBuilder ���ַ���ƴ��  ��StringBuffer ...�������ַ���ƴ�ӵġ�
		//String  final ��ʾ���յ� �� 
		//��final���εı��� ���ܱ����¸�ֵ ����final���ε��� �����ܱ��̳С�
		//��final���εķ��������ܱ���д��
		long startTime2 = System.currentTimeMillis();
		String str2 = "";
		for(int i = 0;i<50000;i++){
			str2+=i;//str = str + i; 12345678910111213...
		}
		long resultTime2 = System.currentTimeMillis()-startTime2;
		System.out.println(resultTime2);
		
		
		
		
		//StringBuilder ���ַ���ƴ��  ��StringBuffer ...�������ַ���ƴ�ӵġ�
		//String  final ��ʾ���յ� �� 
		//��final���εı��� ���ܱ����¸�ֵ ����final���ε��� �����ܱ��̳С�
		//��final���εķ��������ܱ���д��
		long startTime3 = System.currentTimeMillis();
		String str3 = "";
		for(int i = 0;i<50000;i++){
			str3+=i;//str = str + i; 12345678910111213...
		}
		long resultTime3 = System.currentTimeMillis()-startTime3;
		System.out.println(resultTime3);
		
		
		
		
		//StringBuilder ���ַ���ƴ��  ��StringBuffer ...�������ַ���ƴ�ӵġ�
		//String  final ��ʾ���յ� �� 
		//��final���εı��� ���ܱ����¸�ֵ ����final���ε��� �����ܱ��̳С�
		//��final���εķ��������ܱ���д��
		long startTime4 = System.currentTimeMillis();
		String str4 = "";
		for(int i = 0;i<50000;i++){
			str4+=i;//str = str + i; 12345678910111213...
		}
		long resultTime4 = System.currentTimeMillis()-startTime4;
		System.out.println(resultTime4);
		
		
		
		
		//StringBuilder ���ַ���ƴ��  ��StringBuffer ...�������ַ���ƴ�ӵġ�
		//String  final ��ʾ���յ� �� 
		//��final���εı��� ���ܱ����¸�ֵ ����final���ε��� �����ܱ��̳С�
		//��final���εķ��������ܱ���д��
		long startTime5 = System.currentTimeMillis();
		String str5 = "";
		for(int i = 0;i<50000;i++){
			str5+=i;//str = str + i; 12345678910111213...
		}
		long resultTime5 = System.currentTimeMillis()-startTime5;
		System.out.println(resultTime5);
	}

}