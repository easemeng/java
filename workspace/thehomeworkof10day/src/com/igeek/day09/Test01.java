package com.igeek.day09;

import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ËïÎò¿Õ");
		list.add("Öí°Ë½ä");
		list.add("É³ºÍÉĞ");
		list.add("ÌúÉÈ¹«Ö÷");
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		System.out.println(list.size());
		
		list.remove("ÌúÉÈ¹«Ö÷");
		
		list.remove(2);
		
		list.set(1, "ÖíÎòÄÜ");
		
		System.out.println(list);

	}

}
