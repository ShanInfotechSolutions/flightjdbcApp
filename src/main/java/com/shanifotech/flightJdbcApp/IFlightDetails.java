package com.shanifotech.flightJdbcApp;

import java.sql.SQLException;

public interface IFlightDetails {
	public void addFlight(FlightDetails fd) throws ClassNotFoundException,SQLException;
	public void updateFlight();
	public void getFlight() throws ClassNotFoundException,SQLException;
	public void deleteFlight();
}
