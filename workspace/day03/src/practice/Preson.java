package practice;

public class Preson {
	
	// ���Ի��Ա����
	public String name;
	public int age;
	boolean isMarried;
	
	// ������
	public Preson(){}
/*	public Person(String n,int a,boolean im){
		name = n;
		age = a;
		isMarried = im;
	}*/
	
	// ����������
	public void walk(){
		System.out.println("��·...");
	}
	
	public String display(){
		
		return "�����ǣ�" + name + ",�����ǣ�" + age + ",Married:" + isMarried;
		
	}
	
	
	// �����
	{
		name = "lilei";
		age = 71;
		isMarried = true;
	}
	
	// �ڲ���
	class pet{
		String name;
		float weight;
		float height;
	}

	public static void main(String[] args) {
		

	}

}
