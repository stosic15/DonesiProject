package com.comtrade.frontcontroller;

import java.io.IOException;

import com.comtrade.comunication.Comunication;
import com.comtrade.domen.TransferObject;

public class FrontController {
	private static FrontController instance;
	
	private FrontController() {
		
	}
	public static FrontController getInstance() {
		if(instance == null) {
			instance = new FrontController();
		}
		return instance;
		
	}
	public TransferObject execute (TransferObject transferObject) throws ClassNotFoundException, IOException {
		Comunication.getInstance().send(transferObject);
		return Comunication.getInstance().read();
	}

}
