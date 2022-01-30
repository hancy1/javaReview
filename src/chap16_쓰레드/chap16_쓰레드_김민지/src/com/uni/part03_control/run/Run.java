package chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part03_control.run;

import chap16_쓰레드.chap16_쓰레드_김민지.src.com.uni.part03_control.model.thread.InterruptSample;

public class Run {

	public static void main(String[] args) {
		
		//Thread4 th4 = new Thread4();
		//Thread(th4).start(); 
		
		InterruptSample is = new InterruptSample();
		is.sleepInterrupt();

	}

}
