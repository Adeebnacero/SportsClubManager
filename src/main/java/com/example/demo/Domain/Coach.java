package com.example.demo.Domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Adeebo on 2017/08/05.
 */
public class Coach implements Serializable {

    private String clubID;
    private String firstName;
    private String lastName;
    private String DOB;
    private String status;
    private ContactDetails contactDetails;
    private List<Wages> wages;

    public Coach() {
    }

    public Coach (Builder builder){

        this.clubID = builder.clubID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.DOB = builder.DOB;
        this.status = builder.status;
        this.contactDetails = builder.contactDetails;
        this.wages = builder.wages;
    }

    public static class Builder{

        private String clubID;
        private String firstName;
        private String lastName;
        private String DOB;
        private String status;
        private ContactDetails contactDetails;
        private List<Wages> wages;

        public Builder clubID(String value) {
            this.clubID = value;
            return this;
        }

        public Builder firstName(String value) {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            this.lastName = value;
            return this;
        }

        public Builder DOB(String value) {
            this.DOB = value;
            return this;
        }

        public Builder status(String value) {
            this.status = value;
            return this;
        }

        public Builder contactDetails(ContactDetails value) {
            this.contactDetails = value;
            return this;
        }

        public Builder wages(List<Wages> value) {
            this.wages = value;
            return this;
        }

        public Coach build(){

            return new Coach(this);
        }
    }

    public String getClubID() {
        return clubID;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public String getDOB() {
        return DOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStatus() {
        return status;
    }

    public List<Wages> getWages() {
        return wages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coach)) return false;

        Coach coach = (Coach) o;

        return clubID.equals(coach.clubID);

    }

    @Override
    public int hashCode() {
        return clubID.hashCode();
    }

    @Override
    public String toString() {
        return "Coach{" +
                "clubID='" + clubID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", status='" + status + '\'' +
                ", contactDetails=" + contactDetails +
                ", wages=" + wages +
                '}';
    }
}
