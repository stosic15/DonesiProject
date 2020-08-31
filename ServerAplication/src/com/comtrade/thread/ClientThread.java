package com.comtrade.thread;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.comtrade.controlerBL.CommandBase;
import com.comtrade.controllerBL.donesi.ControllerBLHomeAdress;
import com.comtrade.domen.TransferObject;

public class ClientThread extends Thread {
	private Socket socket ;
	public ClientThread(Socket socket) {
		super();
		this.socket = socket;
	}
	
	@Override
	public void run() {
		while(true) {
			ObjectInputStream objectInputStream;
			try {
		     objectInputStream = new ObjectInputStream(socket.getInputStream());
				TransferObject transferObject = (TransferObject) objectInputStream.readObject();
				processTheData(transferObject);
			} catch (IOException | ClassNotFoundException e) {
				
			}
			
	}
 
	}

	private void processTheData(TransferObject transferObject) {
		CommandBase commandBase = null ;
		switch (transferObject.getConstantesFC()) {
		case HOME_ADRESS:
			commandBase = new ControllerBLHomeAdress();
			break;

		default:
			break;
		}
		commandBase.execute(transferObject);
		send(transferObject);
		
	}

	private void send(TransferObject transferObject) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			objectOutputStream.writeObject(transferObject);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
