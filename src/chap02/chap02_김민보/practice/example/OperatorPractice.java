package chap02.chap02_김민보.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	

	public void method1() {//삼항연산자
		//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		
				
		System.out.println("정수 값 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num + "은(는)" + (num > 0 ? "양수이다." : "양수가 아니다."));
		
	}
	
	
	public void method2() {//삼항연산자

		//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
		//양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요		
		
		
		System.out.println("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = num > 0? "양수이다." : (num == 0 ? "0이다." : "음수이다.");
		System.out.println(num + "은(는)" + result);
	
	}
	
	
	
	
	public void method2if() {

		//키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
		//양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요
		
				
		System.out.println("정수 값 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
				}
		
		else if(num < 0) {
			System.out.println("음수다.");
		}
		
		else {
			System.out.println("0이다.");
		}
	
	}
	
	public void method3() {//삼항연산자

		//키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
			
		
		System.out.println("정수 값 입력 : ");
		int num = sc.nextInt();
		
		String result = num % 2 == 0 ? "짝수이다." : "홀수이다";
		System.out.println(num + "은(는)" + result);
				
	}
	
	
	public void method3if() {//if문
		
		//키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
				
		
		System.out.println("정수 값 입력 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다.");
				}		
		else{
			System.out.println("홀수다.");
		}
	}
	
public void method4() {
		
		//모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		//인원 수와 사탕 개수를 키보드로 입력 받고
		//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요
		
				
		System.out.println("인원 수 입력 : ");
		int personNum = sc.nextInt();
		
		System.out.println("사탕 개수 입력 : ");
		int candyNum = sc.nextInt();
		
		int candy1 = (int)(candyNum / personNum);
		int candy2 = candyNum % personNum;
		
		
		System.out.println("1인당 사탕 개수 : " + candy1);
		System.out.println("남은 사탕 개수 : " + candy2);
		
	}


	public void method5(){
	
	
	
	System.out.println("이름 : ");
	String name = sc.nextLine();
	
	System.out.println("학년(숫자만) : ");
	int grade = sc.nextInt();
	
	System.out.println("반(숫자만) : ");
	int classNum = sc.nextInt();
	
	System.out.println("번호(숫자만) : ");
	int num = sc.nextInt();
	sc.nextLine();
	
	System.out.println("성별(M/F) : ");	
	char gender = sc.nextLine().charAt(0);
	
	System.out.println("성적(소숫점 둘째 자리까지) : ");
	double score = sc.nextDouble();
	sc.nextLine();
	

	String student = (gender == 'M') ? "남학생" : "여학생";
	
	System.out.println(grade + "학년 " + classNum + "반 " + num + "번 " +name +" "+ student + "의 성적은 " + score + "이다.");
	
	}
	
	
	public void method6(){
		//나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
		//성인(19세 초과)인지 출력하세요.
		
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		
		String result = age<=13? "어린이" : (age>13 && age<=19?"청소년":"성인");
		
		System.out.println(result);
	
	}
	
public void method7() {			

		
		System.out.println("국어 점수 : ");
		int korean = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int english = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		int average = total / 3;
		
		String result = korean>=40 && english>=40 && math>40 && average>=60 ? "합격" : "불합격";
			
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ average);
		System.out.println(result);
		}

	
	public void method8() {
		//주민번호를 이용하여 남자인지 여자인지 구분하여 출력하시오.
		
		
		System.out.println("주민번호를 입력하세요(- 꼭 포함)");
		
		String juNum = sc.nextLine();
		char gender = juNum.charAt(7);		
	
		String result = (gender == '1' || gender == '3') ? "남자 " : 
			(gender == '2' || gender == '4') ? "여자" : "잘못 입력하셨습니다";
		
		System.out.println(result);
		
	}
	
	public void method9() {
		//키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		//그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		//아니면 false를 출력하세요.
		//(단, 입력할 때 num1은 num2보다 작아야 함)
		
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요.(단, 첫번째 입력한정수보다 커야함) : ");
		int num2 = sc.nextInt();
		
		System.out.println("비교할 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		Boolean result = num3<=num1 || num3 > num2;
		
		System.out.println("정수1 : " + num1);
		System.out.println("정수2 : " + num2);
		System.out.println("비교한 정수 : " + num3);		
		System.out.println(result);
	}

	public void method10() {
		//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("세 번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		boolean result = ((num1 == num2) && (num2==num3) && (num3==num1));
		//블리언
		
		System.out.println(result);
		
				
	}
	
	public void method11() {
		
		
		System.out.println("A사원의 연봉 : ");
		double moneyA = sc.nextDouble();
		sc.nextLine();
		System.out.println("B사원의 연봉 : ");
		double moneyB = sc.nextDouble();
		sc.nextLine();
		System.out.println("C사원의 연봉 : ");
		double moneyC = sc.nextDouble();
		sc.nextLine();
		
		double incA = 0.4;
		double incC = 0.14;
		
		
		double tM_A = moneyA+incA*moneyA;
		double tM_B = moneyB;
		double tM_C = moneyC+incC*moneyC;

		String resultA = tM_A>=3000 ? "3000이상" : "3000미만";
		String resultB = tM_B>=3000 ? "3000이상" : "3000미만";
		String resultC = tM_C>=3000 ? "3000이상" : "3000미만";
		
		
		
		System.out.println("A사원의 인센티브 포함 연봉 : " + tM_A);
		System.out.println(resultA);
		System.out.println("B사원의 인센티브 포함 연봉 : " + tM_B);
		System.out.println(resultB);
		System.out.println("C사원의 인센티브 포함 연봉 : " + tM_C);
		System.out.println(resultC);	
		
		
	}
}

