package com.igeek.single2;

public class Main {

	public static void main(String[] args) {
		
		Singleton single = Singleton.getInstance();
		// ����ʱ û������
		// NullPointerException ��ָ���쳣   ����ֵΪnull
		single.chi();

	}
	
	// 1. ˽�л�������
	// 2. ������̬��Ա���� ��  ������  �� ����ʽ��
	// 3. ��̬���� �� ���س�Ա����

}
