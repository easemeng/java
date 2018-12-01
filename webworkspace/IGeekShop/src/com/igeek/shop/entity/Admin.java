package com.igeek.shop.entity;

import java.io.Serializable;

public class Admin implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String aid;
	private String adminname;
	private String adminpwd;
	private String name;
	
	public Admin() {
		
	}

	public Admin(String aid, String adminname, String adminpwd, String name) {
		
		this.aid = aid;
		this.adminname = adminname;
		this.adminpwd = adminpwd;
		this.name = name;
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminpwd() {
		return adminpwd;
	}

	public void setAdminpwd(String adminpwd) {
		this.adminpwd = adminpwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", adminname=" + adminname + ", adminpwd=" + adminpwd + ", name=" + name + "]";
	}
	
}
