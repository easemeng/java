package com.igeek.class1;

public class Test1 {
	/**
	 * �������  
	 * 	��װ:
	 * 		1.˽�����ԣ��ṩ���е�set/get��
	 * 		2.��ʵ��ĳһ�ι��ܵĴ��룬д�뵽һ�������еĹ��̡�����Ҳ�з�װ��  
	 *  �̳�:
	 *  ��̬:
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//ͨ��һ����Ĺ����������ǿ��Դ�������������
		
		//��������
		TestVraiable tv1 = new TestVraiable();
		TestVraiable tv2 = new TestVraiable();
		tv1.setAge(22);
		//tv1.age=100;
		TestVraiable.country="���峯.";
		//tv2.age=200;
		int age = tv1.getAge();//��ֵ���á�
		System.out.println(age);
		System.out.println(TestVraiable.country);
		
		//System.out.println(tv2.age);
		System.out.println(TestVraiable.country);
		
	}
	
	//���   �� ����һ��������������㷵�� 1��������ĺ� ��
	public int getSum(int n){
		int sum = 0;
		for (int i = 1; i <=n; i++) {
			sum+=i;
		}
		return sum;
	}

}
