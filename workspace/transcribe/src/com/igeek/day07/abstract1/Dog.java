package com.igeek.day07.abstract1;
// һ������̳г����� �� ���������д����д �� ���ǣ� Override  ���������еĳ��󷽷�
public class Dog extends Quan {

	@Override
	public void speak() {
		
		System.out.println("������...");

	}

	@Override
	public void eat() {
		
		System.out.println("����");

	}

	@Override
	public void dream() {
		
		System.out.println("�ѵ�....");

	}
	
	public void mimi(){
		System.out.println("���ڲ���һ����ͷ");
	}

}
