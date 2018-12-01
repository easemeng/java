package com.igeek.day10.test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) throws IOException{
		//定义集合来存储对象
		 ArrayList<Student> list = new ArrayList<Student>();
		 
		 //定义字符流读取
		 BufferedReader br = new BufferedReader(new FileReader("name.txt"));
		 
		 String len;
		 while((len = br.readLine())!=null){
			 
			 //创建Student对象
			 Student stu = new Student();
			 
			 String[] stuMessageArray = len.split(",");
			 
			 //将数组中的数据取出，然后设置到Student对象中
			 stu.setId(stuMessageArray[0]);
			 stu.setName(stuMessageArray[1]);
			 stu.setSex(stuMessageArray[2]);
			 stu.setAge(stuMessageArray[3]);
			 
			 //添加对象到集合
			 list.add(stu);
		 }
		 //关流
		 br.close();
		 
		 //打印修改后的数据
		 System.out.println("学号\t姓名\t性别\t年龄");
		 
		 //定义字符写入流
		 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("name.txt",true));
		 
		 //循环集合判断元素，修改元素，并将数据重新写入
		 for(int i = 0;i<list.size();i++){
			 //定义字符串拼接对象
			 StringBuilder StringBuilder =new StringBuilder();
			 //获取对象
			 Student stu = list.get(i);
			 
			 //判断元素
			 if(stu.getName().equals("卢俊义")){
				 stu.setName("史文恭");
			 }
			 System.out.println(stu.getId() + "\t" + stu.getName()+"\t"+stu.getSex() +"\t"+stu.getAge());
			 
			 //拼接元素
			 StringBuilder.append(stu.getId()).append(",").append(stu.getName()).append(",").append(stu.getSex()).append(",").append(stu.getAge());
			 
			 //bufferedWriter.close();
		 }
		 //关闭流
		 bufferedWriter.close();
	}
}
