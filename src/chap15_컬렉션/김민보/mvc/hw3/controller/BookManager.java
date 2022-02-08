package chap15_컬렉션.김민보.mvc.hw3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import chap15_컬렉션.김민보.mvc.hw3.model.dao.BookDao;
import chap15_컬렉션.김민보.mvc.hw3.model.vo.Book;

public class BookManager {
	
	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {
		
	}
	
	public void addBook(Book book) {
		
		book.setbNo(Integer.valueOf(bd.getLastBookNo()+1).toString());
		
		bd.addBook(book);
	}
	
	public Book deleteBook(String key) {
		
		return bd.deleteBook(key);
		
	}
	
	public String searchBook(String title) {
		String key = bd.searchBook(title);
		
		return key;
	}
	
	public Book selectBook(String key) {
		
		return bd.selectBook(key);

	}
	
	public HashMap<String, Book> selectAll() {
		
		return bd.selectAll();
		
	}
	
	public Book[] sortedBookList() {
		
		ArrayList<Book> list = bd.sortedBookList();
		
		Book[] book = new Book[list.size()];
		for(int i=0; i<book.length; i++) {
			book[i] = list.get(i);
		}
		
		return book;
	}

	public void printBookList(Book[] br) {
		
		//향상된 for문
		
		for(Book b : br) {
			System.out.println(b);
		}
	}

}
