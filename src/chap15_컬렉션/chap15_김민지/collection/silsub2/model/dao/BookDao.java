package chap15_컬렉션.chap15_김민지.collection.silsub2.model.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import chap15_컬렉션.chap15_김민지.collection.silsub2.model.vo.Book;

public class BookDao {
	
	private HashMap<String, Book> bookMap;
	
	public BookDao() { // 기본 생성자 bookMap 객체 생성
		bookMap = new HashMap<String, Book>();
	}
	
	public BookDao (HashMap<String, Book> map) { // 매개변수 생성자 다른 map을 전달 받아 bookMap의 초기값으로 사용함
		
		bookMap = map;
	}
	
	public int getLastBookNo() {
		
		String lastNo = "0"; // 마지막 번호 구하기 , 첫글일 경우 0으로 갈 수 있게!
		
		Iterator<String> it = bookMap.keySet().iterator(); // HashMap<key, value>
		
		while(it.hasNext()) {
			
			lastNo = it.next(); // 마지막 객체
		}
		
		return Integer.valueOf(lastNo).intValue(); // Integer.valueOf : String을 Integer로 변경하기 위해 사용하는 메소드. wrapper 객체 반환
	}

	public void addBook(Book book) {
		
		bookMap.put(book.getbNo(), book);
		
	}
	
	public Book deleteBook(String key) { // keySet 을 이용하여 전달받은 도서 번호와 일치하는 도서 book Map 에서 삭제 , 삭제한 객체 리턴
		
		Book bk = null; // 삭제한 객체 담을 변수 생성
		
		Iterator<String> it = bookMap.keySet().iterator();
		
		while(it.hasNext()) {
			if(it.next().equals(key)) {
				bk = bookMap.remove(key);
			}
		}
		return bk;		
		
	}
	
	
	
	public String searchBook(String title) { // entrySet()을 이용하여 전달받은 도서 제목을 포함하는 book Map 의 key 값 리턴, entrySet은 key와 value 값이 모두 필요할 때 사용
		
		String key = null;
		
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
	
	public Book selectBook(String key) { //전달받은 key 값을 이용하여 book Map 의 해당 key 값의 value 인 Book 객체 리턴
		
		return bookMap.get(key);
		
	}
	
	public HashMap<String, Book> selectAll() { // 전체 도서 리턴
		
		return bookMap;
		
	}
	
	public ArrayList<Book> sortedBookList() { // entrySet() 을 이용하여 ArrayList<Book> 을 가져오고 Collections.sort() 를 이용하여 리스트 정렬 후 리턴
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		Iterator<Entry<String, Book>> it = bookMap.entrySet().iterator();
		
		while(it.hasNext()) {
			
			list.add(it.next().getValue());
		}
		
		Collections.sort(list);
		
		return list;
	}

}
