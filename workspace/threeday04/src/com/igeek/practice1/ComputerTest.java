package com.igeek.practice1;

public class ComputerTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.open();
		Mouse mouse = new Mouse();
		computer.useUSB(mouse);
		Keyboard keyboard = new Keyboard();
		computer.useUSB(keyboard);
		computer.close();

	}

}
