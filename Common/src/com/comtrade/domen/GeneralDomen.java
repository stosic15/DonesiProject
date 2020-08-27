package com.comtrade.domen;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public interface GeneralDomen extends Serializable {

	String getTableName();

	String getCollumnName();

	String getValues();

	void setValuesINSERT(PreparedStatement preparedStatement);

	List<GeneralDomen> selectAll(ResultSet resultSet);

}
