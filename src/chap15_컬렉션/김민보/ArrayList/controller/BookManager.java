package chap15_컬렉션.김민보.ArrayList.controller;

import java.util.ArrayList;

import chap15_컬렉션.김민보.ArrayList.model.vo.Book;

public class BookManager {
	
	
	ArrayList<Book> bookList = new ArrayList<Book>();	
	
	
	public void insertBook(Book book) {
		int lastNo = 0;
		
		try {			
			lastNo = bookList.get(bookList.size()-1).getbNo() + 1;
			book.setbNo(lastNo);
			bookList.add(book);					
		
		}catch(IndexOutOfBoundsException e) {
			
			lastNo = 1;
			book.setbNo(lastNo);
			bookList.add(0, book);	
			
		}		
		
	}

	public int deleteBook(int bNo) {
		// TODO Auto-generated method stub
				
		try {
		bookList.remove(bNo-1);
		return 1;
		}catch(Exception e) {
			return 0;
		}			
	}

	public ArrayList<Book> searchBook(String title) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> searchList = new ArrayList<Book>();		
		
		
		//for(int i = 0; i<bookList.size(); i++) {		
			
			//if(bookList.contains(title)){							
			//	searchList.add(bookList.get(i));
			//}	//여기 고쳐야됨!
		//}			
		
		for(Book bk : bookList) {
			if(bk.getTitle().contains(title)) {
				searchList.add(bk);
			}
		}		
		
		return searchList;
		
	}

	public ArrayList<Book> selectList() {
		// TODO Auto-generated method stub		
		
		return bookList;
		
	}

	
	
}
