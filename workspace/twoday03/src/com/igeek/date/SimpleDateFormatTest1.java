package com.igeek.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
		
		String rule = "yyyy��MM��dd��HH:mm:ss";
		DateFormat df = new SimpleDateFormat();
		// �� date ����ת��������Ҫ�����ڸ�ʽ �� 
		
		// �����ڸ�ʽ  ת��������Ҫ��ϵͳʱ�� �� Date . ������������
		String date = "2018��08��08��00:00:00";
		
		Date d = df.parse(date);
		
		System.out.println(d);
		
		System.out.println(Math.PI);  // �ʽ�  �ִ�  ....    ���㹤����   CVS .

	}

}