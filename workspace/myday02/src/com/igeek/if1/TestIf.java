package com.igeek.if1;

public class TestIf {

	public static void main(String[] args) {
		
		int x = 10;
		//x=x-10;  x=0   0>0  false  0=0
		if((x-=10)>0){
			System.out.println("����");
		}else{
			System.out.println("�Ǻ�!!!");
		}
	}

}
