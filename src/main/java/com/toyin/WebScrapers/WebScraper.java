package com.toyin.WebScrapers;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.toyin.Entities.Stock;
import com.toyin.UserInput;

import java.io.IOException;

public interface WebScraper {
     public Stock scraping();
}
