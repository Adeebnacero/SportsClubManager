package com.example.demo.Domain;

import java.util.Date;

/**
 * Created by Adeebo on 2017/08/05.
 */
public class Wages {

    private String wageID;
    private Date date;
    private int hours;
    private double rate;
    private double total;

    public Wages() {
    }

    public Wages (Builder builder){

        this.wageID = builder.wageID;
        this.date = builder.date;
        this.hours = builder.hours;
        this.rate = builder.rate;
        this.total = builder.total;
    }

    public static class Builder{

        private String wageID;
        private Date date;
        private int hours;
        private double rate;
        private double total;

        public Builder wageID(String value) {
            this.wageID = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder hours(int value) {
            this.hours = value;
            return this;
        }

        public Builder rate(double value) {
            this.rate = value;
            return this;
        }

        public Builder total(double value) {
            this.total = value;
            return this;
        }

        public Wages build(){

            return new Wages(this);
        }
    }

    public String getWageID() {
        return wageID;
    }

    public Date getDate() {
        return date;
    }

    public int getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public double getTotal() {
        total = rate * hours;
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wages)) return false;

        Wages wages = (Wages) o;

        return wageID.equals(wages.wageID);

    }

    @Override
    public int hashCode() {
        return wageID.hashCode();
    }

    @Override
    public String toString() {
        return "***Wages***" + '\n' +
                "WageID: " + wageID + '\n' +
                "Date: " + date + '\n' +
                "Hours:" + hours + '\n' +
                "Rate: R" + rate + '\n' +
                "Total: R" + getTotal() + '\n' +
                "****************" + '\n' ;
    }
}
