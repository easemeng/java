package com.igeek.day07.test03;

public class Test03Manager {
	
	private String name;
	private String id;
	private double salary;
	private double bonus;
	
	public Test03Manager() {
		super();
	}
	
	public Test03Manager(String name, String id, double salary, double bonus) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
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
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public static void work(){
		System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
	}

}
