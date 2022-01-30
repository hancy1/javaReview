package chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part02_scheduling.run;

import chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part02_scheduling.model.thread.Thread3;

public class Run {

	public static void main(String[] args) {

		Thread3 th3 = new Thread3();
		
		for(int i = 1; i <= 100; i++) {
			Thread th = new Thread(th3); // 우선순위 기본이 5
			
			if(i % 2 == 0) {
				th.setPriority(Thread.MAX_PRIORITY); // 10
				th.setName("thread 짝수" + i); // 현재 실행되고 있는 스레드에 이름을 지정해주는 것
			}else {
				th.setPriority(Thread.MIN_PRIORITY); // 1
				th.setName("thread 홀수 : " + i);
			}
			
			th.start(); // 우선순위가 높을 수록 점유율이 높아짐. 그래서 짝수가 위에 분포되어있고 홀수가 아래
		}

	}

}
