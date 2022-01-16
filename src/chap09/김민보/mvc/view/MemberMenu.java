package chap09.김민보.mvc.view;

import java.util.Scanner;

import chap09.김민보.mvc.controller.MemberController;
import chap09.김민보.mvc.model.vo.Member;

public class MemberMenu {

	
	private MemberController mc = new MemberController(); 
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("===== 회원 관리 메뉴=====");
			System.out.println("1. 신규 회원 등록 ");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴선택 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;				
			case 6:
				sortMember();
				break;					
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시입력 하세요.");
				break;				
			}			
		}
	}

	public void insertMember() {
		// TODO Auto-generated method stub
		
		int memberCount = mc.getMemberCount();
		if(MemberController.SIZE >= memberCount) {
			System.out.println("최대회원수를 초과하였습니다.");
			return;
		}else {
			System.out.println("===회원 정보 입력===");
			System.out.println("아이디 : ");
			String userId = sc.nextLine();
			Member m = mc.checkId(userId);
			
			//값이있으면 동일한 아이디가 존재한다는 뜻. null이여야 등록가능
			
			if(m != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
			}else {
				System.out.println("비밀번호 : ");
				String userPwd = sc.nextLine();
				
				System.out.println("이름 : ");
				String name = sc.nextLine();
				
				System.out.println("나이 : ");
				int age = sc.nextInt();
				
				sc.nextLine();
				System.out.println("성별 : ");
				char gender = sc.nextLine().charAt(0);
				
				System.out.println("이메일 : ");
				String email = sc.nextLine();
		
				mc.insertMember(new Member(userId, userPwd, name, age, gender, email));
				System.out.println("성공적으로 회원 등록이 되었습니다.");
			}
		}		
	}
	
	
	public void searchMember() {
		// TODO Auto-generated method stub
		while(true) {
			
			System.out.println("===회원 정보 검색===");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			
			System.out.println("메뉴선택 : ");			
			int menu = sc.nextInt();
			sc.nextLine();
			
			//이전 메뉴로 선택시 main실행시키기..
			if(menu == 9) {
				mainMenu();
				break;
			}				
			
			System.out.println("검색 내용 : ");
			String search = sc.nextLine();
			
		
			//나머지는 mc의 서치메소드로 전달시키기~
			
			//리턴값이 없는경우 "없다" 출력
			// 리턴값이 있는 경우는 회원정보 출력
			
			
			if(mc.searchMember(menu, search) == null) {
				System.out.println("검색된 결과가 없습니다.");
			}else {
				System.out.println(mc.searchMember(menu, search).information());	
			}			
		}
		
		
		
	}
	
	
	public void updateMember() {
		// TODO Auto-generated method stub
		while(true) {
			
			System.out.println("===회원 정보 수정===");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			
			System.out.println("메뉴선택 : ");			
			int menu = sc.nextInt();
						
			
			
			//이전 메뉴로 선택시 main실행시키기..
			if(menu == 9) {
				mainMenu();
				break;
			}				
			
			sc.nextLine();
			System.out.println("변경할 회원 아이디 : ");
			String userId = sc.nextLine();
			
			Member m = mc.checkId(userId);
			
			if(mc.checkId(userId)==null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			}else {
				System.out.println("변경 내용 : ");
				String update = sc.nextLine();
				
				mc.updateMember(m, menu, update);
				System.out.println("회원 정보가 변경되었습니다.");
			}			
		}		
	}
	
	
	
	public void deleteMember() {
		// TODO Auto-generated method stub
		System.out.println("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		
		Member m = mc.checkId(userId);
		
		if(mc.checkId(userId)==null) {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}else {
			
			System.out.println(m.information());
			
			System.out.println("정말 삭제하시겠습니까? (y/n)");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'y' || ch == 'Y') {
				mc.deleteMember(userId);
				System.out.println("회원의 정보가 삭제되었습니다.");
			}
			
			if(ch == 'n' || ch == 'N') {
				
				System.out.println("처음으로 돌아갑니다.");
				mainMenu();
			}			
			
		}		
		
	}
	
	public void printAllMember() {
		// TODO Auto-generated method stub
		
		Member[] mem = mc.getMem();
		for(int i = 0; i < mc.getMemberCount(); i++) {			
			System.out.println(mem[i].information());
		}
		
	}
	
	
	
	public void sortMember() {
		// TODO Auto-generated method stub
		
		Member[] sortMem = null; 
		// 정렬 결과를 받아 줄 객체배열 초기화
		
		
		while(true) {
			
			System.out.println("==회원 정보 정렬==");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬(남여순)");
			System.out.println("9. 이전 메뉴로");
			
			System.out.println("메뉴 선택 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2: 
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
				
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			case 9: 
				mainMenu();
				break;				
		}
			
			for(int i = 0; i < mc.getMemberCount(); i++) {
				System.out.println(sortMem[i].information());
			}	
			
		}
		
	}
	
	
}
