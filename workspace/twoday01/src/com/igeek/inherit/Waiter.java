package com.igeek.inherit;

public class Waiter extends Employee{
	
	public Waiter() {
		super();
	}
	
	public Waiter(String name,double salary) {
		super(name,salary);
	}
	
	public void work(){
		System.out.println("�ϲ������");
	}

}
