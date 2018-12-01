package com.igeek.day07.oop2;

import com.igeek.day07.abstract1.Dog;
import com.igeek.day07.abstract1.Quan;
import com.igeek.day07.abstract1.Wolf;

public class Test3 {

	public static void main(String[] args) {
		//
		Dog dog = new Dog();
		//
		Wolf wolf = new Wolf();
		// 那么我们在实际调用方法的时候可以传递子类对象，或者接口实现类对象。
		speak(wolf);
		
		// 同样也可以传递完成向上转型的对象。

	}
	// String ...	Java.lang.包下的类都不用引包
	// 方法的形式参数 ， 声明的时候 ， 需要你传递一个父类对象或者接口对象 。 
	
	public static void speak(Quan quan){
		quan.speak();
	}

}
