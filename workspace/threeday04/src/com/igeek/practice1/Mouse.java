package com.igeek.practice1;

public class Mouse extends Hardware implements USB {

	@Override
	public void open() {
		
		System.out.println("�������");

	}

	@Override
	public void close() {
		
		System.out.println("�Ͽ����");

	}

	@Override
	public void work() {
		
		System.out.println("������");

	}


}
