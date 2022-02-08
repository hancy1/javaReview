package chap17_네트워크.김민보.chap02_socket.part02_chat.controller;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

import chap17_네트워크.김민보.chap02_socket.part02_chat.Thread.Receiver;
import chap17_네트워크.김민보.chap02_socket.part02_chat.Thread.Sender;

public class ChatServerManager {

	public void srartServer() {
		
		String name = "Server";
		
		//1. 포트번호
		int port = 8500;
		
		
		try {
			ServerSocket server = new ServerSocket(port);
			
			System.out.println("서버 스타트~!");
			
			Socket client = server.accept();
			System.out.println("클라이언트와 연결이 되었습니다");
			
			//송수신 작업용 스레드 만들기 
			//: 채팅프로그램은 무전기처럼 송신을 받고 수신을 하는것이 아니라 전화기처럼 송신을 받으면서 동시에 수신도 할수있어야 
			// 하기때문에 이를 위해 송신과 수신을 별도의 스레드로 처리하면 동시에 처리가 가능하다.

			Sender sender = new Sender(client, name);
			Thread sth = new Thread(sender);
			
			Receiver receiver = new Receiver(client);
			Thread rth = new Thread(receiver);
			
			
			sth.start();
			rth.start();
			
			server.close();					
					
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
