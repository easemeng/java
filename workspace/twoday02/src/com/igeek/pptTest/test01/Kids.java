package com.igeek.pptTest.test01;

public class Kids extends ManKing {
	
	public static int yearsOld = 15;
	
	public static void main(String[] args) {
		
		ManKing someKid = new Kids();
		someKid.sex = 1;
		someKid.salary = 8000;
		someKid.manOrWorman();
		someKid.employeed();
		printAge();
	}

	public static void printAge() {
		System.out.println(yearsOld);
	}

}
