package com.igeek.liucheng;

public class WhileDemo1 {

	public static void main(String[] args) {
		
		//while ѭ�� ��  
		
		//wihleѭ����ʼ���������ⲿ
		/*int i = 0;
		int sum = 0;
		while(i<=100){
			sum+=i;
			i++;   //ѭ���������������һ��
		}
		System.out.println(sum);*/
		
		/*for(;;){
			System.out.println("�����ºܼ�");
		}*/
		
		/*while(true){
			System.out.println("�����Ǽ򵥿���");
		}*/
		int i = 1;
		int sum = 0;
		do {
			sum+=i;//sum=1 
			i++;//i = 2;
		} while (i<2);
		System.out.println(sum);
		//ע�� ����do while ѭ�����������������Ƿ����� ��do�еĴ������ٻ�ִ��1�Ρ�
		//10  7 for 3 while.  do while �����á�
		//switch 
		//break , continue ,return �ؼ��ֵ�����
		//break ��ʾ����  ���ֽṹ  1.ѭ�� 2.ѡ��(switch case)  
		//continue ��ʾ��ֹ��ǰѭ�����ص�ѭ��ͷ���������´�ѭ����  ֻ������ѭ���ṹ�С�
		//��ͬ�㣬���涼����д���롣û����˼��д��Ҳ���ᱻִ�С�д����ᱨ����
		//return �ؼ��� ��ʾ���� ��������ֱ���������� ��return ��ʾ�����ķ���ֵ ��ǿ������������
	}

}