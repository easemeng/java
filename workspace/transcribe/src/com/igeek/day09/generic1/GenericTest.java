package com.igeek.day09.generic1;

// ���ͻ����Ե���������� ��   // E = String

public class GenericTest<E> {

	// ���ͱ�������ĳ�Ա ��
	private E myField; // ��һ�����Բ�ȷ����ʲô���͵�ʱ�� ��

	public E getmyField() {
		return myField;
	}

	public void setmyField(E myField) {
		this.myField = myField;
	}

}
