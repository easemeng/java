package com.igeek.inherit;

public class Test {

	public static void main(String[] args) {

		Manager manager = new Manager("�ܻ���", 6000, 1500);
		Waiter waiter1 = new Waiter("������", 3000);
		Waiter waiter2 = new Waiter("�ܽ���", 3000);
		Cook cook = new Cook("������", 5000);

		manager.work();
		waiter1.work();
		waiter2.work();
		cook.work();

		double money = (manager.getSalary() + manager.getBonus() + waiter1.getSalary() + waiter2.getSalary()
				+ cook.getSalary());

		System.out.println(money);

	}

}
