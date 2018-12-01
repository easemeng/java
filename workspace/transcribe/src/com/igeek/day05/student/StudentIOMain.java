package com.igeek.day05.student;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StudentIOMain {
	
	// 查看学生信息的代码 IO
	public static void selectAll() throws Exception {
		
		FileInputStream input = new FileInputStream("e:学生信息表.xlsx");
		FileOutputStream output = new FileOutputStream("");

		BufferedInputStream bi = new BufferedInputStream(input);
		BufferedOutputStream bo = new BufferedOutputStream(output);
		
		int i = 0;
		while ((i = bi.read()) != -1) {
			bo.write(i);
		}
		
		
		
		
		FileInputStream input2 = new FileInputStream("e:学生信息表.xlsx");
		FileOutputStream output2 = new FileOutputStream("");

		BufferedInputStream bi2 = new BufferedInputStream(input2);
		BufferedOutputStream bo2 = new BufferedOutputStream(output2);
		
		int i2 = 0;
		while ((i2 = bi2.read()) != -1) {
			bo2.write(i2);
		}
		
		
		
		
		FileInputStream input3 = new FileInputStream("e:学生信息表.xlsx");
		FileOutputStream output3 = new FileOutputStream("");

		BufferedInputStream bi3 = new BufferedInputStream(input);
		BufferedOutputStream bo3 = new BufferedOutputStream(output);
		
		int i3 = 0;
		while ((i = bi.read()) != -1) {
			bo.write(i);
		}
		
		
		
		
		FileInputStream input4 = new FileInputStream("e:学生信息表.xlsx");
		FileOutputStream output4 = new FileOutputStream("");

		BufferedInputStream bi4 = new BufferedInputStream(input);
		BufferedOutputStream bo4 = new BufferedOutputStream(output);
		
		int i4 = 0;
		while ((i = bi.read()) != -1) {
			bo.write(i);
		}
		
		
		
		
		FileInputStream input5 = new FileInputStream("e:学生信息表.xlsx");
		FileOutputStream output5 = new FileOutputStream("");

		BufferedInputStream bi5 = new BufferedInputStream(input5);
		BufferedOutputStream bo5 = new BufferedOutputStream(output5);
		
		int i5 = 0;
		while ((i5 = bi5.read()) != -1) {
			bo5.write(i5);
		}
	}

}
