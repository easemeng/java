package com.igeek.if1;

import java.util.Scanner;

public class TestIf6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿼�Գɼ�:");
		int score = sc.nextInt();
		//����������if  else else if �Ƚ�����  ������if ��ʼ ��else ����������һ������ �������ֻ֧�ᱻִ��1�Ρ�
		if(score<0 || score>100){
			System.out.println("��ĳɼ��Ǵ����");
		}else if(score>=90 && score<=100){
			System.out.println("��ĳɼ���������");//1
		}else if(score>=80 && score<=90){
			System.out.println("��ĳɼ����ں�");//1
		}else if(score>=70 && score<80){
			System.out.println("��ĳɼ�������");
		}else if(score>=60 && score<70){
			System.out.println("��ĳɼ����ڼ���");
		}else {
			System.out.println("��ĳɼ����ڲ�����");
		}

	}

}
