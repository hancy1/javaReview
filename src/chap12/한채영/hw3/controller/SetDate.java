package chap12.한채영.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SetDate {

	public SetDate() {
	}

	public String todayPrint() {

		String today = null;
		Date d = new Date();

		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int hour = d.getHours();
		int min = d.getMinutes();
		int sec = d.getSeconds();

		return year + "년 " + month + "월 " + date + "일 " + hour + "시 " + min + "분 " + sec + "초";
	}

	public String setDay() {
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
				
		Date today1 = new Date(111,2,21);
		
		return sdf.format(today1);			
	}
}
