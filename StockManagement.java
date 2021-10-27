package com.bridgelabz.stockmanagement;

public class StockManagement {

	public class StockAccountManagement {

		public static void main(String[] args) {

			// creating Object
			StockPortFolio stockPortfolio = new StockPortFolio();
			
			// Calling Method 
			stockPortfolio.addStock("DMart", 2, 100);
			stockPortfolio.addStock("Reliance", 3, 150);
			stockPortfolio.calculateStockVal();
			stockPortfolio.printReport();
		}
	}

}
