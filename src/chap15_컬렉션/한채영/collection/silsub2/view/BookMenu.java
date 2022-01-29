package chap15_컬렉션.한채영.collection.silsub2.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import chap15_컬렉션.한채영.collection.silsub2.controller.BookManager;
import chap15_컬렉션.한채영.collection.silsub2.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();

	public BookMenu() {
		
	}

	public void mainMenu() {
		
		while (true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색 출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.println("메뉴 번호 선택: ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				bm.addBook(inputBook());
				break;
			case 2:
				Book[] b = bm.sortedBookList();
				bm.printBookList(b);
				break;
			case 3:
				Book bk = bm.deleteBook(inputBookNo());
				//삭제가 되면 value가 리턴
				if(bk != null) {
					System.out.println("성공적으로 삭제되었습니다.");
				}else {
					System.out.println("삭제할 글이 존재하지 않습니다.");
				}
				break;
			case 4:
				String key = bm.searchBook(inputBookTitle());
				if(key != null) {
					System.out.println(bm.selectBook(key));
				}else {
					System.out.println("글이 존재하지 않습니다.");
				}
				break;
			case 5:
				HashMap<String, Book> map= bm.selectAll();
				if(map.isEmpty()) {
					System.out.println("정보가 없습니다.");
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
			default:
				System.out.println("잘못 입력했습니다.");
				continue;
			}
		}
	}

	public Book inputBook() {
		System.out.println("도서 제목: ");
		sc.nextLine();
		String title = sc.nextLine();
		System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int num = sc.nextInt();
		System.out.println("도서 저자: ");
		sc.nextLine();
		String author = sc.nextLine();
		
		Book bk = new Book(num, title, author);
		return bk;		
				
	}

	public String inputBookNo() {
		
		sc.nextLine();
		System.out.println("도서 번호: ");
		return sc.nextLine();
	}

	public String inputBookTitle() {
		
		sc.nextLine();
		System.out.println("도서 제목: ");
		return sc.nextLine();
	}
}
