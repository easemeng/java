package com.igeek.day02.liucheng;

public class ForDemo3 {

	public static void main(String[] args) {
		
		//test1();
		//test2(998);
		//test2();
		//test3();
		test4();
	}
	
	public static void test1(){
		//��ӡ1~100֮��������7�ı����������ĸ�����  
				//�ܺͣ�������ü�������˼�룩
				
				int sum = 0;//������͡�
				int count = 0;//����������
				for (int i = 1; i < 101; i++) {
					if(i%7==0){
						//�����
						sum+=i;
						count++;//��������һ  ֤����һ�������ˡ�
					}
					System.out.println(sum);
					System.out.println(count);
				}
	//�������ӡ�ŵ�ѭ�����ⲿ����ӡ����ѭ�������ս�����ŵ�ѭ�����ڲ�����ӡ����ѭ���Ĺ��̡�
	}
	
	public static void test2(){
		// 100 - 999 
		//ˮ�ɻ���  ��153  ��λ  ʮλ  ��λ  ��555
		//System.out.println("������İ�λ:" +i/100);
		//System.out.println("������ĸ�λ:" +i%10);
		//System.out.println("�������ʮλ:" +(i/10)%10);
		
		for(int i=100;i<1000;i++){
			int b = i/100;
			int g = i%10;
			int s = (i/10)%10;
			if(b*b*b+g*g*g+s*s*s==i){
				System.out.println(i);
			}
		}
	}
	
	public static void test3(){
		//��200�������е�����  ��  ֻ�ܱ�1��������������������������α�2������-1 ���䷶Χ�ڵ�����һ���� ������ ,�Ͳ���������
		for(int i = 2;i<=200;i++){
			boolean flag = true;//��������
			for(int j = 2;j<i;j++){
				//���Ǳ�����һ���������ˡ�
				if(i%j==0){
					//�����������ѱ�־�Ʒ���
					flag=false;
					//break;//һ��ѭ����
					return;//ǿ���������� ����������κ�ѭ��������������ִ���ˡ�
				}
			}
			// �������յļ���  ��flag ��ʾ��ǰѭ���е�i ��ȷ��һ��������  ֱ��������i�Ϳ����� ��
			if(flag){
				System.out.println(i);
			}
		}
	}
	
	public static void test4(){
		int i = 0;
		do{
			i++;
			if(i==3){
				continue;//continue ��ʾ��ֹ����ѭ�����ص�ѭ��ͷ�������´�ѭ����
				
			}
			System.out.println(i);//1 2  3  
		}while(i<5);
	}
	
	
	
	
	public static void test11(){
		//��ӡ1~100֮��������7�ı����������ĸ�����  
				//�ܺͣ�������ü�������˼�룩
				
				int sum = 0;//������͡�
				int count = 0;//����������
				for (int i = 1; i < 101; i++) {
					if(i%7==0){
						//�����
						sum+=i;
						count++;//��������һ  ֤����һ�������ˡ�
					}
					System.out.println(sum);
					System.out.println(count);
				}
	//�������ӡ�ŵ�ѭ�����ⲿ����ӡ����ѭ�������ս�����ŵ�ѭ�����ڲ�����ӡ����ѭ���Ĺ��̡�
	}
	
	public static void test12(){
		// 100 - 999 
		//ˮ�ɻ���  ��153  ��λ  ʮλ  ��λ  ��555
		//System.out.println("������İ�λ:" +i/100);
		//System.out.println("������ĸ�λ:" +i%10);
		//System.out.println("�������ʮλ:" +(i/10)%10);
		
		for(int i=100;i<1000;i++){
			int b = i/100;
			int g = i%10;
			int s = (i/10)%10;
			if(b*b*b+g*g*g+s*s*s==i){
				System.out.println(i);
			}
		}
	}
	
	public static void test13(){
		//��200�������е�����  ��  ֻ�ܱ�1��������������������������α�2������-1 ���䷶Χ�ڵ�����һ���� ������ ,�Ͳ���������
		for(int i = 2;i<=200;i++){
			boolean flag = true;//��������
			for(int j = 2;j<i;j++){
				//���Ǳ�����һ���������ˡ�
				if(i%j==0){
					//�����������ѱ�־�Ʒ���
					flag=false;
					//break;//һ��ѭ����
					return;//ǿ���������� ����������κ�ѭ��������������ִ���ˡ�
				}
			}
			// �������յļ���  ��flag ��ʾ��ǰѭ���е�i ��ȷ��һ��������  ֱ��������i�Ϳ����� ��
			if(flag){
				System.out.println(i);
			}
		}
	}
	
	public static void test14(){
		int i = 0;
		do{
			i++;
			if(i==3){
				continue;//continue ��ʾ��ֹ����ѭ�����ص�ѭ��ͷ�������´�ѭ����
				
			}
			System.out.println(i);//1 2  3  
		}while(i<5);
	}
	
	
	
	
	public static void test21(){
		//��ӡ1~100֮��������7�ı����������ĸ�����  
				//�ܺͣ�������ü�������˼�룩
				
				int sum = 0;//������͡�
				int count = 0;//����������
				for (int i = 1; i < 101; i++) {
					if(i%7==0){
						//�����
						sum+=i;
						count++;//��������һ  ֤����һ�������ˡ�
					}
					System.out.println(sum);
					System.out.println(count);
				}
	//�������ӡ�ŵ�ѭ�����ⲿ����ӡ����ѭ�������ս�����ŵ�ѭ�����ڲ�����ӡ����ѭ���Ĺ��̡�
	}
	
	public static void test22(){
		// 100 - 999 
		//ˮ�ɻ���  ��153  ��λ  ʮλ  ��λ  ��555
		//System.out.println("������İ�λ:" +i/100);
		//System.out.println("������ĸ�λ:" +i%10);
		//System.out.println("�������ʮλ:" +(i/10)%10);
		
		for(int i=100;i<1000;i++){
			int b = i/100;
			int g = i%10;
			int s = (i/10)%10;
			if(b*b*b+g*g*g+s*s*s==i){
				System.out.println(i);
			}
		}
	}
	
	public static void test23(){
		//��200�������е�����  ��  ֻ�ܱ�1��������������������������α�2������-1 ���䷶Χ�ڵ�����һ���� ������ ,�Ͳ���������
		for(int i = 2;i<=200;i++){
			boolean flag = true;//��������
			for(int j = 2;j<i;j++){
				//���Ǳ�����һ���������ˡ�
				if(i%j==0){
					//�����������ѱ�־�Ʒ���
					flag=false;
					//break;//һ��ѭ����
					return;//ǿ���������� ����������κ�ѭ��������������ִ���ˡ�
				}
			}
			// �������յļ���  ��flag ��ʾ��ǰѭ���е�i ��ȷ��һ��������  ֱ��������i�Ϳ����� ��
			if(flag){
				System.out.println(i);
			}
		}
	}
	
	public static void test24(){
		int i = 0;
		do{
			i++;
			if(i==3){
				continue;//continue ��ʾ��ֹ����ѭ�����ص�ѭ��ͷ�������´�ѭ����
				
			}
			System.out.println(i);//1 2  3  
		}while(i<5);
	}
	
	
	
	
	public static void test31(){
		//��ӡ1~100֮��������7�ı����������ĸ�����  
				//�ܺͣ�������ü�������˼�룩
				
				int sum = 0;//������͡�
				int count = 0;//����������
				for (int i = 1; i < 101; i++) {
					if(i%7==0){
						//�����
						sum+=i;
						count++;//��������һ  ֤����һ�������ˡ�
					}
					System.out.println(sum);
					System.out.println(count);
				}
	//�������ӡ�ŵ�ѭ�����ⲿ����ӡ����ѭ�������ս�����ŵ�ѭ�����ڲ�����ӡ����ѭ���Ĺ��̡�
	}
	
	public static void test32(){
		// 100 - 999 
		//ˮ�ɻ���  ��153  ��λ  ʮλ  ��λ  ��555
		//System.out.println("������İ�λ:" +i/100);
		//System.out.println("������ĸ�λ:" +i%10);
		//System.out.println("�������ʮλ:" +(i/10)%10);
		
		for(int i=100;i<1000;i++){
			int b = i/100;
			int g = i%10;
			int s = (i/10)%10;
			if(b*b*b+g*g*g+s*s*s==i){
				System.out.println(i);
			}
		}
	}
	
	public static void test33(){
		//��200�������е�����  ��  ֻ�ܱ�1��������������������������α�2������-1 ���䷶Χ�ڵ�����һ���� ������ ,�Ͳ���������
		for(int i = 2;i<=200;i++){
			boolean flag = true;//��������
			for(int j = 2;j<i;j++){
				//���Ǳ�����һ���������ˡ�
				if(i%j==0){
					//�����������ѱ�־�Ʒ���
					flag=false;
					//break;//һ��ѭ����
					return;//ǿ���������� ����������κ�ѭ��������������ִ���ˡ�
				}
			}
			// �������յļ���  ��flag ��ʾ��ǰѭ���е�i ��ȷ��һ��������  ֱ��������i�Ϳ����� ��
			if(flag){
				System.out.println(i);
			}
		}
	}
	
	public static void test34(){
		int i = 0;
		do{
			i++;
			if(i==3){
				continue;//continue ��ʾ��ֹ����ѭ�����ص�ѭ��ͷ�������´�ѭ����
				
			}
			System.out.println(i);//1 2  3  
		}while(i<5);
	}
	
	
	
	
	public static void test41(){
		//��ӡ1~100֮��������7�ı����������ĸ�����  
				//�ܺͣ�������ü�������˼�룩
				
				int sum = 0;//������͡�
				int count = 0;//����������
				for (int i = 1; i < 101; i++) {
					if(i%7==0){
						//�����
						sum+=i;
						count++;//��������һ  ֤����һ�������ˡ�
					}
					System.out.println(sum);
					System.out.println(count);
				}
	//�������ӡ�ŵ�ѭ�����ⲿ����ӡ����ѭ�������ս�����ŵ�ѭ�����ڲ�����ӡ����ѭ���Ĺ��̡�
	}
	
	public static void test42(){
		// 100 - 999 
		//ˮ�ɻ���  ��153  ��λ  ʮλ  ��λ  ��555
		//System.out.println("������İ�λ:" +i/100);
		//System.out.println("������ĸ�λ:" +i%10);
		//System.out.println("�������ʮλ:" +(i/10)%10);
		
		for(int i=100;i<1000;i++){
			int b = i/100;
			int g = i%10;
			int s = (i/10)%10;
			if(b*b*b+g*g*g+s*s*s==i){
				System.out.println(i);
			}
		}
	}
	
	public static void test43(){
		//��200�������е�����  ��  ֻ�ܱ�1��������������������������α�2������-1 ���䷶Χ�ڵ�����һ���� ������ ,�Ͳ���������
		for(int i = 2;i<=200;i++){
			boolean flag = true;//��������
			for(int j = 2;j<i;j++){
				//���Ǳ�����һ���������ˡ�
				if(i%j==0){
					//�����������ѱ�־�Ʒ���
					flag=false;
					//break;//һ��ѭ����
					return;//ǿ���������� ����������κ�ѭ��������������ִ���ˡ�
				}
			}
			// �������յļ���  ��flag ��ʾ��ǰѭ���е�i ��ȷ��һ��������  ֱ��������i�Ϳ����� ��
			if(flag){
				System.out.println(i);
			}
		}
	}
	
	public static void test44(){
		int i = 0;
		do{
			i++;
			if(i==3){
				continue;//continue ��ʾ��ֹ����ѭ�����ص�ѭ��ͷ�������´�ѭ����
				
			}
			System.out.println(i);//1 2  3  
		}while(i<5);
	}

}