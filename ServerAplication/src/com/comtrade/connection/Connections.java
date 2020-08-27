package com.comtrade.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
	private Connection connection;
	private volatile static Connections connections;
	
	public Connections() {
		
	}
	public Connection getConnection() {
		return connection;
	}
	public static Connections getInstance() {
		if(connections == null) {
			synchronized (Connections.class) {
				if(connections == null) {
			
			connections = new Connections();
		}
	}
		

}
		return connections;
}
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void undoTransaction() {
		try {
			connection.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void confirmTransaction() {
		try {
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void startTransaction() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/donesi", "root","");
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
