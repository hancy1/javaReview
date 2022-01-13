package chap08.김민보.hw1.run;

import chap08.김민보.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticSample nss = new NonStaticSample();
		
		System.out.print("1. 랜덤 값 : ");		
		nss.printLottoNumbers();
		
		System.out.print("2. a문자 5개 출력 : ");
		nss.outputChar(5, 'a');	
		
		System.out.println();
		System.out.println("3. 랜덤 영문자 출력 : " + nss.alphabette());
		System.out.println("4. apple의 2번 4번 인덱스 사이의 값 출력 :" + nss.mySubstring("apple", 2, 4));
		
		
		
	}

}
