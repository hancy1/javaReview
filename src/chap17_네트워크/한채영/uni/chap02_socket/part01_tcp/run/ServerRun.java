package chap17_네트워크.한채영.uni.chap02_socket.part01_tcp.run;

import chap17_네트워크.한채영.uni.chap02_socket.part01_tcp.sample.TCPServer;

public class ServerRun {

	public static void main(String[] args) {

		TCPServer ts = new TCPServer();
		ts.serverStart();
		
	}

}
