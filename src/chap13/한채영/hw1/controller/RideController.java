package chap13.한채영.hw1.controller;

import chap13.한채영.hw1.model.vo.Guests;
import chap13.한채영.hw1.model.vo.RollerCoaster;

public class RideController {

	protected Guests[] gs = new Guests[4];
	protected Guests[] onboard;
	
	public RideController() {
		// TODO Auto-generated constructor stub
	}
	
	public void cutGuests() {
		
		{
			gs[0] = new Guests("홍길동", 17, 'M', 120.2);
			gs[1] = new Guests("유관순", 20, 'F', 102.3);
			gs[2] = new Guests("김유신", 23, 'M', 110.4);
			gs[3] = new Guests("김흥부", 21, 'M', 112.5);
		}
		
		int count = 0;
		onboard = new Guests[RollerCoaster.PERMITNUMBER];
		
		try {
			for(int i = 0; i < gs.length; i++) {
				
					if(gs[i].getHeight() >= RollerCoaster.CUTHEIGHT) {
						onboard[count] = gs[i];
						count++;
				
				}
				
				
				
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호: " + e.getMessage());
			
		} 
			finally {
		}
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요.");
			System.out.println("이번 차례 탑승 명단");
			
			for(int i = 0; i < onboard.length; i++) {
				System.out.println("이름: " + onboard[i].getName() + " 키: " + onboard[i].getHeight());
			}
			
			

			System.out.println("탑승자 요금: " + count*RollerCoaster.PRICE + "원");
		}
		
		
	}
	
