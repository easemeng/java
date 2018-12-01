package com.igeek.practice;

import java.util.Scanner;

public class StringTest3 {

	@SuppressWarnings("resource")
	public static void main(java.lang.String[] args) {
		
		String usersname = "天天卡牌";
		String passwords = "更新太短";
		
		for(int i = 0; i < 3; i++){
			Scanner scanner = new Scanner(System.in);
			System.out.println("用户名：");
			String username = scanner.nextLine(); //用来表示接受字符串
			System.out.println("密码：");
			String password = scanner.nextLine();
			
			if(username.equals(usersname) && password.equals(passwords)){
				System.out.println("登陆成功！");
			}else{
				if(i == 2){
					System.out.println("错误次数过多，您的账号已被锁定，请联系管理员解锁");
				}else{
					System.out.println("用户名或密码输入错误，您还有" + (2-i) + "次机会");
				}
			}
		}

	}

}
