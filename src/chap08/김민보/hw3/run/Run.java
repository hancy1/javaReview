package chap08.김민보.hw3.run;

import chap08.김민보.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static 메소드는 new하면서 객체를 생성할 필요가 없다. 이미 메모리에 올라가있음!		
		//* 각 메소드에서 출력문은 존재하지 않는다. 테스트 출력은 main 함수에서 value에 접근하여 출력
		
		
		StaticSample.setValue("Java");//입력은 세터~
		System.out.println("value : " + StaticSample.getValue()); //출력은 게터
		
		StaticSample.toUpper();//수행
		System.out.println("대문자로 : " + StaticSample.getValue());		
		
		
		System.out.println("길이 : " + StaticSample.valueLength());
		
		
		StaticSample.valueConcat("PROGRAMMING");
		System.out.println("PROGRAMMING을 붙여서 : " + StaticSample.getValue());
		
		
		StaticSample.setChar(0, 'C');
		System.out.println("j=>c : " + StaticSample.getValue());
	}

}
