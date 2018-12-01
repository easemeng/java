package com.igeek.student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class StudentMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// ÿһ��student���� ����ʵ�ʹ����˾����һ��ѧ����
		ArrayList<Student> list = new ArrayList<Student>();
		//�־û��洢 �����ݿ� ��
		while (true) {
			System.out.println("=====��ӭ����ѧ������ϵͳ=====");
			System.out.println("1	�鿴ѧ��");
			System.out.println("2       ����ѧ��");
			System.out.println("3	ɾ��ѧ��");
			System.out.println("4       �޸�ѧ��");
			System.out.println("5       �鿴ָ��ѧ��");
			System.out.println("6	�˳�");
			System.out.println("���������ѡ��");
			Scanner sc = new Scanner(System.in);
			int xz = sc.nextInt();
			switch (xz) {
			case 1:
				// �鿴ѧ����
				selectAll(list);
				break;
			case 2:
				// ����
				//�Ƚ��뵽�������ݵ�ҳ�档
				addSudent(list);
				break;
			case 3:
				// ɾ��
				deleteStudent(list);
				break;
			case 4:
				// �޸�
				updateStudent(list);
				break;
			case 5:
				// ��ѯ��һ ����ѧ��id
				break;
			case 6:
				// �˳�
				System.exit(0);// JVM�˳� ��
				break;
			default:
				System.out.println("����������������롣");
				break;
			}

		}

	}

	
	//��װһ���鿴����ѧ���ķ�����
	public static void selectAll(ArrayList<Student> list){
		if(list.size()==0){
			System.out.println("������˼��û��ѧ����");
		}else{
			for (int i = 0; i < list.size(); i++) {
				//�õ�ÿһ��ѧ�����󣬴�ӡѧ����Ϣ ��
				Student stu = (Student) list.get(i);
				System.out.println(stu);
			}
		}
		
	}
	
	//����ѧ��
	@SuppressWarnings("resource")
	public static void addSudent(ArrayList<Student> list){
		System.out.println("������ѧ����id,name,age,address");
		System.out.println("������ʾ��   �����¸�ʽ����...");
		System.out.println("������,20,��������Ԫ��");
		Scanner sc2 = new Scanner(System.in);
		String input = sc2.nextLine();//�����������ݡ�
		String [] stus = input.split(",");
		String uuid = getUUID();
		int age = Integer.parseInt(stus[1]);//��ΰ�һ���ַ���ת���ɻ�����������  Integer.parseInt("123");
		//����student ���󣬰������ȷ�װ�������С�
		Student student = new Student(uuid,stus[0],age,stus[2]);
		list.add(student);
	}
	
	//ɾ��ѧ��
	@SuppressWarnings("resource")
	public static void deleteStudent(ArrayList<Student> list){
		System.out.println("������Ҫɾ����ѧ������:");
		Scanner sc3 = new Scanner(System.in);
		String name = sc3.nextLine();
		//list.remove(name);
		//�ȴ�������ȡ�����е�ѧ�� ��  �ж����ѧ�������ָ�����������Ƿ�һ�£����һ�£�ɾ����ѧ������
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);//ȡ��ÿһ��ѧ������
			String stuName = stu.getName();
			if(name.equals(stuName)){
				list.remove(i);
			}
		}
	}
	
	
	@SuppressWarnings("resource")
	public static void updateStudent(ArrayList<Student> list){
		//��������ȥ�޸ġ�
		System.out.println("������Ҫ�޸ĵ�ѧ��������");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Student stu = null;
		int j = 0;
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			if(student.getName().equals(input)){
				System.out.println(student);
				stu = student;
				j = i;
				break;//ֱ���������Ѿ��ҵ�ѧ���ˡ�
			}
		}
		System.out.println("�������޸ĵĵ�ַ:");
		String address = sc.nextLine();
		
		stu.setAddress(address);
		
		list.set(j, stu);//ֱ���滻 ��
		
		
	}
	
	//����������ѯ��һѧ����
	@SuppressWarnings("resource")
	public static void getStudentById(ArrayList<Student> list){
		System.out.println("������ѧ����������");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			if(student.getName().equals(input)){
				System.out.println(student);
				break;//ֱ���������Ѿ��ҵ�ѧ���ˡ�
			}
		}
	}
	
	//���߷��� �� ����һ��UUID���������ַ������͡�
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}
}