package com.igeek.generic;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		GenericTest<String, String> gt = new GenericTest<String, String>();
		gt.add("���");
		GenericTest<Integer, String> gt1 = new GenericTest<Integer, String>();
		gt1.add(123);
		@SuppressWarnings("rawtypes")
		GenericTest gt2 = new GenericTest();
		// ����ָ�����͵�ʱ�����ж���ķ��ͱ�ʶ �ͻ��� Object
		gt2.add(123);
		gt2.add("hahaaaahhh");
		gt2.add(true);

	}
	/**
	 * ArrayList List = new ArrayList();
	 * 	List.add("123")
	 *  list.add(23);
	 *  list.add(new Person());
	 *  list.add(10.2);
	 *  
	 *  for(int i = 0; i < list.size();i++){
	 *  	String str = (String) list.get(i);
	 *  	System.out.println(str);
	 *  }
	 *  
	 */

}
