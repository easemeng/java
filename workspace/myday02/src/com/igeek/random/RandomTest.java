package com.igeek.random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt(11);
		System.out.println(i);
	}

}
