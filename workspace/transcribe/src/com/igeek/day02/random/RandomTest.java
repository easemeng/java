package com.igeek.day02.random;

import java.util.Random;
import java.util.UUID;

public class RandomTest {

	public static void main(String[] args) {
		// Ctrl + Shift + o   快速导包
		Random r = new Random();
		
		int i = r.nextInt(20);
		
		double d = r.nextDouble();
		
		float f = r.nextFloat();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		
		UUID uuid = UUID.randomUUID();
		String uuidStr = uuid.toString();
		System.out.println(uuidStr.replace("-", " "));

		
		
		
		
		// Ctrl + Shift + o   快速导包
		Random r2 = new Random();
		
		int i2 = r2.nextInt(20);
		
		double d2 = r2.nextDouble();
		
		float f2 = r2.nextFloat();
		
		System.out.println(i2);
		System.out.println(d2);
		System.out.println(f2);
		
		UUID uuid2 = UUID.randomUUID();
		String uuidStr2 = uuid2.toString();
		System.out.println(uuidStr2.replace("-", " "));

		
		
		
		
		// Ctrl + Shift + o   快速导包
		Random r3 = new Random();
		
		int i3 = r3.nextInt(20);
		
		double d3 = r3.nextDouble();
		
		float f3 = r3.nextFloat();
		
		System.out.println(i3);
		System.out.println(d3);
		System.out.println(f3);
		
		UUID uuid3 = UUID.randomUUID();
		String uuidStr3 = uuid3.toString();
		System.out.println(uuidStr3.replace("-", " "));

		
		
		
		
		// Ctrl + Shift + o   快速导包
		Random r4 = new Random();
		
		int i4 = r4.nextInt(20);
		
		double d4 = r4.nextDouble();
		
		float f4 = r4.nextFloat();
		
		System.out.println(i4);
		System.out.println(d4);
		System.out.println(f4);
		
		UUID uuid4 = UUID.randomUUID();
		String uuidStr4 = uuid4.toString();
		System.out.println(uuidStr4.replace("-", " "));

		
		
		
		
		// Ctrl + Shift + o   快速导包
		Random r5 = new Random();
		
		int i5 = r5.nextInt(20);
		
		double d5 = r5.nextDouble();
		
		float f5 = r5.nextFloat();
		
		System.out.println(i5);
		System.out.println(d5);
		System.out.println(f5);
		
		UUID uuid5 = UUID.randomUUID();
		String uuidStr5 = uuid5.toString();
		System.out.println(uuidStr5.replace("-", " "));

	}

}
