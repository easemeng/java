package com.igeek.day07.test06;

public class Test06Books {
	
	private String id;
	private String name;
	private double price;
	
	public Test06Books() {
		super();
	}
	
	public Test06Books(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "图书编号：" + id + " 书名：" + name + " 单价：" + price + "\n";
	}
	

}
