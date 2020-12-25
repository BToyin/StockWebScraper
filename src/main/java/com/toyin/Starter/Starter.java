package com.toyin.Starter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toyin.Entities.Stock;
import com.toyin.WebScrapers.WebScraper;
import com.toyin.WebScrapers.YahooFinanceScraper;


public class Starter {

    public static void start() {

        //can easily change the scraper being used here
        WebScraper webScraper = new YahooFinanceScraper();

        Stock stock = webScraper.scraping();
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = mapper.writeValueAsString(stock);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonString);

    }
}
