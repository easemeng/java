package com.igeek.pptTest.test04;

public class Kids extends ManKing {
	
	public static int yearsOld = 15;
	
	public static void main(String[] args) {
		
		ManKing someKid = new Kids();
		someKid.sex = 1;
		someKid.salary = 0;
		someKid.manOrWorman();
		someKid.employeed();
		printAge();
	}

	public static void printAge() {
		System.out.println(yearsOld);
	}
	
	void employeed(){
		if(salary <= 0){
			System.out.println("Kids should study and no job.");
		}else{
			System.out.println("job");
		}
	}

}
