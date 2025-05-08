package com.marketdata.fmv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

    @Id
    private int org_i;

    private String ticker;

    @Column(name = "company_name")
    private String companyName;

    public Integer getOrgId() {
        return org_i;
    }

    public void setOrgId(Integer org_i) {
        this.org_i = this.org_i;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
