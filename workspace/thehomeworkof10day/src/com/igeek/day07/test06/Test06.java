package com.igeek.day07.test06;

public class Test06 {

	public static void main(String[] args) {
		
		
		Test06Books tesB = new Test06Books("C001","java基础",10);
		
		Test06Books tesB1 = new Test06Books("C002","java进阶",20);
		
		Test06Books tesB2 = new Test06Books("C003","java精通",40);
		
				
		if(tesB.getPrice() > tesB1.getPrice() & tesB.getPrice() > tesB2.getPrice()){
			System.out.println(tesB);
		}
		if(tesB1.getPrice() > tesB.getPrice() & tesB1.getPrice() > tesB2.getPrice()){
			System.out.println(tesB1);
		}
		if(tesB2.getPrice() > tesB.getPrice() & tesB2.getPrice() > tesB1.getPrice()){
			System.out.println(tesB2);
		}
		
				

	}

}
