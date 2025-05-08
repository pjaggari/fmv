package com.marketdata.fmv.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class MarketBidInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int org_i;

    private String ticker;
    @Column(name = "current_price")
    private BigDecimal currentPrice;

    private BigDecimal change;

    @Column(name = "percent_change")
    private BigDecimal percentChange;

    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal open;

    @Column(name = "previous_close")
    private BigDecimal previousClose;

    @Column(name = "market_timestamp")
    private LocalDateTime marketTimestamp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrgId() {
        return org_i;
    }

    public void setOrgId(int org_i) {
        this.org_i = org_i;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    public BigDecimal getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(BigDecimal percentChange) {
        this.percentChange = percentChange;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(BigDecimal previousClose) {
        this.previousClose = previousClose;
    }

    public LocalDateTime getMarketTimestamp() {
        return marketTimestamp;
    }

    public void setMarketTimestamp(LocalDateTime marketTimestamp) {
        this.marketTimestamp = marketTimestamp;
    }
}
