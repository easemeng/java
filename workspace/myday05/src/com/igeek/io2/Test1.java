package com.igeek.io2;

import java.io.File;
import java.io.FileReader;

public class Test1 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
		File file = new File("d:/b.txt");
		FileReader fr = new FileReader(file);//һ��File�������IO��ʹ�á�
	}

}
