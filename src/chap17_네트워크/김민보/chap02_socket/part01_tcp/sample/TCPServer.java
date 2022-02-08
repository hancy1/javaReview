package chap17_네트워크.김민보.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class TCPServer {

	public void serverStart() {
		
		//1. 서버에 포트번호를 정함(0~65536) -- > 기본적으로(0~1023)은 쓰임, 보통 8000번대가 많이쓰임
		
		int port = 8500;
		String serverIp = null;
		
		//2. 서ㅓ버소켓 만들기
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(port);
			
			//3. 클라이언트로부터 접속 요청이 올때까지 대기
			
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			//4. 접속요청이 오면 요청수락후 해당 클라이언트에 대한 소켓 객체 생성
			
			Socket client = server.accept();
			
			String clientIp = client.getInetAddress().getHostAddress();
			System.out.println(clientIp + "가 연결을 요청함!");
			
			//5. 연결된 클라이언트와 입출력 스트림 생성
			
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
			//6. 보조 스트림을 통해서 성능개선
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			
			PrintWriter pw = new PrintWriter(output);
			
			//7. 스트림을 통해서 읽고 쓰기
			
			String message = br.readLine();			
			System.out.println(clientIp + "가 보낸 메시지 : " + message);
			
			
			//서버->클라이언트로 메시지 전송
			pw.print("만나서 반갑습니다");
			pw.flush();
			
			//8. 통신종료
			pw.close();
			br.close();
			
			server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
