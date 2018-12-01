package com.igeek.day09.test04;

public class MainAPP {
	public static void main(String[] args) {
		 Student student1 = new Student("����", 18, 45);
         Student student2 = new Student("����", 20, 61);
         Student student3 = new Student("����", 21, 50);
         Student student4 = new Student("�׵�", 25, 80);
         Student student5 = new Student("������", 23, 90);
         Student[] students = {student1,student2,student3,student4,student5};
         
         listStudent(students);
         getMaxScore(students);
         getMaxStudent(students);
         getAverageScore(students);
         getCount(students);
	}
	@SuppressWarnings("unused")
	public static void listStudent(Student[] arr){
		for(int i = 0;i<arr.length;i++){
			Student student =arr[i];
			String name = student.getName();
			int age = student.getAge();
			double score = student.getScore();
			System.out.println(student);
		}
	}
	public static int getMaxScore(Student[] arr){
		double max = 0;
		for(int i =0;i<arr.length;i++){
			Student student = arr[i];
			double score =student.getScore();
			if(score>max){
				max = score;
			}
		}
		System.out.println("��߷���" + max);
		return (int) max;
	}
	public static Student getMaxStudent(Student[] arr){
		double max = 0;
		for(int i =0;i<arr.length;i++){
			Student student = arr[i];
			double score =student.getScore();
			if(score>max){
				max = score;
			}
		}
		for(int i =0;i<arr.length;i++){
			Student student = arr[i];
			double score = student.getScore();
			if(score == max){
				System.out.println("�ɼ����ѧ��λ" + arr[i].getName());
				return arr[i];
			}
		}
		return null;
	}
	public static int getAverageScore(Student[] arr){
		int total = 0;
		for(int i = 0;i<arr.length;i++){
			Student student = arr[i];
			double score = student.getScore();
			total +=score;
		}
		System.out.println("ѧ���ɼ�ƽ����Ϊ" + total/5);
		return total/5;
	}
	public static int getCount(Student[] arr){
		int count =0;
		for(int i = 0;i<arr.length;i++){
			Student student = arr[i];
			double score = student.getScore();
			if(score<60){
				count++;
			}
		}
		System.out.println("������ѧ������Ϊ:" + count++);
		return count;
	}
}
