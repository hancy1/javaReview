package chap09.chap09_김민지.mvc.view;



import java.util.Scanner;

import chap09.chap09_김민지.mvc.controller.MemberController;
import chap09.chap09_김민지.mvc.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.println("번호 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			
			switch(menu) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAllMember(); break;
			case 6 : sortMember(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못입력하셨습니다. 다시 입력해주세요."); break;
			
			}
		}
	}

	private void insertMember() {
		
		int memberCount = mc.getMemberCount();
		
		if(memberCount >= mc.SIZE) {
			System.out.println("더 이상 신규 회원 등록을 하실 수 없습니다.");
			return;
		}else {
			System.out.println("아이디 입력 (중복체크) : ");
			String id = sc.nextLine();
			
			Member m = mc.checkId(id); // 아이디 중복체크 하는 과정
			
			if(m != null) {
				System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
		
			}else {
				System.out.println("비밀번호 : ");
				String pwd = sc.nextLine();
				
				System.out.println("이름 : ");
				String name = sc.nextLine();
				
				System.out.println("나이 : ");
				int age = sc.nextInt();
				
				System.out.println("성별 : ");
				char gender = sc.next().charAt(0);
				sc.nextLine();
				
				System.out.println("이메일 : " );
				String email = sc.nextLine();
				
				Member newMem = new Member (id, pwd, name, age, gender, email);
				
				mc.insertMember(newMem);
				
				System.out.println("성공적으로 회원 등록이 되었습니다.");
			}
		}
		
	}
	
	public void searchMember() {
		
		while(true) {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}
			
			System.out.println("검색 내용 : ");
			String search = sc.nextLine();
			
			Member m = mc.searchMember(menu, search);
			
			if(m == null) {
				System.out.println("검색된 결과가 없습니다.");
			}else {
				System.out.println(m.information());
			}
			
		}
		
	}
	
	public void updateMember() {
		while(true) {
			System.out.println("====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}
			
			
			System.out.println("변경할 회원 아이디 : ");
			String userId = sc.nextLine();
			
			Member m = mc.checkId(userId);
			
			if(m == null) {
				System.out.println("변경할 회원이존재하지 않습니다.");
			}else {
				System.out.println("기존 회원 정보");
				System.out.println(m.information());
				
				System.out.println("변경 내용 : ");
				String update = sc.nextLine();
				
				mc.updateMember(m, menu, update);
				
				System.out.println("회원의 정보가 변경되엇습니다.");
			}
		}
		
	}
	
	public void deleteMember() {
		
		System.out.println("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		
		Member m = mc.checkId(userId);
		
		if(m == null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}else {
			System.out.println("==== 기존 회원 정보 ====");
			System.out.println(m.information());
			
			while(true) {
			System.out.println("정말 삭제하시겠습니까? (y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0); // 대소문자 구별없이
			
			if(ch == 'Y') {
				mc.deleteMember(userId);
				System.out.println("회원의 정보가 삭제되었습니다.");
				break;
			}else {
				break;
			}
		}
		
	  }
		
	}
	
	public void printAllMember() {
		Member[] mem = mc.getMem();
		
		for(int i = 0; i < mc.getMemberCount(); i++) { // 전체를 다 돌리면 꽉 차지 않았을 경우 에러가 날 수 있으므로 membercount 만큼만 돌려준다.
			System.out.println(mem[i].information());
		}
		
	}
	
	public void sortMember() {
		Member[] sortMem = null;
		
		while(true) {
			System.out.println("====== 회원 정보 정렬 ======");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("9. 이전 메뉴로");
			System.out.println("메뉴 선택 :");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : sortMem = mc.sortIdAsc(); break;
			case 2 : sortMem = mc.sortIdDesc(); break;
			case 3 : sortMem = mc.sortAgeAsc(); break;
			case 4 : sortMem = mc.sortAgeDesc(); break;
			case 5 : sortMem = mc.sortGenderDesc(); break;
			case 9 : System.out.println("이전 메뉴로 돌아갑니다."); return;
			default : System.out.println("잚못 입력하셨습니다. 다시 입력해주세요."); continue;
			
			
			
			
			}
			
			for(int i = 0; i < mc.getMemberCount(); i++) { // 전체를 다 돌리면 꽉 차지 않았을 경우 에러가 날 수 있으므로 membercount 만큼만 돌려준다.
				System.out.println(sortMem[i].information());
			}
		}
		
	}
	
	

}
