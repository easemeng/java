package com.igeek.day07.test03;

public class Test03 {

	public static void main(String[] args) {
		
		Test03Manager tesM = new Test03Manager("��Ŀ����","123",15000,6000);
		Test03Coder tesC = new Test03Coder("����Ա","135",10000);
		
		System.out.println("����Ϊ" + tesM.getId() + "��������Ϊ" +tesM.getSalary() + 
				"����Ϊ" + tesM.getBonus() + "��" + tesM.getName());
		Test03Manager.work();
		System.out.println("����Ϊ" + tesC.getId() + "��������Ϊ" + tesC.getSalary() + 
				"��" + tesC.getName());
		Test03Coder.work();
		
		Test03Manager tesM1 = new Test03Manager();
		tesM1.setName("��Ŀ����");
		tesM1.setId("123");
		tesM1.setSalary(15000);
		tesM1.setBonus(6000);
		
		Test03Coder tesC1 = new Test03Coder();
		tesC1.setName("����Ա");
		tesC1.setId("135");
		tesC1.setSalary(10000);

	}

}
