package chap15_컬렉션.한채영.ArrayList.controller;

import java.util.ArrayList;

import chap15_컬렉션.한채영.ArrayList.model.vo.Book;

public class BookManager {

	private ArrayList<Book> bookList = new ArrayList<Book>();

	public BookManager() {
		// TODO Auto-generated constructor stub
	}

	public void insertBook(Book book) {

		int lastNo = 0; // 우선 변수 생성 및 초기화

		try {
			lastNo = bookList.get(bookList.size() - 1).getbNo() + 1; // 마지막 도서 번호 + 1
		} catch (IndexOutOfBoundsException e) {
			lastNo = 1;
		}
		book.setbNo(lastNo);

		bookList.add(book);

	}

	public int deleteBook(int bNo) {

		int result = 0;
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getbNo() == bNo) {
				bookList.remove(i);	
				result = 1;
			} 
		}
		return result;

	}

	public ArrayList<Book> searchBook(String title) {
		
		ArrayList<Book> searchList = new ArrayList<Book>(); // 검색 결과값들을 보관할 리스트
		
		for (Book b : bookList) {

			if (b.getTitle().equals(title)) {
				searchList.add(b); // 서치리스트에 추가
			}
		}
		
		return searchList;

	}

	public ArrayList<Book> selectList() {
		
		return bookList;

	}

}
