package chap12.김민보.hw2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {

	public SpaceUpper() {
		// TODO Auto-generated constructor stub
	}
	
	public void spacetoUpper() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어를 입력하세요(띄어쓰기포함) : ");
		String str = sc.nextLine();
		
		StringTokenizer strT = new StringTokenizer(str, " ");
		
		while(strT.hasMoreTokens()) {
			
			String div = strT.nextToken();
			
			String first = div.substring(0, 1);
			first = first.toUpperCase();
			
			String end = div.substring(1);
			end = end.toLowerCase();
			
			String finalStr = first + end;
			
			//한줄로 출력
			System.out.print(finalStr + " ");
			
		}	
		
	}	
}