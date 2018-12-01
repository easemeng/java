package com.igeek.practice1;

public class Mouse extends Hardware implements USB {

	@Override
	public void open() {
		
		System.out.println("连接鼠标");

	}

	@Override
	public void close() {
		
		System.out.println("断开鼠标");

	}

	@Override
	public void work() {
		
		System.out.println("点击鼠标");

	}


}
