package chap09.chap09_김민지.mvc.controller;

import chap09.chap09_김민지.mvc.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10; // 최대 회원 수 상수필드로 10 초기화
	private int memberCount; // 현재 회원 수 필드
	private Member[] mem = new Member[SIZE]; // 회원들의 정보를 담는 객체 배열
	
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}
	
	public int getMemberCount() {
		
		return memberCount;
	}
	
	public Member[] getMem() {
		
		return mem;	
	}
	
	public Member checkId(String userId) {
		
		Member m = null;
		
		for(int i = 0; i < memberCount; i++) {
			
			if(mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
			
		}
		
		return m;
	}
	
	public void insertMember(Member m) {
		
		mem[memberCount++] = m;
		
	}
	
	public Member searchMember(int menu, String search) {
		
		Member searchMember = null;
		
		for(int i = 0; i < memberCount; i++) {
			
			if(menu == 1) {
				if(mem[i].getUserId().equals(search)) {
					searchMember = mem[i];
				}
				
			}else if(menu == 2) {
				if(mem[i].getName().equals(search)) {
					searchMember = mem[i];
				}
				
			}else {
				if(mem[i].getEmail().equals(search)) {
					searchMember = mem[i];
				}
				
			}
		}
		
		return searchMember;
	}
	
	
	public void updateMember(Member m, int menu, String update) {
		
		for(int i = 0; i < memberCount; i++) {
			
			if(menu == 1) {
				mem[i].setUserPwd(update);
				
			}else if(menu == 2) {
				mem[i].setName(update);
				
			}else {
				mem[i].setEmail(update);
				
			}
		}
		
		
		
	}
	
	public void deleteMember(String userId) {
		
		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오
		// memberCount 1 감소
		
		for(int i = 0; i < memberCount; i++) {
			
			if(mem[i].getUserId().equals(userId)) {
				
				if(i == memberCount-1) { // 객체가 맨마지막 순서였으면 바로 삭제
					mem[i] = null;
				}else { // 중간에 끼인 객체일 경우, 그 뒤부터의 객체들 순서를 하나씩 당겨준다
					for(int j = i; j < memberCount - 1; j++) {
						mem[j] = mem[j+1];
					}
					mem[memberCount-1] = null; // 맨 뒤로 밀린 삭제될 객체는 삭제!
				}
				memberCount--; //객체들 삭제완료. 사이즈 줄이기
				break;
			}
		}
			
	}
	
	public Member[] sortIdAsc() {  //st[1].compareTo(st[2]) 가 양수면 st1>st2 그러므로 오름차순을 원하면 두개 자리를 바꿔야 한다. 
		
		Member [] copy = mem.clone(); // 기존의 배열을 복사해서 사용
		
		for(int i = 0; i < memberCount; i++) {
			for(int j = 0; j < i; j++) {
				if(copy[j].getUserId().compareTo(copy[i].getUserId()) > 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
		
	}

	public Member[] sortIdDesc() { // 위랑 반대로
		
		Member [] copy = mem.clone(); // 기존의 배열을 복사해서 사용
		
		for(int i = 0; i < memberCount; i++) {
			for(int j = 0; j < i; j++) {
				if(copy[j].getUserId().compareTo(copy[i].getUserId()) < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
		
		
	}
	
	public Member[] sortAgeAsc() {
			
		Member [] copy = mem.clone(); // 기존의 배열을 복사해서 사용
		
		for(int i = 0; i < memberCount; i++) {
			for(int j = 0; j < i; j++) {
				if(copy[i].getAge() < copy[j].getAge()) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
		
		
	}
	
	public Member[] sortAgeDesc() {
		
		Member [] copy = mem.clone(); // 기존의 배열을 복사해서 사용
		
		for(int i = 0; i < memberCount; i++) {
			for(int j = 0; j < i; j++) {
				if(copy[i].getAge() > copy[j].getAge()) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
		
		
	}
	
	public Member[] sortGenderDesc() {
		Member [] copy = mem.clone(); // 기존의 배열을 복사해서 사용
		
		for(int i = 0; i < memberCount; i++) {
			for(int j = 0; j < i; j++) {
				if(copy[i].getGender() > copy[j].getGender()) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
		
		
		
	}
}
