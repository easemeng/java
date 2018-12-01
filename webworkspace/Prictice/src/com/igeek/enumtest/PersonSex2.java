package com.igeek.enumtest;

public class PersonSex2 {
	
	private final String sex;
	private final String sexdesc;
	
	private PersonSex2(String sex,String sexdesc){
		
		this.sex = sex;
		this.sexdesc = sexdesc;
		
	}

	public String getSex() {
		return sex;
	}

	public String getSexdesc() {
		return sexdesc;
	}

	public static final PersonSex2 MAN = new PersonSex2("��","����");
	public static final PersonSex2 WOMAN = new PersonSex2("Ů","Ů��");
	public static final PersonSex2 SEMON = new PersonSex2("��","����");
	
	@Override
	public String toString() {
		return "Sex [sex=" + sex + ", sexdesc=" + sexdesc + "]";
	}

	public void behavior(){
		System.out.println("˯��");
	}
}
