package chap02.chap02_김민지.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner (System.in);
	
	 public void practice1(){
		 System.out.println("정수 : ");
		 int num = sc.nextInt();
		 
		 if(num > 0) {
			 System.out.println("양수다");
		 }else {System.out.println("양수가 아니다");}
	 }
	 
	 public void practice2(){ 
		 System.out.println("정수 : ");
		 int num = sc.nextInt();
		 
		 if(num > 0) {
			 System.out.println("양수다");
		 }else if(num == 0) {
			 System.out.println("0이다");
		 }else {System.out.println("음수다");}
	 }
	 
	 public void practice3(){
		 System.out.println("정수 : ");
		 int num = sc.nextInt();
		 
		 if(num % 2 == 0) {
			 System.out.println("짝수다");
		 }else {System.out.println("홀수다");}
	 }
	 
	 public void practice4(){
		 System.out.println("인원 수 : ");
		 int num = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("사탕 개수 : ");
		 int candy = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("1인당 사탕 개수 : " + candy/num);
		 System.out.println("남는 사탕 개수 : " + candy%num);
	 }
	 
	 public void practice5(){
		 System.out.println("이름 : ");
		 String name = sc.nextLine();
		 
		 System.out.println("학년(숫자만) : ");
		 int grade = sc.nextInt();
		 sc.nextLine();
		 
		System.out.println("반(숫자만) : ");
		int ban = sc.nextInt();
		sc.nextLine();
		
		System.out.println("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double result = sc.nextDouble();
		
		String stu = (gender == 'M')? "남" : "여" ;
		
		System.out.println(grade + "학년 "+ ban +"반 " + num + "번 " + name + " " + stu +"학생의 성적은 " + result +"이다. ");
		
		 
		 }
	 
	 public void practice6(){
		 System.out.println("나이 : ");
		 int age = sc.nextInt();
		 sc.nextLine();
		 
		 if(age <= 13) {
			 System.out.println("어린이");
		 }else if(age <= 19) {
			 System.out.println("청소년");
		 }else {
			 System.out.println("성인");
		 }
	 }
	 
	 public void practice7(){
		 System.out.println("국어 : ");
		 int kor = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("영어 : ");
		 int eng = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("수학 : ");
		 int math = sc.nextInt();
		 sc.nextLine();
		 
		 
		 int sum = kor + eng + math;
		 double avg = sum / 3;
		 System.out.println("합계 : " + sum);
		 System.out.println("평균 : " + avg);
		 if(kor >= 40 & eng >= 40 & math >= 40 & avg >= 60) {
			 System.out.println("합격");
		 }else {
			 System.out.println("불합격");
		 }
	 }
	 
	 
	 public void practice8(){
		 System.out.println("주민번호를 입력하세요(- 포함) : ");
		 String no = sc.nextLine();
		 
		String a = (no.charAt(7) == '1'||no.charAt(7) == '3')? "남자" : (no.charAt(7) == '2'||no.charAt(7) == '4')? "여자" : "잘못입력하셨습니다.";
		System.out.println(a);
				
	 }

	 public void practice9(){
		 System.out.println("정수 1 : ");
		 int num1 = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("정수 2 : ");
		 int num2 = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("입력 : ");
		 int num = sc.nextInt();
		 sc.nextLine();
		 
		 String result = (num <= num1 || num > num2)? "true" : "false";
		 System.out.println(result);
	 }
	 
	 public void practice10(){
		 System.out.println("정수 1 : ");
		 int num1 = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("정수 2 : ");
		 int num2 = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("정수 3 : ");
		 int num3 = sc.nextInt();
		 sc.nextLine();
		 
		 String str = (num1 == num2 && num2== num3 && num3 == num1)? "true" : "false";
		 System.out.println(str);
	 }


	 public void practice11(){
		 System.out.println("A사원의 연봉 : ");
		 int a = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("B사원의 연봉 : ");
		 int b = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("C사원의 연봉 : ");
		 int c = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println("A사원의 인센티브포함 연봉 : " + a*1.4);
		 System.out.println(a*1.4 >=3000? "3000이상":"3000미만");
		 System.out.println("B사원의 인센티브포함 연봉 : " + b);
		 System.out.println(b >=3000? "3000이상":"3000미만");
		 System.out.println("C사원의 인센티브포함 연봉 : " + c*1.15);
		 System.out.println(c*1.15 >=3000? "3000이상":"3000미만");
	 }

}
