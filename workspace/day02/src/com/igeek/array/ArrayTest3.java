package com.igeek.array;

public class ArrayTest3 {
	
	/**
	 * 
	 * �����е����Զ���Ĭ��ֵ  ��
	 * 		����     0   byte short  int long 
	 * 		����     0.0   float double 
	 * 		����     false  
	 * 		�ַ���   ' ' 
	 * 		
	 * 		
	 * 		����������������Ĭ��ֵ����null�������Ĭ��ֵ����null.
	 */
	public static void main(String[] args) {
		int [] arrays = new int[5];  //5 ��ʾ����ĳ��ȡ� ������Ԫ�صĸ�����
		arrays[0]=10;
		arrays[1]=11;
		arrays[2]=12;
		arrays[3]=13;
		arrays[4]=14;
		
		/*for(int i=0;i<arrays.length;i++){
			System.out.println(arrays[i]);
		}*/
		
		int [] arrays2 = new int[5];
		arrays[0]=10;
		arrays[1]=11;
		arrays[2]=12;
		arrays[3]=13;
		arrays[4]=14;
		
		//  == �� �Ǹ�ʲô�ģ�����   �Ƚ��������ߵ�ֵ�Ƿ���ȡ�
		//  ==��equals()���� ... 
		//   ==  ���ڻ�����������   ==��  �Ƚϵ����������ߵ�ֵ �Ƿ���� ��
		//   ==  ����������������   ==��   �Ƚϵ��Ƕ�����ڴ��ַ��(���е�λ�á�)
		System.out.println(arrays==arrays2);
		
		int a = 10 ;
		int b = 20 ;
		System.out.println(a==b);
		
	}

}