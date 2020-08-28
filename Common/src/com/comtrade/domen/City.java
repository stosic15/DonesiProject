package com.comtrade.domen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class City implements GeneralDomen {
	private int id_city;
	private String city_name;
	public City() {
		super();
	}
	public City(String city_name) {
		super(); 
		this.city_name = city_name;
	}
	public int getId_city() {
		return id_city;
	}
	public void setId_city(int id_city) {
		this.id_city = id_city;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "city";
	
		
	}
	@Override
	public List<GeneralDomen> selectAll(ResultSet resultSet) {
		List<GeneralDomen >citys = new ArrayList<GeneralDomen>();
		try {
			while(resultSet.next()) {
			City city = new City();
			city.setId_city(resultSet.getInt("id_city"));
			city.setCity_name(resultSet.getString("city_name"));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return citys;
		
	}
	@Override
	public String getCollumnName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getValues() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setValuesINSERT(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	}
	
	
	


