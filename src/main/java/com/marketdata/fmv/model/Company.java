package com.marketdata.fmv.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {

    @Id
    private int org_i;

    private String ticker;

}
