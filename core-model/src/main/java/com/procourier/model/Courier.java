package com.procourier.model;

import java.util.Objects;

public class Courier {
    private String companyName;
    private Address headquarters;
    private Long pricePerDistance;
    private Long pricePerWeight;

    public Courier(String companyName, Address headquarters, Long pricePerDistance, Long pricePerWeight) {
        this.companyName = Objects.requireNonNull(companyName);
        this.headquarters = Objects.requireNonNull(headquarters);
        this.pricePerDistance = Objects.requireNonNull(pricePerDistance);
        this.pricePerWeight = Objects.requireNonNull(pricePerWeight);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(Address headquarters) {
        this.headquarters = headquarters;
    }

    public Long getPricePerDistance() {
        return pricePerDistance;
    }

    public void setPricePerDistance(Long pricePerDistance) {
        this.pricePerDistance = pricePerDistance;
    }

    public Long getPricePerWeight() {
        return pricePerWeight;
    }

    public void setPricePerWeight(Long pricePerWeight) {
        this.pricePerWeight = pricePerWeight;
    }
}
