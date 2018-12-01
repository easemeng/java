package com.igeek.domain;

import java.io.Serializable;

public class Area implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ÇøÓòµÄid */
	private int id;
	private String area_name;
	private String arae_code;
	private int area_parent_id;
	
	public Area() {
		super();
	}

	public Area(int id, String area_name, String arae_code, int area_parent_id) {
		super();
		this.id = id;
		this.area_name = area_name;
		this.arae_code = arae_code;
		this.area_parent_id = area_parent_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public String getArae_code() {
		return arae_code;
	}

	public void setArae_code(String arae_code) {
		this.arae_code = arae_code;
	}

	public int getArea_parent_id() {
		return area_parent_id;
	}

	public void setArea_parent_id(int area_parent_id) {
		this.area_parent_id = area_parent_id;
	}

	@Override
	public String toString() {
		return "Area [id=" + id + ", area_name=" + area_name + ", arae_code=" + arae_code + ", area_parent_id="
				+ area_parent_id + "]";
	}

}
