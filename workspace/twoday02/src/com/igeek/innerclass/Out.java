package com.igeek.innerclass;

public class Out {
	
	private static String name = "�ⲿ��";
	// �ڲ���
	public class Inner{
		// ������...
		// ����...
		// ����...
		private String name = "�ڲ����е�name";
		public String color = "��ɫ";
		
		public void show(String name){
			// Out out = new Out();
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Out.name);
			// ���ھ�̬�ڲ��� �� ��Ҫ�����ⲿ��ĳ�Ա �� һ��������Ա��ɾ�̬��
			eat();
		}
	}
	
	public void show(){
		// �ⲿ��  ��Ҫ�����ڲ���ĳ�Ա	�����ڲ������ . ��������ķ�ʽ	ֱ��	�ڲ���   ������ = new �ڲ��๹����();
		Inner in = new  Inner();
		String color = in.color;
		System.out.println(color);
	}
	
	public static void eat(){
		System.out.println("��...");
	}
	
	

}
