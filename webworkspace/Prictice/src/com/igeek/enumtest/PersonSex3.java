package com.igeek.enumtest;

public enum PersonSex3 implements Person {
	
	MAN("男","男神"){
		public void behavior(){
			System.out.println("陪女神睡觉");
		}
	},
	WOMAN("女","女神"){
		public void behavior(){
			System.out.println("和男神睡觉");
		}
	},
	SEMON("妖","妖人"){
		public void behavior(){
			System.out.println("一个人睡不着");
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
		
		System.out.println("睡觉");
		
	}*/
}
