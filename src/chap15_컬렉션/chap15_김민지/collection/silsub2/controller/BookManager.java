package chap15_컬렉션.chap15_김민지.collection.silsub2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import chap15_컬렉션.chap15_김민지.collection.silsub2.model.dao.BookDao;
import chap15_컬렉션.chap15_김민지.collection.silsub2.model.vo.Book;

public class BookManager {
	
	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	
	public BookManager() {
		// TODO Auto-generated constructor stub
	}

	public void addBook(Book book) { // BookDao의 getLastBookNo() 메소드를 통해 도서의 마지막 도서 번호를 알아옴
		
		book.setbNo(Integer.valueOf(bd.getLastBookNo()+1).toString()); // setter를 이용하여 도서 번호를 마지막 도서 번호 +1 처리
		
		bd.addBook(book); // BookDao의 addBook()메소드에 해당 Book 객체 전달
		
	}

	public Book deleteBook(String key) {
		
		return bd.deleteBook(key); // BookDao의 deleteBook() 메소드에 전달받은 도서 번호 전달, 그 결과 값을 받아 리턴
	}

	public String searchBook(String title) {
		
		return bd.searchBook(title); // BookDao의 searchBook() 메소드에 전달받은 도서 제목 전달, 그 결과 값(map의 key값)을 받아 리턴
	}

	public Book selectBook(String key) {
		
		return bd.selectBook(key); // BookDao의 selectBook() 메소드에 전달받은 key값 전달, 그 결과 값(해당 Book객체)을 받아 리턴
	}
	
	public HashMap<String, Book> selectAll() {
		
		return bd.selectAll(); // BookDao의 selectAll() 메소드를 통해 도서 전체를 전달 받아 리턴
	}
	
	public Book[] sortedBookList() {
		
		ArrayList<Book> list = bd.sortedBookList(); // BookDao의 sortedBookList() 메소드를 통해 정렬된 도서 리스트를 전달 받아
		
		Book[] bk = new Book[list.size()];
		
		for(int i = 0; i < bk.length; i++) { // for문을 이용하여 Book[] 배열에 추가
			bk[i] = list.get(i);
		}
		
		return bk; // 해당 배열 주소 값 리턴
		
	}
	
	public void printBookList(Book[] br) { // for each문을 이용하여 전달받은 Book[] 배열 전체 출력
		
		for(Book b : br) {
			System.out.println(b);
		}
		
	}
	

}
