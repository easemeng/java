package com.igeek.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class StringUtils {
	
	// ·µ»ØÒ»¸öUUID
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}
	
	public static String getDate(){
		
		String date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = sdf.format(new Date());
		return date;
		
	}

}
