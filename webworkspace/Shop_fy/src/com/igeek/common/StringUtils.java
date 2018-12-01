package com.igeek.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class StringUtils {
	
	public static String getUUID(){
		
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}
	
	public static String getDate(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(new Date());
		return date;
		
	}

}
