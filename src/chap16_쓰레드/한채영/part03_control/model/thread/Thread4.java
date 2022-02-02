package chap16_쓰레드.한채영.part03_control.model.thread;

public class Thread4 implements Runnable {

	@Override
	public void run() {

		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000); // 1초 지연 1:1000
				//스레드.sleep을 통해 스레드를 딜레이시킬 수 있다. 1초 정지 후 스레드 진행
				System.out.println(i + "초");
			}
			
			System.out.println("카운트 종료");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
