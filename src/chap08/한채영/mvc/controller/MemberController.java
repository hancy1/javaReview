package chap08.한채영.mvc.controller;

import chap08.한채영.mvc.model.vo.Member;

public class MemberController {

	Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);

	public MemberController() {
		// TODO Auto-generated constructor stub
	}

	public int login(String id, String pwd) {

		if (id.equals(mem.getMemberId()) && pwd.equals(mem.getMemberPwd())) {
			return 1;
		} else {
			return 0;
		}
	}

	public Member readInfo() {
		System.out.println(mem.information());
		return mem;
	}

	public int readAge() {
		
		// mem의 주민번호의 앞 2자리를 추출해서 출생년도를 알아낼 것
		//HINT : String클래스의 substring() 메소드, Integer클래스의 parseInt() 메소드 참고
		// 나이 = 올해년도 – 출생년도 + 1 ( 어떤 조건이 필요한지 생각해보시오 )
		// 구한 나이 값 리턴	
		
		String str = mem.getCitizenNo().substring(0, 2); //0부터 2전까지
		int check = Integer.parseInt(str);
			
		if(check >= 0 && check <= 22) {
			int year = 2000 + check;
			int age = 2022 - year + 1;
			return age;
		} else {
			int year = 1900 + check;
			int age = 2022 - year + 1;
			return age;
		}		
			
	}

	public void updateHeight(double height) {
		
		mem.setHeight(height);
		System.out.println("수정된 키: " + mem.getHeight());
		
	}
}
