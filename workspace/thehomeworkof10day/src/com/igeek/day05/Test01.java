package com.igeek.day05;

public class Test01 {

	public static void main(String[] args) {
		
		even(3);

	}
	
	public static void even(int a){
		
		if(a > 3){
			for(int i = 0;i <= a;i++){
				if(i % 2 == 0){
					System.out.println(i);
				}
			}
		}else{
			System.out.println("Э”ИлУРХ`");
		}
		
	}

}
