package chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	
	/*
	 * 소켓 프로그래밍은 소켓을 이용한 통신 프로그래밍을 뜻한다.
	 * 소켓이란 프로세스간의 통신에 사용되는 양쪽 끝단을 의미.
	 * 서로 멀리 떨어진 두 사람이 통신하기 위해서 전화기가 필요한 것처럼,
	 * 프로세스 간의 통신을 위해서는 그 무언가가 필요하고 그것이 바로 소켓이다.
	 * 
	 * TCP를 이용한 통신은 전화에 비유.
	 * 데이터를 전송하기 전에 먼저 상대편과 연결을 한 후에 데이터를 전송하며 잘 전송되었는지를 확인하고
	 * 전송에 실패했다면 해당 데이터를 재전송하기 때문에 신뢰 있는 데이터의 전송이 요구되는 통신에 적합하다
	 * 예를 들면 파일을 주고받는데 적합하다.
	 */
	
	public void ClientStart() {
		// 1. 서버의 ip 주소와 서버가 정한 포트번호를 먼저 알아야함
		int port = 8500;
		String serverIp = null;
		
		try {
			// 2. 서버의 ip 주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트 소켓객체 생성
			serverIp = InetAddress.getLocalHost().getHostAddress();
			
			
			Socket server = new Socket(serverIp, port); // 클라이언트 프로그램에서 소켓을 생헝하여 서버소켓에 연결을 요청한다.
			
			System.out.println("서버와 연결이 되었습니다. ");
			
			
			// 3. 서버와의 입출력 스트림 오픈
			if(server != null) {
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				
				PrintWriter pw = new PrintWriter(server.getOutputStream());
				
				// 4. 스트림을 통해 읽고 쓰기
				pw.println("반가워요");
				pw.flush(); // 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
				
				// 서버 -> 클라이언트 메세지 읽어 들임
				String message = br.readLine();
				System.out.println("서버가 보낸 메세지 " + message);
				
				pw.close(); // 버퍼, 프린트 닫고
				br.close();
				
			}
			server.close(); // 소켓도 닫아주기
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
