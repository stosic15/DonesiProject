package com.comtrade.servis;

import com.comtrade.connection.Connections;
import com.comtrade.domen.TransferObject;

public abstract class GeneralSystemOperation {
	public void executeGeneralSystemOperation(TransferObject transferObject) {
		try {
		startTransaction();
		executeConcreteSystemOperaction(transferObject);
		confirmTransaction();
	}catch (Exception e) {
		e.printStackTrace();
		undoTransaction();
		}finally {
		closeTransaction();
		}
	}

	private void closeTransaction() {
		Connections.getInstance().undoTransaction();
	}

	private void undoTransaction() {
		Connections.getInstance().undoTransaction();
	}

	private void confirmTransaction() {
		Connections.getInstance().confirmTransaction();
	}

	protected abstract void executeConcreteSystemOperaction(TransferObject transferObject);

	private void startTransaction() {
		Connections.getInstance().startTransaction();
	}


}
