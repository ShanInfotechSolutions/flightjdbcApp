package com.shanifotech.flightJdbcApp.preparedStaementEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.shanifotech.flightJdbcApp.DBConnect;

public class LiquorDao implements ILiquor{
	private Connection con=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	Scanner sc=new Scanner(System.in);

	@Override
	public void addLiquorDetails() throws Exception {
		con=DBConnect.connect();
		String insertLiq="insert into liquor values(?,?,?,?,?,?)";// '?' is known as 'in' parameters
		ps=con.prepareStatement(insertLiq);
		System.out.println("Insert Liquor data");
		ps.setInt(1, sc.nextInt());
		sc.nextLine();
		ps.setString(2, sc.nextLine());
		ps.setString(3,sc.nextLine());
		ps.setString(4, sc.nextLine());
		ps.setInt(5, sc.nextInt());
		ps.setDouble(6, 1000+Math.random());
		ps.execute();
		System.out.println("Data Inserted Successfullyyyyy!!!!!  Cheeeerrrsssss");
		}

	@Override
	public void getLiquorDetails() {
		
		}

}
