package com.igeek.inherit;

public class Cook extends Employee{
	
	public Cook() {
		super();
	}
	
	public Cook(String name,double salary) {
		super(name,salary);
	}
	
	public void work(){
		System.out.println("����");
	}

}
