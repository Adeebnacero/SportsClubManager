package com.example.demo.Domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Adeebo on 2017/08/06.
 */
public class TeamDetails implements Serializable{

    private String teamID;
    private String teamName;
    private String teamDivision;
    private int playerTotal;
    private Coach coach;
    private List<Player> player;

    public TeamDetails() {
    }

    public TeamDetails (Builder builder){

        this.teamID = builder.teamID;
        this.teamName = builder.teamName;
        this.teamDivision = builder.teamDivision;
        this.playerTotal = builder.playerTotal;
        this.coach = builder.coach;
        this.player = builder.player;
    }

    public static class Builder{

        private String teamID;
        private String teamName;
        private String teamDivision;
        private int playerTotal;
        private Coach coach;
        private List<Player> player;

        public Builder teamID(String value) {
            this.teamID = value;
            return this;
        }

        public Builder teamName(String value) {
            this.teamName = value;
            return this;
        }

        public Builder teamDivision(String value) {
            this.teamDivision = value;
            return this;
        }

        public Builder playerTotal(int value) {
            this.playerTotal = value;
            return this;
        }

        public Builder coach(Coach value) {
            this.coach = value;
            return this;
        }

        public Builder player(List<Player> value) {
            this.player = value;
            return this;
        }

        public TeamDetails build(){

            return new TeamDetails(this);
        }
    }

    public String getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamDivision() {
        return teamDivision;
    }

    public int getPlayerTotal() {
        return playerTotal;
    }

    public Coach getCoach() {
        return coach;
    }

    public List<Player> getPlayer() {
        return player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamDetails)) return false;

        TeamDetails that = (TeamDetails) o;

        return teamID.equals(that.teamID);

    }

    @Override
    public int hashCode() {
        return teamID.hashCode();
    }

    @Override
    public String toString() {
        return "***TeamDetails***" +
                "TeamID: " + teamID + '\n' +
                "TeamName: " + teamName + '\n' +
                "TeamDivision: " + teamDivision + '\n' +
                "PlayerTotal: " + playerTotal + '\n' +
                coach + '\n' +
                player + '\n' +
                "*******************" + '\n';
    }
}
