package com.igeek.lesson7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac = new ClassPathXmlApplicationContext("com/igeek/lesson7/beans.xml");
		Person p = (Person) ac.getBean("p2");
		System.out.println(p);
	}

}