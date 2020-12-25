package com.toyin;


import java.util.Scanner;

public class UserInput {

    public static String getYahooFinanceUrl() {
        String baseUrl = "https://uk.finance.yahoo.com/quote/";
        Scanner scanner;
        System.out.println("Choose ticker: ");
        scanner = new Scanner(System.in);
        String tickerSymbol = scanner.nextLine().toUpperCase();
        String endUrl = tickerSymbol + "?p=" + tickerSymbol + "&.tsrc=fin-srch";
        return baseUrl + endUrl;
    }
}
