package com.igeek.oop;

public class PhoneTest2 {
	public static void main(String[] args) {
		//����(����)����
		Phone huaWei = new Phone();
		
		huaWei.brand="��Ϊ��ҫ10";
		huaWei.price=998;
		huaWei.color="��ɫ";
		
		//���ݶ����ڴ��ַ���и�ֵ  �� ע�⣺���ָ�ֵ��ʽ.  ��˼��������������ͬһ������
		Phone huaWei2 = huaWei;
		
		huaWei2.brand="ɽկƻ��XX";
		huaWei2.price=8888;
		huaWei2.color="������";
		
		System.out.println(huaWei.brand+huaWei.price+huaWei.color);
		System.out.println(huaWei2.brand+huaWei2.price+huaWei2.color);
		
		
		System.out.println(huaWei);//ֱ�Ӵ�ӡ������ʾ���Ƕ�����ڴ��ַ��
		System.out.println(huaWei2);
		
		System.out.println(huaWei instanceof Phone);
		
	}
}
