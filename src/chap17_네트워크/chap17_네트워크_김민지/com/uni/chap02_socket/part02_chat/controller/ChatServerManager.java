package chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part02_chat.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part02_chat.thread.Receiver;
import chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part02_chat.thread.Sender;

public class ChatServerManager {
	
	
	public void startServer() {
		//서버이름정하기
		String name = "Server";
		
		//1.포트번호
		int port = 8500;
		
		try {
			ServerSocket server = new ServerSocket(port); // 소켓생성
			
			System.out.println("Server Strart!~");
			
			Socket client = server.accept(); // 서버 연결하기
			System.out.println("클라이언트와 연결이 되었습니다.");
			
			//송수신 작업용 스레드 만들기 
			//: 채팅프로그램은 무전기처럼 송신을 받고 수신을 하는것이 아니라 전화기처럼 송신을 받으면서 동시에 수신도 할수있어야 
			// 하기때문에 이를 위해 송신과 수신을 별도의 스레드로 처리하면 동시에 처리가 가능하다.

			Sender sender = new Sender(client, name);
			Thread sth = new Thread(sender); // Sender 쓰레드
			
			Receiver receiver = new Receiver(client);
			Thread rth = new Thread(receiver); // Receiver 쓰레드
			
			sth.start(); // 쓰레드 활성화
			rth.start();
			
			server.close(); // 입출력이 계속 되야하기 때문에 서버만 닫아준다.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
