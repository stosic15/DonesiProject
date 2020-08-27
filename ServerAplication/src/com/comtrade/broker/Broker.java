package com.comtrade.broker;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.comtrade.connection.Connections;
import com.comtrade.domen.GeneralDomen;
import com.comtrade.domen.SqlException;

public class Broker {
	public void insert(GeneralDomen generalDomen) throws SqlException {
		String sql = "insert into "+generalDomen.getTableName()+" "+generalDomen.getCollumnName()+" values"+generalDomen.getValues();
		
		try {
			PreparedStatement preparedStatement = Connections.getInstance().getConnection().prepareStatement(sql);
			generalDomen.setValuesINSERT(preparedStatement);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new SqlException("Insert problem"+ e);
		}
		
			
		}
	public List<GeneralDomen>selectAll(GeneralDomen generalDomen) throws SqlException{
		String sql = "select * from "+generalDomen.getTableName();
		ResultSet resultSet = null;
		try {
			PreparedStatement preparedStatement = Connections.getInstance().getConnection().prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			throw new SqlException(e.toString());
			
		}
		return generalDomen.selectAll(resultSet);
		
		
	}
		
	}


