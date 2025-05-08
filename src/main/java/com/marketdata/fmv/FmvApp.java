package com.marketdata.fmv;

import org.springframework.boot.CommandLineRunner;
import com.marketdata.fmv.service.MarketDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FmvApp implements CommandLineRunner{

	private final MarketDataService marketDataService;

	public FmvApp(MarketDataService marketDataService) {
		this.marketDataService = marketDataService;
	}

	public static void main(String[] args) {
		SpringApplication.run(FmvApp.class, args);
	}

	@Override
	public void run(String... args) {
		marketDataService.updateMarketData();
	}

}
