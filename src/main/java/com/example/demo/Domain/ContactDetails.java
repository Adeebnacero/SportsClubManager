package com.example.demo.Domain;

import java.io.Serializable;

/**
 * Created by Adeebo on 2017/08/04.
 */
public class ContactDetails implements Serializable {

    private String playerContactNumber;
    private String contactFirstName;
    private String contactLastName;
    private String relationship;
    private String contactHomeNumber;
    private String contactCellphoneNumber;

    public ContactDetails() {
    }

    public ContactDetails(Builder builder){

        this.playerContactNumber = builder.playerContactNumber;
        this.contactFirstName = builder.contactFirstName;
        this.contactLastName = builder.contactLastName;
        this.relationship = builder.relationship;
        this.contactHomeNumber = builder.contactHomeNumber;
        this.contactCellphoneNumber = builder.contactCellphoneNumber;
    }

    public static class Builder{

        private String playerContactNumber;
        private String contactFirstName;
        private String contactLastName;
        private String relationship;
        private String contactHomeNumber;
        private String contactCellphoneNumber;

        public Builder playerContactNumber(String value) {
            this.playerContactNumber = value;
            return this;
        }

        public Builder contactCellphoneNumber(String value) {
            this.contactCellphoneNumber = value;
            return this;
        }

        public Builder contactFirstName(String value) {
            this.contactFirstName = value;
            return this;
        }

        public Builder contactHomeNumber(String value) {
            this.contactHomeNumber = value;
            return this;
        }

        public Builder contactLastName(String value) {
            this.contactLastName = value;
            return this;
        }

        public Builder relationship(String value) {
            this.relationship = value;
            return this;
        }
    }

    public String getPlayerContactNumber() {
        return playerContactNumber;
    }

    public String getContactCellphoneNumber() {
        return contactCellphoneNumber;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getContactHomeNumber() {
        return contactHomeNumber;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public String getRelationship() {
        return relationship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactDetails)) return false;

        ContactDetails contactDetails = (ContactDetails) o;

        return contactFirstName.equals(contactDetails.contactFirstName);

    }

    @Override
    public int hashCode() {
        return contactFirstName.hashCode();
    }
}
