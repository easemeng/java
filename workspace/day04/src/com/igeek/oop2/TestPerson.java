package com.igeek.oop2;

/*
 * @Override  �ж�ע�����εķ��� �Ƿ�������д������
 * @SuppressWarnings("unused")  ���Ʊ��뾯�档
 * @Deprecated ��ʾ�������� ��  ���Ժ�İ汾�����п��ܻᱻɾ�������滻����
 *  JDK 1.0    ---   1.9  �� ��  �ȶ� ��1.8   1.9
 */
@Deprecated
public class TestPerson {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 10;
		//�������������    �������� = new ������();
		//java�еĶ�����ͨ�������� ���������ġ�
		
		//Scanner sc = new Scanner(System.in);
		Person tom = new Person("��ȫ��", 20, "��");// �ȴ��������ָ���������˳�ʼ������(�������еĳ�Ա�������и�ֵ��)
		//������toString֮��  �ٴ�ӡ��������  ������ʾ������ڴ��ַ�����ǵ���toString������
		System.out.println(tom);
		
		Person jack = new Person();// �����Ĵ������󣬲�û�и������ʼ�� (�������еĳ�Ա�������и�ֵ��)
		System.out.println(jack);
	}

}