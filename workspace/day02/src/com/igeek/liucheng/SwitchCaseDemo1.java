package com.igeek.liucheng;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		
		
		//ѡ�����̿������  switch case
		//�Ӽ���������һ��1-12֮��Ķ������ж������ĸ��·�
		
		//ʲôʱ����if	ʲôʱ����switch case �� �� 
		//if ��Ҫ������������ж� �� 	switch case ��Ҫ������ָ���ĳ���ֵ���ж�
		
		/**
		 * switch(����){
		 * 			case ����1:
		 * 					ִ�еĴ���;				
		 * 			break;
		 * 			}
		 * 
		 * switch case �� �� �ܹ�ʹ����Щ�������ͣ�
		 * 		byte , short , char , int
		 * 		String	JDK 1.7�ſ�ʼ֧��String
		 * 		enum ö�٣����ǿ�����ٳ����Ľ�����Ƕ�����ö�١��� Java �Ĺؼ��� �� JDK 1.5֮���֧�֡�
		 * 
		 * 		JDK �����������¼���
		 * 
		 *  break,continue ��ʲô����
		 *  break  ��ʾ����  ��������switch case�ṹ�У�Ҳ��������ѭ���ṹ��(for , while ,do while )��
		 *  	break ��ʾ������ǰѭ��(������ѭ��Ƕ�ף�break ֻ������һ��ѭ��)
		 *  continue ֻ������ѭ���ṹ�У���ʾ��������ѭ�����ص�ѭ��ͷ�������´�ѭ����
		 *  
		 *  ��Ҫ��N��ѭ����ֱ������������ʹ��һ���ؼ��� return
		 */
		
		int a = 99;
		switch (a)
		{
		case 1:
			System.out.println("1");
			break;
		case 99:
			System.out.println("99");
			break;
			default:
				System.out.println("����");
				break;
		
		}
	}

}
