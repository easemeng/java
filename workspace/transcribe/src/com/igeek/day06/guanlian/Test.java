package com.igeek.day06.guanlian;

//java ������  �࣬    ����(���) ���̳�
public class Test {

	public static void main(String[] args) {
		Pet yingWu = new Pet("��ķ","����ͷ�","����");
		
		Person jack = new Person("�ܿ�",20,yingWu);
		
		jack.getPet();//��Ĺ�����ϵ �� ��A���еĳ�Ա��������B���һ������
	}

}
