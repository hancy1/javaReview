package chap12.chap12_김민지.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SetDate {
	
	public SetDate() {
		// TODO Auto-generated constructor stub
	}
	
	public String todayPrint() { // Calendar 클래스를 사용하여 오늘 날짜에 대한 객체를 생성하여 년 월 일 시 분 초 값을 각각 변수에 분리 저장한 후 출력		
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // month에는 꼭 +1 하기!
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		return year + "년 " + month +"월 " +  day + "일 " + hour + "시 " +  minute + "분 " + second + "초";
		
	}
	
	public String setDay() { // 2011년 3월 21일 월요일 출력하기
		
		Calendar cal = Calendar.getInstance(); // 캘린더 객체 생성
		
		cal.set(2011, 2, 21); // 월은 -1 한 값을 써준다. 날짜 세팅
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); // 날짜형식 설정
		
		String setDay = sdf1.format(cal.getTime()); // String 값에 세팅한 객체를 불러서 형식대로 담아준다
		
		return setDay;
		
		
		
	}
	
	
	
	
	

}
