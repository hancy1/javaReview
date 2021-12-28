package chap02.chap02_김민지.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1(){
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		sc.nextLine();

		switch(menu) {
		case 1 : System.out.println("입력메뉴입니다.");
		break;
		case 2 : System.out.println("수정메뉴입니다.");
		break;
		case 3 : System.out.println("조회메뉴입니다.");
		break;
		case 4 : System.out.println("삭제메뉴입니다.");
		break;
		case 9 : System.out.println("종료합니다.");
		break;
		default : System.out.println("잘못입력하셨습니다.");
		}
	}


	public void practice2(){
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();

		if(num>0 && num%2 == 0) {
			System.out.println("짝수다");
		}else if(num>0 && num%2 != 0) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요");
		}
	}

	public void practice3(){
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		sc.nextLine();

		System.out.println("수학 : ");
		int math = sc.nextInt();
		sc.nextLine();

		System.out.println("영어 : ");
		int eng = sc.nextInt();
		sc.nextLine();


		int sum = kor + eng + math;
		double avg = sum / 3;

		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4(){
		System.out.println("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();

		switch(num) {
		case 12:
		case 1:
		case 2: System.out.println(num + "월은 겨울입니다.");
		break;
		case 3:
		case 4:
		case 5: System.out.println(num + "월은 봄입니다.");
		break;
		case 6:
		case 7:
		case 8: System.out.println(num + "월은 여름입니다.");
		break;
		case 9:
		case 10:
		case 11: System.out.println(num + "월은 가을입니다.");
		break;
		default: System.out.println(num + "월은 잘못 입력된 달입니다.");
		break;
		}
	}



	public void practice5(){
		String id = "user1";
		String pwd = "1234";

		System.out.println("아이디 : ");
		String a = sc.nextLine();

		System.out.println("비밀번호 : ");
		String b = sc.nextLine();

		if(a.equals(id) && b.equals(pwd)) {
			System.out.println("로그인 성공");
		}else if(a.equals(id)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if( b.equals(pwd)) {
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

	public void practice6(){
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String str = sc.nextLine();

		switch(str) {
		case"관리자" : System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글작성");
		break;
		case"회원" : System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		break;
		case"비회원" : System.out.println("게시글 조회");
		break;
		default : System.out.println("잘못 입력했습니다.");
		break;
		}
	}

	public void practice7(){
		System.out.println("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		sc.nextLine();

		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		sc.nextLine();

		double BMI = (kg / (height * height));

		System.out.println("BMI 지수 : " + BMI);
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if(BMI < 23) {
			System.out.println("정상체중");
		}else if(BMI < 25) {
			System.out.println("과체중");
		}else if(BMI < 30) {
			System.out.println("비만");
		}else {System.out.println("고도 비만");}

	}

	public void practice8(){
		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		sc.nextLine();

		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);

		int result = 0;

		if(num1 > 0 && num2 >0) { // 양수여야함.
			switch(ch) {
			case'+' : result = num1 + num2; break;
			case'-' : result = num1 - num2; break;
			case'*' : result = num1 * num2; break;
			case'/' : result = num1 / num2; break;
			case'%' : result = num1 % num2; break;
			default : System.out.println("잘못 입력하셨습니다.");
			return;


			}
		}else {System.out.println("양수를 입력하세요.");}
		System.out.printf("%d %c %d = %d", num1, ch, num2, result);
	}

	public void practice9(){
		System.out.println("중간 고사 점수 : ");
		int mid = sc.nextInt();
		sc.nextLine();

		System.out.println("기말 고사 점수 : ");
		int end = sc.nextInt();
		sc.nextLine();

		System.out.println("과제 점수 : ");
		int homework = sc.nextInt();
		sc.nextLine();

		System.out.println("출석 회수 : ");
		int count = sc.nextInt();
		sc.nextLine();

		double m = mid*0.2;
		double e = end*0.3;
		double hw = homework*0.3;
		int c = count;

		double sum = m+e+hw+c;

		System.out.println("===========결과==========");
		if(sum>=70 && c >=20*0.7) {
			System.out.println("중간 고사 점수(20) : " + m);
			System.out.println("기말 고사 점수(30) : " + e);
			System.out.println("과제 점수    (30) : " + hw);
			System.out.println("출석 점수    (20) : " + c);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
		}else {
			
			if(c < 20*0.7) {
				System.out.println("FAIL [출석 횟수 부족] (" + c + "/20)");
			}
			if(sum <70) {
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")" );
			}
		}
	}
	
	 public void practice10(){
		 System.out.println("실행할 기능을 선택하세요.");
		 System.out.println("1. 메뉴 출력");
		 System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. Pass/Fail");

			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch (menu) { 

			case 1:	practice1(); break;
			case 2:	practice2(); break;
			case 3:	practice3(); break;
			case 4:	practice4(); break;
			case 5:	practice5(); break;
			case 6:	practice6(); break;
			case 7:	practice7(); break;
			case 8:	practice8(); break;
			case 9:	practice9(); break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
	 }
	
	
}
