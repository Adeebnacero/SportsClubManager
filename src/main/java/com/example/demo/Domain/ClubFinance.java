package com.example.demo.Domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Adeebo on 2017/08/07.
 */
public class ClubFinance implements Serializable{

    private String financeID;
    private Date date;
    private String month;
    private List<ClubIncome> clubIncome;
    private List<ClubExpense> clubExpense;

    public ClubFinance() {
    }

    public ClubFinance (Builder builder){

        this.financeID = builder.financeID;
        this.date = builder.date;
        this.month = builder.month;
        this.clubIncome = builder.clubIncome;
        this.clubExpense = builder.clubExpense;

    }

    public static class Builder{

        private String financeID;
        private Date date;
        private String month;
        private List<ClubIncome> clubIncome;
        private List<ClubExpense> clubExpense;

        public Builder financeID(String value) {
            this.financeID = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder month(String value) {
            this.month = value;
            return this;
        }

        public Builder clubIncome(List<ClubIncome> value) {
            this.clubIncome = value;
            return this;
        }

        public Builder clubExpense(List<ClubExpense> value) {
            this.clubExpense = value;
            return this;
        }
    }

    public String getFinanceID() {
        return financeID;
    }

    public Date getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }

    public List<ClubIncome> getClubIncome() {
        return clubIncome;
    }

    public List<ClubExpense> getClubExpense() {
        return clubExpense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClubFinance)) return false;

        ClubFinance that = (ClubFinance) o;

        return financeID.equals(that.financeID);

    }

    @Override
    public int hashCode() {
        return financeID.hashCode();
    }
}



