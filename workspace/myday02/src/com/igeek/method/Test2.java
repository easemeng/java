package com.igeek.method;

public class Test2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//���������� (Overload)��
		//��ͬһ�����У��������ͬ��������ֻҪ���ǵĲ����б�ͬ���������أ�������ֵ�����޹ء�
		
		
		String str = haHa(10);
		haHa(); 
	}
	
	//public protected  default  private
	public static String haHa(int a){
		return "����";
	}
	
	public static void haHa(){
		System.out.println("����");
	}

}
