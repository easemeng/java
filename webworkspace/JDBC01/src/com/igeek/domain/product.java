package com.igeek.domain;

import java.io.Serializable;

// һ��ʵ����(Entity)	�ֽ�JavaBean �� Domain	�� POJO(��java����)
// �Ǹ����ݿ��е��ֶ� ��һһ��Ӧ��ϵ(ӳ���ϵ)

public class product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int pid;
	private String pname;
	private double price;
	private String category_id;
	
	public product() {
		super();
	}
	
	public product(int pid, String pname, double price, String category_id) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.category_id = category_id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	// ��������������Ƶ�ʱ�� ����� toString
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", category_id=" + category_id + "]";
	}

}
