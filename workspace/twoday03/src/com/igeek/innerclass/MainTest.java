package com.igeek.innerclass;

import com.igeek.innerclass.Out.Inner;

public class MainTest {

	public static void main(String[] args) {
		// anonymous inner class �����ڲ���
		Niu niu = new Niu(){
			
			@Override
			public void dream() {
				System.out.println("����ɮ�� �� ");
			}
			
			@Override
			public void play(){
				System.out.println("������� ��");
			}
		};
		
		niu.dream();
		niu.play();
		
		// �����ڲ������ķ�ʽ
		
		Out out = new Out();
		Inner in = out.new Inner();
		in.eat("gaga");

	}

}