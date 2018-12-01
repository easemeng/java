package com.igeek.day07.test01;

public class Test01Course {
	
	private String subId;
	private String subName;
	private String startDate;
	private String subDescribe;
	
	public Test01Course() {
		super();
	}
	
	public Test01Course(String subId, String subName, String startDate, String subDescribe) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.startDate = startDate;
		this.subDescribe = subDescribe;
	}
	
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getSubDescribe() {
		return subDescribe;
	}
	public void setSubDescribe(String subDescribe) {
		this.subDescribe = subDescribe;
	}

	@Override
	public String toString() {
		return  subId + "	" + subName + "	" + startDate + "	"
				+ subDescribe + "\n";
	}
	
	

}
