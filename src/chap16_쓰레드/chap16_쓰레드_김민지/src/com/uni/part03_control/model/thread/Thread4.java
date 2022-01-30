package chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part03_control.model.thread;

public class Thread4 implements Runnable{

	@Override
	public void run() {


		try {
			for(int i = 1; i <= 10; i++) { 
			Thread.sleep(1000); // 쓰레드를 1초간 멈추게 한다				
			System.out.println(i+ "초");
			}
		
			System.out.println("카운트종료");
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}




}
