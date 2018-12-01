package com.igeek.thread2;

public class Ticket implements Runnable {

	private String name;
	
	public Ticket (String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 50; i++){
			System.out.println(name + "==" + i);
		}
		
	}
	
	

}
