package com.igeek.oop2;

import com.igeek.abstract1.Dog;
import com.igeek.abstract1.Quan;
import com.igeek.abstract1.Wolf;

public class Test1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//
		Dog dog = new Dog();
		//
		Wolf wolf = new Wolf();
		// ��ô������ʵ�ʵ��÷�����ʱ����Դ���������󣬻��߽ӿ�ʵ�������
		speak(wolf);
		
		// ͬ��Ҳ���Դ����������ת�͵Ķ���

	}
	// String ...	Java.lang.���µ��඼��������
	// ��������ʽ���� �� ������ʱ�� �� ��Ҫ�㴫��һ�����������߽ӿڶ��� �� 
	
	public static void speak(Quan quan){
		quan.speak();
	}

}
