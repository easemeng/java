package com.igeek.recursion;

public class TestMain {

	static int i = 0;
	public static void main(String[] args) {
		methodA();

	}
	
	/**  
	* @Title: methodA  
	* @Description: ��һ����������ӡi,i++,�ٵ�����������,i++,��ӡ
	*/
	public static void methodA() {
		System.out.println("����A:"+i);
		i++;
		methodB();
		i++;
		System.out.println("����A:"+i);
	}
	
	/**  
	* @Title: methodB  
	* @Description: �ڶ�������      
	*/
	public static void methodB() {
		System.out.println("����B:"+i);
		i++;
		methodC();
		i++;
		System.out.println("����B:"+i);
	}

	/**  
	* @Title: methodC  
	* @Description: ����������      
	*/
	private static void methodC() {
		System.out.println("����C:"+i);
		i++;
		methodD();
		i++;
		System.out.println("����C:"+i);
	}

	/**  
	* @Title: methodD  
	* @Description: ���ĸ�����      
	*/
	private static void methodD() {
		System.out.println("����D:"+i);
	}

}
