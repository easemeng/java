package com.igeek.operator;

public class Demo2 {

	public static void main(String[] args) {
		//��ֵ�����
		//double a = 10;
		//int d = (int) a;
		
		int i = 10;
		//i += 10;//�ȼ���  i = i + 10;		-= *= /= %=
		i*=3;//i = i * 3;
		System.out.println(i);
		
		
		// == �ű�ʾ�ж��������ߵ�ֵ�Ƿ���� �� = ��ʾ��ֵ��
		int i2 = 20;
		System.out.println(i2>=20); // != ���ǲ����ڵ���˼ �� 
		
		//�Ƚ������	�ص�	�������boolean���ͽ��ֻ��true����false
		
		boolean flag = "����"  instanceof String; // instance ʵ��	�����󡣣�
		//�ж���ߵĶ����Ƿ������ұߵ��� �� 
		System.out.println(flag);
		
	}

}