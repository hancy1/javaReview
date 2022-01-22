package chap12.chap12_김민지.hw1.view;

import java.util.Scanner;

import chap12.chap12_김민지.hw1.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : tokenMenu(); break;
			case 2 : inputMenu(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			
			}
		}
	}
	
	public void tokenMenu() { // 토큰처리 전 문자와 글자개수, 토큰 처리 후 문자와 글자개수 그리고 모두대문자로변경
		
		String str = "J a v a P r o g r a m";
		
		tc.afterToken(str);
	}
	
	public void inputMenu() {
		
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		
		//첫글자 대문자
		tc.firstCap(str);
		
		System.out.println("찾을 문자 하나를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		// 문자가 들어간 개수
		tc.findChar(str, ch);
	}

}
