package com.igeek.day07.test05;

public class Test05 {

	public static void main(String[] args) {
		
		Test05Cat tesC = new Test05Cat("��ɫ","��˹è");
		Test05Dog tesD = new Test05Dog("��ɫ","����");
		tesC.eat();
		tesC.catchMouse();
		tesD.eat();
		tesD.lookHome();
		
		Test05Cat tesC1 = new Test05Cat();
		tesC1.setColor("��ɫ");
		tesC1.setBreed("��˹è");
		
		Test05Dog tesD1 = new Test05Dog();
		tesD1.setColor("��ɫ");
		tesD1.setBreed("����");

	}

}
