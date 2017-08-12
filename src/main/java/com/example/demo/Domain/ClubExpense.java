package com.example.demo.Domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Adeebo on 2017/08/07.
 */
public class ClubExpense implements Serializable{

    private String expenseID;
    private Date date;
    private String expenseName;
    private String expenseDescription;
    private float expenseAmount;
    private float expenseTotal;
    private String expenseAuthorization;
    private Administrator administrator;

    public ClubExpense() {
    }

    public ClubExpense (Builder builder){

        this.expenseID = builder.expenseID;
        this.date = builder.date;
        this.expenseName = builder.expenseName;
        this.expenseDescription = builder.expenseDescription;
        this.expenseAmount = builder.expenseAmount;
        this.expenseTotal = builder.expenseTotal;
        this.expenseAuthorization = builder.expenseAuthorization;
        this.administrator = builder.administrator;
    }

    public static class Builder{

        private String expenseID;
        private Date date;
        private String expenseName;
        private String expenseDescription;
        private float expenseAmount;
        private float expenseTotal;
        private String expenseAuthorization;
        private Administrator administrator;

        public Builder expenseID(String value) {
            this.expenseID = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder expenseName(String value) {
            this.expenseName = value;
            return this;
        }

        public Builder expenseDescription(String value) {
            this.expenseDescription = value;
            return this;
        }

        public Builder expenseAmount(float value) {
            this.expenseAmount = value;
            return this;
        }

        public Builder expenseTotal(float value) {
            this.expenseTotal = value;
            return this;
        }

        public Builder expenseAuthorization(String value) {
            this.expenseAuthorization = value;
            return this;
        }

        public Builder administrator(Administrator value) {
            this.administrator = value;
            return this;
        }

        public ClubExpense build(){

            return new ClubExpense(this);
        }
    }

    public String getExpenseID() {
        return expenseID;
    }

    public Date getDate() {
        return date;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public float getExpenseAmount() {
        return expenseAmount;
    }

    public float getExpenseTotal() {
        return expenseTotal;
    }

    public String getExpenseAuthorization() {
        return expenseAuthorization;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClubExpense)) return false;

        ClubExpense that = (ClubExpense) o;

        return expenseID.equals(that.expenseID);

    }

    @Override
    public int hashCode() {
        return expenseID.hashCode();
    }

    @Override
    public String toString() {
        return "ClubExpense{" +
                "expenseID='" + expenseID + '\'' +
                ", date=" + date +
                ", expenseName='" + expenseName + '\'' +
                ", expenseDescription='" + expenseDescription + '\'' +
                ", expenseAmount=" + expenseAmount +
                ", expenseTotal=" + expenseTotal +
                ", expenseAuthorization='" + expenseAuthorization + '\'' +
                ", administrator=" + administrator +
                '}';
    }
}


