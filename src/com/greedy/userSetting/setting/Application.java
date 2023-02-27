package com.greedy.userSetting.setting;

import java.awt.MenuContainer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		UserController userController = new UserController();
		
		
		do {
			System.out.println("========= 메뉴 관리 ===========");
			System.out.println("1. 유저 전체 조회");
	
			int no = sc.nextInt();
			switch(no){
			case 1 : userController.findAllUser(); break;
			default : System.out.println("잘못된 메뉴를 선택하셨습니다.");
			}
		}while(true);
		 }
	}
