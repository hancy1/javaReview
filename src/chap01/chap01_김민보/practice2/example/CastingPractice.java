package chap01.chap01_김민보.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.println("문자 : ");		
		char ch = sc.nextLine().charAt(0);	
		
		System.out.println("A Unicode : "+(int)ch);
	}
	
	
	public void method2() {
		
		
		System.out.println("국어 : ");
		double korean = sc.nextDouble();
		
		System.out.println("영어 : ");
		double english = sc.nextDouble();
		
		System.out.println("수학 : ");
		double math = sc.nextDouble();
		
		int total = (int) (korean + english + math);
		int average = (int) (korean + english + math) / 3;
				
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ average);
		
	}
	
	public void method3() {
		//선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형변환을 이용하여
		//주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);
		System.out.println((int)dNum);
		
		System.out.println((double)iNum1);
		System.out.println(iNum2 * dNum);

		System.out.println(dNum);
		System.out.println((double)iNum1/iNum2);
		
		System.out.println((int)fNum);
		System.out.println(iNum1/(int)fNum);
		
		System.out.println(iNum1/fNum);
		System.out.println(iNum1/(double)fNum);
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch + iNum1);
		System.out.println((char)(ch + iNum1));
	
	}
	
}
