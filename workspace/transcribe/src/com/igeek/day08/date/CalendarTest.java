package com.igeek.day08.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cd = Calendar.getInstance();  // 类名.来调用创建对象的方法  。 拿到日历对象。
		System.out.println(cd);
		
		// 转换成Date对象 。 
		Date date = cd.getTime();
		System.out.println(date);
		
		int year = cd.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cd.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int day = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		cd.set(2018,8,8);
		System.out.println(cd);
		
		// Calendar类  表示日历类
		
		
		
		
		Calendar cd2 = Calendar.getInstance();  // 类名.来调用创建对象的方法  。 拿到日历对象。
		System.out.println(cd2);
		
		// 转换成Date对象 。 
		Date date2 = cd.getTime();
		System.out.println(date2);
		
		int year2 = cd2.get(Calendar.YEAR);
		System.out.println(year2);
		
		int month2 = cd2.get(Calendar.MONTH)+1;
		System.out.println(month2);
		
		int day2 = cd2.get(Calendar.DAY_OF_MONTH);
		System.out.println(day2);
		
		cd2.set(2018,8,8);
		System.out.println(cd2);
		
		// Calendar类  表示日历类
		
		
		
		
		Calendar cd3 = Calendar.getInstance();  // 类名.来调用创建对象的方法  。 拿到日历对象。
		System.out.println(cd);
		
		// 转换成Date对象 。 
		Date date3 = cd.getTime();
		System.out.println(date);
		
		int year3 = cd.get(Calendar.YEAR);
		System.out.println(year);
		
		int month3 = cd.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int day3 = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		cd.set(2018,8,8);
		System.out.println(cd);
		
		// Calendar类  表示日历类
		
		
		
		
		Calendar cd4 = Calendar.getInstance();  // 类名.来调用创建对象的方法  。 拿到日历对象。
		System.out.println(cd);
		
		// 转换成Date对象 。 
		Date date4 = cd.getTime();
		System.out.println(date);
		
		int year4 = cd.get(Calendar.YEAR);
		System.out.println(year);
		
		int month4 = cd.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int day4 = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		cd.set(2018,8,8);
		System.out.println(cd);
		
		// Calendar类  表示日历类
		
		
		
		
		Calendar cd5 = Calendar.getInstance();  // 类名.来调用创建对象的方法  。 拿到日历对象。
		System.out.println(cd5);
		
		// 转换成Date对象 。 
		Date date5 = cd5.getTime();
		System.out.println(date);
		
		int year5 = cd5.get(Calendar.YEAR);
		System.out.println(year5);
		
		int month5 = cd5.get(Calendar.MONTH)+1;
		System.out.println(month5);
		
		int day5 = cd5.get(Calendar.DAY_OF_MONTH);
		System.out.println(day5);
		
		cd5.set(2018,8,8);
		System.out.println(cd5);
		
		// Calendar类  表示日历类

	}

}
