package com.igeek.extends1;

public class Test{

	/**
	 * ͨ���̳й�ϵ��������Լ̳е��������е����ԣ��������� ����˽�г�Ա�����ܱ�ֱ�ӵ��á�
	 */
	public static void main(String[] args) {

		//java�еļ̳��ǳ�ȡ���ԣ�����˴���ĸ����ԡ�
		Student stu = new Student();
		System.out.println(stu.name);
		System.out.println(stu.sex);
		System.out.println(stu.age);
		stu.eat();
		stu.dream();
		stu.play();
		stu.setMoney(200000.0);
		System.out.println(stu.getMoney());
		//stu.piao();
		//stu.notify();//Object
		/**
		 * ��java����м̳й�ϵ��ֻ���ǵ�һ�̳С�
		 * һ��������ֻ��һ������ ���������ࡣ��
		 * 
		 * ��java��Ĭ��Object����������ĸ��� ��
		 * 
		 *  ֱ�Ӹ��� ����̳�˭  ˭�������ֱ�Ӹ��� �� �㸸��̳�˭��˭������ļ�Ӹ��� ��
		 *  
		 *  ע�⣬����Ƽ̳й�ϵ��ʱ����ò�Ҫ����3�ء�
		 */
		
		//java  ���ʵ������ ��
		
		// �̳й�ϵ�������is a�Ĺ�ϵ,���������һ��  
		// ��˼���� �� ����  ����   ȥ  �̳� ����   �����������
	}

}