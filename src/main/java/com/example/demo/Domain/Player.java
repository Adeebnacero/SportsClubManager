package com.example.demo.Domain;

import java.io.Serializable;

/**
 * Created by Adeebo on 2017/08/04.
 */
public class Player implements Serializable{

    private String clubID;
    private String firstName;
    private String lastName;
    private String DOB;
    private String ID;
    private String position;
    private String strongFoot;
    private String status;
    private ContactDetails contactDetails;
    private PlayerSubscription playerSubscription;

    public Player() {
    }

    public Player(Builder builder){

        this.clubID = builder.clubID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.DOB = builder.DOB;
        this.ID = builder.ID;
        this.position = builder.position;
        this.strongFoot = builder.strongFoot;
        this.status = builder.status;
        this.contactDetails = builder.contactDetails;
        this.playerSubscription = builder.playerSubscription;
    }

    public static class Builder {

        private String clubID;
        private String firstName;
        private String lastName;
        private String DOB;
        private String ID;
        private String position;
        private String strongFoot;
        private String status;
        private ContactDetails contactDetails;
        private PlayerSubscription playerSubscription;

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

        public Builder ID(String value) {
            this.ID = value;
            return this;
        }

        public Builder position(String value) {
            this.position = value;
            return this;
        }

        public Builder strongFoot(String value) {
            this.strongFoot = value;
            return this;
        }

        public Builder status(String value) {
            this.status = value;
            return this;
        }

        public Builder playerSubscription(PlayerSubscription value) {
            this.playerSubscription = value;
            return this;
        }

        public Builder contactDetails(ContactDetails value) {
            this.contactDetails = value;
            return this;
        }

        public Player build(){

            return new Player(this);
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

    public String getID() {
        return ID;
    }

    public String getPosition() {
        return position;
    }

    public String getStrongFoot() {
        return strongFoot;
    }

    public String getStatus() {
        return status;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public PlayerSubscription getPlayerSubscription() {
        return playerSubscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        return clubID.equals(player.clubID);

    }

    @Override
    public int hashCode() {
        return clubID.hashCode();
    }

    @Override
    public String toString() {
        return "***Player***" +'\n' +
                "ClubID: " + clubID + '\n' +
                "FirstName: " + firstName + '\n' +
                "LastName: " + lastName + '\n' +
                "DOB: " + DOB + '\n' +
                "ID: " + ID + '\n' +
                "Position: " + position + '\n' +
                "StrongFoot: " + strongFoot + '\n' +
                "Status: " + status + '\n'
                +"******************" + '\n'
                + contactDetails
                + playerSubscription + '\n';
    }
}
