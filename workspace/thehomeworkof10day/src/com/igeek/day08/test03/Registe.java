package com.igeek.day08.test03;

public class Registe {
	
	private String name;
	private String pwd;
	private String date;
	private String hobbys;
	
	public Registe() {
		super();
	}
	
	public Registe(String name, String pwd, String date, String hobbys) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.date = date;
		this.hobbys = hobbys;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHobbys() {
		return hobbys;
	}
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}	

}
