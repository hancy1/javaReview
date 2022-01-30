package chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part03_control.model.thread;

import java.util.Scanner;

public class InterruptSample {
	
	public void sleepInterrupt() {
		Thread5 th5 = new Thread5();
		Thread th = new Thread(th5);
		
		th.start();  // 쓰레드 활성화
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아무값이나 입력하세요 ");
		String input = sc.nextLine();
		
		
		System.out.println("입력한 값 " + input); // 값을 입력받으면 값을 출력하고 쓰레드5 실행 -> 문자입력으로 쓰레드 지연이 방해됐으므로 에러처리 -> 몇초만에 입력했다.
											   // 문자 입력을 하지 않으면 정해놓은대로 10초까지 하고 카운트 종료!
		
		th.interrupt(); // 쓰레드 지연 메소드
	}

}
