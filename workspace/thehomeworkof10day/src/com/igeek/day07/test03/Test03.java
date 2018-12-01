package com.igeek.day07.test03;

public class Test03 {

	public static void main(String[] args) {
		
		Test03Manager tesM = new Test03Manager("项目经理","123",15000,6000);
		Test03Coder tesC = new Test03Coder("程序员","135",10000);
		
		System.out.println("工号为" + tesM.getId() + "基本工资为" +tesM.getSalary() + 
				"奖金为" + tesM.getBonus() + "的" + tesM.getName());
		Test03Manager.work();
		System.out.println("工号为" + tesC.getId() + "基本工资为" + tesC.getSalary() + 
				"的" + tesC.getName());
		Test03Coder.work();
		
		Test03Manager tesM1 = new Test03Manager();
		tesM1.setName("项目经理");
		tesM1.setId("123");
		tesM1.setSalary(15000);
		tesM1.setBonus(6000);
		
		Test03Coder tesC1 = new Test03Coder();
		tesC1.setName("程序员");
		tesC1.setId("135");
		tesC1.setSalary(10000);

	}

}
