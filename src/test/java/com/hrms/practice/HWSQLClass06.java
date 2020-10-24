package com.hrms.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class HWSQLClass06 {
	// HW get the result set metadata store it in arraylist, retrieve from arraylist
	// and print
	// in console also get column type name and get table names

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:mysql://hostname:port/db name
	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	@Test
	public void resultSetData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from ohrm_job_title");
		ResultSetMetaData rsMetaData = rs.getMetaData();
		int colCount = rsMetaData.getColumnCount();
		List<String> resultSets = new ArrayList<>();

		for (int i = 1; i <= colCount; i++) {
			String resultSet = rsMetaData.getColumnName(i);
			resultSets.add(resultSet);
		}
		System.out.println("==============Column name===============");
		System.out.println(resultSets);

		
		System.out.println("==============Column type===============");
		for (int i = 1; i <= colCount; i++) {
			String colType = rsMetaData.getColumnTypeName(i);
			System.out.println(colType);
		}
		System.out.println("==============Table name===============");
		String tableName = rsMetaData.getTableName(1);
		System.out.println(tableName);


	}

}
