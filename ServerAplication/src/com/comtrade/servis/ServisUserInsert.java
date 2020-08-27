package com.comtrade.servis;

import com.comtrade.broker.Broker;
import com.comtrade.domen.SqlException;
import com.comtrade.domen.TransferObject;
import com.comtrade.domen.User;

public class ServisUserInsert extends GeneralSystemOperation {

	@Override
	protected void executeConcreteSystemOperaction(TransferObject transferObject) {
		User user = (User) transferObject.getRequest();
		Broker broker = new Broker();
		try {
			broker.insert(user);
			transferObject.setMessage("Insert successful");
		} catch (SqlException e) {
			// TODO Auto-generated catch block
			transferObject.setMessage(e.toString());
		}
		
	}

}
