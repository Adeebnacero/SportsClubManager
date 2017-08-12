package com.example.demo.Factory;

import com.example.demo.Domain.PlayerSubscription;

import java.util.Date;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class PlayerSubscriptionFactory {

    public static PlayerSubscription getPlayerSubscription (Map<String, String> values, Date date, double fee, double discount){

        PlayerSubscription playerSubscription = new PlayerSubscription.Builder()
                .subscriptionID(values.get("subscriptionID"))
                .date(date)
                .fee(fee)
                .discount(discount)
                .build();

        return playerSubscription;
    }
}