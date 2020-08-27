package com.comtrade.domen;

import java.io.Serializable;

public class TransferObject implements Serializable {
	private Object request;
	private Object response;
	private ConstantesBL constantesBL;
	private ConstantesFC constantesFC;
	String message;
	public Object getRequest() {
		return request;
	}
	public void setRequest(Object request) {
		this.request = request;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
	public ConstantesBL getConstantesBL() {
		return constantesBL;
	}
	public void setConstantesBL(ConstantesBL constantesBL) {
		this.constantesBL = constantesBL;
	}
	public ConstantesFC getConstantesFC() {
		return constantesFC;
	}
	public void setConstantesFC(ConstantesFC constantesFC) {
		this.constantesFC = constantesFC;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public static TransferObject create (Object request, ConstantesFC constantesFC, ConstantesBL constantesBL) {
		TransferObject transferObject = new TransferObject();
		transferObject.setRequest(request);
		transferObject.setConstantesFC(constantesFC);
		transferObject.setConstantesBL(constantesBL);
		
		return transferObject;
	}
	
	

}
