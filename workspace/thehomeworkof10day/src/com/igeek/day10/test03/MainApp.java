package com.igeek.day10.test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) throws IOException{
		//���弯�����洢����
		 ArrayList<Student> list = new ArrayList<Student>();
		 
		 //�����ַ�����ȡ
		 BufferedReader br = new BufferedReader(new FileReader("name.txt"));
		 
		 String len;
		 while((len = br.readLine())!=null){
			 
			 //����Student����
			 Student stu = new Student();
			 
			 String[] stuMessageArray = len.split(",");
			 
			 //�������е�����ȡ����Ȼ�����õ�Student������
			 stu.setId(stuMessageArray[0]);
			 stu.setName(stuMessageArray[1]);
			 stu.setSex(stuMessageArray[2]);
			 stu.setAge(stuMessageArray[3]);
			 
			 //��Ӷ��󵽼���
			 list.add(stu);
		 }
		 //����
		 br.close();
		 
		 //��ӡ�޸ĺ������
		 System.out.println("ѧ��\t����\t�Ա�\t����");
		 
		 //�����ַ�д����
		 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("name.txt",true));
		 
		 //ѭ�������ж�Ԫ�أ��޸�Ԫ�أ�������������д��
		 for(int i = 0;i<list.size();i++){
			 //�����ַ���ƴ�Ӷ���
			 StringBuilder StringBuilder =new StringBuilder();
			 //��ȡ����
			 Student stu = list.get(i);
			 
			 //�ж�Ԫ��
			 if(stu.getName().equals("¬����")){
				 stu.setName("ʷ�Ĺ�");
			 }
			 System.out.println(stu.getId() + "\t" + stu.getName()+"\t"+stu.getSex() +"\t"+stu.getAge());
			 
			 //ƴ��Ԫ��
			 StringBuilder.append(stu.getId()).append(",").append(stu.getName()).append(",").append(stu.getSex()).append(",").append(stu.getAge());
			 
			 //bufferedWriter.close();
		 }
		 //�ر���
		 bufferedWriter.close();
	}
}
