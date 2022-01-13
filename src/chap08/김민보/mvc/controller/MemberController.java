package chap08.김민보.mvc.controller;

import chap08.김민보.mvc.model.vo.Member;

public class MemberController {

	
	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);
	
	public int login(String id, String pwd){
	
		// 전달받은 id, pwd값과 mem의 memberId와 memberPwd 비교했을 때
		// 모두 같으면 1을 리턴
		// 아니면 0을 리턴		
		
		int login = 0; //리턴할 값 초기화먼저 시킴	
		
		if(id.equals(mem.getMemberId()) && pwd.equals(mem.getMemberPwd())){			
			login = 1;			
		}else {
			login = 0;
		}
		
		return login;
	}
	

	public Member readInfo() {
		// TODO Auto-generated method stub		
		
		return mem;
	}

	public int readAge() {
		
		//HINT : String클래스의 substring() 메소드, Integer클래스의 parseInt() 메소드 참고
		//우선 힌트로 나온 메소드가 뭔지 알아봄 substring은 (0 , 2) 0부터 1 사이에 있는 인덱스를 뽑아주는 메소드임
		// Integer에 parseInt메소드는 문자열에서 정수부분을 인트형으로 바꿔주는 메소드임!		
		
		String year = mem.getCitizenNo().substring(0, 2);
		int yearnum = Integer.parseInt(year);//지금 인트에 90이들어있다~
		
		yearnum = yearnum + 1900;//네자리 연도로 바꿔줌
		
		int nowyear = 2022;//맨날 바뀌니까 수정 쉽게 자료형으로 받아줌 ~!		
		int age = nowyear-yearnum +1;	//진짜 나이계산
		
		
		return age;//보내줌~
	}
	
	public void updateHeight(double height){
		// 전달 받은 height값으로 mem의 height값 수정		
		//당연 member클래스의 세터이용해서 수정함~!
		
		mem.setHeight(height);	
		
	}
	
}
