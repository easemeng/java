package com.igeek.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����spring IOC ��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/igeek/lesson2/lesson2.xml");
		Person p = ac.getBean(Person.class);
		System.out.println(p);
	}

}