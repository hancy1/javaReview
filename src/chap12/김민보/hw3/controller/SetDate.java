package chap12.김민보.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class SetDate {

	public SetDate() {
		// TODO Auto-generated constructor stub
	}
	
	public String todayPrint(){
		
		
		GregorianCalendar gc = new GregorianCalendar();
		
		//오늘의 년, 월, 일, 시, 분, 초를 각 변수에 담은 후 오늘을 String으로
		//리턴
		
		int year = gc.get(GregorianCalendar.YEAR); //년		
		int month = (gc.get(GregorianCalendar.MONTH)+1); //달		
		int day = gc.get(GregorianCalendar.DATE); //일		
		int hour = gc.get(GregorianCalendar.HOUR); //시		
		int minute = gc.get(GregorianCalendar.MINUTE); //분
		int second  = gc.get(GregorianCalendar.SECOND); //초
		
		String today = year + "년 " + month + "월 " + day + "일 " + hour +"시 "+ minute +"분 " + second+ "초";
		
		return today;
		
	}
	
	public String setDay() {
		
		GregorianCalendar gc = new GregorianCalendar();
		
		gc.set(2011, 3-1, 21);
		
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");	
		
		
		String setDay = dayFormat.format(gc.getTime());		
		return setDay;		
		
	}
	
}