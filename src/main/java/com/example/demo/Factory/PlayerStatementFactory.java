package com.example.demo.Factory;

import com.example.demo.Domain.Player;
import com.example.demo.Domain.PlayerStatement;
import com.example.demo.Domain.PlayerSubscription;

import java.util.Date;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class PlayerStatementFactory {

    public static PlayerStatement getPlayerStatement (Map<String, String> values, Date date, Player player, PlayerSubscription playerSubscription, float balance){

        PlayerStatement playerStatement = new PlayerStatement.Builder()
                .statementID(values.get("statementID"))
                .date(date)
                .player(player)
                .playerSubscription(playerSubscription)
                .balance(balance)
                .build();

        return playerStatement;
    }
}