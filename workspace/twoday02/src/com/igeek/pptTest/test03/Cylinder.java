package com.igeek.pptTest.test03;

public class Cylinder extends Circle {

	Circle cir = new Circle();

	private double length;

	Cylinder() {
		length = 1;
	}

	public Cylinder(double radius, double length) {
		super(radius);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

//	public double findArea() {
//		return 0;
//	}

}
