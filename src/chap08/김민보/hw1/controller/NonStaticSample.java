package chap08.김민보.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {

	//매개변수 x, 반환값 x,
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력

		int[] arr = new int[6];
		
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);	
		System.out.println(Arrays.toString(arr));
		
	}

	
	
	//매개변수 o 반환값 x
	public void outputChar(int num, char c) {
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
		
		for (int i = 1; i<=num; i++) {
			System.out.print(c + " ");
		}
		
	}
	
	
	
	//매개변수 x 반환값 o
	public char alphabette() {
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함		
		//65~ 122 (대문자 - 특수문자 - 소문자 아스키코드 중간에 특수문자 빼는것이 관건...)
		
		char ch = ' ';
		
		while(true) {
			ch = (char)(int)(Math.random()*57+65);
			
			if(ch >= 'a' && ch <='z' || ch>='A' && ch<='Z') {
				return ch;				
			}				
			else {
				continue;
			}				
		}		
	}
	
	
	
	//매개변수 o 반환값 o	
	public String mySubstring(String str, int index1, int index2) {
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
			
		return str.substring(index1, index2);
		
	}
}
