package chap08.김민보.hw3.run;

import chap08.김민보.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
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
