package chap02.chap02_김민보.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		//종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.		
				
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("9.종료");
		
		System.out.println("메뉴번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		
		switch(num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
			
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
			
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
			
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
			
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			return;
			
		default:
			System.out.println("잘못입력하였습니다. 안내된 번호를 입력하세요.");
			return;
		}
		
	}
	
	public void practice2(){
		//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		//짝수가 아니면 “홀수다“를 출력하세요.
		//양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
				
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if((num > 0) && (num%2 == 0)) {
			System.out.println("짝수다.");
				}
		
		else if(num % 2 == 1) {
			System.out.println("홀수다.");
		}
		
		else {
			System.out.println("양수만 입력해 주세요.");
		}
		
		
	}
	
	public void practice3(){		
		
		System.out.println("국어 점수 : ");
		int korean = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int english = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double average = total / 3;
		
		
		String result = " ";
		
		if(korean>=40 && english>=40 && math>40 && average>=60) {
			result = "축하합니다, 합격입니다!";
			System.out.println("국어점수 : " + korean);
			System.out.println("수학점수 : " + math);
			System.out.println("영어점수 : " + english);
			System.out.println("총점 : "+ total);
			System.out.println("평균 : "+ average);
			System.out.println(result);
				}
					
		else {
			result = "불합격입니다.";
			System.out.println("국어점수 : " + korean);
			System.out.println("수학점수 : " + math);
			System.out.println("영어점수 : " + english);
			System.out.println(result);
				}
						
		}
		
	
	public void practice4(){
		
		//수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		
			
		System.out.println("월을 입력하시면 계절을 알려 드려요!");
		System.out.println("1~12 사이의 정수 입력 : ");
				
		int season = sc.nextInt();
				
		
		switch(season) {
		case 1:
		case 2:
		case 12:
			System.out.println(season + "월은 겨울입니다.");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println(season + "월은 봄입니다.");
			break;
		
		case 6:
		case 7:
		case 8:
			System.out.println(season + "월은 여름입니다.");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println(season + "월은 가을입니다.");
			break;
			
			
		default:
			System.out.println(season + "월은 범위를 벗어나서, 해당하는 계절이 없습니다.");
			return;
		}
				
	}
	
	public void practice5(){
		
		//아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		//로그인 성공 시 “로그인 성공”, 
		//아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		//비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
								
		
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		
		if(id.equals("user1") && password.equals("1234")){
			System.out.println("로그인 성공");
		}
		
		else if(!id.equals("user1") && password.equals("1234")){
			System.out.println("아이디가 틀렸습니다.");
		}
		
		else if(id.equals("user1") && !password.equals("1234")){
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
		else {
			System.out.println("아이디,비번 모두 확인하세요.");
		}
		
	}
	
	public void practice6(){
		/*
		사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		비회원은 게시글 조회만 가능합니다.
		(단, 잘못 입력하였을 경우 “잘못 입력했습니다.” 라는 출력문이 출력되도록)
		*/		
		
		System.out.println("관리자, 회원, 비회원 중");
		System.out.println("권한을 확인하고자 하는 회원 등급을 입력하세요 : ");
		String grade = sc.nextLine();
		
		if(grade.equals("관리자")){
			System.out.println("권한을 확인하고자 하는 회원 등급 : " + grade);
			System.out.println("회원관리, 게시글관리");
			System.out.println("게시글작성, 댓글작성");
			System.out.println("게시글조회");
			}
		
		else if(grade.equals("회원")){
			System.out.println("권한을 확인하고자 하는 회원 등급 : " + grade);			
			System.out.println("게시글작성, 댓글작성");
			System.out.println("게시글조회");
			}
		
		else if(grade.equals("비회원")){
			System.out.println("권한을 확인하고자 하는 회원 등급 : " + grade);			
			System.out.println("게시글조회");		
			}
		
		else {
			System.out.println("잘못 입력했습니다.");
			}
				
	}
		
	public void practice7(){
		//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		//저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
		//BMI = 몸무게 / (키(m) * 키(m))
		//BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		//BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		//BMI가 30이상일 경우 고도 비만
		
	
		
		System.out.println("키(m)를 입력해주세요 :  ");
		double h = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요 :  ");
		double w = sc.nextDouble();
		
		double bmi = w / (h*h);
		
		if(bmi < 18.5) {
			System.out.println("BMI 지수 : "+ bmi);
			System.out.println("저체중");
			}
		else if(bmi == 18.5 && bmi < 23) {
			System.out.println("BMI 지수 : "+ bmi);
			System.out.println("정상체중");
			}
		else if(bmi == 23 && bmi < 25) {
			System.out.println("BMI 지수 : "+ bmi);
			System.out.println("과체중");
			}
		else if(bmi == 25 && bmi < 30) {
			System.out.println("BMI 지수 : "+ bmi);
			System.out.println("비만");
			}		
		else {
			System.out.println("BMI 지수 : "+ bmi);
			System.out.println("고도비만");
		}		
		
	}

	
	public void practice8(){
		//키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		//(단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
		//“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
		//(printf()문을 이용하여 마지막 출력문을 작성해보시오.)	

		
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		int op1 = num1 + num2;
		int op2 = num1 - num2;
		int op3 = num1 * num2;
		double op4 = num1 / num2;
		int op5 = num1 % num2;
		 
						
		if(op == '+') {				
			System.out.printf("%d  %c  %d = %d", num1, op, num2, op1);
			}
		
		else if(op == '-') {				
			System.out.printf("%d  %c  %d = %d", num1, op, num2, op2);
			}
		
		else if(op == '*') {				
			System.out.printf("%d  %c  %d = %d", num1, op, num2, op3);
			}
		
		else if(op == '/') {				
			System.out.printf("%d  %c  %d = %f", num1, op, num2, op4);
			}
		
		else if(op == '%') {				
			System.out.printf("%d  %c  %d = %d", num1, op, num2, op5);
			}
		
		else {
			System.out.printf("잘못 입력하였습니다. 프로그램을 종료합니다.");
			}
			
	}
	
	public void practice9(){	

		
		System.out.println("중간고사 점수 : ");
		int test1 = sc.nextInt();
		System.out.println("기말고사 점수 : ");
		int test2 = sc.nextInt();
		System.out.println("과제 점수 : ");
		int homework = sc.nextInt();
		System.out.println("출석 회수 : ");
		int day = sc.nextInt();
		
		double t1s = test1 * 0.2;
		double t2s = test2 * 0.3;
		double hs = homework * 0.3;
		double ds = day;
		
		double total = t1s + t2s + hs + ds;
		
		//14일 이상 출석하면 전체강의의 70%이상 출석임
		
		if(14 <= day && 70<=total) {
			System.out.println("중간고사 점수(20) : "+ t1s);
			System.out.println("기말고사 점수(30) : "+ t2s);
			System.out.println("과제 점수(20) : "+ hs);
			System.out.println("출석 점수(30) : "+ ds);
			System.out.println("총점 : "+ total);
			System.out.println("PASS");
			}
		
		else if(14 <= day && 70>total) {			
			System.out.println("FAIL [점수미달] (총점 " + total + ")");
			}
		
		else if(14 > day && 70<=total) {			
			System.out.println("FAIL [출석 횟수 부족] (" + day + "/20)");
			}
		
		else {
			System.out.println("FAIL [출석 횟수 부족] (" + day + "/20)");
			System.out.println("FAIL [점수미달] (총점 " + total + ")");
			}
					
	}
	
	
	public void practice10(){		
		
		
		System.out.println("실행할 기능의 숫자를 입력하세요.");
		
		System.out.println("1.메뉴 출력");
		System.out.println("2.짝수/홀수");
		System.out.println("3.합격/불합격");
		System.out.println("4.계절");
		System.out.println("5.로그인");
		System.out.println("6.권한 확인");
		System.out.println("7.BMI");
		System.out.println("8.계산기");
		System.out.println("9.Pass/Fail");
		
		
		System.out.println("선택 : ");
		int num = sc.nextInt();
						
		
				
		
		switch(num) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
					
		case 4:
			practice4();
			break;
			
		case 5:
			practice5();
			break;
					
		case 6:
			practice6();
			break;
			
		case 7:
			practice7();
			break;
			
		case 8:
			practice8();
			break;
			
		case 9:
			practice9();
			break;					
			
		default:
			System.out.println( "잘못 누르셨습니다. 해당하는 범위의 숫자를 선택해주세요.");
			return;
		}
		
		
	}

}
