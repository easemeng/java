package com.igeek.sb;

public class StringBuilderTest {

	@SuppressWarnings("unused")
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
		
		
		
		
	}

}