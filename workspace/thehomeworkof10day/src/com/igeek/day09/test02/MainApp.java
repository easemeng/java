package com.igeek.day09.test02;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student stu = new Student();
		stu.setId("it001");
		stu.setName("�Ʋ�");
		stu.setHeight(1.72);
		
		list.add(stu);
		
		Student stu1 = new Student();
		stu1.setId("it002");
		stu1.setName("�����");
		stu1.setHeight(1.78);
		
		list.add(stu1);
		
		Student stu2 = new Student();
		stu2.setId("it003");
		stu2.setName("������");
		stu2.setHeight(1.64);
		
		list.add(stu2);
		
		Student stu3 = new Student();
		stu3.setId("it004");
		stu3.setName("��ӱ");
		stu3.setHeight(1.68);
		
		list.add(stu3);
		
		for(Student i : list){
			System.out.println(i);
		}
		
		System.out.println(list.size());
		
		System.out.println(list.get(2));
		
		System.out.println(list.remove(3));
		
		System.out.println(list.size());
		
		Student stu4 = new Student();
		stu4.setId("it005");
		stu4.setName("������");
		stu4.setHeight(1.67);
		
		list.set(0, stu4);
		
		for(int i = 0;i < list.size();i++){
			if(list.get(i).getHeight() > 1.70){
				System.out.println(list.get(i));
			}
		}
		
		for(int i = 0;i < list.size();i++){
			char[] ch = list.get(i).getName().toCharArray();
			if(ch[0] == '��'){
				System.out.println(list.get(i));
			}
		}

	}

}
