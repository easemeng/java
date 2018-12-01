package com.igeek.day09.test05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
		ArrayList<Student> list = new ArrayList<Student>();
		for(int i = 0;i < 10;i++){
			Student stu = new Student();
			Random random = new Random();
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入学生姓名：");
			stu.setName(scanner.nextLine());
			stu.setAge(random.nextInt(5) + 22);
			stu.setScore(random.nextInt(100)+1);
			
			list.add(stu);
		}
		for(Student i : list){
			System.out.println(i);
		}
		System.out.println(find (list));
		System.out.println(total(list));
		System.out.println(average(list));
		flunk(list);

	}
	
	public static Student find (ArrayList<Student> list) {
		int so = 0;
		Student maxStu = null;
		for(int i = 0;i < list.size();i++){
			if(so < list.get(i).getScore()){
				so = list.get(i).getScore();
			}
		}
		
		for(int i = 0;i < list.size();i++){
			if(so == list.get(i).getScore()){
				maxStu = list.get(i);
			}
		}
		return maxStu;
		
	}
	
	public static int total (ArrayList<Student> list){
		int tt = 0;
		for(int i = 0;i < list.size();i++){
			tt += list.get(i).getScore();
		}
		return tt;		
	}
	
	public static int average (ArrayList<Student> list){
		
		int ta = total(list);
		int ave = ta / list.size();
		return ave;
	}
	
	public static void flunk(ArrayList<Student> list){
		ArrayList<Student> list1 = new ArrayList<Student>();
		int count = 0;
		for(int i = 0;i < list.size();i++){
			if(list.get(i).getScore() < 60){
				Student stu1 = new Student();
				stu1 = list.get(i);
				list1.add(stu1);
				count ++ ;
			}
		}
		for(Student i : list1){
			System.out.println(i);
		}
		System.out.println(count);
		
	}

}
