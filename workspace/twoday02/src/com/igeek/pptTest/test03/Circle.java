package com.igeek.pptTest.test03;

public class Circle {
	
	private double radius;

	Circle() {
		radius = 1;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea(){
		double area = (radius * radius * Math.PI);
		return area;
	}

}
