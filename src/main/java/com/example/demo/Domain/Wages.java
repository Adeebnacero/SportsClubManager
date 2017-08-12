package com.example.demo.Domain;

import java.util.Date;

/**
 * Created by Adeebo on 2017/08/05.
 */
public class Wages {

    private String wageID;
    private Date date;
    private int hours;
    private float rate;
    private float total;

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
        private float rate;
        private float total;

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

        public Builder rate(float value) {
            this.rate = value;
            return this;
        }

        public Builder total(float total) {
            this.total = rate * hours;
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

    public float getRate() {
        return rate;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wages)) return false;

        Wages wages = (Wages) o;

        return Float.compare(wages.total, total) == 0;

    }

    @Override
    public int hashCode() {
        return (total != +0.0f ? Float.floatToIntBits(total) : 0);
    }

    @Override
    public String toString() {
        return "Wages{" +
                "wageID='" + wageID + '\'' +
                ", date=" + date +
                ", hours=" + hours +
                ", rate=" + rate +
                ", total=" + total +
                '}';
    }
}
