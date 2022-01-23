package chap12.김민보.hw6;

import java.util.Calendar;

public class DateCalculator {

	public DateCalculator() {
	// TODO Auto-generated constructor stub
	}
	
	
	public long leapDate() {
		
		Calendar today=Calendar.getInstance();
		long sumDays=0L;
		
		for(int i=1;i<=today.get(Calendar.YEAR);i++) { 					// Year
			if(i==today.get(Calendar.YEAR)){ 							// 올해가 되면
				if(isLeapYear(i)) System.out.println("올해는 윤년입니다.");
				else System.out.println("올해는 평년입니다.");
				for(int j=1;j<=(today.get(Calendar.MONTH)+1);j++){ 		// Month
					
					if(j==(today.get(Calendar.MONTH)+1)) {				// 이번달이 되면
						for(int n=1;n<=today.get(Calendar.DATE);n++) 	// Date, 오늘이 되면
						{
							sumDays+=1;
						}
					}
					else if(j==2) {
						if(isLeapYear(i)) sumDays+=29;
						else sumDays+=28;
					}
					else if(j==4||j==6||j==9||j==11) {
						sumDays+=30;
					}
					else sumDays+=31;
				}
			}
			else {
				if(isLeapYear(i)) sumDays+=366;
				else sumDays+=365;	
			}
		}
		return sumDays;
		
	}

	
	public boolean isLeapYear(int year) {
		
		if(year %4 == 0 && year %100 != 0 || year %400 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
}