package com.igeek.baozhuang;

public class Test1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// ��װ��
		// �����������ͣ�������������
		// ÿ�������������Ͷ�������֮��Ӧ�������������� �� ���ǰ�װ��
		/**
		 * byte		Byte
		 * short    Short
		 * int		 Integer
		 * long		Long
		 * float	Float
		 * double	Double
		 * boolean	Boolean
		 * char		 Character
		 */
		// ��װ���д��ںܶೣ�õ����Ը����� �� 
		
		// װ�� �� ����
		// װ�䣺�ѻ�����������ת���ɰ�װ����� �� 
		// ���䣺�Ѱ�װ�����ת���ɻ����������� �� 
		// JDK1.5   �ֶ���ȥ��װ��		JDK1.5֮��֧���Զ���װ�� �� 
		
		/*byte b1 = 12;
		Byte b2 = new Byte(b1);  // װ�� �� 
		Integer i1 = new Integer(b1);
		System.out.println(b2.MAX_VALUE);
		System.out.println(b2.MIN_VALUE);
		
		System.out.println(i1.MAX_VALUE);
		System.out.println(i1.MIN_VALUE);
		
		byte b3 = b2.byteValue();  // ����	�����ǲ��䶼�ǵ���xxxxValue������
		int i2 = i1.intValue();*/
		
		
		int i = 10;
		Integer i2 = i;  // �Զ�װ�� �� 		������װ����� = �����������͡�
		Integer i3 = 10;
		System.out.println(i2);
		
		int i4 = i3;  // �Զ����� �� 
		System.out.println(i4);
		String str = "123";
		int result = Integer.parseInt(str);  // ��ΰ�һ���ַ���ת���ɻ����������� �� 
		double result2 = Double.parseDouble(str);
		float result3 = Float.parseFloat(str);
		// ע�������Ǵ������ַ���
		System.out.println(result3);

	}
}