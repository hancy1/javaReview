package chap15_컬렉션.chap15_김민지.collection.silsub2.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import chap15_컬렉션.chap15_김민지.collection.silsub2.controller.BookManager;
import chap15_컬렉션.chap15_김민지.collection.silsub2.model.vo.Book;

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
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체출력");
			System.out.println("6. 끝내기");
			System.out.println("메뉴 번호 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : bm.addBook(inputBook()); break;
			case 2 : bm.printBookList(bm.sortedBookList()); break; // 제목별 오름차순 내용 구현
			case 3 :
					Book bk = bm.deleteBook(inputBookNo()); 
					
					if(bk != null) {
						System.out.println("성공적으로 삭제");
					}else {
						System.out.println("삭제할 글이 존재하지 않음");
					}
					
					break;
					
			case 4 : 
					String key = bm.searchBook(inputBookTitle()); 
					
					if(key == null) {
						System.out.println("조회한 글이 존재하지 않음");
					}else {
						System.out.println(bm.selectBook(key));
					}
					break;
					
			case 5 : 
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
			case 6 : System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
		}
	}

	private Book inputBook() {
		
		
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) :");
		int category = sc.nextInt();
		sc.nextLine();
		
		System.out.println("도서 저자 : ");
		String author = sc.nextLine();
		
		Book book = new Book(title, category, author); // 위에서 입력 받은 title, category, author를 매개변수로 한 Book 객체 생성 (book)
						
		return book;
		
		
	}	
	
	public String inputBookNo() {
		
		System.out.println("도서 번호 : ");
		String bNo = sc.nextLine();
		
		return bNo;
		
	}
	
	public String inputBookTitle() {
		
		System.out.println("도서 제목 : ");
		String title = sc.nextLine();
		
		return title;
		
	}
	
}
