package chap15_컬렉션.김민보.mvc.hw3.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import chap15_컬렉션.김민보.mvc.hw3.controller.BookManager;
import chap15_컬렉션.김민보.mvc.hw3.model.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public BookMenu() {
		
	}
	
	public void mainMenu() {
		
		while(true){
			
			System.out.println("***** 도서 관리 프로그램 *****");
			System.out.println("1. 새 도서 추가 ");
			System.out.println("2. 도서정보 정렬후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");

			System.out.print("메뉴 선택 : ");
			
			int num = sc.nextInt();
			sc.nextLine();

			
			switch(num) {
			
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				break;
			case 3:
				Book bk = bm.deleteBook(inputBookNo());
				if(bk != null) {
					System.out.println("성공적으로 삭제되었습니다.");
				}else {
					System.out.println("삭제할 글이 존재하지 않습니다.");
				}
				break;
			case 4:
				String key = bm.searchBook(inputBookTitle());
				
				if(key == null) {
					System.out.println("조회한 글이 존재하지 않습니다.");
				}else {
					System.out.println(bm.selectBook(key));
				}
				
				break;
			case 5:
				HashMap<String, Book> map = bm.selectAll();
				if(map.isEmpty()) {
					System.out.println("없습니다.");
				}else {
					Iterator<String> it = map.keySet().iterator();
					while(it.hasNext()) {
						System.out.println(map.get(it.next()));
					}
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			
			default : 
				System.out.println("잘못입력하셨습니다. 다시입력하세요.");
				break;

			}
		}
		
	}
	
	public Book inputBook() {
		
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("장르 (1.인문/2.자연과학/3.의료/4.기타) 숫자로 입력 : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();

		return new Book(category, title, author);
	}
	
	public String inputBookNo() {
		
		System.out.print("도서 번호 : ");
		String key = sc.nextLine();
		
		return key;
		
	}
	
	public String inputBookTitle() {
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();

		return title;
	}

}
