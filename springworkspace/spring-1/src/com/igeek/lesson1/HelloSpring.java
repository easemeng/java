package com.igeek.lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��������ķ�ʽ
		// 1. ֱ��new Person p = new Person();
		// 2. �������� new Person();
		// 3. ȫ·�� com.igeek.lesson1.Person p = new com.igeek.lesson1.Person();
		// 4. ���� Class.forName("com.igeek.lesson1.Person").newInstance();
		
		// ͨ��spring IOC��������������
		// ͨ��spring IOC��������������
		
		// ����springIOC��������	ApplicationContext��һ���ӿ�	
		// ����springIOC������װ���� �����������������
		
		// BeanFactory bf = new ClassPathXmlApplicationContext("beans.xml");
		
		// bf.getBean("");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		// ʹ��java������ʵ�� ����Ĭ���ǵ���ģʽ�������Ǵ��������
//		Person p = (Person) ac.getBean("p1");
//		System.out.println(p);
		
		Person p1_1 = (Person) ac.getBean("p1");
		System.out.println(p1_1);
		Person p1_2 = (Person) ac.getBean("p1");
		System.out.println(p1_2);
		
		Person p2_1 = (Person) ac.getBean("p2");
		System.out.println(p2_1);
		Person p2_2 = (Person) ac.getBean("p2");
		System.out.println(p2_2);
		
//		Person p2 = (Person) ac.getBean(Person.class);
//		System.out.println(p2);
	}

}