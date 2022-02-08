package chap16_쓰레드.김민보.part01_thread.model.thread;

//스레드 생성
//1Tread상속받기 
public class Thread1 extends Thread {

	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("스레드 1 [ " + i +"]");
		}
	}

	
}
