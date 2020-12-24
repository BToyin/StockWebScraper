package com.toyin.Starter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.toyin.Entities.Stock;
import com.toyin.UserInput;

import java.io.IOException;

public class Starter {


    public static void start() {


        WebClient client = new WebClient();
        client.getOptions().setJavaScriptEnabled(false);
        client.getOptions(). setCssEnabled(false);
        client.getOptions().setUseInsecureSSL(true);

        try {
            HtmlPage page = client.getPage(UserInput.getUrl());

            HtmlElement stockName = (HtmlElement) page.getFirstByXPath("//h1[@data-reactid='7']");
            HtmlElement stockPrice = (HtmlElement) page.getFirstByXPath("//span[@class='Trsdu(0.3s) Fw(b) Fz(36px) Mb(-4px) D(ib)']");

            Stock stock = new Stock();
            stock.setStockName(stockName.asText());
            stock.setStockPrice(stockPrice.asText());

            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(stock);
            System.out.println(jsonString);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
