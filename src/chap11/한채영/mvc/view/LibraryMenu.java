package chap11.한채영.mvc.view;

import java.util.Scanner;

import chap11.한채영.mvc.controller.LibraryManager;
import chap11.한채영.mvc.model.vo.Book;
import chap11.한채영.mvc.model.vo.Member;

public class LibraryMenu {

	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("나이: ");
		int age = sc.nextInt();
		System.out.println("성별: ");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);

		Member mem = new Member(name, age, gender);

		lm.insertMember(mem);

		while (true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이 페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println("메뉴선택: ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println(lm.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

	public void selectAll() {

		// LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
		Book[] bList = lm.selectAll();

		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력  대여할 때 도서번호를 알기 위해
		// ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true

		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서: " + bList[i].toString());
		}

	}

	public void searchBook() {

		System.out.println("검색할 제목 키워드 : ");
		sc.nextLine();
		String keyword = sc.nextLine();

		Book[] searchList = lm.searchBook(keyword);

		for (Book b : searchList) {
			if(b != null)
				System.out.println(b.toString());
		}

	}

	public void rentBook() {
		// 도서 대여를 위해 도서번호를 알아야 된다.
		// selectAll() 메소드 호출을 통해 도서 리스트 한번 출력 해주고
		selectAll();

		// “대여할 도서 번호 선택 : ” >> 입력 받음 (num : int)

		System.out.println("대여할 도서 번호 선택: ");
		int num = sc.nextInt();

		// LibraryManager의 rentBook(num) 메소드에 전달
		int result = lm.rentBook(num);
		// 그 결과 값을 result로 받고 그 result가
		// 0일 경우  “성공적으로 대여되었습니다.” 출력
		// 1일 경우  “나이 제한으로 대여 불가능입니다.” 출력
		// 2일 경우  “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
		// 마이페이지를 통해 확인하세요” 출력

		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능합니다.");
		} else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
		}
	}
}
