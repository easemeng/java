package com.igeek.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Student s1 = new Student("陈少强","java",68.5);
		Student s2 = new Student("李杭","java",58.7);
		Student s3 = new Student("田瑞瑞","java",66.6);
		Student s4 = new Student("曹铭前","java",69.8);
		
		Student s5 = new Student("徐宝山","H5",59.9);
		Student s6 = new Student("李瑶","H5",44.4);
		Student s7 = new Student("戴静","H5",88.8);
		
		// 创建一个学生集合 装所有的所有 。 
		ArrayList<Student> studentist = new ArrayList<Student>();
		Collections.addAll(studentist, s1,s2,s3,s4,s5,s6,s7);
		
		// 分班操作 。 
		ArrayList<Student> java = new ArrayList<Student>();
		ArrayList<Student> H5 = new ArrayList<Student>();
		
		for (Student student : studentist) {
			if(student.getClass_Id().equals("java")){
				java.add(student);
			}else{
				H5.add(student);
			}
			
		}
		
		// 创建 Map 集合 ， 存储该班所有的学生。 
		Map<String, ClassRoom> map = new HashMap<String, ClassRoom>();
		// 创建java班的对象 。 
		ClassRoom javaClassRoom = new ClassRoom("java",java);
		map.put("java", javaClassRoom);
		
		ClassRoom H5ClassRoom = new ClassRoom("H5",H5);
		map.put("H5", H5ClassRoom);
		
		print(map);
		
/*		ArrayList<Student> javaList = new ArrayList<Student>();
		javaList.add(s1);
		javaList.add(s2);
		
		ArrayList<Student> H5List = new ArrayList<Student>();
		H5.add(s5);
		
		ClassRoom java = new ClassRoom("java",javaList);
		ClassRoom H5 = new ClassRoom("H5",H5List);*/

	}
	
	public static void print(Map<String,ClassRoom> map){
		
		// 如何遍历Map集合？？
		Set set = map.keySet();
		Iterator<ClassRoom> it = set.iterator();
		while(it.hasNext()){
			double sum = 0.0;
			double avg = 0.0;
			// 拿到所有班级 。 
			ClassRoom room = map.get(it.next());  // it.next() 拿到的是字符串key ... 想获得value ...
			// 拿到该班级所有学生的集合 。 
			ArrayList<Student> stuList = room.getStudentList();
			for (Student student : stuList) {
				sum += student.getScore();
			}
			
			avg = sum/stuList.size();
			System.out.println(room.getClass_Id() + "的学生...总分：" + sum + "\t平均分：" + avg);
		}
	}

}
