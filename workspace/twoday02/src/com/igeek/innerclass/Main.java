package com.igeek.innerclass;

import com.igeek.xiushifu.Test1;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// ����Ĵ�����ʽ �� 
		// 1. ����	��������	=	new ������();
		// 2. ��������		new ������();
		// 3. ȫ·��.����	��������	=	new ȫ·��.����();
		// 4. ͨ��Java����		5. spring ioc...
		
		// ��������������ͬ�����ʱ�����ѡ��������Ĭ�ϴ������������ж��󣬶������������µ��Ǹ��ࡣ
		
		com.igeek.abstract1.Test01 test1 = new com.igeek.abstract1.Test01();
		com.igeek.oop2.Test1 test2 = new com.igeek.oop2.Test1();
		Test1 test3 = new Test1();
	}

}