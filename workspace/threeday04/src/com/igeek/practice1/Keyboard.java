package com.igeek.practice1;

public class Keyboard extends Hardware implements USB {

	@Override
	public void open() {
		
		System.out.println("���Ӽ���");

	}

	@Override
	public void close() {
		
		System.out.println("�Ͽ�����");

	}

	@Override
	public void work() {
		
		System.out.println("���̰���");

	}

}
