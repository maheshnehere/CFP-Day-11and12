package com.bridgelabz.stock;
import java.util.Scanner;
public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int size = Integer.parseInt(scanner.nextLine());

        StockPortfolio stockPortfolio = new StockPortfolio(size);

        // Read in stock details from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter stock name: ");
            String stockName = scanner.nextLine().trim();

            // Read number of shares and share price
            System.out.print("Enter number of shares: ");
            int numShares = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter share price: ");
            double sharePrice = Double.parseDouble(scanner.nextLine());

            // Create Stock object and add it to the StockPortfolio
            Stock stock = new Stock(stockName, numShares, sharePrice);
            stockPortfolio.addStock(stock);
        }

        // Print the stock report
        stockPortfolio.printStockReport();
    }
}
