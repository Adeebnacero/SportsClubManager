package com.example.demo.Domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Adeebo on 2017/08/07.
 */
public class MatchResults implements Serializable {

    private String resultID;
    private Date date;
    private int homeScore;
    private int awayScore;
    private String opponentName;
    private List<TeamDetails> teamDetails;

    public MatchResults() {
    }

    public MatchResults(Builder builder){

        this.resultID = builder.resultID;
        this.date = builder.date;
        this.homeScore = builder.homeScore;
        this.awayScore = builder.awayScore;
        this.opponentName = builder.opponentName;
        this.teamDetails = builder.teamDetails;

    }

    public static class Builder{

        private String resultID;
        private Date date;
        private int homeScore;
        private int awayScore;
        private String opponentName;
        private List<TeamDetails> teamDetails;

        public Builder resultID(String value) {
            this.resultID = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder homeScore(int value) {
            this.homeScore = value;
            return this;
        }

        public Builder awayScore(int value) {
            this.awayScore = value;
            return this;
        }

        public Builder opponentName(String value) {
            this.opponentName = value;
            return this;
        }

        public Builder teamDetails(List<TeamDetails> value) {
            this.teamDetails = value;
            return this;
        }

        public MatchResults build(){

            return new MatchResults(this);
        }
    }

    public String getResultID() {
        return resultID;
    }

    public Date getDate() {
        return date;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public String getOpponentName() {
        return opponentName;
    }

    public List<TeamDetails> getTeamDetails() {
        return teamDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MatchResults)) return false;

        MatchResults matchResults = (MatchResults) o;

        return resultID.equals(matchResults.resultID);

    }

    @Override
    public int hashCode() {
        return resultID.hashCode();
    }

    @Override
    public String toString() {
        return "MatchResults{" +
                "resultID='" + resultID + '\'' +
                ", date=" + date +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                ", opponentName='" + opponentName + '\'' +
                ", teamDetails=" + teamDetails +
                '}';
    }
}
