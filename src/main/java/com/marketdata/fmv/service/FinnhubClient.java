package com.marketdata.fmv.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class FinnhubClient {

    private final RestTemplate restTemplate;
    private final String apiKey;

    public FinnhubClient(RestTemplate restTemplate, @Value("${finnhub.api.key}") String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
        System.out.println("API Key: " + apiKey);
    }

    public FinnhubQuoteResponse getQuote(String ticker){

        String url = UriComponentsBuilder.fromHttpUrl("https://finnhub.io/api/v1/quote")
                .queryParam("symbol",ticker)
                .queryParam("token",apiKey)
                .toUriString();

        return restTemplate.getForObject(url, FinnhubQuoteResponse.class);
    }
}
