package com.bridgelabz.stock;

class StockPortfolio {
    private Stock[] stocks;
    private int size;

    public StockPortfolio(int size) {
        this.stocks = new Stock[size];
        this.size = 0;
    }

    public void addStock(Stock stock) {
        if (size < stocks.length) {
            stocks[size++] = stock;
        } else {
            System.out.println("Cannot add more stocks. Portfolio is full.");
        }
    }

    public double calculateTotalPortfolioValue() {
        double totalPortfolioValue = 0;
        for (Stock stock : stocks) {
            if (stock != null) {
                totalPortfolioValue += stock.calculateStockValue();
            }
        }
        return totalPortfolioValue;
    }

    public void printStockReport() {
        System.out.println("\nStock Report:");
        for (Stock stock : stocks) {
            if (stock != null) {
                System.out.println("Stock: " + stock.getStockName());
                System.out.println("Number of Shares: " + stock.getNumShares());
                System.out.println("Share Price: $" + stock.getSharePrice());
                System.out.println("Total Value: $" + String.format("%.2f", stock.calculateStockValue()));
                System.out.println("------------------------------------");
            }
        }
        System.out.println("\nTotal Portfolio Value: $" + String.format("%.2f", calculateTotalPortfolioValue()));
    }
}

