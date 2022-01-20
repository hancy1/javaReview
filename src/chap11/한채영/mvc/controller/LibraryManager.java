package chap11.한채영.mvc.controller;

import chap11.한채영.mvc.model.vo.AniBook;
import chap11.한채영.mvc.model.vo.Book;
import chap11.한채영.mvc.model.vo.CookBook;
import chap11.한채영.mvc.model.vo.Member;

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
	
	public void insertMember(Member m) {
	
		this.mem = m; // 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
		
	}

	public Member myInfo() {
		
		return mem;
	}

	public Book[] selectAll() {
		
		return bList;
		
	}

	public Book[] searchBook(String keyword) {
		
		Book[] b = new Book[5];
		int count = 0;
		
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				b[count] = bList[i];
				count++;
			}
		}
		
		return b;
	}

	public int rentBook(int index) {
		int result = 0;
		
		// 전달 받은 index의 bList 객체가 실제 AniBook 객체를 참조하고 있고
		// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
		// result를 1로 초기화  나이 제한으로 대여 불가하다는 의미
		
		if(bList[index] instanceof AniBook && mem.getAge() < ((AniBook)bList[index]).getAccessAge()) {
			result = 1;
		}
		
		// 전달 받은 index의 bList 객체가 실제 CookBook 객체를 참조하고 있고
		// 해당 요리책의 쿠폰유무가 “true”일 경우
		// 회원의 couponCount 1 증가 처리 후
		// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰이 발급됐다는 의미
		if(bList[index] instanceof CookBook && ((CookBook)bList[index]).isCoupon() == true) {
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;			
		}
		return result;
		
	}
}
