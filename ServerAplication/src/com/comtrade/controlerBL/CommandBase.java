package com.comtrade.controlerBL;

import com.comtrade.domen.TransferObject;

public interface CommandBase {
	public void execute(TransferObject transferObject);

}
