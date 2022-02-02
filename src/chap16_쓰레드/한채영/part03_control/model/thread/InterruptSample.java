package chap16_쓰레드.한채영.part03_control.model.thread;

import java.util.Scanner;

public class InterruptSample {

	public void sleepInterrupt() {
		Thread5 th5 = new Thread5();
		Thread th = new Thread(th5);

		th.start(); //스레드를 실행시키고 : 1초 마다 n초가 출력되는 스레드

		Scanner sc = new Scanner(System.in);
		System.out.println("아무 값이나 입력: ");
		String input = sc.nextLine(); //입력한 값을 받는데 입력을 대기하는 동안에도 스레드는 계속 진행 
		
		System.out.println("입력한 값: " + input);
		
		th.interrupt(); //thread5에 interrupt를 발생시켜 sleep메소드의 일시정지상태를 벗어나게 함 -> 예외처리한다
	
	}
}
