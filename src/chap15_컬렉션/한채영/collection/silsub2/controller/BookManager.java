package chap15_컬렉션.한채영.collection.silsub2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import chap15_컬렉션.한채영.collection.silsub2.model.dao.BookDao;
import chap15_컬렉션.한채영.collection.silsub2.model.vo.Book;

public class BookManager {

	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);

	public BookManager() {
		// TODO Auto-generated constructor stub
	}

	public void addBook(Book book) {

		book.setbNo(Integer.valueOf(bd.getLastBookNo() + 1).toString());

		bd.addBook(book);

	}

	public Book deleteBook(String key) {

		return bd.deleteBook(key);
	}

	public String searchBook(String title) {
		
		return bd.searchBook(title);
	}

	public Book selectBook(String key) {

		return bd.selectBook(key);

	}

	public HashMap<String, Book> selectAll() {

		return bd.selectAll();

	}

	public Book[] sortedBookList() {

		ArrayList<Book> bk = bd.sortedBookList();
		Book[] b = new Book[bk.size()];

		for (int i = 0; i < bk.size(); i++) {
			b[i] = bk.get(i);
		}

		return b;
	}

	public void printBookList(Book[] br) {

		for (Book b : br) {
			System.out.println(b.toString());
		}
	}

}
