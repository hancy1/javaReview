package chap16_쓰레드.김민보.part01_thread.run;

import chap16_쓰레드.김민보.part01_thread.model.thread.Thread1;
import chap16_쓰레드.김민보.part01_thread.model.thread.Thread2;

public class Run {
	
	// Runnable 인터페이스 vs Thread 클래스의 차이점
	// - Runnable 인터페이스는 스레드화 될 수 있는 메소드 run() 메소드를 가지고있다. 
	// - Thread 클래스는 Runnable 인터페이스를 구현하고 있으며 스레드를 활성화 하는 start() 메소드를 가지고있다.
	// - Thread 클래스는 Thread 상태를 제어 할 수 있는 메소드를 가지고 있다.

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread1 th1 = new Thread1();
		
		Thread2 th2 = new Thread2();		
		Thread th = new Thread(th2);
		
		//th1.run();
		//th.run();
		
		//동시에 실행
		th1.start();
		th.start();
		
		System.out.println("메인메소드");
		
		//한번 사용된 쓰레드는 재사용 X 새로 객체를 생성해서 사용하자!!
		//th1.start();
		
		
	}

}
