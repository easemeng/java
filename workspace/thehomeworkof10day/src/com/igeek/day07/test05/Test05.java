package com.igeek.day07.test05;

public class Test05 {

	public static void main(String[] args) {
		
		Test05Cat tesC = new Test05Cat("花色","波斯猫");
		Test05Dog tesD = new Test05Dog("黑色","藏獒");
		tesC.eat();
		tesC.catchMouse();
		tesD.eat();
		tesD.lookHome();
		
		Test05Cat tesC1 = new Test05Cat();
		tesC1.setColor("花色");
		tesC1.setBreed("波斯猫");
		
		Test05Dog tesD1 = new Test05Dog();
		tesD1.setColor("黑色");
		tesD1.setBreed("藏獒");

	}

}
