package com.igeek.pptTest.test04;

public class ManKing {
	
	public int sex;
	public int salary;
	
	void manOrWorman(){
		
		if(sex == 0){
			System.out.println("women");
		}else if(sex == 1){
			System.out.println("man");
		}
		else{
			System.out.println(" ‰»Î”–ŒÛ");
		}
		
	}
	
	void employeed(){
		
		if(salary <= 0){
			System.out.println("no job");
		}else{
			System.out.println("job");
		}
		
	}

}
