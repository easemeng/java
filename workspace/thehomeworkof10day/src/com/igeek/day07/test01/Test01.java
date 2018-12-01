package com.igeek.day07.test01;

import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {
		
		ArrayList<Test01Teacher> list = new ArrayList<Test01Teacher>();
		ArrayList<Test01Course> list1 = new ArrayList<Test01Course>();
		Test01Teacher tea = new Test01Teacher();
		
		
		System.out.println("教师编号	姓名	性别	年龄	科目");
		
		tea.setId("t001");
		tea.setName("薛之谦");
		tea.setSex("男");
		tea.setAge(26);
		tea.setSubject("Java");
		list.add(tea);
		
		Test01Teacher tea1 = new Test01Teacher();
		tea1.setId("t002");
		tea1.setName("张碧晨");
		tea1.setSex("女");
		tea1.setAge(24);
		tea1.setSubject("iOS");
		list.add(tea1);
		
		Test01Teacher tea2 = new Test01Teacher();
		tea2.setId("t003");
		tea2.setName("张杰");
		tea2.setSex("男");
		tea2.setAge(28);
		tea2.setSubject("Java");
		
		list.add(tea2);
		
		System.out.println(list);
		
		System.out.println("课程编号	 名称	创建时间		课程描述");
		Test01Course cou = new Test01Course();
		cou.setSubId("s001");
		cou.setSubName("java");
		cou.setStartDate("2007-02-08");
		cou.setSubDescribe("Java学科，包含JavaSE和JavaEE");
		
		list1.add(cou);
		
		Test01Course cou1 = new Test01Course();
		
		cou1.setSubId("s002");
		cou1.setSubName("IOS");
		cou1.setStartDate("2007-02-09");
		cou1.setSubDescribe("IOS系统开发");
		
		list1.add(cou1);
		
		System.out.println(list1);

	}

}
