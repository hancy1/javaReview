package chap16_쓰레드.김민보.race.run;

import chap16_쓰레드.김민보.race.model.thread.Heart;
import chap16_쓰레드.김민보.race.model.thread.Star;

public class Run {

	public static int tot1 = 0;
	public static int tot2 = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heart h = new Heart();
		Star s = new Star();
		
		
		Thread th1 = new Thread(h);
		Thread th2 = new Thread(s);
		
		try {
			th1.start();
			Thread.sleep(500);
			
			th2.start();
		
			th1.join();
			th2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		String str = Run.tot1 > Run.tot2 ? "하트승" : (Run.tot1 < Run.tot2 ? "별승": " 무승부 ");
		System.out.println(str);

	}

}
