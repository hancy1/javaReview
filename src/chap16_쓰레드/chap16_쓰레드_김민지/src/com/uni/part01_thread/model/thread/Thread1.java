package chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part01_thread.model.thread;


// 프로세스는 간단히 말해ㅓㅅ 실행 중인 프로그램
// 프로세스에는 프로그램 수행에 필요한 데이터와 메모리 등의 자원 그리고 쓰레드로 구성됨
// 프로세스의 자원을 이용해서 실제로 작업을 수행하는 것이 바로 쓰레드. 쓰레드가 여러개면 멀티 쓰레드

// 쓰레드를 구현 하는 방법
// 1. Thread 클래스 상속받기. 단, 쓰레드클래스를 상속받으면 다른 클래스를 상속받을 수 없다.
// 2. Runnable 인터페이스 구현


//스레드생성
//1.Thread 상속받기
public class Thread1 extends Thread{

	@Override
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("스레드 1 [ " + i + " ]");
		}
	}

}
