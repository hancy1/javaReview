package chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part03_control.model.thread;

public class Thread5 implements Runnable{

	@Override
	public void run() {
		
		int cnt = 0;
		
		while(cnt < 10) {
			try {
				Thread.sleep(1000); // 1초간 멈추기
				
				System.out.println((++cnt) + "초");
			} catch (InterruptedException e) { // 쓰레드 지연에 방해되는 에러가 발생했을 경우
				
				System.out.println("예외발생 했니???");
				System.out.println(cnt + "초에 카운트 종료");
				
				cnt = 10; //while이 멈춤
				
			}
			
		}
		
		System.out.println("카운트 종료");
	}

}
