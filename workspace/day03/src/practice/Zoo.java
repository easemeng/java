package practice;

public class Zoo {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal animal2 = new Animal();
		
		animal.legs = 4;
		animal2.legs = 8;
		
		System.out.println(animal.legs);
		System.out.println(animal2.legs);
		
		animal.legs = 3;
		
		System.out.println(animal.legs);
		System.out.println(animal2.legs);
		
		animal.eat();
		animal.move();
		
	}

}
