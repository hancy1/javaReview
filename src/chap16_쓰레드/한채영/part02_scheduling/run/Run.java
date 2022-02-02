package chap16_쓰레드.한채영.part02_scheduling.run;

import chap16_쓰레드.한채영.part02_scheduling.model.thread.Thread3;

public class Run {

	public static void main(String[] args) {

		Thread3 th3 = new Thread3();
		
		for(int i = 1; i <= 100; i++) {
			Thread th = new Thread(th3); //러너블 인터페이스를 받은 thread3 클래스를 스레드로 받음
				
			//스레드 객체의 메소드를 통해 우선순위를 줄 수 있다. 우선순위 10이 제일 중요하고 1이 가장 낮음
			//기본 우선순위는 5
			//우선순위가 높은 것부터 스레드가 실행된다.
			if(i % 2 == 0) {
				th.setPriority(Thread.MAX_PRIORITY); //우선순위 10 제일 중요
				th.setName("thread 짝수 : " + i); 
			} else {
				th.setPriority(Thread.MIN_PRIORITY); //우선순위 1 제일 낮음
				th.setName("thread 홀수 : " + i);
			}
			
			th.start();
		}
		
	}

}
