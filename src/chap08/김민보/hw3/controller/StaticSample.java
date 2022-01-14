package chap08.김민보.hw3.controller;

public class StaticSample {
	
	private static String value;

	
	//세터게터 
	
	public static String getValue() {
		return value;
	}	
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	
	//!모든 메소드는 출력문 없이 value에 접근해서 출력해야됨!
	
	public static void toUpper() {
		
		value = value.toUpperCase();	
		
	}

	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
		
		//문자하나하나를 배열에넣고~
		char[] arr = value.toCharArray();		
		
		//지정된 인덱스를 입력받은 차형으로 바꿔서
		arr[index] = c;
		
		//배열을 합쳐서 다시 스트링타입으로 벨류에 넣어줌~!!
		value = String.valueOf(arr);
		
		
		/*리플레이스 사용
		String val = value.replace(value.charAt(index), c);
		value = val;
		 */
	}
	
	public static int valueLength() {
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		int lenght = 0; //리턴할값 초기화
		
		lenght = value.length();		
		
		return lenght;
	}
	
	public static String valueConcat(String str) {
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		
		
		String sumStr = " "; //리턴할 값 초기화
		
		sumStr = value + str;
		value = sumStr;
		
		return sumStr;
		
		
	}

	
}
