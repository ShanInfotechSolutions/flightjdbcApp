package com.shanifotech.flightJdbcApp.examples;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.shanifotech.flightJdbcApp.DBConnect;

public class ToyDao implements IToy{
	private Connection con=null;
	private Statement st=null;
	private ResultSet rs=null;
	
	@Override
	public void addToy(Toy t) throws Exception {
		con=DBConnect.connect();
		st=con.createStatement();
		
		st.addBatch("insert into toy values(101,'spiderMan','USA',7897.00)");
		st.addBatch("insert into toy values(102,'elephant','China',6541.00)");
		st.addBatch("insert into toy values(103,'laughing buddha','China',3200.00)");
		st.addBatch("insert into toy values(104,'channapattana pujari','India',4320.00)");
		st.addBatch("insert into toy values(105,'hulk','USA',6210.00)");
		st.executeBatch();// the return type is int array
		System.out.println("Data Inserted");
		}

	@Override
	public void updateToy() {
	
	}

	@Override
	public void getToy() throws Exception {
		con=DBConnect.connect();
		st=con.createStatement();
		String queryRs="select toyId,toyName,(toyPrice-(toyPrice*.15)) as newToyPrice from toy";
		rs=st.executeQuery(queryRs);
		while(rs.next()) {
			//System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getDouble("newToyPrice"));
			System.out.printf("\n %d,%s,%.1f",rs.getInt(1),rs.getString(2),rs.getDouble(3));
		}
	}

	
}
