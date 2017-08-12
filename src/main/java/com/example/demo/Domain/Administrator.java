package com.example.demo.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Adeebo on 2017/08/05.
 */
@Entity
public class Administrator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String clubID;
    private String firstName;
    private String lastName;
    private String DOB;
    private String status;
    private ContactDetails contactDetails;
    private List<Wages> wages;

    protected Administrator() {
    }

    public Administrator (Builder builder){

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

        public Administrator build(){

            return new Administrator(this);
        }
    }

    public String getClubID() {
        return clubID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getStatus() {
        return status;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public List<Wages> getWages() {
        return wages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administrator)) return false;

        Administrator that = (Administrator) o;

        return clubID.equals(that.clubID);

    }

    @Override
    public int hashCode() {
        return clubID.hashCode();
    }

    @Override
    public String toString() {
        return "Administrator{" +
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
