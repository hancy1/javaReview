package chap17_네트워크.한채영.uni.chap02_socket.part02_chat.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import chap17_네트워크.한채영.uni.chap02_socket.part02_chat.thread.Receiver;
import chap17_네트워크.한채영.uni.chap02_socket.part02_chat.thread.Sender;

public class ChatClientManager {

	
	public void startClient() {
		
		String name = "Client";
		int port = 8500;
		
		String serverIp = null;
		
		try {
			serverIp = InetAddress.getLocalHost().getHostAddress();
			//192.168.43.203
			//serverIp = "192.168.43.203";
			Socket socket = new Socket(serverIp, port);
			System.out.println("서버와의 연결이 되었습니다.");
			
			Sender sender = new Sender(socket, name);
			Thread sth = new Thread(sender);
			
			Receiver receiver = new Receiver(socket);
			Thread rth = new Thread(receiver);
			
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
