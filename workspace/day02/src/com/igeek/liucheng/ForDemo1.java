package com.igeek.liucheng;

public class ForDemo1 {

	public static void main(String[] args) {
		
		//ѭ���ṹ �� �������ض��������� �� ȥ����ִ��ĳ�δ���
		//i=i+5
		for(int i = 0;i < 10;i += 5){
			
			System.out.println("����");
			if(i==5){
				break;//ǿ��������ǰѭ����
			}
			System.out.println("ABC");
		}
		// 1 2 3 4 2 3 4 2 3 4 ...ֱ��2������������ ѭ������
		
		//����1��100���������ĺ� �� ���������ĺ� �� ����ż���ĺ� �� 
		
		//����һ������ �������ܽ��
		//int sum = 0;
		int even = 0; //ż��
		int odd = 0;
		for(int i = 1;i < 10;i++){
			//sum+=1; // �ȼ��� sum = sum + i ; 
			if(i % 2 == 0){
				even += i;
			}else{
				odd += i;
			}
			
		}
		//System.out.println(sum);
		System.out.println("����ż���ĺ�" + even + "���������ĺ�" + odd);

	}

}
