package com.igeek.day07.innerclass;

public class Main2 {

	public static void main(String[] args) {
		// �ڲ��ഴ������ĸ�ʽ
		// �ⲿ��.�ڲ���	�ڲ����������	=	new �ⲿ�๹����().new �ڲ��๹����();
		Out.Inner sb = new Out().new Inner();
		sb.show(".....");

	}

}
