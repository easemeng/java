package com.igeek.practice1;

public class Computer {
	
	public static void open(){
		System.out.println("����");
		Screen se = new Screen();
		se.work();
	}
	
	public static void close(){
		System.out.println("�ػ�");
	}
	
	public static void useUSB(USB usb){
		
		 usb.open();
		 usb.work();
		 usb.close();
		
	}

}
