package com.shanifotech.flightJdbcApp.examples;

public interface IToy {
	public void addToy(Toy t) throws Exception;
	public void updateToy();
	public void getToy() throws Exception;
}
