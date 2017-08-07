package com.example.demo.Domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Adeebo on 2017/08/04.
 */
public class PlayerSubscription implements Serializable {

    private String subscriptionID;
    private Date date;
    private float fee;
    private float discount;
    private float total;

    private PlayerSubscription() {
    }

    public PlayerSubscription(Builder builder){

        this.subscriptionID = builder.subscriptionID;
        this.date = builder.date;
        this.discount = builder.discount;
        this.fee = builder.fee;
        this.total = builder.total;
    }

    public static class Builder {

        private String subscriptionID;
        private Date date;
        private float fee;
        private float discount;
        private float total;

        public Builder subscriptionID(String value) {
            this.subscriptionID = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder discount(float value) {
            this.discount = value;
            return this;
        }

        public Builder fee(float value) {
            this.fee = value;
            return this;
        }

        public Builder total(float value) {
            this.total = value;
            return this;
        }

        public PlayerSubscription build()
        {
            return new PlayerSubscription(this);
        }
    }

    public String getSubscriptionID() {
        return subscriptionID;
    }

    public Date getDate() {
        return date;
    }

    public float getDiscount() {
        return discount;
    }

    public float getFee() {
        return fee;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerSubscription)) return false;

        PlayerSubscription that = (PlayerSubscription) o;

        return Float.compare(that.total, total) == 0;

    }

    @Override
    public int hashCode() {
        return (total != +0.0f ? Float.floatToIntBits(total) : 0);
    }
}