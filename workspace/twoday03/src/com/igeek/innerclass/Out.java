package com.igeek.innerclass;


/**
 * 
 * @author student
 * 
 * �ڲ���
 * 
 * 		һ�� ��Ա�ڲ���
 * 			��1.���η���������public,default,pratected,private��
 * 			��2.�ڲ�������Ǿ�̬�ģ�Ҳ�����ǷǾ�̬�ģ�
 * 				��̬�ڲ��ֻࣺ�ܷ������ľ�̬��Ա �� �������������̬��Ա
 * 				�Ǿ�̬�ڲ��ࣺ���治��������̬��Ա
 * 			��3.�����Ա�final���Ρ� ��{��final���ε��಻�ܱ��̳� �� ̫����}
 * 		���� �ֲ��ڲ��ࣨ�ڲ����ڷ����ж��壩
 * 			1.�����ľֲ��ڲ���
 * 					1.1ֻ���Ƿ�static�� .
 * 					1.2ֻ���ڶ���ķ����д���������ʹ��  �� 
 * 					1.3û�з���Ȩ�����η� ��ֻ����Ĭ�ϲ�д�ģ�
 * 
 * 			2.�����ڲ��� �� 
 * 					һ������������ӿڶ��� �� ���߳��������
 * 					{ �ڷ������м���ʵ�ֵķ��� }
 * 
 * 			���������� �� ��Ҫʹ��һ������ڲ��� ����Ҫ���¸�ʽ�ഴ������ �� 
 * 				�ⲿ��.�ڲ��� 	�������� = new �ⲿ�๹����().�ڲ��๹����();
 * 			���ⲿ������Ҫ�����ڲ���ĳ�Ա �� �ǳ��򵥴������� �� 
 * 			���ڲ�������Ҫ�����ⲿ��ĳ�Ա �� �ǳ���ֱ��д �� 
 *
 */
public class Out {
	
	private String name = "��";
	private static int age = 20;
	
	 class Inner{
		
		private  String name = "ȫ";
		// ֻ�о�̬�ڲ����� �� ����������̬��Ա �� 
		// һ���ڲ����Ǿ�̬�� ֻ��ʹ�����ľ�̬��Ա
		public void eat(String name){
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Out.this.name);
			System.out.println(age);
			// System.out.println(super.name);
			System.out.println(age);
			wan();
		}
		
	}
	 
	 public void play(){
		// ���ⲿ������Ҫ�����ڲ���ĳ�Ա �� �ǳ��򵥴������� ��
		 Inner in = new Inner();
		 in.eat("name");
	 }
	 
	 public void wan(){
		 // û�з���Ȩ�����η� �� defult
		 class MethodInnerClass{
			 int age = 20;
			 String name = "��С��";
			 public void test(){
				 System.out.println("�����¾ֲ�����");
			 }
		 }
		 
		 MethodInnerClass mic = new MethodInnerClass();
		 System.out.println(mic.name);
		 System.out.println(mic.age);
		 mic.test();
	 }

}
