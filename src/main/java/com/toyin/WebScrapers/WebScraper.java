package com.toyin.WebScrapers;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.toyin.Entities.Stock;
import com.toyin.Settings.WebClientSettings;
import com.toyin.UserInput;

import java.io.IOException;

public abstract class WebScraper {

    protected HtmlPage page;
    protected HtmlElement stockName = null, stockPrice = null, exDivDate = null, dividendYield = null, peRatio = null;
    final WebClient client = WebClientSettings.configuration();


    public abstract Stock scraping();
}
