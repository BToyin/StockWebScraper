package com.toyin.WebScrapers;

import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLElement;
import com.toyin.Entities.Stock;
import com.toyin.UserInput;

import java.io.IOException;

public class YahooFinanceScraper extends WebScraper {

    @Override
    public Stock scraping() {

        try {
            do {
                page = client.getPage(UserInput.getYahooFinanceUrl());
                stockName = page.getFirstByXPath("//h1[@data-reactid='7']");
                stockPrice = page.getFirstByXPath("//span[@class='Trsdu(0.3s) Fw(b) Fz(36px) Mb(-4px) D(ib)']");
                peRatio = page.getFirstByXPath("//td[@data-test='PE_RATIO-value']");
                exDivDate = page.getFirstByXPath("//td[@data-test='EX_DIVIDEND_DATE-value']");
                dividendYield = page.getFirstByXPath("//td[@data-test='DIVIDEND_AND_YIELD-value']");

            } while (stockName == null && stockPrice == null); }

        catch (IOException e) {
            e.printStackTrace();
        }

        Stock stock = new Stock();
        assert stockName != null;
        stock.setExDivDate(exDivDate.asText());
        stock.setDividendYield(dividendYield.asText());
        stock.setPeRatio(peRatio.asText());
        stock.setStockName(stockName.asText());
        stock.setStockPrice(stockPrice.asText());

        return stock;

    }
}
