package chap16_쓰레드.김민보.part02_scheduling.run;

import chap16_쓰레드.김민보.part02_scheduling.model.thread.Thread3;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread3 th3 = new Thread3();
		
		for(int i = 1; i<=100; i++) {
			Thread th = new Thread(th3);//우선순위의 기본이 5
			
			if(i%2 ==0) {
				th.setPriority(Thread.MAX_PRIORITY);//우선순위 10
				th.setName("thread 짝수 : " + i);
			}else {
				th.setPriority(Thread.MIN_PRIORITY);//우선순위 1
				th.setName("thread 홀슈 : " + i);
			}
			
			th.start();
		}
		
	}

}
