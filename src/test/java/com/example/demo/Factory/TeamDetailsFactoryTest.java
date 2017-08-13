package com.example.demo.Factory;

import com.example.demo.Domain.*;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;
/**
 * Created by Adeebo on 2017/08/13.
 */
public class TeamDetailsFactoryTest {

    TeamDetails teamDetails;
    Map<String,String> team;

    Coach coach;
    Map<String,String> coaching;

    Player player;

    ContactDetails contactDetails;
    Map<String,String> contact;

    PlayerSubscription playerSubscription;

    Wages wages;
    Map<String,String> wage;
    List<Wages> wageList;

    List<Player> playerList;
    Map<String,String> players;

    @Before
    public void setUp() throws Exception {

        team = new HashMap<String, String>();
        team.put("teamID","005");
        team.put("teamName","Under 16");
        team.put("teamDivision","Under 16 Blue");

        coaching = new HashMap<String, String>();
        coaching.put("clubID","001");
        coaching.put("firstName","001");
        coaching.put("lastName","001");
        coaching.put("DOB","001");
        coaching.put("status","001");

        wage = new HashMap<String, String>();
        wage.put("wageID","001");

        wages = WagesFactory.getWages(wage,new Date(),8,20.6);
        wageList = new ArrayList<Wages>();
        wageList.add(wages);

        contact = new HashMap<String, String>();
        contact.put("playerContactNumber","123231231");
        contact.put("contactFirstName","Bob");
        contact.put("contactLastName","Builder");
        contact.put("relationship","Friend");
        contact.put("contactHomeNumber","002023123");
        contact.put("contactCellphoneNumber","123123123123");

        contactDetails = ContactDetailsFactory.getContactDetails(contact);

        coach = CoachFactory.getCoach(coaching, contactDetails, wageList);

        players = new HashMap<String, String>();

        player = PlayerFactory.getPlayer(players,contactDetails,playerSubscription);
        playerList = new ArrayList<Player>();
    }

    @Test
    public void testGetTeamDetails() throws Exception {

        teamDetails = TeamDetailsFactory.getTeamDetails(team, 23, coach, playerList);

        System.out.println(teamDetails.toString());
        assertEquals(true, teamDetails.equals(teamDetails));

    }
}