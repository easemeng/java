package com.igeek.day07.test03;

public class Test03Coder {
	
	private String name;
	private String id;
	private double salary;
	
	public Test03Coder() {
		super();;
	}
	
	public Test03Coder(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void work(){
		System.out.println("正在努力的写着代码......");
	}

}
