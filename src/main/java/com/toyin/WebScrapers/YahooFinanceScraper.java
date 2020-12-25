package com.toyin.WebScrapers;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.toyin.Entities.Stock;
import com.toyin.UserInput;
import com.toyin.Settings.WebClientSettings;

import java.io.IOException;

public class YahooFinanceScraper implements WebScraper {

    private HtmlPage page;
    private HtmlElement stockName = null, stockPrice = null;
    private final WebClient client = WebClientSettings.configuration();


    @Override
    public Stock scraping() {

        try {
            do {
                page = client.getPage(UserInput.getUrl());
                stockName = page.getFirstByXPath("//h1[@data-reactid='7']");
                stockPrice = page.getFirstByXPath("//span[@class='Trsdu(0.3s) Fw(b) Fz(36px) Mb(-4px) D(ib)']");

            } while (stockName == null && stockPrice == null); }

        catch (IOException e) {
            e.printStackTrace();
        }

        Stock stock = new Stock();
        assert stockName != null;
        stock.setStockName(stockName.asText());
        stock.setStockPrice(stockPrice.asText());

        return stock;

    }
}
