package com.shanifotech.flightJdbcApp;

public interface IFlightDetails {
	public void addFlight(FlightDetails fd) throws Exception;
	public void updateFlight();
	public void getFlight() throws Exception;
	public void deleteFlight();
}
