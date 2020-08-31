package com.comtrade.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadServer extends Thread {
	@Override
	public void run() {
		startServer();
	}
	private void startServer() {
		
		try {
			ExecutorService executorService = Executors.newCachedThreadPool();
			ServerSocket serverSocket = new ServerSocket(9000);
			while(true) {
				Socket socket = serverSocket.accept();
				ClientThread clientThread = new ClientThread(socket);
				List<ClientThread>list = ThreadController.getInstance().getClientList();
				if(!list.contains(clientThread)) {
					ThreadController.getInstance().addClient(clientThread);
					executorService.execute(clientThread);
				}
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		 
		
	}

}
