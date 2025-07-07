package com.shanifotech.flightJdbcApp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FlightDetailsDao implements IFlightDetails{
	Scanner sc=new Scanner(System.in);
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	

	@Override
	public void addFlight(FlightDetails fd) throws SQLException {
//		con=DBConnect.connect();
//		st=con.createStatement();
//		System.out.println("Flight Details: Id,FlightCompany,TravelDate,Source,Destination");
//		fd.setFlightId(sc.nextInt());
//		sc.nextLine();
//		fd.setFlightCompany(sc.nextLine());
//		fd.setTravelDate(sc.nextLine());
//		fd.setSource(sc.nextLine());
//		fd.setDestination(sc.nextLine());
//		String insertFlights="insert into flightdetails values("+fd.getFlightId()+",'"+fd.getFlightCompany()+"','"
//				+fd.getTravelDate()+"','"+fd.getSource()+"','"+fd.getDestination()+"')";
//				st.executeUpdate(insertFlights);
//				System.out.println("Data Inserted");
	}

	@Override
	public void updateFlight() {
		}

	@Override
	public void getFlight() throws SQLException {
		con=DBConnect.connect();
		st=con.createStatement();
		String queryResult="select * from flightdetails";// result set id used for fetching the data from the database and points from the 1st row
		rs=st.executeQuery(queryResult);
		while(rs.next()) {
			System.out.println("Flight Id: "+rs.getInt(1));// index number  based which uses digits, column based which uses column names
		}
		
	}

	@Override
	public void deleteFlight() {
		// TODO Auto-generated method stub
		
	}

}
