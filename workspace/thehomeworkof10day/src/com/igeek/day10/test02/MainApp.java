package com.igeek.day10.test02;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		ArrayList<Student> list = new ArrayList<Student>();
		FileWriter fw = new FileWriter("Test2_2.txt");
		for (int i = 0; i < 3; i++) {
			Student stu = new Student();
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入学生学号：");
			stu.setId(scanner.nextLine());
			System.out.println("请输入学生姓名：");
			stu.setName(scanner.nextLine());
			System.out.println("请输入学生性别：");
			stu.setSex(scanner.nextLine());
			System.out.println("请输入学生年龄：");
			stu.setAge(scanner.nextLine());

			list.add(stu);
		}
		/*for (Student i : list) {
			System.out.println(i);
			Student ch = i;
			fw.write(ch);;
			fw.flush();
		}
		fw.close();*/
		
		for(int i = 0;i < list.size();i++){
			String str = list.get(i).toString();
			fw.write(str);;
			fw.write("\r\n");
			fw.flush();
		}
		fw.close();
	}

}
