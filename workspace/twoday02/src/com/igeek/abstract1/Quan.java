package com.igeek.abstract1;

// ������  ����ʵ�������� �� ���ܴ������������ ��

// �������п����зǳ��󷽷� �� 
// �������п����й����� �� ������ʵ��������   �������Ǹ�������ʹ�õ� �� 
// ���һ������ �� ���ڳ��󷽷� �� ��ô����������ڵ���һ���ǳ�����
public abstract class Quan {

	// ���������еĹ�ͬ��������Ϊ
	// abstract ���ε��� ����������

	public String name;
	public String type;
	public int age;

	public Quan() {

	}

	public Quan(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	// Ȯ�ƶ���  ��һ�����  ��    ��     ��
	// ��  ������ 
	// ��  �����
	// ��  ����...
	public abstract void speak();

	public abstract void eat();

	// ����Ҳ���Ա�abstract�ؼ��������Ρ� ���󷽷� û�з����塣{...}
	public abstract void dream();

}
