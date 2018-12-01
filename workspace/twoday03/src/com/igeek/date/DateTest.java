package com.igeek.date;

import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		// 1535530154757   从计算机元年 。    1秒   1000毫秒
		System.out.println(date.getTime());
		
		Date date2 = new Date(0L);
		System.out.println(date2);
		
		Date date3 = new Date(1535530154757L);
		System.out.println(date3);
		
	}

}
