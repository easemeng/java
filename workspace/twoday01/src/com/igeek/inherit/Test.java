package com.igeek.inherit;

public class Test {

	public static void main(String[] args) {

		Manager manager = new Manager("周惠人", 6000, 1500);
		Waiter waiter1 = new Waiter("周树人", 3000);
		Waiter waiter2 = new Waiter("周建人", 3000);
		Cook cook = new Cook("周作人", 5000);

		manager.work();
		waiter1.work();
		waiter2.work();
		cook.work();

		double money = (manager.getSalary() + manager.getBonus() + waiter1.getSalary() + waiter2.getSalary()
				+ cook.getSalary());

		System.out.println(money);

	}

}
