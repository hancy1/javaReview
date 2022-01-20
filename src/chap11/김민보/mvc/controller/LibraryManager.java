package chap11.김민보.mvc.controller;

import chap11.김민보.mvc.model.vo.AniBook;
import chap11.김민보.mvc.model.vo.Book;
import chap11.김민보.mvc.model.vo.CookBook;
import chap11.김민보.mvc.model.vo.Member;

public class LibraryManager {

	private Member mem = null; //null명시 초기화~
	private Book[] bList = new Book[5];
	
	{		
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);			
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐 ", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		
				
		this.mem = mem;
		
		}
	
	public Member myInfo() {
		
		return mem;
		}
	
	public Book[] selectAll() {
		
		return bList;
		}
	
	public Book[] searchBook(String keyword) {		
		
		
		Book[] sList = new Book[5];
		int count = 0;
		
		for(int i = 0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				sList[count] = bList[i];
				count++; 
			}
		}		
		return sList; 
		
	}
	
	public int rentBook(int index) {
		int result = 0;		
		
		if(bList[index] instanceof AniBook) {
			if(mem.getAge()<((AniBook)bList[index]).getAccessAge()){
				result = 1;
				
			}		
		}		
		if(bList[index] instanceof CookBook) {
			if(((CookBook)bList[index]).isCoupon()) {				
				result = 2;

				mem.setCouponCount(mem.getCouponCount()+1);				
			}
		}		
		
		return result;
		}
}
