package com.igeek.interface1;

public class Test {

	public static void main(String[] args) {
		
		Count count = new ShuiYun();
		// �ӿ�ͬ��������ɶ�̬��
		count.count();
		
		System.out.println(Count.FEI_LV);

	}
	/**
	 *  Count count = new Count(){
	 *  	// �����ڲ��� �� ����ʵ�ֽӿ� �� 
	 *  	@Override
	 *  	public void count (){
	 *  		System.out.println("");
	 *  	};
	 */

}
