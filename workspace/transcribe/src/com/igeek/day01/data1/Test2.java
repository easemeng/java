package com.igeek.day01.data1;

public class Test2 {

	/**
	 * ���� ��
	 * 		��Ա����
	 * 			1.ʵ������ ��  û�б�static���εı���
	 * 			2.����� ��  ��static���εı���
	 * 		�ֲ�����
	 * 			1.�β� ����С�����еĲ���
	 * @param args
	 */
	
	// ��Ա����   ��ȫ�ֱ�����  static ��ʾ��̬��  ��̬�����ܷ��ʷǾ�̬��Ա��  ����
	static int i = 100;
	int age = 20;
	
	public static void main(String[] args) {
		
		// show();
		// int ii3 = 100;
		// show2(ii3);  // �����ĵ���   ��java�з������Ա�����  ���Ƿ�������Ƕ��
		
		wan();
		
	}
	
	public static void show(){
		int i2 = 200;
		System.out.println(i);
		System.out.println(i2);
	}
	
	public static void show2(int ii){
		System.out.println(ii);
	}
	
	public static void wan(){
		// ע�⣺����ֻ�ܱ����� ����Ƕ�ף�Ҳ���ܻ������  �������ѭ��ģʽ
		play();
		System.out.println("wan����");
	}
	
	public static void play(){
		wan();
		System.out.println("play����");
		{
			
		}
	}
		
	{
		// �����  �õ�����һ������������ʾ  { }
		int i = 10;
		System.out.println(i);
	}

}
