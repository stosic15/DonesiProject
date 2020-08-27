package com.comtrade.domen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HomeAdress implements GeneralDomen {
	private int id_homeadress;
	private String adress;
	
	public HomeAdress() {
		super();
	}
	public HomeAdress(String adress) {
		super();
		this.adress = adress;
	}
	public int getId_homeadress() {
		return id_homeadress;
	}
	public void setId_homeadress(int id_homeadress) {
		this.id_homeadress = id_homeadress;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return " home_adress ";
	}
	@Override
	public String getCollumnName() {
		// TODO Auto-generated method stub
		return "(adress)";
	}
	@Override
	public String getValues() {
		// TODO Auto-generated method stub
		return " (?) " ;
	}
	@Override
	public void setValuesINSERT(PreparedStatement preparedStatement) {
		try {
			preparedStatement.setString(1, adress);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<GeneralDomen> selectAll(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
