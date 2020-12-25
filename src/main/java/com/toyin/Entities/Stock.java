package com.toyin.Entities;

public class Stock {

    private String stockName;
    private String stockPrice;
    private String peRatio;
    private String exDivDate;
    private String dividendYield;


    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(String stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(String peRatio) {
        this.peRatio = peRatio;
    }

    public String getExDivDate() {
        return exDivDate;
    }

    public void setExDivDate(String exDivDate) {
        this.exDivDate = exDivDate;
    }

    public String getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(String dividendYield) {
        this.dividendYield = dividendYield;
    }
}
