package com.example.demo.Factory;

import com.example.demo.Domain.ContactDetails;
import com.example.demo.Domain.Player;
import com.example.demo.Domain.PlayerSubscription;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

/**
 * Created by Adeebo on 2017/08/06.
 */
public class PlayerFactoryTest {

    Player player;
    ContactDetails contactDetails;
    PlayerSubscription playerSubscription;
    Map<String, String> play;
    Map<String, String> con;
    Map<String, String> sub;

    @Before
    public void setUp() throws Exception {

        play = new HashMap<String, String>();
        play.put("clubID","001");
        play.put("firstName","Adeeb");
        play.put("lastName","Nac");

        con = new HashMap<String, String>();
        con.put("contactFirstName","Dullah");

        sub = new HashMap<String, String>();
        sub.put("100","100");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetPlayer() throws Exception {

        player = PlayerFactory.getPlayer(play,contactDetails,playerSubscription);

        System.out.println(player.getContactDetails());
        assertEquals(true, player.equals(player));
    }
}