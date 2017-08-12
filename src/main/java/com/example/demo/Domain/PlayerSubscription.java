package com.example.demo.Domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Adeebo on 2017/08/04.
 */
public class PlayerSubscription implements Serializable {

    private String subscriptionID;
    private Date date;
    private double fee;
    private double discount;
    private double total;

    private PlayerSubscription() {
    }

    public PlayerSubscription(Builder builder){

        this.subscriptionID = builder.subscriptionID;
        this.date = builder.date;
        this.discount = builder.discount;
        this.fee = builder.fee;
    }

    public static class Builder {

        private String subscriptionID;
        private Date date;
        private double fee;
        private double discount;
        private double total;

        public Builder subscriptionID(String value) {
            this.subscriptionID = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder fee(double value) {
            this.fee = value;
            return this;
        }

        public Builder discount(double value) {
            this.discount = value;
            return this;
        }

        public Builder total(double value) {
            this.total = value;
            return this;
        }

        public PlayerSubscription build(){

            return new PlayerSubscription(this);
        }
    }

    public String getSubscriptionID() {
        return subscriptionID;
    }

    public Date getDate() {
        return date;
    }

    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotal() {

        total = fee - discount;
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerSubscription)) return false;

        PlayerSubscription that = (PlayerSubscription) o;

        return subscriptionID.equals(that.subscriptionID);

    }

    @Override
    public int hashCode() {
        return subscriptionID.hashCode();
    }

    @Override
    public String toString() {
        return "***PlayerSubscription***" + '\n' +
                "SubscriptionID: " + subscriptionID + '\n' +
                "Date: " + date + '\n' +
                "Fee: R" + fee + '\n' +
                "Discount: R" + discount + '\n' +
                "Total: R" + getTotal() + '\n' +
                "************";
    }
}