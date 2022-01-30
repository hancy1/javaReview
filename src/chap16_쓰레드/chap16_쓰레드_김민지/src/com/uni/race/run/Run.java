package chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.race.run;

import chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.race.model.thread.Heart;
import chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.race.model.thread.Star;

public class Run {


	public static int tot1 = 0;
	public static int tot2 = 0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heart h = new Heart();
		Star s = new Star();
		try {
			Thread th1 = new Thread(h); // 하트
			Thread th2 = new Thread(s); // 별

			th1.start(); // 하트 스레드 시작
			Thread.sleep(500); // 0.5 초 지연

			th2.start(); // 별 스레드 시작
			
			th1.join(); // join() : 지정된 시간동안 스레드가 실행되도록 하고, 지정된 시간이 지나거나 작업 종료시 join()을 호출한 스레드로 다시 돌아와 실행을 계속 한다.
			th2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String str = Run.tot1 > Run.tot2 ? "하트승" : (Run.tot1 < Run.tot2 ? "별승": " 무승부 "); // 각 클래스가 10행으로 계획되어 있으므로 10+10 합쳐 20번 출력
		System.out.println(str);


	}

}
