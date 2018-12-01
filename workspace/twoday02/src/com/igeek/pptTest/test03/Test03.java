package com.igeek.pptTest.test03;

public class Test03 {

	public static void main(String[] args) {
		
		Circle cir = new Circle();
		Cylinder cyl = new Cylinder();
		
		double c1 = cir.findArea();
		double c2 = cyl.getLength();
		double c3 = c1 * c2;
		
		System.out.println(c3);

	}

}
