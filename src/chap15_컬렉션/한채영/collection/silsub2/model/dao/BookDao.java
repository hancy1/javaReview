package chap15_컬렉션.한채영.collection.silsub2.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import chap15_컬렉션.한채영.collection.silsub2.model.vo.Book;

public class BookDao {

	private HashMap<String, Book> bookMap;

	public BookDao() {
		bookMap = new HashMap<String, Book>();
	}

	public BookDao(HashMap<String, Book> map) {
		bookMap = map;
	}

	public int getLastBookNo() {

		String lastNo = "0";

		Iterator<String> it = bookMap.keySet().iterator();
		while (it.hasNext()) {
			lastNo = it.next();
		}

		return Integer.valueOf(lastNo).intValue();

	}

	public void addBook(Book book) {
		bookMap.put(book.getbNo(), book);
	}

	public Book deleteBook(String key) {
		Book b = bookMap.remove(key);
		
		return b;
	}

	public String searchBook(String title) {
		String key = null;

		Iterator<Entry<String, Book>> it = bookMap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Book> en = it.next();

			if (en.getValue().getTitle().contains(title)) {
				key = en.getKey();
				break;
			}
		}
		return key;
	}

	public Book selectBook(String key) {
		return bookMap.get(key);
	}

	public HashMap<String, Book> selectAll() {
		return bookMap;
	}

	public ArrayList<Book> sortedBookList() {
		ArrayList<Book> list = new ArrayList<Book>();

		Iterator<Entry<String, Book>> it = bookMap.entrySet().iterator();
		while (it.hasNext()) {

			list.add(it.next().getValue());
		}

		Collections.sort(list);

		return list;
	}

}
