package com.igeek.day08.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {

	public static void main(String[] args) throws ParseException {
		
		String rule = "yyyy��MM��dd��HH:mm:ss";
		DateFormat df = new SimpleDateFormat();
		// �� date ����ת��������Ҫ�����ڸ�ʽ �� 
		
		// �����ڸ�ʽ  ת��������Ҫ��ϵͳʱ�� �� Date . ������������
		String date = "2018��08��08��00:00:00";
		
		Date d = df.parse(date);
		
		System.out.println(d);
		
		System.out.println(Math.PI);  // �ʽ�  �ִ�  ....    ���㹤����   CVS .
		
		
		
		
		String rule2 = "yyyy��MM��dd��HH:mm:ss";
		DateFormat df2 = new SimpleDateFormat();
		// �� date ����ת��������Ҫ�����ڸ�ʽ �� 
		
		// �����ڸ�ʽ  ת��������Ҫ��ϵͳʱ�� �� Date . ������������
		String date2 = "2018��08��08��00:00:00";
		
		Date d2 = df2.parse(date2);
		
		System.out.println(d2);
		
		System.out.println(Math.PI);  // �ʽ�  �ִ�  ....    ���㹤����   CVS .
		
		
		
		
		String rule3 = "yyyy��MM��dd��HH:mm:ss";
		DateFormat df3 = new SimpleDateFormat();
		// �� date ����ת��������Ҫ�����ڸ�ʽ �� 
		
		// �����ڸ�ʽ  ת��������Ҫ��ϵͳʱ�� �� Date . ������������
		String date3 = "2018��08��08��00:00:00";
		
		Date d3 = df3.parse(date);
		
		System.out.println(d);
		
		System.out.println(Math.PI);  // �ʽ�  �ִ�  ....    ���㹤����   CVS .
		
		
		
		
		String rule4 = "yyyy��MM��dd��HH:mm:ss";
		DateFormat df4 = new SimpleDateFormat();
		// �� date ����ת��������Ҫ�����ڸ�ʽ �� 
		
		// �����ڸ�ʽ  ת��������Ҫ��ϵͳʱ�� �� Date . ������������
		String date4 = "2018��08��08��00:00:00";
		
		Date d4 = df.parse(date);
		
		System.out.println(d);
		
		System.out.println(Math.PI);  // �ʽ�  �ִ�  ....    ���㹤����   CVS .
		
		
		
		
		String rule5 = "yyyy��MM��dd��HH:mm:ss";
		DateFormat df5 = new SimpleDateFormat();
		// �� date ����ת��������Ҫ�����ڸ�ʽ �� 
		
		// �����ڸ�ʽ  ת��������Ҫ��ϵͳʱ�� �� Date . ������������
		String date5 = "2018��08��08��00:00:00";
		
		Date d5 = df5.parse(date5);
		
		System.out.println(d5);
		
		System.out.println(Math.PI);  // �ʽ�  �ִ�  ....    ���㹤����   CVS .

	}

}
