package com.igeek.oop;

public class TestPerson {

	public static void main(String[] args) {
		
		//����һ������ ���﷨��ʽ  ��   ���������   �������� = new ������();
		
		Person tom = new Person();
		Person jack = new Person();
		tom.name="��ķ";
		tom.age=19;
		System.out.println(tom.name);//����ͨ������. �����ߵ�ǰ���г�Ա��
		System.out.println(tom.age);
		tom.eat();
		tom.play();
		jack.name="�ܿ�";
		jack.age=20;
		System.out.println(jack.name);
		System.out.println(jack.age);
		jack.eat();
		jack.play();
		
		//tom �� jack ����ͬһ������ �����Ǹ���Person���������ġ�
		
	}

}
