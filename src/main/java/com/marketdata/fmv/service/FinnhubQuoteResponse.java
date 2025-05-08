package com.marketdata.fmv.service;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class FinnhubQuoteResponse {

    @JsonProperty("c")
    private BigDecimal currPrice;

    @JsonProperty("d")
    private BigDecimal change;

    @JsonProperty("dp")
    private BigDecimal percentChange;

    @JsonProperty("h")
    private BigDecimal high;

    @JsonProperty("l")
    private BigDecimal low;

    @JsonProperty("o")
    private BigDecimal open;

    @JsonProperty("pc")
    private BigDecimal previousClose;

    @JsonProperty("t")
    private long time;

    // Getters
    public BigDecimal getCurrPrice() {
        return currPrice;
    }

    public BigDecimal getChange() {
        return change;
    }

    public BigDecimal getPercentChange() {
        return percentChange;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public BigDecimal getPreviousClose() {
        return previousClose;
    }

    public long getTime() {
        return time;
    }

    // Setters
    public void setCurrPrice(BigDecimal currPrice) {
        this.currPrice = currPrice;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    public void setPercentChange(BigDecimal percentChange) {
        this.percentChange = percentChange;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public void setPreviousClose(BigDecimal previousClose) {
        this.previousClose = previousClose;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
