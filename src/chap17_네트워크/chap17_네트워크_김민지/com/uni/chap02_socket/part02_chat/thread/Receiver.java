package chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part02_chat.thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receiver implements Runnable{
	
	private DataInputStream in; // 객체 읽어오기
	
	public Receiver(Socket socket) { // socket을 매개변수로 받아
		
		try {
			in = new DataInputStream(socket.getInputStream());  // 소켓을 통해 객체 읽어오기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println(in.readUTF()); // 읽은 객체 출력
			} catch (IOException e) {
				break;
			}
		}
		
	}
	

}
