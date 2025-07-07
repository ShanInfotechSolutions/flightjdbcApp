package com.shanifotech.flightJdbcApp;

public class FlightDetails {
	private int flightId;
	private String flightCompany;
	private String travelDate;
	private String source;
	private String destination;
	
	public FlightDetails() {
	}

	public FlightDetails(int flightId, String flightCompany, String travelDate, String source, String destination) {
		this.flightId = flightId;
		this.flightCompany = flightCompany;
		this.travelDate = travelDate;
		this.source = source;
		this.destination = destination;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightCompany() {
		return flightCompany;
	}

	public void setFlightCompany(String flightCompany) {
		this.flightCompany = flightCompany;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "FlightDetails [flightId=" + flightId + ", flightCompany=" + flightCompany + ", travelDate=" + travelDate
				+ ", source=" + source + ", destination=" + destination + "]";
	}
	

}
