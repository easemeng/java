package com.igeek.method;

public class Test1 {

	public static void main(String[] args) {
		//���� �� ������������ض����ܵ�ĳһ�δ��롣
		
		//����Method(����Function)����ĸ�ʽ ��
		
		//����Ȩ�����η�   + ����ֵ����  +�������� (�����б�){ 
		//		������
		//		return ����ķ���ֵ;
		//}
		
		//��ε��÷��� ����
		//getSum(10,20);  //���������з���ֵ�ķ�����û���κ�����ġ�
		
		//System.out.println(getSum(10,20));//��ʱ���ӡ��ǰ�����ķ���ֵ�� ����Ҳ���Ƽ���
		
		//int i = getSum(10,20);//��ֵ���á� �Ƽ�ʹ�ø�ֵ���á�
		//System.out.println(i);
		print();//void ��ʾ����û�з���ֵ���ͣ��������ַ������� ������ֻ�ܵ��á�
	}
	
	//public ���е�  protected �ܱ�����  default Ĭ�ϲ�д��  private ˽�е� ��
	//����ֵ����  �������ǻ����������ͣ�Ҳ���������������� ��
	//��������    �Լ������ ��������    aaaBbbCcc  
	//�����б� �� ��ʾ�ڵ��÷�����ʱ����Ҫ����ľ������ ��
	//return ��ʾ�����ķ���ֵ ��
	
	public static int  getSum(int a,int b){//a=10,b=20;
		//
		// �����塣
		//
		getMax(2,3);//�����ĵ��� ��
		return a+b; //return ǿ���������� �����ҷ������� ��
	}
	
	//ע�⣺����֮�䲻�ܻ���Ƕ�� ��
	public static int getMax(int x,int y){
		//getSum(10,20); // ����֮�䲻�ܻ�����ã���ѭ����
		return x;
	}
	
	//StackOverflowError   һ��Error ���޷�ͨ�������� ��
	//Exception  ���Դ���� ��
	//Throwable �������쳣(Exception)��������(Error)�ĸ��� ��
	
	public static void print(){
		System.out.println("��������á�");
	}

}
