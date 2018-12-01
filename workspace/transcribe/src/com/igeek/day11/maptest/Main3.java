package com.igeek.day11.maptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main3 {

	public static void main(String[] args) {
		
		// �������� �� ������	Arrays
		int [] a = {1,23,456,4564,321,897,34,0,34,88,6,99};
		Arrays.sort(a);
		int b = Arrays.binarySearch(a, 23);
		// binarySearch(byte[] a, byte key)   ʹ�ö����������㷨����ָ��ֵ��ָ���ֽ����顣
		System.out.println(b);
		// Arrays.toString(a);  // ��Ҫ���������� ת�����ַ������ �� 
		System.out.println(Arrays.toString(a));
		
		// �������� �� ������	Collections
		ArrayList<String> list = new ArrayList<String>();
		
		Collections.addAll(list, "�����ħ","����","Ԫ��");
		
		System.out.println(list);
		
		// ����һ�����ĺ� �� 
		
		int sum = test(10,20);
		System.out.println(sum);
		
		int [] arrs = {10,20};
		int sum2 = test1(arrs);
		System.out.println(sum2);

	}
	
	// �����Ŀɱ���� ��  JDK 1.5 ֮��ű�֧�� �� 
	// ע��   �ɱ����   ����д��ǰ�� �� ����ֻ��Ҫ��һ���ɱ���� �� 
	// ע�� �� �ɱ����	�ᱻ�������������� �� ���˿ɱ����֮�� �� ���Ƕ��ڲ�����ȷ��������� �� ���÷���ȥ���������صķ���
	public static int test(int ... my){
		int sum = 0;
		for(int i = 0; i < my.length;i++){
			sum += my[i];
		}
		return sum;
	}
	
	// int ... my   �ȼ���	int [] my	һ����
	public static int test1(int [] my){
		int sum = 0;
		for(int i = 0; i < my.length;i++){
			sum += my[i];
		}
		return sum;
	}
	
	public static int sum(int a){
		int sum = 0;
		sum += a;
		return sum;
	}
	
	public static int sum(int a,int b){
		int sum = 0;
		sum += a;
		sum += b;
		return sum;
	}

}
