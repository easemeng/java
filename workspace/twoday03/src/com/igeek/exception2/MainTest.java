package com.igeek.exception2;

public class MainTest {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("���������rank��");
		int rank = sc.nextInt();
		CaiException cai = null;
		if(rank < 2000){
			cai = new CaiException(".....");
		}
		
		try{
			throw cai;   // throw �ؼ���  ��ʾ�Զ����쳣 ��
		}catch(Exception e){
			e.printStackTrace();
		}*/
		
		test();
		
		// throw , throws , try catch  ��ʲô����
		// throw  ����һ���Զ����쳣 �� �쳣��������Լ������ �� NullPointerException
		// throws  ��ʾ�׳��쳣 �� һ��д�ڷ�����С���źʹ�����֮�� �� ˭���� ˭������
		// try catch  ��ʾ���񲢴����쳣

	}
	
	public static void test(){
		throw new NullPointerException("��ָ���� ������");
	}

}