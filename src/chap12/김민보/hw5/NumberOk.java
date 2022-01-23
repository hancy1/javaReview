package chap12.김민보.hw5;

import java.util.Scanner;

public class NumberOk {
	private int ran;

	
	
	public NumberOk() {
		// TODO Auto-generated constructor stub
	}
	
	public void numGame() {
		
		ran = (int)(Math.random()*100 +1); 		
		
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1; 		
		
		while(true) {
			
			System.out.print("1부터 100 사이의 정수를 하나 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num > ran) {				
				System.out.println(num +"보다 작습니다. " + count + "번째 실패!!");
				count++;
				
			}else if(num < ran) {				
				System.out.println(num + "보다 큽니다. " + count + "번째 실패!!");
				count++;
				
			}else if (num == ran) {				
				System.out.println(count + "번 만에 맞췄습니다. 축하합니다.");
				
				while(true) {
					System.out.println("게임을 계속하시겠습니까? (y/n)");
					String yesOrNo = sc.nextLine();
					
					if("y".equalsIgnoreCase(yesOrNo)) {
						System.out.println("새로운 게임을 시작합니다!!!");
						numGame();
						
					}else if("n".equalsIgnoreCase(yesOrNo)) {
						System.out.println("게임을 종료합니다.");
						return;
						
					}else {
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						continue;
					}					
				}		
			}
		}		
	}
	
	
}
