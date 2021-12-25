package com.bridgelabz.OopsPrograms;

public class Stock {

	private String ShareName;
	private int price;
	private int numberOfShares;

	public String getShareName() {
		return ShareName;
	}

	public int getPrice() {
		return price;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public Stock(String ShareName, int numberOfShares,int price) {
		this.ShareName = ShareName;
		this.numberOfShares = numberOfShares;
		this.price = price;
	}
}

