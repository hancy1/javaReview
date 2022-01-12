package chap08.한채영.mvc.view;

import java.util.Scanner;

import chap08.한채영.mvc.controller.MemberController;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberView() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {

		System.out.println("아이디를 입력하세요: ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요: ");
		String pwd = sc.nextLine();

		int result = mc.login(id, pwd);

		if (result == 1) {
			while (true) {
				System.out.println("===== 회원 프로그램 =====");
				System.out.println("1. 내 정보 보기");
				System.out.println("2. 내 나이 조회하기");
				System.out.println("3. 키 수정하기");
				System.out.println("9. 프로그램 종료하기");
				System.out.println("메뉴 번호 선택: ");
				int menu = sc.nextInt();

				switch (menu) {
				case 1:
					mc.readInfo();
					break;
				case 2:
					System.out.println(mc.readAge() + "세");
					break;
				case 3: 
					updateHeight();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				}

			}
		} else if (result == 0) {
			System.out.println("로그인 실패. 프로그램을 종료합니다.");
			return;
		}

	}

	public void updateHeight() {

		System.out.println("수정할 키를 입력하세요" );
		double height = sc.nextDouble();
		
		mc.updateHeight(height);
	}
}
