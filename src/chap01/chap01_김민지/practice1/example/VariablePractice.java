package chap01.chap01_김민지.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	Scanner sc = new Scanner (System.in);
	public void method1() {
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name +"님 반갑습니다^^");
	}
	
	public void method2() {
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
	}

	public void method3() {
		System.out.println("가로 : ");
		double w = sc.nextDouble();
		
		System.out.println("세로 : ");
		double h = sc.nextDouble();
		
		System.out.println("면적 : " + (w*h));
		System.out.println("둘레 : " + ((w+h)*2));
	}
	
	public void method4() {
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
}