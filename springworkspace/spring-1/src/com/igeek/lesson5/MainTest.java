package com.igeek.lesson5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/igeek/lesson5/beans.xml");
		Person p = (Person) ac.getBean("p4");
		System.out.println(p);
	}

}