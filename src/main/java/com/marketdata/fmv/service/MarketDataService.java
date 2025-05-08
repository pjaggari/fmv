package com.marketdata.fmv.service;

import org.springframework.stereotype.Service;

@Service
public class MarketDataService {

    private final FinnhubClient finnhubClient;

    public MarketDataService(FinnhubClient finnhubClient) {
        this.finnhubClient = finnhubClient;
    }

    public void fetchAndPrintData() {
        String ticker = "TSLA";
        FinnhubQuoteResponse quote = finnhubClient.getQuote(ticker);

        System.out.println("Current Price: " + quote.getCurrPrice());
        System.out.println("Change: " + quote.getChange());
        System.out.println("Percent Change: " + quote.getPercentChange());
        System.out.println("High: " + quote.getHigh());
        System.out.println("Low: " + quote.getLow());
        System.out.println("Open: " + quote.getOpen());
        System.out.println("Previous Close: " + quote.getPreviousClose());
        System.out.println("Timestamp: " + quote.getTime());
    }
}
