package com.igeek.day03.obj;

//定义一个账户类 。
// 模拟ATM 存钱取钱。

// 面向对象  1。封装 。
public class Animal {

	private int legs;
	
	private String legs2;
		
	public String getLegs2() {
		
		return legs2;
	}

	public void setLegs2(String legs2) {
		
		this.legs2 = legs2;
	}

	//需要对外提供两个方法 。一个是set设置   get获取。
	public void setLegs(int legs){
		//this关键字  表示当前类对象本身 。  this.legs  表示 当前类中的成员边legs
		if(legs>0&&legs<10)
			this.legs=legs;
		else
			System.out.println("****认真点。");
	}
	
	public int getLegs(){
		
		if(legs==0){
			System.out.println("请先设置legs。");
			
			return -1;
		}else{
			return legs;
		}
		
	}
	
	
	
	
	private int legs3;
	
	private String legs4;
		
	public String getLegs4() {
		
		return legs4;
	}

	public void setLegs4(String legs4) {
		
		this.legs4 = legs4;
	}

	//需要对外提供两个方法 。一个是set设置   get获取。
	public void setLegs3(int legs3){
		//this关键字  表示当前类对象本身 。  this.legs  表示 当前类中的成员边legs
		if(legs3>0&&legs3<10)
			this.legs3=legs3;
		else
			System.out.println("****认真点");
	}
	
	public int getLegs3(){
		
		if(legs3==0){
			System.out.println("请先设置legs");
			
			return -1;
		}else{
			return legs3;
		}
		
	}
	
	
	
	
	private int legs5;
	
	private String legs6;
		
	public String getLegs6() {
		
		return legs6;
	}

	public void setLegs6(String legs6) {
		
		this.legs6 = legs6;
	}

	//需要对外提供两个方法 。一个是set设置   get获取。
	public void setLegs5(int legs5){
		//this关键字  表示当前类对象本身 。  this.legs  表示 当前类中的成员边legs
		if(legs5>0&&legs5<10)
			this.legs5=legs5;
		else
			System.out.println("****认真点");
	}
	
	public int getLegs5(){
		
		if(legs5==0){
			System.out.println("请先设置legs。");
			
			return -1;
		}else{
			return legs5;
		}
		
	}
	
	
	
	
	private int legs7;
	
	private String legs8;
		
	public String getLegs8() {
		
		return legs8;
	}

	public void setLegs8(String legs8) {
		
		this.legs8 = legs8;
	}

	//需要对外提供两个方法 。一个是set设置   get获取。
	public void setLegs7(int legs7){
		//this关键字  表示当前类对象本身 。  this.legs  表示 当前类中的成员边legs
		if(legs7>0&&legs7<10)
			this.legs7=legs7;
		else
			System.out.println("****认真点");
	}
	
	public int getLegs7(){
		
		if(legs7==0){
			System.out.println("请先设置legs");
			
			return -1;
		}else{
			return legs7;
		}
		
	}
	
	
	
	
	private int legs9;
	
	private String legs0;
		
	public String getLegs0() {
		
		return legs0;
	}

	public void setLegs0(String legs0) {
		
		this.legs0 = legs0;
	}

	//需要对外提供两个方法 。一个是set设置   get获取。
	public void setLegs9(int legs9){
		//this关键字  表示当前类对象本身 。  this.legs  表示 当前类中的成员边legs
		if(legs9>0&&legs9<10)
			this.legs9=legs9;
		else
			System.out.println("****认真点");
	}
	
	public int getLegs9(){
		
		if(legs9==0){
			System.out.println("先设置legs");
			
			return -1;
		}else{
			return legs9;
		}
		
	}
	
	
}
