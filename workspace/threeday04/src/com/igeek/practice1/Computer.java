package com.igeek.practice1;

public class Computer {
	
	public static void open(){
		System.out.println("开机");
		Screen se = new Screen();
		se.work();
	}
	
	public static void close(){
		System.out.println("关机");
	}
	
	public static void useUSB(USB usb){
		
		 usb.open();
		 usb.work();
		 usb.close();
		
	}

}
