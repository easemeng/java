package com.igeek.day03.oop;

//人类  。
//共同特征 ， 共同行为 。
public class Person {
	//类的属性  来表示一类事物所具有的共同特征 。
	//成员变量(属性)就是类的属性 。
	String height = "180";
	int age = 20;
	String name;
	String sex;
	
	/**
	 * 下面的全是方法(函数)。
	 * 
	 * 方法的命名规则 ：   
	 * 		访问权限修饰符    + 返回值类型  + 方法名称(形参1,形参2....){ 方法体  return }
	 * 	共有           受保护的             默认不写     私有的 
	 * public protected  default private 	
	 * 
	 * ruturn 表示强制跳出  结束当前方法。    表示方法的返回值。
	 * 
	 */
	//描述事物的共同行为。     
	void eat(){
		System.out.println("都会吃饭。");
	}
	public void play(){
		System.out.println("玩。");
	}
	public void learn(){
		System.out.println("学习。。。");
	}
	//方法的返回值类型 。  int x int y 

	public static int getSum(int a,int b){
		return a+b;
	}
	
	public static int getMax(int sb1,int sb2){
		return (sb1>sb2)?sb1:sb2;
	}
	//方法体中的retrun 出来的数据类型 ，由方法声明位置的返回值类型来决定 。
	
	//... 表示参数的个数  不确定 ，他是一个数组 。args 这个形参 就表示一个数组 。对于这种方法而言。必须传递一个数组过来。
	public static int equalsNumbers(int ... args ){
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		return -128;
	}
	
	public static void printHelloWorld(){
		for(int i=0;i<10;i++){
			System.out.println("Hello World!");
		}
	}
	
	//打印1到n之间的数据 。 5 1-4   1000   - 999
	public static void printNum(int n){
		for(int i=1;i<n;i+=2){
			System.out.println(i);
		}
	}
	
	
	
	
	//类的属性  来表示一类事物所具有的共同特征 。
	//成员变量(属性)就是类的属性 。
	String height2 = "180";
	int age2 = 20;
	String name2;
	String sex2;
	
	/**
	 * 下面的全是方法(函数)。
	 * 
	 * 方法的命名规则 ：   
	 * 		访问权限修饰符    + 返回值类型  + 方法名称(形参1,形参2....){ 方法体  return }
	 * 	共有           受保护的             默认不写     私有的 
	 * public protected  default private 	
	 * 
	 * ruturn 表示强制跳出  结束当前方法。    表示方法的返回值。
	 * 
	 */
	//描述事物的共同行为。     
	void eat2(){
		System.out.println("吃");
	}
	public void play2(){
		System.out.println("玩");
	}
	public void learn2(){
		System.out.println("学");
	}
	//方法的返回值类型 。  int x int y 

	public static int getSum2(int a,int b){
		return a+b;
	}
	
	public static int getMax2(int sb1,int sb2){
		return (sb1>sb2)?sb1:sb2;
	}
	//方法体中的retrun 出来的数据类型 ，由方法声明位置的返回值类型来决定 。
	
	//... 表示参数的个数  不确定 ，他是一个数组 。args 这个形参 就表示一个数组 。对于这种方法而言。必须传递一个数组过来。
	public static int equalsNumbers2(int ... args ){
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		return -128;
	}
	
	public static void printHelloWorld2(){
		for(int i=0;i<10;i++){
			System.out.println("Hello World!");
		}
	}
	
	//打印1到n之间的数据 。 5 1-4   1000   - 999
	public static void printNum2(int n){
		for(int i=1;i<n;i+=2){
			System.out.println(i);
		}
	}
	
	
	
	
	//类的属性  来表示一类事物所具有的共同特征 。
	//成员变量(属性)就是类的属性 。
	String height3 = "180";
	int age3 = 20;
	String name3;
	String sex3;
	
	/**
	 * 下面的全是方法(函数)。
	 * 
	 * 方法的命名规则 ：   
	 * 		访问权限修饰符    + 返回值类型  + 方法名称(形参1,形参2....){ 方法体  return }
	 * 	共有           受保护的             默认不写     私有的 
	 * public protected  default private 	
	 * 
	 * ruturn 表示强制跳出  结束当前方法。    表示方法的返回值。
	 * 
	 */
	//描述事物的共同行为。     
	void eat3(){
		System.out.println("吃");
	}
	public void play3(){
		System.out.println("玩");
	}
	public void learn33(){
		System.out.println("学习。。");
	}
	//方法的返回值类型 。  int x int y 

	public static int getSum3(int a,int b){
		return a+b;
	}
	
	public static int getMax3(int sb1,int sb2){
		return (sb1>sb2)?sb1:sb2;
	}
	//方法体中的retrun 出来的数据类型 ，由方法声明位置的返回值类型来决定 。
	
	//... 表示参数的个数  不确定 ，他是一个数组 。args 这个形参 就表示一个数组 。对于这种方法而言。必须传递一个数组过来。
	public static int equalsNumbers3(int ... args ){
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		return -128;
	}
	
	public static void printHelloWorld3(){
		for(int i=0;i<10;i++){
			System.out.println("Hello World!");
		}
	}
	
	//打印1到n之间的数据 。 5 1-4   1000   - 999
	public static void printNum3(int n){
		for(int i=1;i<n;i+=2){
			System.out.println(i);
		}
	}
	
	
	
	
	//类的属性  来表示一类事物所具有的共同特征 。
	//成员变量(属性)就是类的属性 。
	String height4 = "180";
	int age4 = 20;
	String name4;
	String sex4;
	
	/**
	 * 下面的全是方法(函数)。
	 * 
	 * 方法的命名规则 ：   
	 * 		访问权限修饰符    + 返回值类型  + 方法名称(形参1,形参2....){ 方法体  return }
	 * 	共有           受保护的             默认不写     私有的 
	 * public protected  default private 	
	 * 
	 * ruturn 表示强制跳出  结束当前方法。    表示方法的返回值。
	 * 
	 */
	//描述事物的共同行为。     
	void eat4(){
		System.out.println("吃");
	}
	public void play4(){
		System.out.println("玩");
	}
	public void learn4(){
		System.out.println("学");
	}
	//方法的返回值类型 。  int x int y 

	public static int getSum4(int a,int b){
		return a+b;
	}
	
	public static int getMax4(int sb1,int sb2){
		return (sb1>sb2)?sb1:sb2;
	}
	//方法体中的retrun 出来的数据类型 ，由方法声明位置的返回值类型来决定 。
	
	//... 表示参数的个数  不确定 ，他是一个数组 。args 这个形参 就表示一个数组 。对于这种方法而言。必须传递一个数组过来。
	public static int equalsNumbers4(int ... args ){
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		return -128;
	}
	
	public static void printHelloWorld4(){
		for(int i=0;i<10;i++){
			System.out.println("Hello World!");
		}
	}
	
	//打印1到n之间的数据 。 5 1-4   1000   - 999
	public static void printNum4(int n){
		for(int i=1;i<n;i+=2){
			System.out.println(i);
		}
	}
	
	
	
	
	//类的属性  来表示一类事物所具有的共同特征 。
	//成员变量(属性)就是类的属性 。
	String height5 = "180";
	int age5 = 20;
	String name5;
	String sex5;
	
	/**
	 * 下面的全是方法(函数)。
	 * 
	 * 方法的命名规则 ：   
	 * 		访问权限修饰符    + 返回值类型  + 方法名称(形参1,形参2....){ 方法体  return }
	 * 	共有           受保护的             默认不写     私有的 
	 * public protected  default private 	
	 * 
	 * ruturn 表示强制跳出  结束当前方法。    表示方法的返回值。
	 * 
	 */
	//描述事物的共同行为。     
	void eat5(){
		System.out.println("吃");
	}
	public void play5(){
		System.out.println("玩");
	}
	public void learn5(){
		System.out.println("学");
	}
	//方法的返回值类型 。  int x int y 

	public static int getSum5(int a,int b){
		return a+b;
	}
	
	public static int getMax5(int sb1,int sb2){
		return (sb1>sb2)?sb1:sb2;
	}
	//方法体中的retrun 出来的数据类型 ，由方法声明位置的返回值类型来决定 。
	
	//... 表示参数的个数  不确定 ，他是一个数组 。args 这个形参 就表示一个数组 。对于这种方法而言。必须传递一个数组过来。
	public static int equalsNumbers5(int ... args ){
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		return -128;
	}
	
	public static void printHelloWorld5(){
		for(int i=0;i<10;i++){
			System.out.println("Hello World!");
		}
	}
	
	//打印1到n之间的数据 。 5 1-4   1000   - 999
	public static void printNum5(int n){
		for(int i=1;i<n;i+=2){
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		//getSum(10,20); 对于有返回值方法 ，单独调用没有意义。
		
		//System.out.println(getSum(10,20));//输出当前方法的返回值 。
		
		//推荐方式 ，赋值调用 。就是用一个变量来接受方法的返回值。
		//int sum = getSum(10,20);
		//System.out.println(sum);
		
		//在调用方法的时候，传入的参数  我们叫做实际参数 ，简称  实参。
		//int max = getMax(30,'A');//实际参数  简称  实参   跟  形参的数据个数跟类型都要一致。
		//System.out.println(max);
		
		//  int [] arrays1 = new int[]{1,2,34,52,1};
		//  简写  就是 ：    int [] arrays1 = {1,2,34,52,1};
		//int [] arrays = new int[]{1,2,3,4,5};//数组的另外一种创建方式 。 
		//int returnValue = equalsNumbers(arrays);
		//System.out.println(returnValue);
		
		//printHelloWorld();
		
		//注意 ：对于void  没有返回值的方法 。  就只能调用。
		printNum(10);
		
	}
}
