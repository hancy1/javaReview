package chap17_네트워크.김민보.chap02_socket.part02_chat.Thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receiver implements Runnable {
	
	private DataInputStream in;

	
	public Receiver(Socket socket) {
		
		try {
			in = new DataInputStream(socket.getInputStream());			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(in.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
