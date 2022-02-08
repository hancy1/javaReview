package chap16_쓰레드.김민보.part03_cotrol.model.thread;

import java.util.Scanner;

public class InterruptSample {

	public void sleepInterrupt() {
		Thread5 th5 = new Thread5();
		Thread th = new Thread(th5);
		
		th.start();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아무 값이나 입력 하세요 : ");
		String input = sc.nextLine();
		
		System.out.println("입력한 값 : " + input);
		
		th.interrupt();
	}
}
