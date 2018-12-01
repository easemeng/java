package com.igeek.enumtest;

public enum PersonSex3 implements Person {
	
	MAN("��","����"){
		public void behavior(){
			System.out.println("��Ů��˯��");
		}
	},
	WOMAN("Ů","Ů��"){
		public void behavior(){
			System.out.println("������˯��");
		}
	},
	SEMON("��","����"){
		public void behavior(){
			System.out.println("һ����˯����");
		}
	};
	
	private final String sex;
	private final String sexdesc;
	
	private PersonSex3(String sex,String sexdesc){
		
		this.sex = sex;
		this.sexdesc = sexdesc;
		
	}

	public String getSex() {
		return sex;
	}

	public String getSexdesc() {
		return sexdesc;
	}
	
	@Override
	public String toString() {
		return "Sex [sex=" + sex + ", sexdesc=" + sexdesc + "]";
	}

	/*public void behavior(){
		
		System.out.println("˯��");
		
	}*/
}