package com.igeek.day09.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTest3 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("",1));
		list.add(new Person("",2));
		list.add(new Person("",3));
		list.add(new Person("",4));
		
		int sumAge = 0;
		ArrayList<Person> newlist = new ArrayList<Person>();
		Iterator<Person> ite = list.iterator();
		
		while(ite.hasNext()){
			Person thisNum = ite.next();
			if(thisNum.getAge() == 18){
				// 当年龄 = 18		就往新的集合里添加数据
				newlist.add(new Person("LGD",90));
				// 注意 ： 此时在迭代器遍历集合的时候 ， 不允许对原始集合做修改操作 。 
			}
			
			System.out.println(thisNum.getName() + "\t" + thisNum.getAge());
			sumAge += thisNum.getAge();
		}
		System.out.println(sumAge);
		
		// 把新的集合整体拼接过来
		list.addAll(newlist);
		
		/**
		 * 格式：
		 *  for(数据类型  xxx : list){
		 *  	System.out.println(xxx);
		 *  }
		 */
		
		for (Person person : list) {
			Person s = new Person();
			System.out.println(s.getName() + "\t" + s.getAge());
		}
		// ConcurrentModificationException 并发修改异常。
		
		// 创建一个新的集合对象 。 这个集合中存放每一个90的人 。 装完之后 ， 再把这个新的集合 ， 放到老的集合中。

	}

}
