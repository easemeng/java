package com.igeek.day09.test03;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		for (int i = 0; i < 3; i++) {
			Student stu = new Student();
			Scanner scanner = new Scanner(System.in);
			System.out.println("�������" + (i + 1) + "��ѧԱ��ѧ�ţ�");
			stu.setId(scanner.nextLine());
			System.out.println("�������" + (i + 1) + "��ѧԱ��������");
			stu.setName(scanner.nextLine());
			System.out.println("�������" + (i + 1) + "��ѧԱ���Ա�");
			stu.setSex(scanner.next().charAt(0));
			System.out.println("�������" + (i + 1) + "��ѧԱ�����䣺");
			stu.setAge(scanner.nextInt());
			System.out.println("�������" + (i + 1) + "��ѧԱ����ߣ�");
			stu.setHeight(scanner.nextDouble());

			list.add(stu);
		}
		printAll(list);
		findMaxHeight(list);
	}
	
	public static void printAll(ArrayList<Student>stuList){
		for (Student i :stuList) {
			System.out.println(i);
		}
	}
	
	public static void findMaxHeight(ArrayList<Student>stuList){
		double he = 0;
		for(int i = 0;i < stuList.size();i++){			
			double he1 = stuList.get(i).getHeight();
			if(he < he1){
				he = he1;
			}
		}
		
		for(int i = 0;i < stuList.size();i++){
			if(he == stuList.get(i).getHeight()){
				System.out.println(stuList.get(i));
			}
		}
	}

}
