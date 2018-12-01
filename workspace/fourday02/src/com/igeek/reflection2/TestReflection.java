package com.igeek.reflection2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestReflection {
	
	/**
	 * ��̬���أ�����������ʱ������Ӧ��������ʹ���������Ǵ���ģ�
	 * �������ɻ�ִ�С�ͨ����̬���ؿ����ó���Ŀ��ӳ��Դ��������
	 * ���Ժ��ά������չ����Ҫ���塣
	 * 
	 * ��̬���أ������ڱ���ʱִ�С���ִ�й����м������п���ִ�е��ĳ���
	 * �����ּ��ط�ʽ�£�ֻҪ������һ��������������Ͳ������С�
	 * ����һ��д����Ĭ�ϵ��Ǿ�̬���ء�
	 * 
	 * Java��������������������ʱ���ء�֪̽��ʹ�ñ����ڼ���ȫδ֪��classes��
	 * ͨ��JAVA�ķ�����ƣ����Ի�ó����ڲ��������JAR����CLASS��METHOD,���ԣ�
	 * ��������Ϣ
	 * 
	 * @param args
	 * @throws Exception 
	 */

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) throws Exception {
		
		// java ����
		// �����ܸ�ʲô �� ��̬�Ļ��һ���������е���Ϣ �� 
		// ��Ҫʹ��Class��Ķ���  ��  Class�� �� 	A	Person	String
		// ʹ��Class����ʾ���е��� ��  Class���ж�����   ���������Ϊ������
		
		// Class������ʹ�÷����һ��Դͷ
		
		// ���Class��������ַ�ʽ
		
		// ������
		Class classType = Person.class;  // Person.class ����Person������Ӧ�� .class �ļ�
		
		Person tom = new Person();
		Class classType2 = tom.getClass();  // �ڶ��ֻ�������Ͷ���ķ�ʽ
		
		Class classType3 = Class.forName("com.igeek.reflection2.Person");
		
		Annotation[] annotations = classType.getAnnotations();
		// �õ���ǰ������ע��
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}
		
		// �����Ͷ���    .getMethods(); �����õ���ǰ�������еķ���  ����ֵ������һ������
		Method[] methods = classType.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}

	}

}
