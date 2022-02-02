package chap16_쓰레드.한채영.part03_control.run;

import chap16_쓰레드.한채영.part03_control.model.thread.InterruptSample;
import chap16_쓰레드.한채영.part03_control.model.thread.Thread4;

public class Run {

	public static void main(String[] args) {

		Thread4 th4 = new Thread4();
		new Thread(th4).start();
		
		InterruptSample is = new InterruptSample();
		is.sleepInterrupt();
	}
	

}
