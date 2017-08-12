package com.example.demo.Factory;

import com.example.demo.Domain.Coach;
import com.example.demo.Domain.Player;
import com.example.demo.Domain.TeamDetails;

import java.util.List;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class TeamDetailsFactory {

    public static TeamDetails getTeamDetails (Map<String, String> values, int playerTotal, Coach coach, List<Player> player){

        TeamDetails teamDetails = new TeamDetails.Builder()
                .teamID(values.get("teamID"))
                .teamName(values.get("teamName"))
                .teamDivision(values.get("teamDivision"))
                .playerTotal(playerTotal)
                .coach(coach)
                .player(player)
                .build();

        return teamDetails;
    }
}
