package com.example.demo.Factory;

import com.example.demo.Domain.MatchResults;
import com.example.demo.Domain.TeamDetails;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class MatchResultsFactory {

    public static MatchResults getMatchResults (Map<String, String> values, Date date, int homeScore, int awayScore, List<TeamDetails> teamDetails){

        MatchResults matchResults = new MatchResults.Builder()
                .resultID(values.get("resultID"))
                .date(date)
                .homeScore(homeScore)
                .awayScore(awayScore)
                .opponentName(values.get("opponentName"))
                .teamDetails(teamDetails)
                .build();

        return matchResults;
    }
}