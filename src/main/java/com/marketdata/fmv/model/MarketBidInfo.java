package com.marketdata.fmv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class MarketBidInfo {

    @Id
    private int org_i;

    private String ticker;
    private BigDecimal currentPrice;     // "c"
    private BigDecimal change;           // "d"
    private BigDecimal percentChange;    // "dp"
    private BigDecimal high;             // "h"
    private BigDecimal low;              // "l"
    private BigDecimal open;             // "o"
    private BigDecimal previousClose;    // "pc"

    private LocalDateTime marketTimestamp;
}
