package com.igeek.utils;

import java.util.UUID;

public class StringUtils {
	
	// ����һ��UUID
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}

}
