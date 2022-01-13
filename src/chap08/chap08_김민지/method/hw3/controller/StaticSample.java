package chap08.chap08_김민지.method.hw3.controller;

public class StaticSample {
	
	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static void toUpper() {
		// value 필드 값을 모두 대문자로 변경 --> char 배열 응용
		
		StaticSample.value = StaticSample.value.toUpperCase();
		
	}
	
	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		
		String s = value;
		char [] arr = s.toCharArray(); // 문자열을 char 배열로 바꿔주는 함수
		arr[index] = c;
		System.out.println(arr);
				
	}
	
	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		
		return value.length();
	}
	
	public static String valueConcat(String str) {
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		
		return value.concat(str); // 문자열을 합쳐주는 concat 함수 사용!
	}
	

}
