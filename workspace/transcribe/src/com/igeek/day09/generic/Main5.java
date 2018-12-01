package com.igeek.day09.generic;

public class Main5 {

	public static void main(String[] args) {

		GenericTest<String, String> gt = new GenericTest<String, String>();
		gt.add("");
		GenericTest<Integer, String> gt1 = new GenericTest<Integer, String>();
		gt1.add(123);
		GenericTest gt2 = new GenericTest();
		// 当不指定泛型的时候，类中定义的泛型标识 就会是 Object
		gt2.add(1);
		gt2.add("");
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
