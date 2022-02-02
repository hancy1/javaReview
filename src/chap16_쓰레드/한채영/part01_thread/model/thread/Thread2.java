package chap16_쓰레드.한채영.part01_thread.model.thread;

//2. Runnable 인터페이스 구현
//러너블은 인터페이스이기 때문에 implement로 받는다 <-> 스레드는 extends로 상속받음
public class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("스레드 2 [ " + i + " ]");
			//러너블이 실행될 내용 작성. i가 1부터 10까지 진행되도록
		}

	}

}
