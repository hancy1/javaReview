package chap16_쓰레드.김민보.part03_cotrol.model.thread;

public class Thread5 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		while(cnt<10) {
			try {
				Thread.sleep(1000);
				
				System.out.println((++cnt) + "초");
				
			} catch (InterruptedException e) {
				System.out.println("예외 발생 했니?");
				System.out.println(cnt +"초에 카운트 종료");
				cnt = 10;
				
			}
		}
		
		System.out.println("카운트 종료");
		
		
	}

}
