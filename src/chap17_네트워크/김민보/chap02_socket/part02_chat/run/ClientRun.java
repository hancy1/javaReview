package chap17_네트워크.김민보.chap02_socket.part02_chat.run;

import chap17_네트워크.김민보.chap02_socket.part02_chat.controller.ChatClientManager;

public class ClientRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChatClientManager client = new ChatClientManager();
		client.startClient();
	}

}
