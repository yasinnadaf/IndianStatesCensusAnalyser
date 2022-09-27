package com.bridgelabz.test;

public class CSVStateCensus {
    private String stateName;
    private long census;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public long getCensus() {
        return census;
    }

    public void setCensus(long census) {
        this.census = census;
    }

    public CSVStateCensus(String stateName, long census) {
        this.stateName = stateName;
        this.census = census;
    }

    @Override
    public String toString() {
        return "CSVStateCensus{" +
                "stateName='" + stateName + '\'' +
                ", census=" + census +
                '}';
    }
}
