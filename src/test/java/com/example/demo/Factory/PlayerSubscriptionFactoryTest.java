package com.example.demo.Factory;

import com.example.demo.Domain.PlayerSubscription;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 * Created by Adeebo on 2017/08/13.
 */
public class PlayerSubscriptionFactoryTest {

    PlayerSubscription playerSubscription;
    Map<String, String> playerSubs;

    @Before
    public void setUp() throws Exception {

        playerSubs = new HashMap<String, String>();
        playerSubs.put("subscriptionID","001");
    }

    @Test
    public void testGetPlayerSubscription() throws Exception {

        playerSubscription = PlayerSubscriptionFactory.getPlayerSubscription(playerSubs,new Date(), 874, 130);

        System.out.println(playerSubscription.toString());
        assertEquals(true, playerSubscription.equals(playerSubscription));
    }
}