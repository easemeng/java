package com.igeek.homework;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
	//	one();
	//	two();
	//	three();
	//	four();
	//	five();
	//	six();
		seven();
	}
	
	@SuppressWarnings("resource")
	public static void one(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("����һ��Сд��ĸ");
		char i = scanner.next().charAt(0);
		
		switch (i) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		case 'e':
			System.out.println("E");
			break;

		default:
			System.out.println("Other");
			break;
		}
		
		}
	
	
	@SuppressWarnings("resource")
	public static void two(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ɼ�");
		
		int i = scanner.nextInt();
		switch (i / 10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("���ϸ�");
			break;

		default:
			System.out.println("�ϸ�");
			break;
		}
		}
	
	@SuppressWarnings("resource")
	public static void three(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������·ݣ�");
		int i = scanner.nextInt();
		switch(i){
		case 3:
		case 4:
		case 5:
			System.out.println("����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
			default:
				System.out.println("��������ȷ���·�");
		}
	}
	
	@SuppressWarnings("resource")
	public static void four(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������2014����·ݣ�");
		int i = scanner.nextInt();
		System.out.println("���������ڣ�");
		int j = scanner.nextInt();
		int sum = 0;
		
		switch(i){
		case 12:
			sum += 30;
		case 11:
			sum += 31;
		case 10:
			sum += 30;
		case 9:
			sum += 31;
		case 8:
			sum += 31;
		case 7:
			sum += 30;
		case 6:
			sum += 31;
		case 5:
			sum += 30;
		case 4:
			sum += 31;
		case 3:
			sum += 28;
		case 2:
			sum += 31;
		case 1:
			sum += j;
		}
		
		System.out.println("2014��" + i + "��" + j + "����2014���" + sum + "��");
		
		
	}
	
	public static void five(){
		
		int a = 3;
		int x = 100;
		
		switch (a) {
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;

		default:
			x += 34;
			break;
		}
		System.out.println(x);
	}
	
	@SuppressWarnings("resource")
	public static void six(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ɼ���");
		int score = scanner.nextInt();
		switch(score/10){
		case 10:
		case 9:
			System.out.println("�ȼ���A");
			break;
		case 8:
		case 7:
			System.out.println("�ȼ�: B");
			break;
		case 6:
			System.out.println("�ȼ�: C");
			break;
			default:
				System.out.println("�ȼ���D");
				break;
		}
	}
	
	@SuppressWarnings("resource")
	public static void seven(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��������ݣ�");
		int k = scanner.nextInt();
		System.out.println("�������·ݣ�");
		int i = scanner.nextInt();
		System.out.println("���������ڣ�");
		int j = scanner.nextInt();
		int sum = 0;
		
		switch(i){
		case 12:
			sum += 30;
		case 11:
			sum += 31;
		case 10:
			sum += 30;
		case 9:
			sum += 31;
		case 8:
			sum += 31;
		case 7:
			sum += 30;
		case 6:
			sum += 31;
		case 5:
			sum += 30;
		case 4:
			sum += 31;
		case 3:
			if(k % 4 == 0 && k % 100 != 0 || k % 400 == 0){
				sum += 29;
			}else{
				sum += 28;
			}
		case 2:
			sum += 31;
		case 1:
			sum += j;
		
		}
		
		System.out.println(k + "��" + i + "��" + j + "����" + k + "���" + sum + "��");
	
	}

}
