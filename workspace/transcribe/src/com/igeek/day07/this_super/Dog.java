package com.igeek.day07.this_super;

public class Dog {

	// 4�������� . this() n - 1
	public Dog() {
		this(10);
	}

	public Dog(int x) {
		this(10.0);
	}

	public Dog(double d) {
		this('A');
	}

	public Dog(char c) {
		// ����this��ε� ���ն���ȥִ��super()...
	}

	public void setDog() {
		System.out.println(this);
	}

}
