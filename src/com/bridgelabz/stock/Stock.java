package com.bridgelabz.stock;

class Stock {
    private String stockName;
    private int numShares;
    private double sharePrice;

    public Stock(String stockName, int numShares, double sharePrice) {
        this.stockName = stockName;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    public double calculateStockValue() {
        return numShares * sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public int getNumShares() {
        return numShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }
}

