package com.shanifotech.flightJdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static Connection con=null;
	public static Connection connect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcEx","root","Root@007");
		return con;
		
	}

}
