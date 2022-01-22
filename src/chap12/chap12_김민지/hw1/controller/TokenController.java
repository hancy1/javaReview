package chap12.chap12_김민지.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {

	public void afterToken(String str) {
		
		StringTokenizer st = new StringTokenizer(str, " "); // 문자열 공백을 단위로 쪼갠다
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) { // 문자열 쪼갠거를 append로 합치기
			sb.append(st.nextToken());
		}
		
		// 토큰 처리 전 글자와 글자 개수 출력
				System.out.println("토큰 처리 전 글자 : " + str);
				System.out.println("토큰 처리 전 개수 : " + str.length());
		// 토큰 처리 후 글자와 글자 개수, 대문자 변환 출력							
				System.out.println("토큰 처리 후 글자 : " + sb);
				System.out.println("토큰 처리 후 개수 : " + sb.length());
				System.out.println("모두 대문자로 변환 : " + sb.toString().toUpperCase());
	}

	public void firstCap(String str) { // 첫글자 대문자
		
		StringBuilder sb = new StringBuilder(); 
		
		for(int i = 0; i < str.length(); i++) { // [0] 은 대문자, 나머지는 그대로
			if(i == 0) {
				sb.append(str.toUpperCase().charAt(i)); // 대문자로 바꾸고 인덱스 0 번째 글자와 나머지는 그대로 글자를 합침.
			}else sb.append(str.charAt(i));
		}
		
		System.out.println("첫글자 대문자 : " + sb);
		
	}

	public void findChar(String str, char ch) { // 문자개수리턴
		
		StringBuilder sb = new StringBuilder();
		int count = 0; // 문자갯수
		
		for(int i = 0; i < str.length(); i++) { // 문자열을 처음부터 끝까지 돌리면서 매개변수와 똑같은 만큼 count++ 
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		
		System.out.println(ch + " 문자가 들어간 개수 : " + count);
	}
	
	

}
