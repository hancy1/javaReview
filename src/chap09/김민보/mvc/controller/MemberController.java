package chap09.김민보.mvc.controller;

import chap09.김민보.mvc.model.vo.Member;

public class MemberController {

	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
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
		return mem;//멤 주소값 리턴할것임
		
	}
	
	
	
	
	
	public Member checkId(String userId) {
		
		//mem에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입하여 리턴
		
		// 아이디로 검색된 결과를 담을 변수 초기화
		Member m = null;
		
		//검색하고, 있으면 대입
		for(int i = 0; i<mem.length; i++) {
			if(mem[i].getUserId().equals(userId))
				m = mem[i];
		}	
		
	
		
		//되돌려줌
		return m;
	}
	
	public void insertMember(Member m) {
		
		
		mem[memberCount++] = m;	
	
	}
	
	
	public Member searchMember(int menu, String search) {
		Member searchMember = null; 
		
		//menu가 1일때는 아이디로 검색
		if(menu == 1) {
			for(int i = 0; i<memberCount; i++){
				if(mem[i].getUserId().equals(search)) {
					searchMember = mem[i];
				}
			}
		}
		
		//menu가 2일때는 이름으로 검색
		if(menu ==2) {
			for(int i = 0; i<memberCount; i++){
				if(mem[i].getName().equals(search)) {
					searchMember = mem[i];
				}
			}
		}
		
		//menu가 3일때는 이메일로 검색~!
		if(menu==3) {
			for(int i = 0; i<memberCount; i++){
				if(mem[i].getEmail().equals(search)) {
					searchMember = mem[i];
				}
			}
		}
		
		else {
			return null;
		}
		return searchMember;		
		
	}
	
	
	public void updateMember(Member m, int menu, String update) {
		
		if(menu == 1) {
			m.setUserPwd(update);
		}
		
		if(menu==2) {
			m.setName(update);
		}
		
		if(menu==3) {
			m.setEmail(update);
		}
		
	}
	
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub
		
		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		
		for(int i = 0; i < memberCount; i++) {
			if(mem[i].getUserId().equals(userId)) {
				for(int j = i+1; j <memberCount; j++) {
					mem[j-1] = mem[j];
				}
				break;
			}
		}
		mem[memberCount -1] = null;
		memberCount--;		
		
	}	
	
	//앞에는 혼자 풀었는데 정렬하는거 다시공부 ...
	
	
	public Member[] sortIdAsc() {
		
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);
		
		for(int i=0; i<copy.length; i++	) {
			for(int j=0; j<i; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
		
	}

	public Member[] sortIdDesc() {
		
		// TODO Auto-generated method stub
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);
		
		for(int i=0; i<copy.length; i++	) {
			for(int j=0; j<i; j++) {
				if(copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
	}

	public Member[] sortAgeAsc() {
		
		// TODO Auto-generated method stub
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);
		
		for(int i=0; i<copy.length; i++	) {
			for(int j=0; j<i; j++) {
				if(copy[i].getAge() - copy[j].getAge() < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
	}

	public Member[] sortAgeDesc() {
		
		
		// TODO Auto-generated method stub
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);
		
		for(int i=0; i<copy.length; i++	) {
			for(int j=0; j<i; j++) {
				if(copy[i].getAge() - copy[j].getAge() > 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
	}

	public Member[] sortGenderDesc() {
		// TODO Auto-generated method stub
		
		
		Member copy[] = new Member[memberCount];
		System.arraycopy(mem, 0, copy, 0, memberCount);
		
		for(int i=0; i<copy.length; i++	) {
			for(int j=0; j<i; j++) {
				if(copy[i].getGender() == 'M' && copy[j].getGender() == 'F') {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}
			}
		}
		
		return copy;
	}

	
}
