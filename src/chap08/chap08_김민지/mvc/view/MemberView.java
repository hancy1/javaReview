package chap08.chap08_김민지.mvc.view;




import java.util.Scanner;

import chap08.chap08_김민지.mvc.controller.MemberController;

public class MemberView {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		System.out.println("아이디 입력하시오 : ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호 입력하시오 : ");
		String pwd = sc.nextLine();
		
		int result = mc.login(id, pwd); // MemberController 클래스의 login 메소드에 전달하고 그 결과값을 result변수에 받는다
		
		if(result == 1) {
			
			System.out.println("로그인 성공!");
			
			while(true) {
				System.out.println("=== 회원 프로그램 ===");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램 종료하기");
				System.out.println("메뉴 번호 선택 : ");
				int menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu) {
				
				case 1 : System.out.println(mc.readinfo().infomation()); break;
				case 2 : System.out.println("나이는 " + mc.readAge() + "세 입니다."); break;
				case 3 : updateHeight(); break;
				case 9 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); continue;
				}
			}
		}else {
			System.out.println("로그인 실패!");
			System.out.println("프로그램을 종료합니다.");
		}
	}
	
	public void updateHeight() {
		System.out.println("수정할 키를 입력하시오 : ");
		double height = sc.nextDouble();
		mc.updateHeight(height);
	}
	
	
}
