package com.igeek.oop2;
/**
 * 
 * 
 * @author ����Ӫ
 * @Version 1.0 2018��8��16��
 * Company wh.igeekhome.com
 * 
 * 
 * ���캯��  �������� �����췽����
 * 	�﷨  ��  �������η�����ķ������η�һ�£�û�з���ֵ����ע�⣺��void��û�С�
 * 			��Ҫ���췽�������Ʊ����������һ�¡�
 * 			ע�⣺�������Ĳ����б���п��ޡ�
 * �����������ã��������󣬲���������г�ʼ����(��ʼ������˼  ���Ǹ������е����Խ��и�ֵ��)
 * 
 * ��java�У�����дһ�����ʱ�򣬹����������ֶ�ָ�� ��
 * ϵͳ��Ĭ�ϸ������һ���յ��޲����Ĺ����� ��
 * public class Student{
 * 		public Student(){
 * 			super();
 * 		}
 * }
 * 
 * ������ �ǿ��Ա����ص� ��
 * 
 * ע�⣺�Ժ���д����Ĺ��̣��Լ�ָ���������ˣ������ȥ���һ���յ��޲εĹ�������
 * Spring...
 * 
 *  ����  
 *  	��Ա���� 
 *  	��Ա����
 *  	��������1.��������2.�������ʼ����
 */
public class Person {
	private String name;
	private int age;
	private String sex;
	/*public Person(){
		
	}*/
	public Person(){
		
	}
	public Person(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	//Overload ����  ��  Override ��д ��  ע��  ע�ͽ��͵����� ��JDK�ṩ��������Դ����ע�� ��@Override ��ʾ�ж�����ķ���ʱ��������д������
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}
