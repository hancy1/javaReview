package chap16_쓰레드.한채영.part01_thread.model.thread;

//스레드생성
//1. Thread 상속받기
//쓰레드를 사용하려면 상속을 받기!
public class Thread1 extends Thread {

	//alt shift s눌러서 run override받기. 새로운 스레드의 메인메소드. 스레드 안에서 실행될 내용 작성
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("스레드 1 [ " + i + " ]");
			//스레드가 실행될 내용을 작성한다. i가 1부터 10까지 반복되도록 진행
		}
	}

	
	
}
