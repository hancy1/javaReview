package chap11.chap11_김민지.mvc.view;

import java.util.Scanner;

import chap11.chap11_김민지.mvc.controller.LibraryManager;
import chap11.chap11_김민지.mvc.model.vo.Book;
import chap11.chap11_김민지.mvc.model.vo.Member;

public class LibraryMenu {
	
	private LibraryManager lm = new LibraryManager();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		Member m = new Member();
		
		System.out.println("회원 이름 >> ");
		m.setName(sc.nextLine()); 
		
		System.out.println("나이 >> ");
		m.setAge(sc.nextInt());
		sc.nextLine();
		
		System.out.println("성별 (F/M) )>> ");
		m.setGender(sc.next().toUpperCase().charAt(0));
		
		
		lm.insertMember(m);
		
		while(true) {
			
			System.out.println("==== 메뉴 ===="); 
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println("메뉴선택 >> ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : System.out.println(lm.myInfo()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			
			}
		}
		
		
	}
	
	public void selectAll() {
		
		Book[] bList = lm.selectAll();
		
		for(int i = 0; i < bList.length; i++) {
			System.out.println( i + "번도서 : " + bList[i].toString());
		}
	}
	
	public void searchBook() {
		
		System.out.println("검색할 제목 키워드 >> ");
		String keyword = sc.nextLine();
		
		
		Book[] bList = lm.searchBook(keyword);
		
		int count = 0;
		
		for(Book b : bList) {
			
			if(b != null) {
				System.out.println(b);
				count++;
			}
		
		}
		
		if(count == 0) {
			System.out.println("조회내역이 없습니다.");
		}
	}
	
	public void rentBook() {
		
		selectAll();
		
		System.out.println("대여할 도서 번호 선택 >> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int result = lm.rentBook(num);
		
		if(result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}else if(result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		}else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
		}
	}
	

}
