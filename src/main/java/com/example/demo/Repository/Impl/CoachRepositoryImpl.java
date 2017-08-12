package com.example.demo.Repository.Impl;

import com.example.demo.Domain.Coach;
import com.example.demo.Repository.CoachRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class CoachRepositoryImpl implements CoachRepository {

    public static CoachRepositoryImpl coach = null;

    private Map<String, Coach> coachTable;

    private CoachRepositoryImpl(){

        coachTable = new HashMap<String, Coach>();
    }

    public static CoachRepositoryImpl getInstance()
    {
        if(coach == null)
            coach = new CoachRepositoryImpl();
        return coach;
    }

    public Coach create(Coach coach) {
        coachTable.put(coach.getClubID(), coach);
        Coach saveCoach = coachTable.get(coach.getClubID());
        return saveCoach;
    }

    public Coach read(String clubID) {
        Coach readCoach = coachTable.get(clubID);
        return readCoach;
    }

    public Coach update(Coach coach) {
        coachTable.put(coach.getClubID(), coach);
        Coach updateCoach = coachTable.get(coach.getClubID());
        return updateCoach;
    }

    public void delete(String clubID) {
        coachTable.remove(clubID);
    }
}
