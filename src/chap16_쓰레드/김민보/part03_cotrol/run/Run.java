package chap16_쓰레드.김민보.part03_cotrol.run;

import chap16_쓰레드.김민보.part03_cotrol.model.thread.InterruptSample;


public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Thread4 th4 = new Thread4();
		//new Thread(th4).start();
		
		InterruptSample is = new InterruptSample();
		is.sleepInterrupt();
	}

}
