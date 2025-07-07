package com.shanifotech.flightJdbcApp;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        FlightDetailsDao fd=new FlightDetailsDao();
        //fd.addFlight(new FlightDetails());
        fd.getFlight();
    }
}
