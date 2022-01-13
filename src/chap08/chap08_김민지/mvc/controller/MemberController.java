package chap08.chap08_김민지.mvc.controller;

import chap08.chap08_김민지.mvc.model.vo.Member;

public class MemberController {
	
	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);
	
	public MemberController() {
		// TODO Auto-generated constructor stub
	}
	
	public int login(String id, String pwd) {
		
		int result = 0; // result 값 초기화 선언
		
		if(mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) { // 전달받은 id, pwd값과 mem의 memberId와 memberPwd 비교했을 때! 모두 같으면 1을 리턴, 아니면 0을 리턴
			
			result = 1;
			
		}
		
		return result;
	}
	
	public Member readinfo() {
		return mem; // mem의 주소 값을 리턴
	}
	
	public int readAge() { 
		int age = 0;
		
		
		int year = Integer.parseInt(mem.getCitizenNo().substring(0, 2)); // Integer.parseInt : 문자열을 숫자로 만듦, Stirng.substring : 문자의 인덱스위치 값을 가져옴 
		// 주민번호 앞 2자리를 숫자로 만들어줌.
		
		if(year < 22) { // 22 보다 작으면 2000년대생 이므로 현재년도 - 2000 - year + 1
			age = 2022 - 2000 - year + 1;
		}else { // 22 보다 크면 1900년대 생!
			age = 2022 - 1900 - year +1;
		}
		
		return age;
	}
	
	public void updateHeight(double height) {
		mem.setHeigth(height);
	}

}
