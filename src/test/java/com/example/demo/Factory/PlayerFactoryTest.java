package com.example.demo.Factory;

import com.example.demo.Domain.ContactDetails;
import com.example.demo.Domain.Player;
import com.example.demo.Domain.PlayerSubscription;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

/**
 * Created by Adeebo on 2017/08/06.
 */
public class PlayerFactoryTest {

    Player player;
    Map<String, String> play;

    ContactDetails contactDetails;
    Map<String, String> contacts;

    PlayerSubscription playerSubscription;
    Map<String, String> playerSubs;

    @Before
    public void setUp() throws Exception {

        play = new HashMap<String, String>();
        play.put("clubID", "001");
        play.put("firstName", "Adeeb");
        play.put("lastName", "Nac");
        play.put("DOB", "88");
        play.put("ID", "880204");
        play.put("position", "midfield");
        play.put("strongFoot", "right");
        play.put("status", "active");

        contacts = new HashMap<String, String>();
        contacts.put("playerContactNumber","123231231");
        contacts.put("contactFirstName","Bob");
        contacts.put("contactLastName","Builder");
        contacts.put("relationship","Friend");
        contacts.put("contactHomeNumber","002023123");
        contacts.put("contactCellphoneNumber","123123123123");

        contactDetails = ContactDetailsFactory.getContactDetails(contacts);

        playerSubs = new HashMap<String, String>();
        playerSubs.put("subscriptionID","001");

        playerSubscription = PlayerSubscriptionFactory.getPlayerSubscription(playerSubs,new Date(),1000,50);

    }
    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetPlayer() throws Exception {

        player = PlayerFactory.getPlayer(play,contactDetails,playerSubscription);

        System.out.println(player.toString());
        assertEquals(true, player.equals(player));
    }
}