package com.igeek.practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class ListTest {
	
	public static void main(String[] args) {
		
		Student s = new Student("Jack", "�༶1", 89);
		Student s2 = new Student("Jack", "�༶2", 29);
		Student s3 = new Student("Jack", "�༶1", 39);
		Student s4 = new Student("Jack", "�༶3", 49);
		Student s5 = new Student("Jack", "�༶2", 59);
		Student s6 = new Student("Jack", "�༶3", 50);
		Student s7 = new Student("Jack", "�༶1", 88);
		
		ArrayList<Student> allStudents = new ArrayList<Student>();
		Collections.addAll(allStudents, s,s2,s3,s4,s5,s6,s7);
		
		// ���ð༶����ѧ���� Map<String,ClassRoom> �ķ�ʽ   �洢��Map������
		HashMap<String, ClassRoom> allClassMap = new HashMap<String, ClassRoom>();
		
		ArrayList<Student> class1Student = new ArrayList<Student>();
		ArrayList<Student> class2Student = new ArrayList<Student>();
		ArrayList<Student> class3Student = new ArrayList<Student>();
		
		for (Student thisStudent : allStudents) {
			if(thisStudent.getClass_number().equals("�༶1")){
				class1Student.add(thisStudent);
			}else if(thisStudent.getClass_number().equals("�༶2")){
				class2Student.add(thisStudent);
			}else if(thisStudent.getClass_number().equals("�༶3")){
				class3Student.add(thisStudent);
			}
		}
		
		ClassRoom class1 = new ClassRoom("�༶1",class1Student);
		ClassRoom class2 = new ClassRoom("�༶2",class2Student);
		ClassRoom class3 = new ClassRoom("�༶3",class3Student);
		
		allClassMap.put("�༶1", class1);
		allClassMap.put("�༶2", class2);
		allClassMap.put("�༶3", class3);
		
		Set<String> classNumber = allClassMap.keySet();
		
		for (String string : classNumber) {
			ClassRoom classRoom = allClassMap.get(string);
			getClassInfo(classRoom);
		}
	}
	
	public static void getClassInfo(ClassRoom classRoom){
		ArrayList<Student> classStudent = classRoom.getStudentList();
		
		double sum = 0;
		double avg = 0;
		
		for (Student student : classStudent) {
			sum += student.getScore();
		}
		
		avg = sum / classStudent.size();
		
		System.out.println(classRoom.getClass_number() + "���ܷ�Ϊ��" + sum + "\tƽ����Ϊ��" + avg);
	}

}
