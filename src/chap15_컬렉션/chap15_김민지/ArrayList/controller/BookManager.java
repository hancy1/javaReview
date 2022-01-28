package chap15_컬렉션.chap15_김민지.ArrayList.controller;

import java.util.ArrayList;

import chap15_컬렉션.chap15_김민지.ArrayList.model.vo.Book;

public class BookManager {
	
	private ArrayList<Book> bookList = new ArrayList<Book>(); 
	// ArrayList는 객체가 추가되어 용량을 초과하면 자동으로 부족한 크기만큼 용량이 늘어납니다
	// ArrayList 에서 추가는 add 삭제는 remove 크기는 size 값출력은 get, contains는 값이 있는 여부확인, indexOf 는 값의 위치 index를 찾아주고 값이 없으면 -1 리턴
	// 값 출력은 for문, 향상된 for문, Iterator 사용 가능
	
	
	public BookManager() {
		// TODO Auto-generated constructor stub
	}

	public void insertBook(Book book) { // 전달 받은 book은 현재 도서 번호가 0인 채로 들어오는데 새로운 도서가 추가될 때마다 추가되는 도서의 도서 번호는 리스트 마지막 도서 번호의 다음 번호로 부여해야 됨
		
		int lastNo = 0; // 우선 변수 생성 및 초기화
		
		try{
			
			lastNo = bookList.get(bookList.size()-1).getbNo()+1;  // 마지막 도서 번호 + 1
			
		}catch(IndexOutOfBoundsException e) { // 하지만 리스트에 도서가 없는 경우, 즉 첫 도서 등록일 경우 위의 문장에서 예외 발생
			
			lastNo = 1; // 해당 예외 발생 시 lastNo = 1; 로 초기화
			
		}finally {
			
			book.setbNo(lastNo); // setter를 이용하여 book 도서 번호를 lastNo로 적용
			
			bookList.add(book); // bookList의 book 추가
		}
		
		
		
	}

	public int deleteBook(int bNo) {
		
		for(int i = 0; i < bookList.size(); i++) {
			
			if(bookList.get(i).getbNo() == bNo) {
				bookList.remove(bookList.get(i)); // for문을 이용하여 전달받은 도서 번호가 존재하는 도서 삭제
				return 1; // 성공적으로 삭제 할 경우 1 리턴
			}
		}
		return 0; // 삭제 되지 않은 경우 즉, 존재하는 도서 번호가 없는 경우 0 리턴
	}

	public ArrayList<Book> searchBook(String title) {
		
		ArrayList<Book> searchList = new ArrayList<Book>(); // 검색 결과값들을 보관할 리스트
		
		for(int i = 0; i < bookList.size(); i++) { 
			
			if(bookList.get(i).getTitle().contains(title)) { // for문을 이용하여 전달받은 제목을 포함한 도서를 searchList에 추가
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList; // searchList 리턴
	}

	public ArrayList<Book> selectList() {
		
		return bookList; // bookList 리턴
	}
	
	

}
