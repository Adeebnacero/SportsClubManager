package com.example.demo.Domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Adeebo on 2017/08/07.
 */
public class ClubIncome implements Serializable{

    private String incomeID;
    private Date date;
    private String incomeName;
    private String incomeDescription;
    private float incomeAmount;
    private float incomeVAT;
    private float incomeTotal;

    public ClubIncome() {
    }

    public ClubIncome (Builder builder){

        this.incomeID = builder.incomeID;
        this.date = builder.date;
        this.incomeName = builder.incomeName;
        this.incomeDescription = builder.incomeDescription;
        this.incomeAmount = builder.incomeAmount;
        this.incomeVAT = builder.incomeVAT;
        this.incomeTotal = builder.incomeTotal;
    }

    public static class Builder{

        private String incomeID;
        private Date date;
        private String incomeName;
        private String incomeDescription;
        private float incomeAmount;
        private float incomeVAT;
        private float incomeTotal;

        public Builder incomeID(String value) {
            this.incomeID = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder incomeName(String value) {
            this.incomeName = value;
            return this;
        }

        public Builder incomeDescription(String value) {
            this.incomeDescription = value;
            return this;
        }

        public Builder incomeAmount(float value) {
            this.incomeAmount = value;
            return this;
        }

        public Builder incomeVAT(float value) {
            this.incomeVAT = value;
            return this;
        }

        public Builder incomeTotal(float value) {
            this.incomeTotal = value;
            return this;
        }

        public ClubIncome build(){

            return new ClubIncome(this);
        }
    }

    public String getIncomeID() {
        return incomeID;
    }

    public Date getDate() {
        return date;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public String getIncomeDescription() {
        return incomeDescription;
    }

    public float getIncomeAmount() {
        return incomeAmount;
    }

    public float getIncomeVAT() {
        return incomeVAT;
    }

    public float getIncomeTotal() {
        return incomeTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClubIncome)) return false;

        ClubIncome that = (ClubIncome) o;

        return incomeID.equals(that.incomeID);

    }

    @Override
    public int hashCode() {
        return incomeID.hashCode();
    }

    @Override
    public String toString() {
        return "ClubIncome{" +
                "incomeID='" + incomeID + '\'' +
                ", date=" + date +
                ", incomeName='" + incomeName + '\'' +
                ", incomeDescription='" + incomeDescription + '\'' +
                ", incomeAmount=" + incomeAmount +
                ", incomeVAT=" + incomeVAT +
                ", incomeTotal=" + incomeTotal +
                '}';
    }
}
