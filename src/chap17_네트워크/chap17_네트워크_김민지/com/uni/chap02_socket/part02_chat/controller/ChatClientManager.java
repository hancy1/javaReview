package chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part02_chat.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part02_chat.thread.Receiver;
import chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part02_chat.thread.Sender;

public class ChatClientManager {
	
	
	public void startClient() {
		
		String name = "Client";
		
		int port = 8500;
		
		String serverIp = null;
		
		try {
			serverIp = InetAddress.getLocalHost().getHostAddress();
			//192.168.43.203 <- 이 IP 주소로 소켓을 만든다면
			//Socket socket = new Socket("192.168.43.203", port);
			
			Socket socket = new Socket(serverIp, port);
			
			System.out.println("서버와의 연결이 되었습니다. ");
			
			Sender sender = new Sender(socket, name);
			Thread sth = new Thread(sender); // sender 쓰레드
			
			Receiver receiver = new Receiver(socket);
			Thread rth = new Thread(receiver); // receiver 쓰레드
			
			sth.start();
			rth.start();
								
					
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
