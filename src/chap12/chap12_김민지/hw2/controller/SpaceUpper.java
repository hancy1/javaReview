package chap12.chap12_김민지.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {
	public SpaceUpper() {
		// TODO Auto-generated constructor stub
	}
	
	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); // 띄어쓰기로 나눈 값들을 담아줌
			// abc 반복문을 돌면서
			// def
			// ghi
			// jkl 이런 식으로 담길 것!
			
			for(int i = 0; i < token.length(); i++) { // abc 에서 0번째는 a 
				if(i == 0) {
					sb.append(token.toUpperCase().charAt(i)); // 0번째는 대문자
				}else {
					sb.append(token.toLowerCase().charAt(i));
				}
			} // 대문자, 소문자로 바꾸면서 중간에 띄어쓰기
			sb.append(" ");
			
		}
		System.out.println(sb);
	}

}
