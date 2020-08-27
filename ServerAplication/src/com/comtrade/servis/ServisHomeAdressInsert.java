package com.comtrade.servis;

import com.comtrade.broker.Broker;
import com.comtrade.domen.HomeAdress;
import com.comtrade.domen.SqlException;
import com.comtrade.domen.TransferObject;

public class ServisHomeAdressInsert extends GeneralSystemOperation {

	@Override
	public void executeConcreteSystemOperaction(TransferObject transferObject) {
		HomeAdress hm = (HomeAdress) transferObject.getRequest();
		Broker broker = new Broker();
		try {
			broker.insert(hm);
			transferObject.setMessage("Uspesan unos");

		} catch (SqlException e) {
			// TODO Auto-generated catch block
			transferObject.setMessage(e.toString());
		}
		
	}

}