package com.igeek.oop;

public class FengZhuang {

	private String age;
	
		//���ȷ�װ������������������֮һ��
		
		//1.ָ�ľ���˽������ ��Ȼ��set/get ��
		//2.��ʵ��ĳ�ι��ܵĴ��룬���뵽һ���������档�����������Ҳ�з�װ��

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		//��ʱthis�ʹ����˵�����   fz
		this.age = age;
	}

	//��������һ������ ������1��������ĺ͡�
	public int getSum(int n){
		//
		int sum = 0;
		sum=(1+n)*n>>1;
		return sum;
	}
}
