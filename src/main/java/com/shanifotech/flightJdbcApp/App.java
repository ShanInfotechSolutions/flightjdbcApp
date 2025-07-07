package com.shanifotech.flightJdbcApp;

public class App {
    public static void main(String[] args) throws Exception {
        FlightDetailsDao fd=new FlightDetailsDao();
        fd.getFlight();
        
    }
}
