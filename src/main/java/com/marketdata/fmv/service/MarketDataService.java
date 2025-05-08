package com.marketdata.fmv.service;

import com.marketdata.fmv.model.Company;
import com.marketdata.fmv.model.MarketBidInfo;
import com.marketdata.fmv.repository.CompanyRepository;
import com.marketdata.fmv.repository.MarketBidInfoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MarketDataService {

    private final CompanyRepository companyRepository; // For accessing company tickers
    private final MarketBidInfoRepository marketBidInfoRepository; // For saving market data
    private final FinnhubClient finnhubClient;

    @Autowired
    public MarketDataService(CompanyRepository companyRepository,
                             MarketBidInfoRepository marketBidInfoRepository,
                             FinnhubClient finnhubClient) {
        this.companyRepository = companyRepository;
        this.marketBidInfoRepository = marketBidInfoRepository;
        this.finnhubClient = finnhubClient;
    }

    @Transactional
    public void updateMarketData() {
        // Step 1: Fetch all companies from the database
        List<Company> companies = companyRepository.findAll();

        // Step 2: Loop through each company and fetch market data
        for (Company company : companies) {
            // Fetch market data from Finnhub API
            FinnhubQuoteResponse quote = finnhubClient.getQuote(company.getTicker());

            // Step 3: Create a MarketBidInfo object and set the values
            MarketBidInfo marketBidInfo = new MarketBidInfo();
            marketBidInfo.setOrgId(company.getOrgId());
            marketBidInfo.setTicker(company.getTicker());
            marketBidInfo.setCurrentPrice(quote.getCurrPrice());
            marketBidInfo.setChange(quote.getChange());
            marketBidInfo.setPercentChange(quote.getPercentChange());
            marketBidInfo.setHigh(quote.getHigh());
            marketBidInfo.setLow(quote.getLow());
            marketBidInfo.setOpen(quote.getOpen());
            marketBidInfo.setPreviousClose(quote.getPreviousClose());
            marketBidInfo.setMarketTimestamp(LocalDateTime.now()); // Set current timestamp

            // Step 4: Save the data into the market_bid_info table
            marketBidInfoRepository.save(marketBidInfo);
        }
    }
}
