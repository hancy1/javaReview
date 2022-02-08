package chap17_네트워크.김민보.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.InputStreamReader;


public class TCPClient {

	
	public void ClientStart() {
		
		//1.서버의 Ip주소와 서버가 정한 포트번호를 먼저 알아야됨
		
		int port = 8500;
		
		String serverIp = null;
		
		try {//2.서버의 ip주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트 소켓 생성
			serverIp = InetAddress.getLocalHost().getHostAddress();
			
			Socket server = new Socket(serverIp, port);
			
			
			System.out.println("서버와 연결이 되었습니다.");
			
			//3. 서버의 입출력 스트림 오픈
			if(server != null) {
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				
				PrintWriter pw = new PrintWriter(server.getOutputStream());
				
				pw.println("반가워요!");
				pw.flush();
				
				String message = br.readLine();
				System.out.println("서버가 보낸 메시지 : " + message);
				
				pw.close();
				br.close();
				
				}
			server.close();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
