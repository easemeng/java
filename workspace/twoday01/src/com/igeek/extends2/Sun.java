package com.igeek.extends2;

public class Sun extends Fu {

	//super();  ��ʾ���ø����пյ��޲εĹ�������
	//super(10.0) ��ʾ���ø����еĹ����� ��
	public Sun(){
		//super(10);
		//super("������");
		//����ָ������������������ʱ��super()���ٵ��á�
		this(10);
		//this("����");
		System.out.println("����Ĺ�������");
		
	}  
	
	public Sun(int a){
		//super();
		//super();
		//this();
		this("����");
		System.out.println(a);//10 
	}
	
	public Sun(String str){
		//super();
		System.out.println(str);
	}
	
	//public String name="����";
	
	public void show(){
		System.out.println(this.name);
		System.out.println(super.name);
		this.eat();
		//�������������� ��
		
		//ע�⣺ͨ���̳й�ϵ���������ֱ�ӵ��ø����еķ�private������ 
		dream();//super.dream()�ȼ۵�д�� ��super.����ʡ�ԡ�
		
		System.out.println(yy);
	}
	
	public void eat(){
		System.out.println("��");
	}
	
	public void test(){
		//System.out.println(name);//Ĭ�ϵ�ǰ�����ӡ����е�name ������ʽ����name
		//System.out.println(name); ���е�nameָ��ǰ��ĳ�Ա��
		System.out.println(name);//���е�name ָ������ĳ�Ա��
		
	}
}