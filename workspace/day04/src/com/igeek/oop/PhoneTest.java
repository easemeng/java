package com.igeek.oop;

public class PhoneTest {

	public static void main(String[] args) {
		//����(����)����
		Phone huaWei = new Phone();
		
		huaWei.brand="��Ϊ��ҫ10";
		huaWei.price=998;
		huaWei.color="��ɫ";
		
		String name = "�ܽ���";
		huaWei.call(name);
		System.out.println(name);
		huaWei.sendMessage();
		
	}

}
