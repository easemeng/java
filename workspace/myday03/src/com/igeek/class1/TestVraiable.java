package com.igeek.class1;

public class TestVraiable {
	
	//��Ա���� ��(������ԡ�   �������������еĹ�ͬ������)
	
	//ʵ������ ��  ÿ���������ӵ��һ�ײ�ͬ�ĸ������˴�֮������Բ���Ӱ�졣
	private int age = 10;
	//����� ��   �����еĶ�����ֵ ��
	public static String country = "�й�";
	
	//һ������ ��˽�л��ˡ�����޷�ֱ�ӷ������� ��   ����. 
	//set , get ����    �� set������age���Խ��и�ֵ���� ��get������ȡage���Ե�ֵ��
	
	public void setAge(int age){//age 
		//�������Ĳ������� ������ǰ���е���������ͬ����ʱ��
		//���ʱ��������Ҫʹ��this�ؼ��� ���������� ��
		//this �ؼ��ֵ���˼   ����ǰ������ ��
		
		//if  age >0   <130;  Syso(�����������)
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void show(){
		System.out.println(age);
	}

}
