package com.igeek.operator;

public class Demo3 {

	public static void main(String[] args) {
		/**
		 * �߼������ ���߼����������·�������
		 * (�߼��ϵĶ����Ƚ��Ͻ�������ʲô�������������㡣)
		 * (��· ����������£��ұ߲��������㡣)
		 * 	& ��ʾ��     �߼�&   ֻ�����߶�Ϊ���ʱ������Ϊ�档
		 * 	| ��ʾ��    �߼�|  ����ֻҪ��һ������ģ���������ʽ�Ľ��������ġ�
		 * 
		 * 	! ��ʾ! ȡ������˼ !true ����false !false����true  
		 * 
		 * 	^ ��ʾ�߼����   ���߽��һֱ��false  ���߽����һ�¾���true
		 * 
		 *  && ��·�� ��ʾ�����ߵĽ��Ϊfalse,�ұ߲���������㡣
		 *  || ��·�� ��ʾ�����ߵĽ��Ϊtrue,�ұ߲���������㡣
		 */
		
		boolean flag = !false;
		System.out.println(flag);
		/*
		int x = 1,y = 1;

		if(x++==1 | ++y==1){
			x =7;
		}
		System.out.println("x="+x+",y="+y);  
*/
		int x = 1,y = 1;

		if(x++==1 || ++y==1){
			x =7;
		}
		System.out.println("x="+x+",y="+y); 
		
		
		System.out.println(2<<1);
	}

}