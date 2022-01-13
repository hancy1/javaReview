package chap08.chap08_김민지.method.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {

	
	public void printLottoNumbers() {
		
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 --> 오름차순 정렬로 출력

		int [] lotto = new int [6]; // 6개를 발생하여야 함

		for(int i = 0; i < lotto.length; i++) { // 배열에 랜덤숫자 넣어주기
			lotto[i] = (int) (Math.random()*45+1);
			for(int j = 0; j < i; j++) { // 중복제거
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto); // 오름차순으로 정리
		System.out.println(Arrays.toString(lotto)); // 배열 값 출력하기
	}

	public void outputChar(int num, char c) {
		
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드

		for(int i = 0; i < num; i++) { // 매개변수 num 만큼
			System.out.print(c + " "); // 매개변수 c
		}

	}

	public char alphabette() {
		
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함

		int num = 0;

		while(true) {
			num = (int)(Math.random()*58+65); // 65부터 58개의 랜덤값 (65~122)

			if(num >= 'a' && num <= 'z' || num>= 'A' && num <= 'Z') { // a~z A~Z  
				break;
			}
		}
		return (char)num; // 숫자형이었으니까 문자형으로 바꿔서 return
	}

	public String mySubstring (String str, int index1, int index2) {
		
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴

		String result = ""; // 리턴할 result 값을 null로 초기화선언

		if(!str.equals("")) { // 만약 str이 공백과 같지 않다면

			for(int i = index1; i < index2; i++) { // index1 부터 index2 까지 안의 범위 글자들을 더해줌
				result += str.charAt(i);
			}

		}	

		return result;
	}

}
