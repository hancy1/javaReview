package chap12.김민보.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public String afterToken(String str) {
				
		String aStr = "";//리턴해줄 값 초기화
		
		StringTokenizer token = new StringTokenizer(str," ");
		
		while(token.hasMoreTokens()) {
			aStr += token.nextToken();//반복문돌면서 문자열에 공백제거한 글자 넣기!
		}
		
		return aStr;
	}

	public String firstCap(String inputStr) {
		// TODO Auto-generated method stub
		
		String first = inputStr.substring(0, 1);
		
		first = first.toUpperCase();		
		
		String end = inputStr.substring(1); //첫글자뺀 모든 뒷글자
		end = end.toLowerCase();
		
		String firstCap = first + end;
		
		return firstCap;
	}

	public int findChar(String inputStr, char one) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		for(int i = 0; i<inputStr.length(); i++) {
			if(inputStr.charAt(i) == one){
				count++;
			}			
		}		
		
		return count;
	}
	
	
}
