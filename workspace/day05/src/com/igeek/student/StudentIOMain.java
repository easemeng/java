package com.igeek.student;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StudentIOMain {
	
	// 查看学生信息的代码 IO
	@SuppressWarnings("resource")
	public static void selectAll() throws Exception {
		
		FileInputStream input = new FileInputStream("e:学生信息表.xlsx");
		FileOutputStream output = new FileOutputStream("");

		BufferedInputStream bi = new BufferedInputStream(input);
		BufferedOutputStream bo = new BufferedOutputStream(output);
		
		int i = 0;
		while ((i = bi.read()) != -1) {
			bo.write(i);
		}
	}

}
