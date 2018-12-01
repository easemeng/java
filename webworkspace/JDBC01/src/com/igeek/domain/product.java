package com.igeek.domain;

import java.io.Serializable;

// 一般实体类(Entity)	又叫JavaBean 叫 Domain	叫 POJO(简单java对象)
// 是跟数据库中的字段 做一一对应关系(映射关系)

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

	// 当你输出对象名称的时候 会调用 toString
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", category_id=" + category_id + "]";
	}

}
