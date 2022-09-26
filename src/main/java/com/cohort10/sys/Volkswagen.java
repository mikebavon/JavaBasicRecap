package com.cohort10.sys;

public abstract class Volkswagen {

    private int yearInvention;

    private String countryOfOrigin;

    public int getYearInvention() {
        return yearInvention;
    }

    public void setYearInvention(int yearInvention) {
        this.yearInvention = yearInvention;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void startEngine() {
        System.out.println("Straight 4 CYLINDER");
    }
}
