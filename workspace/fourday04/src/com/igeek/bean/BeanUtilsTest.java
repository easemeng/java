package com.igeek.bean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

public class BeanUtilsTest {
	
	@Test
	public void test4(){
		
	}
	
	@Test
	public void test3() throws Exception {
		Map<String,String[]> map = new HashMap<String,String[]>();
		// key һ���ʵ�����е�  field ����һ��
		map.put("uid", new String[]{"u03","u04"});
		map.put("userName", new String[]{"����","����"});
		map.put("hobbies", new String[]{"����ʳ","˯����","������","���"});
		
		User user = new User();
		
		BeanUtils.populate(user, map);
		
		System.out.println(user);
 	}

	@Test
	public void test2() throws Exception {
		User user = new User();
		// ��������������ֵ
		BeanUtils.setProperty(user, "uid", "u02");
		String result = BeanUtils.getProperty(user, "uid");
		String result2 = BeanUtils.getProperty(user, "userName");
		System.out.println(result);
		System.out.println(result2);
	}
	
	@Test
	public void test1(){
		User user = new User();
		user.setUid("u01");
		user.setUserName("Uzi");
		user.setPassword("007");
		user.setAge(36);
	}
}
