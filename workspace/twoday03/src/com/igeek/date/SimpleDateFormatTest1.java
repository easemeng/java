package com.igeek.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
		
		String rule = "yyyy年MM月dd日HH:mm:ss";
		DateFormat df = new SimpleDateFormat();
		// 把 date 对象转换成你想要的日期格式 。 
		
		// 把日期格式  转换成你想要的系统时间 。 Date . 毫秒数。。。
		String date = "2018年08月08日00:00:00";
		
		Date d = df.parse(date);
		
		System.out.println(d);
		
		System.out.println(Math.PI);  // 资金  仓储  ....    计算工具类   CVS .

	}

}
