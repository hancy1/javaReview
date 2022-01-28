package chap15_컬렉션.chap15_김민지.ArrayList.view;

import java.util.ArrayList;
import java.util.Scanner;

import chap15_컬렉션.chap15_김민지.ArrayList.controller.BookManager;
import chap15_컬렉션.chap15_김민지.ArrayList.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.println("메뉴 번호 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insertBook(); break;
			case 2 : deleteBook(); break;
			case 3 : searchBook(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}

	private void insertBook() {
		
		
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) :");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.println("도서 저자 : ");
		String author = sc.nextLine();
		
		Book book = new Book(title, category, author); // 위에서 입력 받은 title, category, author를 매개변수로 한 Book 객체 생성 (book)
		
		bm.insertBook(book); // BookManager의 insertBook 메소드로 book 전달
		
		
	}	
	
	
	private void deleteBook() {
		System.out.println("도서 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		int result = bm.deleteBook(bNo); // BookManager의 deleteBook 메소드로 bNo 전달 -> 리턴 값 전달 받음 
		
		if(result == 1) { // result가 1일 경우
			System.out.println("성공적으로 삭제");
		}else { // result가 0일 경우
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}
		
	}
	
	
	private void searchBook() {
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		
		ArrayList<Book> searchList = bm.searchBook(title); // BookManager의 searchBook 메소드로 title 전달 -> 리턴 값 전달받음
		
		if(searchList.isEmpty()) { // searchList가 비어 있을 경우
			System.out.println("검색 결과가 존재하지 않습니다.");
		}else { // searchList가 비어있지 않을 경우 for문을 이용하여 searchList 출력
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		
	}
	
	
	private void selectList() {
		ArrayList<Book> bookList = bm.selectList(); // BookManager의 selectList() 메소드 호출 -> 리턴 값 전달받음
		
		if(bookList.isEmpty()) { // bookList가 비어 있을 경우
			System.out.println("도서 목록이 존재하지 않습니다.");
		}else {
			for(Book b : bookList) { // bookList가 비어있지 않을 경우 for each 문 이용하여 출력
				System.out.println(b);
			}
		}
		
	}

}
