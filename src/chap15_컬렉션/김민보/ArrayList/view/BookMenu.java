package chap15_컬렉션.김민보.ArrayList.view;

import java.util.ArrayList;
import java.util.Scanner;

import chap15_컬렉션.김민보.ArrayList.controller.BookManager;
import chap15_컬렉션.김민보.ArrayList.model.vo.Book;

public class BookMenu {
	
	Scanner sc = new Scanner(System.in);
	BookManager bm = new BookManager();
	
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
			
			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 :
				insertBook();
			break;
			
			case 2 :
				deleteBook();
			break;
			
			case 3 :
				searchBook();
			break;
			
			case 4 :
				selectList();
			break;
			
			case 0 :
				System.out.println("프로그램 종료");
			return;
			
			default:
				System.out.println("해당하는 번호를 선택하세요.");
				break;			
			
			}			
		}		
	}

	
	public void insertBook() {
		// TODO Auto-generated method stub
		
		sc.nextLine();
		System.out.println("도서 제목 :");
		String title = sc.nextLine();
		
		System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) :");
		int category = sc.nextInt();
		
		sc.nextLine();
		System.out.println("도서 저자 :");
		String author = sc.nextLine();
		
		Book book = new Book(title, category, author);
		bm.insertBook(book);
		
		
	}
	
	
	public void deleteBook() {
		// TODO Auto-generated method stub
		
		System.out.println("삭제할 도서 번호 : ");
		int bNo = sc.nextInt();
		
		int result = bm.deleteBook(bNo);
		
		if(result == 1) {
			System.out.println("성공적으로 삭제");
		}else if(result == 0) {
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}
		
	}
	
	
	public void searchBook() {
		// TODO Auto-generated method stub
		
		sc.nextLine();
		System.out.println("검색할 도서 제목 : ");
		String title = sc.nextLine();
		
		ArrayList<Book> searchList = (bm.searchBook(title));		
		
		if(searchList.isEmpty()) {
			System.out.println("검색결과가 존재하지 않습니다.");
		}else {
			for(int i = 0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}	
		
	}
	
	public void selectList() {
		// TODO Auto-generated method stub
		
		ArrayList<Book> bookList = bm.selectList();
		
		
		if(bookList.isEmpty()) {
			System.out.println("도서목록이 존재하지 않습니다.");
		}else {
			for(int i = 0; i<bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}
		}		
	}
	
	
}
