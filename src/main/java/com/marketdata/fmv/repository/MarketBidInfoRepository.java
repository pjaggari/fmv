package com.marketdata.fmv.repository;


import com.marketdata.fmv.model.MarketBidInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketBidInfoRepository extends JpaRepository<MarketBidInfo, Long> {
}
