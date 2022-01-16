package chap09.한채영.mvc.controller;

import chap09.한채영.mvc.model.vo.Member;

public class MemberController {

	public int SIZE = 10;
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

		return mem;

	}

	public Member checkId(String userId) {
		Member m = null; // 아이디로 검색된 결과를 담을 변수 초기화

		// mem 에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
		for (int i = 0; i < memberCount; i++) {
			if (mem[i].getUserId().equals(userId))
				m = mem[i];
		}
		// m 리턴
		return m;
	}

	public void insertMember(Member m) {

		// 매개변수로 전달받은 회원객체를 mem 배열에 추가
		// memberCount 1 증가

		mem[memberCount] = new Member(m.getUserId(), m.getUserPwd(), m.getName(), m.getAge(), m.getGender(),
				m.getEmail());

		memberCount++;

	}

	public Member searchMember(int menu, String search) {

		Member searchMember = null;

		// 매개변수로 전달받은 search 문자열을 menu 번호에 따라
		// 1 인 경우 아이디로 검색 후 결과를 searchMember에 대입하고
		// 2 인 경우 이름으로 검색 후 결과를 searchMember에 대입하고
		// 3 인 경우 이메일로 검색 후 결과를 searchMember에 대입하고
		// searchMember 주소 값 리턴

		switch (menu) {
		case 1:
			for (int i = 0; i < memberCount; i++) {
				if (search.equals(mem[i].getUserId()))
					searchMember = mem[i];
			}
			break;
		case 2:
			for (int i = 0; i < memberCount; i++) {
				if (search.equals(mem[i].getName()))
					searchMember = mem[i];
			}
			break;
		case 3:
			for (int i = 0; i < memberCount; i++) {
				if (search.equals(mem[i].getEmail()))
					searchMember = mem[i];
			}
			break;
		}
		return searchMember;
	}

	public void updateMember(Member m, int menu, String update) {

		// 매개변수로 전달받은 m 회원과 변경 내용인 update 문자열을 menu에 따라
		// 1 인 경우 setter 메소드를 이용하여 m의 비밀번호를 update 문자열로 변경
		// 2 인 경우 setter 메소드를 이용하여 m의 이름을 update 문자열로 변경
		// 3 인 경우 setter 메소드를 이용하여 m의 이메일을 update 문자열로 변경

		switch (menu) {

		case 1:
			m.setUserPwd(update);
			break;
		case 2:
			m.setName(update);
			break;
		case 3:
			m.setEmail(update);
			break;
		}

	}

	public void deleteMember(String userId) {

		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오
		// memberCount 1 감소

		for (int i = 0; i < memberCount; i++) {
			if (userId.equals(mem[i].getUserId()))
				mem[i] = null;
	
				mem[i] = mem[i+1];
			

			
		}
		memberCount--;
	}

	public Member[] sortIdAsc() {

		Member[] copy = mem.clone();

		for (int i = 0; i < memberCount; i++) {

			for (int j = 0; j < i; j++) {

				if (copy[i].getUserId().compareTo(copy[j].getUserId()) < 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}

			}

		}
		return copy;
	}

	public Member[] sortIdDesc() {
		Member[] copy = mem.clone();

		for (int i = 0; i < memberCount; i++) {

			for (int j = 0; j < i; j++) {

				if (copy[i].getUserId().compareTo(copy[j].getUserId()) > 0) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}

			}

		}
		return copy;
	}

	public Member[] sortAgeAsc() {
		Member[] copy = mem.clone();

		for (int i = 0; i < memberCount; i++) {

			for (int j = 0; j < i; j++) {

				if (copy[i].getAge() < copy[j].getAge()) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}

			}

		}
		return copy;
	}

	public Member[] sortAgeDesc() {
		Member[] copy = mem.clone();

		for (int i = 0; i < memberCount; i++) {

			for (int j = 0; j < i; j++) {

				if (copy[i].getAge() > copy[j].getAge()) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}

			}

		}
		return copy;
	}

	public Member[] sortGenderDesc() {
		Member[] copy = mem.clone();

		for (int i = 0; i < memberCount; i++) {

			for (int j = 0; j < i; j++) {

				if (copy[i].getGender() > copy[j].getGender()) {
					Member temp = copy[j];
					copy[j] = copy[i];
					copy[i] = temp;
				}

			}

		}
		return copy;
	}
}
