package com.example.demo.Repository;

import com.example.demo.Domain.ContactDetails;
import com.example.demo.Domain.Player;
import com.example.demo.Domain.PlayerSubscription;
import com.example.demo.Factory.ContactDetailsFactory;
import com.example.demo.Factory.PlayerFactory;
import com.example.demo.Factory.PlayerSubscriptionFactory;
import com.example.demo.Repository.Impl.PlayerRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by Adeebo on 2017/08/13.
 */
public class PlayerRepositoryTest {

    Map<String,String> values;
    PlayerRepository playerRepository;
    ContactDetails contactDetails;
    Map<String, String> contacts;
    PlayerSubscription playerSubscription;
    Map<String, String> playerSubs;

    @Before
    public void setUp() throws Exception {

        playerRepository = PlayerRepositoryImpl.getInstance();
        values = new HashMap<String, String>();
        values.put("clubID", "001");
        values.put("firstName", "Adeeb");
        values.put("lastName", "Nac");
        values.put("DOB", "88");
        values.put("ID", "880204");
        values.put("position", "midfield");
        values.put("strongFoot", "right");
        values.put("status", "active");

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

    @Test
    public void testCreate() throws Exception {

        Player player = PlayerFactory.getPlayer(values, contactDetails, playerSubscription);
        playerRepository.create(player);
        System.out.println(player.toString());
        assertEquals("001",player.getClubID());
    }

    @Test
    public void testRead() throws Exception {

      /*  Player player = playerRepository.read("001");
        assertEquals("midfield", player.getPosition());*/
    }

    @Test
    public void testUpdate() throws Exception {

        Player player = playerRepository.read("001");
        Player updatePlayer = new Player.Builder()
                .clubID(values.get("clubID"))
                .firstName(values.get("firstName"))
                .lastName("Nacerodien")
                .DOB(values.get("DOB"))
                .ID(values.get("ID"))
                .position("Striker")
                .strongFoot(values.get("strongFoot"))
                .status(values.get("status"))
                .contactDetails(contactDetails)
                .playerSubscription(playerSubscription)
                .build();
        playerRepository.update(updatePlayer);
        player = playerRepository.read("001");
        System.out.println(player.toString());
        assertEquals("001",player.getClubID());
    }

    @Test
    public void testDelete() throws Exception {

        playerRepository.delete("001");
        Player player = playerRepository.read("001");
        assertNull(player);
    }
}