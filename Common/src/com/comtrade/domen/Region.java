package com.comtrade.domen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Region implements GeneralDomen {
	public int id_region;
	public String region_name;
	public Region() {
		super();
	}
	public Region(String region_name) {
		super();
		this.region_name = region_name;
	}
	public int getId_region() {
		return id_region;
	}
	public void setId_region(int id_region) {
		this.id_region = id_region;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
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
	@Override
	public List<GeneralDomen> selectAll(ResultSet resultSet) {
		List<GeneralDomen>regions = new ArrayList<GeneralDomen>();
		try {
			while(resultSet.next()) {
				Region region = new Region();
				region.setId_region(resultSet.getInt("id_region"));
				region.setRegion_name(resultSet.getString("region_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return regions;
	}
	
	

}
