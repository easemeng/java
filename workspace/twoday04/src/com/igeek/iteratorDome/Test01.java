package com.igeek.iteratorDome;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person("jack",18);
		Person p2 = new Person("Rose",16);
		Person p3 = new Person("Trump",62);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Iterator<Person> ite = list.iterator();
		
		int sumAge = 0;
		
		while(ite.hasNext()){
			Person thisP = ite.next();
			System.out.println(thisP.getAge() + "ËêµÄ" + thisP.getName());
			
			sumAge += thisP.getAge();
		}
		System.out.println(sumAge);

	}

}
