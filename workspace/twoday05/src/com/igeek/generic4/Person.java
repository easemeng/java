package com.igeek.generic4;

import java.util.ArrayList;

public abstract class Person<T> {
	
	// ArrayList<? super T>  �㴫��Ķ�������	  һ��Ҫ��ArrayList���͵�
	// ���Ҷ���ķ���	ֻ���� T ���� T �ĸ��� �� 
	// T �����㴴�� Person ����ʱ �� ָ��������
	// Person<String> p = new Student<String>();

	public abstract void dream(ArrayList<? super T> list);

}
