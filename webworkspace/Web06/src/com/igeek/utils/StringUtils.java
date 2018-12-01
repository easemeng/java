package com.igeek.utils;

import java.util.UUID;

public class StringUtils {
	
	// ·µ»ØÒ»¸öUUID
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}

}
