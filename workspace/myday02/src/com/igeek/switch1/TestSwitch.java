package com.igeek.switch1;

import java.util.Scanner;

public class TestSwitch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//ѡ�����̿������ ��
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ѡ��:");
		byte c = sc.nextByte();
		//�ʺ�Ҫ����   1.������ ��  2.�׶��졣  3.��ĥ������  4.�����ϴ�
		switch(c){
			//���û��break ����������͸ִ�е�����
			case 1://case ��ʾ����ֵ ��
				System.out.println("�������Ծ���");
			//break;
			case 2:
				System.out.println("��Ц�벽񲡣����");
			//break;//����  ��������ǰ��switch  case��� ��
			case 3:
				System.out.println("��̫����ĥ����������");
			//break;
			case 4:
				System.out.println("�����ϴ�����");
			//break;
			default://10
				System.out.println("���Լ����֣�ҧ���Ծ���...");
			//break;
		}
		
		//  switch case ��Ҫ�������̶���ѡ��  ��ֻҪ��������������  byte short  int char ���� �������enum ö�� ��ҪJDK 1.5 ���ʹ��String ��ҪJDK 1.7
	
		//�Ƽ�ʹ�� switch case ִ��Ч���Ըߡ�
		//if �ó�������ж� ��
	}

}
