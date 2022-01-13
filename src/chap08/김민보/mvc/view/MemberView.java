package chap08.김민보.mvc.view;

import java.util.Scanner;

import chap08.김민보.mvc.controller.MemberController;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberView() {

	}
	
	public void mainMenu() {
		// TODO Auto-generated method stub
		
		System.out.println("아이디를 입력하시오 : ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호를 입력하세요 : ");
		String pwd = sc.nextLine();
		
		int result = mc.login(id, pwd);
		
		
		if(result == 1) {
			while(true) {
				System.out.println("==== 회원 프로그램 ====");
				System.out.println("1. 내정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램 종료하기");
				System.out.println("메뉴 번호 선택 : ");
				
				int num = sc.nextInt();			
				
				switch(num) {
				case 1:					
					
					System.out.println(mc.readInfo().information());
					break;				
				
					
				case 2:
					System.out.println(mc.readAge());
					
					break;
					
				case 3:					
					updateHeight();
					break;
					
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
					
				default:
					System.out.println("메뉴를 다시 선택해주세요.");
					break;				
				
				}
				
			}
		}
		
		else {
			System.out.println("로그인실패, 프로그램 종료");
			
		}
		
	}

	private void updateHeight() {
		// TODO Auto-generated method stub
		//눈에 보이는 부분~!
		
		System.out.println("수정할 당신의 키를 입력 하세요 : ");
		double updateH = sc.nextDouble();
		
		mc.updateHeight(updateH);
		
		System.out.println("수정완료");
		
		
	}
	
	
}
