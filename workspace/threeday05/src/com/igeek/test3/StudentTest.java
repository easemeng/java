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
		
		Student s1 = new Student("����ǿ","java",68.5);
		Student s2 = new Student("�","java",58.7);
		Student s3 = new Student("������","java",66.6);
		Student s4 = new Student("����ǰ","java",69.8);
		
		Student s5 = new Student("�챦ɽ","H5",59.9);
		Student s6 = new Student("����","H5",44.4);
		Student s7 = new Student("����","H5",88.8);
		
		// ����һ��ѧ������ װ���е����� �� 
		ArrayList<Student> studentist = new ArrayList<Student>();
		Collections.addAll(studentist, s1,s2,s3,s4,s5,s6,s7);
		
		// �ְ���� �� 
		ArrayList<Student> java = new ArrayList<Student>();
		ArrayList<Student> H5 = new ArrayList<Student>();
		
		for (Student student : studentist) {
			if(student.getClass_Id().equals("java")){
				java.add(student);
			}else{
				H5.add(student);
			}
			
		}
		
		// ���� Map ���� �� �洢�ð����е�ѧ���� 
		Map<String, ClassRoom> map = new HashMap<String, ClassRoom>();
		// ����java��Ķ��� �� 
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
		
		// ��α���Map���ϣ���
		Set set = map.keySet();
		Iterator<ClassRoom> it = set.iterator();
		while(it.hasNext()){
			double sum = 0.0;
			double avg = 0.0;
			// �õ����а༶ �� 
			ClassRoom room = map.get(it.next());  // it.next() �õ������ַ���key ... ����value ...
			// �õ��ð༶����ѧ���ļ��� �� 
			ArrayList<Student> stuList = room.getStudentList();
			for (Student student : stuList) {
				sum += student.getScore();
			}
			
			avg = sum/stuList.size();
			System.out.println(room.getClass_Id() + "��ѧ��...�ܷ֣�" + sum + "\tƽ���֣�" + avg);
		}
	}

}
