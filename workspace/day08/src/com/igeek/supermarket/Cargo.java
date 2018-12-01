package com.igeek.supermarket;

public class Cargo {
	
	private String cargoName;
	private int number;
	private double price;
	private int amount;
	private String unit;
	private double totalPrice;
	
	public Cargo(){
		
	}
		
	
	public Cargo(String cargoName, int number, double price,
				int amount, String unit, double totalPrice) {
		super();
		this.cargoName = cargoName;
		this.number = number;
		this.price = price;
		this.amount = amount;
		this.unit = unit;
		this.totalPrice = totalPrice;
	}


	public String getCargoName() {
		return cargoName;
	}
	public void setCargoName(String cargoName) {
		this.cargoName = cargoName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
