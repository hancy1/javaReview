package chap15_컬렉션.김민보.mvc.hw3.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import chap15_컬렉션.김민보.mvc.hw3.model.vo.Book;

public class BookDao {
	
	private HashMap<String, Book> bookMap;
	
	
	public BookDao() {
		bookMap = new HashMap<String, Book>();
	}
	
	
	public BookDao(HashMap<String, Book> map) {
		bookMap = map;
	}
	
	
	
	public int getLastBookNo() {
		// 첫 글이면 0 리턴
		String lastNo = "0";
		
		// 기존 글이 있으면 제일 마지막 번호로 세팅
		Iterator<String> it = bookMap.keySet().iterator();
		while(it.hasNext()) {
			lastNo = it.next();
		}
		
		return Integer.valueOf(lastNo).intValue();
	}
	
	
	public void addBook(Book book) {
		
		
		bookMap.put(book.getbNo(), book);
		
		
	}
	
	
	public Book deleteBook(String key) {
		
		
		Book bk = null;
		
		Iterator<String> it = bookMap.keySet().iterator();
		while(it.hasNext()) {
			if(it.next() == key) {
				bk = bookMap.remove(key);
			}
		}
		
		return bk;
	}
	

	public String searchBook(String title) {
		
		
		String key=null;
		
		Iterator<Entry<String, Book>> it = bookMap.entrySet().iterator();
		while(it.hasNext()) {
			
			Entry<String, Book> en = it.next();
			
			if(en.getValue().getTitle().contains(title)) {
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
		while(it.hasNext()) {

			list.add(it.next().getValue());
		}
		
		Collections.sort(list);
		
		return list;
		
	}
	
	

}
