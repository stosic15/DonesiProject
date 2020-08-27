package com.comtrade.comunication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.comtrade.domen.TransferObject;

public class Comunication {
	private static Comunication instance;
	private Socket socket;
	
	private Comunication() {
		try {
			socket = new Socket("127.0.0.1",9000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Comunication getInstance() {
		if(instance == null) {
			instance = new Comunication();
		}
		return instance;
	}
	public void send(TransferObject transferObject) {
		
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			objectOutputStream.writeObject(transferObject);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public TransferObject read() throws ClassNotFoundException, IOException {
		ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
		socket.getInputStream();
		return (TransferObject) objectInputStream.readObject();
	}

}
