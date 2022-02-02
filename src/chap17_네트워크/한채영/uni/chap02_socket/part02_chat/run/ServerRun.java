package chap17_네트워크.한채영.uni.chap02_socket.part02_chat.run;

import chap17_네트워크.한채영.uni.chap02_socket.part02_chat.controller.ChatServerManager;

public class ServerRun {

	public static void main(String[] args) {

		ChatServerManager s = new ChatServerManager();
		s.startServer();
	}

}
