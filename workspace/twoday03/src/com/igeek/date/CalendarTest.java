package com.igeek.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cd = Calendar.getInstance();  // ����.�����ô�������ķ���  �� �õ���������
		System.out.println(cd);
		
		// ת����Date���� �� 
		Date date = cd.getTime();
		System.out.println(date);
		
		int year = cd.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cd.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int day = cd.get(Calendar.DAY_OF_MONTH);  // 29     ��
		System.out.println(day);
		
		cd.set(2018,8,8);
		System.out.println(cd);
		
		// Calendar��  ��ʾ������

	}

}