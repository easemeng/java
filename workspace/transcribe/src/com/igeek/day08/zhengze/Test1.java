package com.igeek.day08.zhengze;

public class Test1 {
	
	public static void main(String[] args) {
		
		String phone = "18888888888";
		
		// 然后指定一个规则  规则也是字符串
		String regex = "1[34578][0-9]{9}";
		///^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+(\.[a-zA-Z]{2,3})+$/
		boolean flag = phone.matches(regex);
		System.out.println(flag);
		
		
		String strs = "hello  java hello     nihao   hehe";
		
		// 可以使用正则表达式   来分切你的字符串 。 
		String [] newstrs = strs.split(" +");
		
		for (String string : newstrs) {
			System.out.println(string);
		}
		
		
		
		
		String phone2 = "18888888888";
		
		// 然后指定一个规则  规则也是字符串
		String regex2 = "1[34578][0-9]{9}";
		///^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+(\.[a-zA-Z]{2,3})+$/
		boolean flag2 = phone2.matches(regex2);
		System.out.println(flag2);
		
		
		String strs2 = "hello  java hello     nihao   hehe";
		
		// 可以使用正则表达式   来分切你的字符串 。 
		String [] newstrs2 = strs2.split(" +");
		
		for (String string : newstrs2) {
			System.out.println(string);
		}
		
		
		
		
		String phone3 = "18888888888";
		
		// 然后指定一个规则  规则也是字符串
		String regex3 = "1[34578][0-9]{9}";
		///^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+(\.[a-zA-Z]{2,3})+$/
		boolean flag3 = phone.matches(regex);
		System.out.println(flag);
		
		
		String strs3 = "hello  java hello     nihao   hehe";
		
		// 可以使用正则表达式   来分切你的字符串 。 
		String [] newstrs3 = strs3.split(" +");
		
		for (String string : newstrs3) {
			System.out.println(string);
		}
		
		
		
		
		String phone4 = "18888888888";
		
		// 然后指定一个规则  规则也是字符串
		String regex4 = "1[34578][0-9]{9}";
		///^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+(\.[a-zA-Z]{2,3})+$/
		boolean flag4 = phone.matches(regex4);
		System.out.println(flag4);
		
		
		String strs4 = "hello  java hello     nihao   hehe";
		
		// 可以使用正则表达式   来分切你的字符串 。 
		String [] newstrs4 = strs.split(" +");
		
		for (String string : newstrs) {
			System.out.println(string);
		}
		
		
		
		
		String phone5 = "18888888888";
		
		// 然后指定一个规则  规则也是字符串
		String regex5 = "1[34578][0-9]{9}";
		///^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+(\.[a-zA-Z]{2,3})+$/
		boolean flag5 = phone5.matches(regex5);
		System.out.println(flag5);
		
		
		String strs5 = "hello  java hello     nihao   hehe";
		
		// 可以使用正则表达式   来分切你的字符串 。 
		String [] newstrs5 = strs5.split(" +");
		
		for (String string : newstrs5) {
			System.out.println(string);
		}
	}

}
