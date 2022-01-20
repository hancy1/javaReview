package chap11.chap11_김민지.mvc.controller;

import chap11.chap11_김민지.mvc.model.vo.AniBook;
import chap11.chap11_김민지.mvc.model.vo.Book;
import chap11.chap11_김민지.mvc.model.vo.CookBook;
import chap11.chap11_김민지.mvc.model.vo.Member;

public class LibraryManager {
	
	private Member mem = new Member();
	private Book[] bList = new Book[5];
	
	
	{ // 초기화 블록을 이용하여 샘플 데이터 초기화
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		}
	
	public LibraryManager() {
		// TODO Auto-generated constructor stub
	}	
	
	public void insertMember(Member mem) { // 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
		this.mem = mem;
		
	}

	public Member myInfo() { // 회원 레퍼런스(mem) 주소 값 리턴
		
		return mem;
		
	}
	 
	public Book[] selectAll() { // 도서 목록 레퍼런스(bList) 주소 값 리턴
		
		return bList;
		
	}
	
	public Book[] searchBook(String keyword) {
		
		Book[] newBList = new Book[5];
		int count = 0; // 키워드포함한 책을 담음
		
		for(int i = 0; i < bList.length; i++) {
			
			if(bList[i].getTitle().contains(keyword)) {
				newBList[count++] = bList[i];
			}
							
		}
		
		return newBList;
	}
	
	public int rentBook(int index) {
		
		int result = 0;
		
		if(bList[index] instanceof AniBook) { // bList[index]가 AniBook 객체를 참조하고 있다면,
			if(((AniBook)bList[index]).getAccessAge()>mem.getAge()) {
				result = 1;
			}
		}else if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon()) {
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		return result;
	}

}
