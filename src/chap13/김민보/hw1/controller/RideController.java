package chap13.김민보.hw1.controller;

import chap13.김민보.hw1.model.vo.Guests;
import chap13.김민보.hw1.model.vo.RollerCoaster;


public class RideController {
	
	
	
	Guests g = new Guests();
	
	public RideController() {
		// TODO Auto-generated constructor stub//기본생성자
	}	
	
	
	public void cutGuests() {
		// TODO Auto-generated method stub

		Guests[] gs = new Guests[4]; //default 매개변수 생성자 이용해서 4명의 객체 초기화
		
		
		{
			gs[0] = new Guests("홍길동", 17, 'M', 120.2);
			gs[1] = new Guests("유관순", 20, 'F', 102.3);
			gs[2] = new Guests("김유신", 23, 'M', 110.4);
			gs[3] = new Guests("김흥부", 21, 'M', 112.5);	
			
		}
		
		
		Guests [] onBoard = new Guests[RollerCoaster.PERMITNUMBER]; //default 놀이기구 허용인원수 크기의 객체배열
		
		
		int index = 0;
		try {
			for(int i = 0; i<gs.length; i++) {
				if(RollerCoaster.CUTHEIGHT < gs[i].getHeight()) {
					onBoard[index] = gs[i];
					index++;
				}
			}
		}catch(ArrayIndexOutOfBoundsException e){
			//배열 크기를 넘어가면 발생되는 예외클래스 참조형 변수 e를 받는 매개변수 자리
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호 : " + e.getMessage().charAt(6));
			
		}finally{
			System.out.println("인원이 가득 찼습니다 다음 차례를 기다리세요");
			System.out.println("이번 차례 탑승 명단");
			
			for(int i = 0; i<onBoard.length; i++) {
				System.out.println(onBoard[i].toString());
			}
			
			System.out.println("탑승자 요금 : " + onBoard.length * RollerCoaster.PRICE);
			
		}		
	}
}
