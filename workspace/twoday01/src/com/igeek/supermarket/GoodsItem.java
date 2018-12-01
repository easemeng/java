package com.igeek.supermarket;

public class GoodsItem {
	
	/**
	 * @Fields  name  ��Ʒ����
	 */
	private String name;
	/**
	 * @Fields  id  ����
	 */
	private String id;
	/**
	 * @Fields  price  ����
	 */
	private double price;
	/**
	 * @Fields  number  ����
	 */
	private int number;
	/**
	 * @Fields  unti  �Ƽ۵�λ
	 */
	private String unti;
	/**
	 * @Fields  money  ���
	 */
	private double money;
	
	
	public GoodsItem() {
		super();
	}
	
	public GoodsItem(String name, String id, double price, int number, String unti, double money) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
		this.number = number;
		this.unti = unti;
		this.money = money;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getUnti() {
		return unti;
	}
	public void setUnti(String unti) {
		this.unti = unti;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

}