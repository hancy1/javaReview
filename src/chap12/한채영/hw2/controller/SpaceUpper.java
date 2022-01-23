package chap12.한채영.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public SpaceUpper() {
		// TODO Auto-generated constructor stub
	}
	
	public void spaceToUpper() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어를 입력하시오(띄어쓰기 포함): ");
		String str = sc.nextLine();
		
		// StringTokenizer를 통해 띄어쓰기를 기준으로 토큰 단위로 나온 것을 연산하는 메소드를 구성
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		// 띄어쓰기 이후 첫 글자는 대문자로 되게 하고 그 외에 나머진 소문자로 해서 StringBuilder에 담아 출력
		
		StringBuilder sb = new StringBuilder();
		
		while (st.hasMoreTokens()) {
			String nStr = st.nextToken();
			sb.append(nStr.toUpperCase().charAt(0)).append(nStr.substring(1)).append(" ");
			//토큰의 맨 처음 문자는 대문자로 바꾸고 + 두 번째 문자부터 끝까지 붙이고 + 마지막에 공백 더하기
		}
		System.out.println(sb);
				
		
	}
	
}
