package com.igeek.inherit;

public class Manager extends Employee{
	
	private double bonus;
	
	public Manager() {
		super();
	}

	public Manager(String name,double salary,double bonus) {
		super(name,salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void work(){
		System.out.println("����Ƶ�");
	}

}
