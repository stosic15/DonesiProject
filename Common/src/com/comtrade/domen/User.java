package com.comtrade.domen;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User implements GeneralDomen{
	private int id_user;
	private String email;
	private String password;
	private String user_name;
	public User() {
		super();
	}
	public User(String email, String password, String user_name) {
		super();
		this.email = email;
		this.password = password;
		this.user_name = user_name;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		
		
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "user";
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
		try {
			preparedStatement.setString(1, "email");
			preparedStatement.setString(2, "password");
			preparedStatement.setString(3, user_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public List<GeneralDomen> selectAll(ResultSet resultSet) {
		List<GeneralDomen>list = new ArrayList<GeneralDomen>();
		try {
			while(resultSet.next()) {
				User user = new User();
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				user.setUser_name(resultSet.getString("user_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	

}
