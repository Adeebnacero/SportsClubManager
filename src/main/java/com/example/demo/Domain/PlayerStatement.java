package com.example.demo.Domain;

import java.util.Date;

/**
 * Created by Adeebo on 2017/08/06.
 */
public class PlayerStatement {

    private String statementID;
    private Date date;
    private Player player;
    private PlayerSubscription playerSubscription;
    private float balance;

    public PlayerStatement() {
    }

    public PlayerStatement (Builder builder){

        this.statementID = builder.statementID;
        this.date = builder.date;
        this.player = builder.player;
        this.playerSubscription = builder.playerSubscription;
        this.balance = builder.balance;

    }

    public static class Builder{

        private String statementID;
        private Date date;
        private Player player;
        private PlayerSubscription playerSubscription;
        private float balance;

        public Builder statementID(String value) {
            this.statementID = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder player(Player value) {
            this.player = value;
            return this;
        }

        public Builder playerSubscription(PlayerSubscription value) {
            this.playerSubscription = value;
            return this;
        }

        public Builder balance(float value) {
            this.balance = value;
            return this;
        }
    }

    public String getStatementID() {
        return statementID;
    }

    public Date getDate() {
        return date;
    }

    public Player getPlayer() {
        return player;
    }

    public PlayerSubscription getPlayerSubscription() {
        return playerSubscription;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerStatement)) return false;

        PlayerStatement that = (PlayerStatement) o;

        return player.equals(that.player);

    }

    @Override
    public int hashCode() {
        return player.hashCode();
    }
}
