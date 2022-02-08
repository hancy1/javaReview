package chap16_쓰레드.김민보.part03_cotrol.model.thread;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
			try {				
				for(int i =1; i<=10; i++) {
				Thread.sleep(1000);				
				System.out.println(i + "초");
				}
				
				System.out.println("카운트 종료");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}

}
