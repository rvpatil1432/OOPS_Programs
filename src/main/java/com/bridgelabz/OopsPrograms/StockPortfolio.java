package com.bridgelabz.OopsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class StockPortfolio {


	private static ArrayList list = new ArrayList();


	private static void stockPortfolio() {
		System.out.println("Please Enter number of stocks..");
		Scanner sc = new Scanner(System.in);
		int numberOfStocks = sc.nextInt(); 
		for (int i = 0; i<numberOfStocks; i++){

			System.out.println ("Stock's name:");
			String stockName = sc.next();
			System.out.println ("Numbers of shares: ");
			int numberShares= sc.nextInt();
			System.out.println ("Stock's price:");
			int stockPrice = sc.nextInt();
			list.add(new Stock(stockName, numberShares,stockPrice));
			calculateTotalValueOfStock(numberShares,stockPrice);
			
		}
	}
	public static int calculateTotalValueOfStock(int numberOfShares, int stockPrice) {
		int totalValueOfStocks= 0;
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Stock stock =  (Stock)itr.next();
			int stocks = stock.getNumberOfShares()*stock.getPrice();
			System.out.println("Name of Stock : "+stock.getShareName()+" Total Stock Price "+stocks);
			totalValueOfStocks = totalValueOfStocks+stocks;
		}
		System.out.println("Total value of stocks : "+totalValueOfStocks);
		return numberOfShares * stockPrice;
	}
	public static void main (String [] args){
		stockPortfolio();
	}
}
