package chap16_쓰레드.한채영.part03_control.model.thread;

public class Thread5 implements Runnable {

	@Override
	public void run() {
		int cnt = 0;
		while (cnt < 10) {
			try {
				Thread.sleep(1000); // 1:1000 스레드가 1초마다 실행되게 한다.
				System.out.println((++cnt) + "초");
			} catch (InterruptedException e) {

				System.out.println("예외발생 했나?"); //cnt가 10되기 전에 입력값을 주면 th.interrupt();통해 예외발생 
				System.out.println(cnt + "초에 카운트 종료");
				cnt = 10; //cnt를 10으로 만들어 반복문을 벗어나게 한다.
			}
		}
		System.out.println("카운트 종료");
	}

}
