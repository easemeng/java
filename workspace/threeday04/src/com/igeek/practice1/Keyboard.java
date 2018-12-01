package com.igeek.practice1;

public class Keyboard extends Hardware implements USB {

	@Override
	public void open() {
		
		System.out.println("Á¬½Ó¼üÅÌ");

	}

	@Override
	public void close() {
		
		System.out.println("¶Ï¿ª¼üÅÌ");

	}

	@Override
	public void work() {
		
		System.out.println("¼üÅÌ°´¼ü");

	}

}
