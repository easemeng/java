package com.igeek.oop3;

import java.util.Scanner;


public class Test {
	@SuppressWarnings({ "unused", "resource" })
	@Deprecated
	public static void main(String[] args) {
		Teacher yuan = new Teacher();
		Student jiLang = new Student("���");
		//new Student("����");  ��������
		//���ֻʹ��һ�� �Ƽ�ʹ����������
		yuan.test(jiLang);
		int abs = Math.abs(-20);
		System.out.println(abs);
		
		Scanner sc = new Scanner(System.in);
		/**
		 * ���������Ŀ�� ��Ϊ�˵��ö����еĳ�Ա(���ԣ�������)��
		 */
		//
	}

}