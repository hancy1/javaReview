package chap11.김민보.mvc.view;

import java.util.Scanner;

import chap11.김민보.mvc.controller.LibraryManager;
import chap11.김민보.mvc.model.vo.Book;
import chap11.김민보.mvc.model.vo.Member;

public class LibraryMenu {

		LibraryManager lm = new LibraryManager();
		Scanner sc = new Scanner(System.in);
		
		public void mainMenu() {
			// TODO Auto-generated method stub
			
			System.out.println("환영합니다.");
			System.out.println("회원등록하세요.");		
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			System.out.println("나이 : ");		
			int age = sc.nextInt();
			
			sc.nextLine();
			System.out.println("성별(m/f) : ");
			char gender = sc.nextLine().charAt(0);
			
			Member newMem = new Member(name, age, gender, 0); 
			lm.insertMember(newMem); 
							
			
			
			while(true) {
				
				System.out.println("====메 뉴====");
				System.out.println("1. 마이페이지");
				System.out.println("2. 도서 전체 조회");
				System.out.println("3. 도서 검색");
				System.out.println("4. 도서 대여하기");
				System.out.println("0. 프로그램 종료하기");
				
				System.out.println("메뉴 선택 : ");
				int menu = sc.nextInt();
				
				sc.nextLine();
				
				switch(menu) {
				
				case 1:				
					System.out.println(lm.myInfo());
					break;
				case 2:
					selectAll();
					break;
				case 3:
					searchBook();
					break;
				case 4:
					rentBook();
					break;				
				case 0:
					System.out.println("프로그램을 종료합니다.");
					return; 
				default:
					System.out.println("잘못입력하셨습니다. 다시입력 하세요.");
					break;				
				}			
				
			}
			
		}
		
		
		public void selectAll() {
			Book[] bList = lm.selectAll();
			for(int i = 0; i<bList.length; i++) {
				System.out.println("["+i + "번 도서] " + bList[i]);
			}
		}
		
		public void searchBook() {
			
			System.out.println("검색할 제목 : ");
			String keyword = sc.nextLine();			
			
			Book[] sList = lm.searchBook(keyword);
			
			
			for(Book sb : sList){
				if(sb!=null) {
				 System.out.println(sb);
				
				}			
			}		
		}
		
		public void rentBook() {
			//도서대여를 하려면 도서번호를 알아야됨
			System.out.println("도서 대여 가능 목록");
			selectAll();
			
			System.out.println("대여할 도서 번호를 선택 : ");		
			int num = sc.nextInt();
			
			int result = lm.rentBook(num);
			
			if(result == 0) {
				System.out.println("성공적으로 대여되었습니다.");
			
			}else if(result == 1) {		
				System.out.println("나이 제한으로 대여가 불가능 합니다.");
			
			}else {//2일때
				System.out.println("성공적으로 대여되었습니다.");
				System.out.println("축하합니다!! 요리학원 쿠폰이 발급되었습니다~ 마이페이지를 통해 확인하세요~!");
			}
			
		}

		
		
}
