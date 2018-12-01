package com.igeek.day08.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		
		String rule = "yyyyÄêMMÔÂddÈÕHH:mm:ss------z";
		SimpleDateFormat df = new SimpleDateFormat(rule);
		String date = df.format(new Date());
		System.out.println(date);

	}

}
