package com.igeek.day06.test1;

public class Test1 {

	public static void main(String[] args) {
		/*Person p = new Person();
		//��ε��õ�ǰ���еķ��� ��
		p.eat();
		p.getInfo();*/
		
		new Person().eat();//���������ʹ�÷�ʽ ������ֻ��Ҫ����һ�����е�ĳһ������һ�ε�ʱ�����ʹ����������
		new Person().getInfo();
		System.out.println(new Person()==new Person());
	}

}
