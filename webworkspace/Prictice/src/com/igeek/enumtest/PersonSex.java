package com.igeek.enumtest;

public class PersonSex {
	
	private final String sex;
	private final String sexdesc;
	
	private PersonSex(String sex,String sexdesc){
		
		this.sex = sex;
		this.sexdesc = sexdesc;
		
	}

	public String getSex() {
		return sex;
	}

	public String getSexdesc() {
		return sexdesc;
	}

	public static final PersonSex MAN = new PersonSex("��","����");
	public static final PersonSex WOMAN = new PersonSex("Ů","Ů��");
	public static final PersonSex SEMON = new PersonSex("��","����");
	
	@Override
	public String toString() {
		return "Sex [sex=" + sex + ", sexdesc=" + sexdesc + "]";
	}

	public void behavior(){
		
		System.out.println("˯��");
		
	}
}