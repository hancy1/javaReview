package chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part01_thread.run;

import chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part01_thread.model.thread.Thread1;
import chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part01_thread.model.thread.Thread2;

public class Run {
	// Runnable 인터페이스 vs Thread 클래스의 차이점
	// - Runnable 인터페이스는 스레드화 될 수 있는 메소드 run() 메소드를 가지고있다. 
	// - Thread 클래스는 Runnable 인터페이스를 구현하고 있으며 스레드를 활성화 하는 start() 메소드를 가지고있다.
	// - Thread 클래스는 Thread 상태를 제어 할 수 있는 메소드를 가지고 있다.
	public static void main(String[] args) {

		Thread1 th1 = new Thread1(); // 1. Thread 클래스 상속 받은 경우 인스턴스 생성 방법 : Thread의 자손 클래스의 인스턴스를 생성
		
		
		Thread2 th2 = new Thread2(); // 2. Runnable 인터페이스를 구현한 경우 인스턴스 생성 방법 : Runnable을 구현한 클래스의 인스턴스를 생성
		Thread th = new Thread(th2); // 생성자 Thread(Runnable target)
		
		//th1.run(); // run() 호출은 단순히 클래스에 선언된 메서드를 호출하는 것 뿐! 
		//run();
		
		th1.start(); 
		th.start();
		
		System.out.println("메인메소드");

		//th1.start(); // 한번 start() 해서 사용한 스레드는 재사용이 안됨. 새로 객체를 생성하여 사용해야한다.

	}

}
