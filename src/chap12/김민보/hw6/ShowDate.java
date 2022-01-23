package chap12.김민보.hw6;

public class ShowDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateCalculator totalDay = new DateCalculator();
		
		
		if(totalDay.isLeapYear(2021) == true) {
			System.out.println("올해는 윤년입니다.");			
		}
		else if(totalDay.isLeapYear(2021) == false) {
			System.out.println("올해는 평년 입니다.");
		}
		
		
		System.out.println("총 날짜 수 : " + totalDay.leapDate());
		
		
	}

}