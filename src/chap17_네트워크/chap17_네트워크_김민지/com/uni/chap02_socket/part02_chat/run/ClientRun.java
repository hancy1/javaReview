package chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part02_chat.run;

import chap17_네트워크.chap17_네트워크_김민지.com.uni.chap02_socket.part02_chat.controller.ChatClientManager;

public class ClientRun {

	public static void main(String[] args) {
		ChatClientManager client = new ChatClientManager();
		client.startClient();

	}

}
