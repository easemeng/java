package com.igeek.extends1;

public class Person {

	public String name;
	protected int age;
	String sex;
	private double money;
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	//ѧ���� ����ʦ�࣬������ ��  ������ ��
	public void eat(){
		System.out.println("��");
	}
	protected void play(){
		System.out.println("��");
	}
	protected void dream() throws NullPointerException{
		System.out.println("����");
	}
	 
	private void piao(){
		 System.out.println("������Ʈ");
	}
	//����ͨ�����ַ�ʽ ��������á�
	public void toSun(){
		piao();
	}
}
