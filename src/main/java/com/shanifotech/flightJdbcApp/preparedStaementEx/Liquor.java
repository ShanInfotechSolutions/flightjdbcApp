package com.shanifotech.flightJdbcApp.preparedStaementEx;

public class Liquor {
	private int batchNo;
	private String liquorName;
	private String liquorType;
	private String countryOrigin;
	private int years;
	private double price;
	
	public Liquor() {
	}

	public Liquor(int batchNo, String liquorName, String liquorType, String countryOrigin, int years,
			double price) {
		this.batchNo = batchNo;
		this.liquorName = liquorName;
		this.liquorType = liquorType;
		this.countryOrigin = countryOrigin;
		this.years = years;
		this.price = price;
	}

	public int getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	public String getLiquorName() {
		return liquorName;
	}

	public void setLiquorName(String liquorName) {
		this.liquorName = liquorName;
	}

	public String getLiquorType() {
		return liquorType;
	}

	public void setLiquorType(String liquorType) {
		this.liquorType = liquorType;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LiquorBarren [batchNo=" + batchNo + ", liquorName=" + liquorName + ", liquorType=" + liquorType
				+ ", countryOrigin=" + countryOrigin + ", years=" + years + ", price=" + price + "]";
	}
}
